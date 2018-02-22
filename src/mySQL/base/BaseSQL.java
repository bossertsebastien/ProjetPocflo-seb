package mySQL.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;


import personne.base.Personne;


public class BaseSQL {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		
		}catch(InstantiationException e) {
			e.printStackTrace();	
		}

}

	String config = "config";
	Connection co = null;
	Statement st;
	Statement rs;

	String url = null;	
	String user = null;
	String password = null;

	
	public void ouvrir() {
		try {
			init();
			co = (Connection) DriverManager.getConnection(url,user,password);
			System.out.println("Connection reussi");
		} catch (SQLException e) {
			System.out.println("Fail connection");
			e.printStackTrace();
		}
	}

	private void init() {
		ResourceBundle rb = ResourceBundle.getBundle(config);
		url = rb.getString("url");
		user = rb.getString("user");
		password = rb.getString("password");
		//System.out.println("url : "+ url + "password : " + password  );
	}

	public boolean getPersonne(String nom, String mdp) {
		boolean exist = false;
		System.out.println("nom : "+ nom + "password : " + mdp  );
		try  {
			String sql = "select * from P_personne where nom=? and prenom=?;";
			PreparedStatement st =  co.prepareStatement(sql);
			st.setString(1, nom);
			st.setString(2, mdp);
			ResultSet rs = (ResultSet) st.executeQuery();
			while (rs.next()) {
				if(rs.getString("nom").equals(nom) && rs.getString("prenom").equals(mdp) )exist = true;
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exist;


	}

	public int enregistrerPersonne(Personne p) throws SQLException {
		int res;
		String sql = "insert into P_personne (nom,prenom,email,RAS) values(?,?,?,?)";
		PreparedStatement ps = co.prepareStatement(sql);
		ps.setString(1, p.getNom());
		ps.setString(2, p.getPrenom());
		ps.setString(3, p.getEmail());
		ps.setBoolean(4, p.getRAS());
		res = ps.executeUpdate();

		return res;
	}


	public ArrayList<Personne> listerPersonne(){
		ArrayList<Personne> lstPersonne = new ArrayList<>();
		try {
			String sql = "select * from P_personne";
			PreparedStatement st =  co.prepareStatement(sql);
			ResultSet rs = (ResultSet) st.executeQuery();
			while (rs.next()) {
				Personne p = new Personne();
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
				p.setEmail(rs.getString("email"));
				p.setRAS(rs.getBoolean("RAS"));
				lstPersonne.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstPersonne;
	}


	public void fermer() throws SQLException {
		if(co != null) co.close();		
	}

}





