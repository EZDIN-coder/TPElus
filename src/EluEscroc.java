import java.util.ArrayList;

public class EluEscroc extends Elu {
	
	private double compteBancaireSuisse;
	
	
	public double getCompteBancaireSuisse() {
		return compteBancaireSuisse;
	}

	public void setCompteBancaireSuisse(double compteBancaireSuisse) {
		this.compteBancaireSuisse = compteBancaireSuisse;
	}

	public EluEscroc() {
		// TODO Auto-generated constructor stub
	}

	public EluEscroc(String nom, String prenom, double Solde,double budget, double soldeSuisse) {
		super(nom, prenom, Solde,budget);
		this.compteBancaireSuisse=soldeSuisse;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void verserDotation(ArrayList<Personne> assistant) {
		System.out.println(" *****Début verserDotation EluEscroc*****");
		double newSolde=0.0;
		//System.out.println("this.getBudget() "+this.getBudget());
		double dotation= this.getBudget()/assistant.size();
		//System.out.println(" ---dotation ---"+dotation);
		for (Personne assist : assistant) {
			System.out.println("traitement de l'assistant"+assist.getName());
			if ( dotation >= 1480) {
				  newSolde=assist.getCompteBancaire() + 1480 ;
				  this.setBudget(this.getBudget()-1480);
				  //System.out.println("getBudget111 ****" + this.getBudget());
			}			  
			else {
				newSolde= assist.getCompteBancaire()+dotation;

				 this.setBudget(this.getBudget()-1480);
				// System.out.println("getBudget122 ****" + this.getBudget());
			}
			
		assist.setCompteBancaire(newSolde);
		
		//System.out.println("getBudgetx ****" + this.getBudget());
		
		
		
		}
		//System.out.println("(this.getCompteBancaireSuisse()  ****" + this.getCompteBancaireSuisse()) ;
		this.setCompteBancaireSuisse(this.getCompteBancaireSuisse() + this.getBudget());
	}

}
