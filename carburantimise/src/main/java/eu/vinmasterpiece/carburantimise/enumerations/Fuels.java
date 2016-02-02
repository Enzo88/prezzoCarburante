package eu.vinmasterpiece.carburantimise.enumerations;

/**
 * Created by vincenzo on 24/01/16.
 */
public enum Fuels {
    BENZINA("1-x", "Benzina"),
    BENZINA_SELF("1-1", "Benzina (Self)"),
    BENZINA_SERVITO("1-0", "Benzina (Servito)"),
    GASOLIO("2-x", "Gasolio"),
    GASOLIO_SELF("2-1", "Gasolio (Self)"),
    GASOLIO_SERVITO("2-0", "Gasolio (Servito)"),
    METANO("3-x", "Metano"),
    GPL("4-x", "GPL");

    private String name;
    private String value;

    private Fuels(String value, String name) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
