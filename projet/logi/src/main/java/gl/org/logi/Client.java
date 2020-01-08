package gl.org.logi;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Client {

	private int ID;
	private String Nom;
	private String Prenom;
	private String Email;
	private String PtsFis;
	private Date DataNaiss;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Client [ID=" + ID + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Email=" + Email + ", PtsFis=" + PtsFis
				+ ", DataNaiss=" + DataNaiss + "]";
	}

	public Client(int iD, String nom, String prenom, String email, String ptsFis, Date dataNaiss) {
		super();
		ID = iD;
		Nom = nom;
		Prenom = prenom;
		Email = email;
		PtsFis = ptsFis;
		DataNaiss = dataNaiss;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPtsFis() {
		return PtsFis;
	}

	public void setPtsFis(String ptsFis) {
		PtsFis = ptsFis;
	}

	public Date getDataNaiss() {
		return DataNaiss;
	}

	public void setDataNaiss(Date dataNaiss) {
		DataNaiss = dataNaiss;
	}

	public int calcuAge() {
		int age = Calendar.getInstance().get(Calendar.YEAR) - this.DataNaiss.getYear() - 1900;
		return age;
	}
}
