package compte_bancaire;

public class Compte {
	public double solde=0;
	public Compte(double solde) {
		this.solde=solde;	}
	public void setSolde(double solde) {
		this.solde=solde;	}
	public double getSolde() {
		return solde;
	}
	public double debiter(double montant) {
		double resultat=0;
		if (montant<solde) {
			resultat=solde-montant;	
		}
		return resultat;
			
	}
	public double crediter(double montant) {
		return solde+=montant;
			
	}
	public double consulter() {
		return solde;
		
	}
	public void virement(double montant) {
		solde+=montant;
		
	}
	public double initialisation(double montant) {
		solde+=montant;
		return solde;
	}


}
