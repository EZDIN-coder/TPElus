
public class Personne {

	private String name;
	private String Secondname;
	private double compteBancaire;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondname() {
		return Secondname;
	}
	public void setSecondname(String secondname) {
		Secondname = secondname;
	}
	public double getCompteBancaire() {
		return compteBancaire;
	}
	public void setCompteBancaire(double compteBancaire) {
		this.compteBancaire = compteBancaire;
	}
	public Personne() {
		// TODO Auto-generated constructor stub
	}
    public Personne(String nom,String prenom,double Solde) {
    	this.name =nom;
    	this.Secondname=prenom;
    	this.compteBancaire=Solde;
    }
}
