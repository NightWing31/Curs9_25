// 25. Să se creeze clasele AdresaEmail, Email. Să se simuleze trimiterea şi primirea unui email.
package com.mycompany.curs9_25;

// Clasa pentru adresa de email
class AdresaEmail {
    private String utilizator;
    private String domeniu;

    public AdresaEmail(String utilizator, String domeniu) {
        this.utilizator = utilizator;
        this.domeniu = domeniu;
    }

    public String getAdresaEmail() {
        return utilizator + "@" + domeniu;
    }
}

// Clasa pentru email
class Email {
    private final String subiect;
    private final String continut;
    private final AdresaEmail expeditor;
    private final AdresaEmail destinatar;

    public Email(String subiect, String continut, AdresaEmail expeditor, AdresaEmail destinatar) {
        this.subiect = subiect;
        this.continut = continut;
        this.expeditor = expeditor;
        this.destinatar = destinatar;
    }

    // Simulăm trimiterea unui email
    public void trimite() {
        System.out.println("Email trimis de la: " + expeditor.getAdresaEmail());
        System.out.println("Catre: " + destinatar.getAdresaEmail());
        System.out.println("Subiect: " + subiect);
        System.out.println("Continut: " + continut);
        System.out.println("Email trimis cu succes!");
    }

    // Simulăm primirea unui email
    public void primeste() {
        System.out.println("Email primit de la: " + expeditor.getAdresaEmail());
        System.out.println("Catre: " + destinatar.getAdresaEmail());
        System.out.println("Subiect: " + subiect);
        System.out.println("Continut: " + continut);
        System.out.println("Email primit cu succes!");
    }
}

public class Curs9_25 {
    public static void main(String[] args) {
        // Crearea adreselor de email
        AdresaEmail expeditor = new AdresaEmail("sara.secara", "gmail.com");
        AdresaEmail destinatar = new AdresaEmail("teo.ilie", "yahoo.com");

        // Crearea unui email
        Email email = new Email("Intrebare despre tema", "Buna Teo, am nevoie de cateva informatii despre tema. Mersi!", expeditor, destinatar);

        // Simulam trimiterea si primirea email-ului
        email.trimite();  // Trimiterea email-ului
        System.out.println();  // Linie goala pentru separare
        email.primeste();  // Primirea email-ului
    }
}
