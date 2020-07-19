import java.util.ArrayList;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Elu>  elus=new ArrayList<Elu>();
		
		ArrayList<Personne> assistantElu1=new ArrayList<Personne>();
		ArrayList<Personne> assistantElu2=new ArrayList<Personne>();
		ArrayList<Personne> assistantElu3=new ArrayList<Personne>();

		Personne personne1=new Personne("chmmem","rym",4500);
		Personne personne2=new Personne("chmmem","rymm",5000);
		Personne personne3=new Personne("zzzz","rpm",4500);
		Personne personne4=new Personne("zzzz","pomm",5000);
		Personne personne5=new Personne("xxx","rdpm",8500);
		Personne personne6=new Personne("yyy","pocmm",6000);
		
		assistantElu1.add(personne1);
		assistantElu1.add(personne2);
		assistantElu2.add(personne3);
		assistantElu2.add(personne4);
		assistantElu3.add(personne5);
		assistantElu3.add(personne6);


		EluEconome elu=new EluEconome("sadaoui", "ezzedie", 8000, 4200);
		elu.setAssistants(assistantElu1);
		elus.add(elu);
		
		EluMafieux mf= new EluMafieux("zzzz", "aaaa", 500000, 4500);
		mf.setAssistants(assistantElu2);
		elus.add(mf);
		
		EluEscroc eluEscroc= new EluEscroc("saaa", "dddd", 250000, 5000, 1000);
		eluEscroc.setAssistants(assistantElu3);
		elus.add(eluEscroc);
		
		for (Elu element : elus) {
			//element.verserDotation(element.getAssistants());
			if (element.getClass().getName().equals("EluMafieux")) {
				
				//System.out.println("traitement EluMafieux: "+ element.getClass().getName());
				((EluMafieux) element).verserDotation(assistantElu2);
				
			}else if(element.getClass().getName().equals("EluEscroc")) {
				
				//System.out.println("traitement EluEscroc"+element.getClass().getName());
				((EluEscroc)element).verserDotation(assistantElu3);
				System.out.println( " comptee Swisse de l'eelu : "+((EluEscroc)element).getCompteBancaireSuisse());
				
			}else {
				//System.out.println("traitement EluEconome  ; "+element.getClass().getName());
				((EluEconome)element).verserDotation(assistantElu1);
				System.out.println(" Nouveau Budget "+((EluEconome)element).getBudget());
				
			}
				
		}
		
	}

}
