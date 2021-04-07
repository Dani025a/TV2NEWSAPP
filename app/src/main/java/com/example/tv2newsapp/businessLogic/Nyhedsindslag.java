package com.example.tv2newsapp.businessLogic;

public class Nyhedsindslag {
    String overskrift;
    String teaserTekst;
    String linkTillStillBillede;
    String udgivelsesDato;
    boolean udgivelsesStatus;
    boolean slettet;

    public Nyhedsindslag(String overskrift, String teaserTekst, String linkTillStillBillede) {
        this.overskrift = overskrift;
        this.teaserTekst = teaserTekst;
        this.linkTillStillBillede = linkTillStillBillede;
    }

    public String getOverskrift() {
        return overskrift;
    }

    public String getTeaserTekst() {
        return teaserTekst;
    }

    public String getLinkTillStillBillede() {
        return linkTillStillBillede;
    }

    public String getUdgivelsesDato() {
        return udgivelsesDato;
    }
    public boolean slettet(){
        return slettet;
    }

    public boolean udgivelsesStatus(){
        return udgivelsesStatus;
    }

    public void setOverskrift(String overskrift) {
        this.overskrift = overskrift;
    }

    public void setTeaserTekst(String teaserTekst) {
        this.teaserTekst = teaserTekst;
    }

    public void setLinkTillStillBillede(String linkTillStillBillede) {
        this.linkTillStillBillede = linkTillStillBillede;
    }

    public void setUdgivelsesDato(String udgivelsesDato) {
        this.udgivelsesDato = udgivelsesDato;
    }

    public void setUdgivelsesStatus(boolean udgivelsesStatus) {
        this.udgivelsesStatus = udgivelsesStatus;
    }

    public void setSlettet(boolean slettet) {
        this.slettet = slettet;
    }
}
