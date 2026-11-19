package rmiclient;

import rmiservice.IConversion;
import java.rmi.Naming;

public class conversionclient {
    public static void main(String[] args) {
        try {
            IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1099/ConversionService");
            double resultat = stub.convertirMontant(500);
            System.out.println("500 EUR = " + resultat + " TND");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}