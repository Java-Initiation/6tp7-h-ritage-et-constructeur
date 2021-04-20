package models;

public class Compte {

    private static int ctCompte = 0;
    private int idcompte;
    private int numerocompte;
    private int soldeCompte;

    public Compte(int numerocompte, int soldeCompte) {
        this.idcompte = ctCompte++;
        this.numerocompte = numerocompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumerocompte() {
        return numerocompte;
    }

    public void setNumerocompte(int numerocompte) {
        this.numerocompte = numerocompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id compte= " + idcompte +
                " numerocompte= " + getNumerocompte() +
                ", soldeCompte= " + getSoldeCompte() +
                '}';
    }

}