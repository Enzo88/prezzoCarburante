package eu.vinmasterpiece.carburantimise.enumerations;

/**
 * Created by vincenzo on 26/01/16.
 */
public enum Order {
    ASC("asc"), DESC("desc");

    private String value;

    private Order(String value) {
        this.value = value;
    }
}
