package eu.vinmasterpiece.carburantimise.enumerations;

/**
 * Created by vincenzo on 24/01/16.
 */

public enum Regions {
    ABRUZZO(2, "Abruzzo"),
    BASILICATA(3, "Basilicata"),
    CALABRIA(7, "Calabria"),
    CAMPANIA(8, "Campania"),
    EMILIA_ROMAGNA(14, "Emilia Romagna"),
    FRIULI_VENEZIA_GIULIA(15, "Friuli Venezia Giulia"),
    LAZIO(9, "Lazio"),
    LIGURIA(18, "Liguria"),
    LOMBARDIA(19, "Lombardia"),
    MARCHE(1, "Marche"),
    MOLISE(4, "Molise"),
    PIEMONTE(13, "Piemonte"),
    PUGLIA(6, "Puglia"),
    SARDEGNA(10, "Sardegna"),
    SICILIA(11, "Sicilia"),
    TOSCANA(12, "Toscana"),
    TRENTINO_ALTO_ADIGE(5, "Trentino Alto Adige"),
    UMBRIA(20, "Umbria"),
    VALLE_AOSTA(16, "Valle d'Aosta"),
    VENETO(17, "Veneto");

    private String name;
    private int value;

    private Regions(int value, String name) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
