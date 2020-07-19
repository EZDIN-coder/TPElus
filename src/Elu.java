import java.util.ArrayList;

public class Elu extends Personne {
	
   private ArrayList<Personne> assistants;
   private double budget;
   
	public ArrayList<Personne> getAssistants() {
	return assistants;
}

	
  public void setAssistants(ArrayList<Personne> assistants) {
	this.assistants = assistants;
 }

	public double getBudget() {
	return budget;
}


  public void setBudget(double budget) {
	this.budget = budget;
}


	public Elu() {
		// TODO Auto-generated constructor stub
	}

	public Elu(String nom, String prenom, double Solde ,double budget) {
		super(nom, prenom, Solde);
		this.budget=budget;

	}
	
	public void embaucherAssistant(Personne assistant) {
		this.assistants.add(assistant);
	}
	
	public void licencierAssistant(Personne assistant) {
		
		this.assistants.remove(assistant);
	}
	
	public void verserDotation(ArrayList<Personne> assistant) {
		System.out.println(" *****Début verserDotation Elu*****");
		for (Personne assist : assistant) {
			double newSolde=assist.getCompteBancaire() + this.getBudget()/assistant.size() ;
			assist.setCompteBancaire(newSolde);
		}
		
	}

}
