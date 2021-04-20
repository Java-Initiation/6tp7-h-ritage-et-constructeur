import models.Compte;
import models.CompteTaux;

public class Main {

    public static void main(String[] args) {

        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(433443, 1000);
        comptes[1] = new CompteTaux(433443, 1000, 2.9);

        for (Compte compte : comptes) {
            System.out.println(compte);
        }

    }

}
