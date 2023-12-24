package ws;


import java.util.Date;

public class Compte {
    private  int code;
    private  double solde;
    private Date dateCeation;

    public Compte(int code, double solde, Date dateCeation) {
        this.code = code;
        this.solde = solde;
        this.dateCeation = dateCeation;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCeation() {
        return dateCeation;
    }

    public void setDateCeation(Date dateCeation) {
        this.dateCeation = dateCeation;
    }
}

