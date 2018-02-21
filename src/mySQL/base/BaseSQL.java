package mySQL.base;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import com.mysql.jdbc.Connection;
import personne.base.Personne;


public class BaseSQL {

	String config = "config";
	Connection co = null;
	Statement st;
	Statement rs;

	String url = null;	
	String user = null;
	String password = null;

	static {
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			
			}catch(InstantiationException e) {
				e.printStackTrace();	
			}

	}
	

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
		System.out.println("url : "+ url + "password : " + password  );
	}

	public void get() {


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




	public static void main(String[] args) throws SQLException{
		BaseSQL bd = new BaseSQL();
		ArrayList<Personne> liste;
		//Personne p = new Personne("Dupont", "jean", "dupont.jean@mail.fr", true);
		Personne p2 = new Personne("skywalker", "luc", "luc.sky@mail.fr", false);
		bd.ouvrir();
		//bd.enregistrerPersonne(p2);
		liste = bd.listerPersonne();
		Integer i = 0;
		Iterator<Personne> it = liste.iterator();
		while(it.hasNext()) {
			System.out.print(liste.get(i).getNom()+" ");
			System.out.println(liste.get(i).getPrenom());
			System.out.println(liste.get(i).getEmail());
			String ras = null;
			if(liste.get(i).getRAS()) {
				ras = "oui";
			}else {
				ras = "non";
			}
			liste.get(i).getRAS();
			System.out.println("Risque Aggrav� de Sant� : " + ras );
			System.out.println("");
			it.next();
			i++;
		}
		bd.fermer();
	}


}





