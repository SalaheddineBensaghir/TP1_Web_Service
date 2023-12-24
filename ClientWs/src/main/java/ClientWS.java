

import proxy.Banque;
import proxy.BanqueService;
import proxy.Compte;

import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        BanqueService proxy = new Banque().getBanqueServicePort();
        System.out.println(proxy.convert(10));
        System.out.println(proxy.getCompte(4));
        System.out.println(proxy.listeCompte());
        Compte cp1 =proxy.getCompte(5);
        System.out.println("Code : "+cp1.getCode());
        System.out.println("Solde : "+cp1.getSolde());
        System.out.println("Date Creation : "+cp1.getDateCeation());
        List<Compte> compteList = proxy.listeCompte();
        for(Compte c : compteList){
            System.out.println("Code : "+c.getCode());
            System.out.println("Solde : "+c.getSolde());
            System.out.println("Date Creation : "+c.getDateCeation());
        }
    }
}

