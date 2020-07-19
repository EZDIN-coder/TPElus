import java.util.ArrayList;

public class EluEconome extends Elu {

	public EluEconome() {
		// TODO Auto-generated constructor stub
	}

	public EluEconome(String nom, String prenom, double Solde ,double budget) {
		super(nom, prenom, Solde ,budget);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void verserDotation(ArrayList<Personne> assistant) {
		System.out.println(" *****Début verserDotation EluEconome*****");
		double newSolde=0.0;
		double dotation= this.getBudget()/assistant.size();
		for (Personne assist : assistant) {
			if ( dotation >= 1480) {
				  newSolde=assist.getCompteBancaire() + 1480 ;
				  this.setBudget(this.getBudget()-1480);
			}			  
			else {
				newSolde= assist.getCompteBancaire()+dotation;

				 this.setBudget(this.getBudget()-1480);
			}
			
		assist.setCompteBancaire(newSolde);
		}
		
	}

}
