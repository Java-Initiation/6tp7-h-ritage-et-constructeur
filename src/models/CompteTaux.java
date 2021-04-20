package models;

public class CompteTaux extends Compte {

    private double taux;

    public CompteTaux(int numerocompte, int soldeCompte, double taux) {
        super(numerocompte, soldeCompte);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                "taux=" + taux +
                '}' + super.toString();
    }
}
