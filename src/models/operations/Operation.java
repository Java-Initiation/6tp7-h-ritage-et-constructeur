package models.operations;

public abstract class Operation {

    private String date;
    private int montant;

    public Operation(String date, int montant) {
        this.date = date;
        this.montant = montant;
    }

    public abstract String getType();

    public int getMontant() {
        return montant;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type='" + getType() + '\'' +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }

}
