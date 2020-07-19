
public class EluMafieux extends Elu {

	public EluMafieux() {
		// TODO Auto-generated constructor stub
	}

	public EluMafieux(String nom, String prenom, double Solde ,double budget) {
		super(nom, prenom, Solde,budget);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	
	public void embaucherAssistant(Personne assistant) {
		if(assistant.getName().equals(this.getName())) {
			this.getAssistants().add(assistant);
		}
		
	}
	
	public boolean isMafieux() {
		
		boolean mafieux=false;
		for(Personne assist : this.getAssistants()) {
			if (assist.getName().equals(this.getName())){
				mafieux=true;
			}
		}
		return mafieux;
	}

}
