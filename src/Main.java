import models.Compte;
import models.CompteTaux;
import models.operations.Credit;
import models.operations.Debit;
import models.operations.Operation;

public class Main {

    public static void main(String[] args) {

        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(433443, 1000);
        comptes[1] = new CompteTaux(433443, 1000, 2.9);

        for (Compte compte : comptes) {
            System.out.println(compte);
        }

        Operation[] operations = new Operation[4];
        operations[0] = new Credit("date1", 1);
        operations[1] = new Debit("date2", 2);
        operations[2] = new Credit("date3", 3);
        operations[3] = new Debit("date4", 5);

        int montantGlobal = 0;
        for (Operation operation : operations) {
            if (operation.getType().equals("CREDIT"))
                montantGlobal += operation.getMontant();
            else
                montantGlobal -= operation.getMontant();
            System.out.println(operation);
        }

        System.out.println("Montant global " + montantGlobal);

    }

}
