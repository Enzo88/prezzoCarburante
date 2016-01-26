package eu.vinmasterpiece.carburantimise.beans;

/**
 * Created by vincenzo on 26/01/16.
 */
public class CarburantiResponse {
    private Boolean success;
    private Position center;
    private Boolean priceSort;
    private Distributore array;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Position getCenter() {
        return center;
    }

    public void setCenter(Position center) {
        this.center = center;
    }

    public Boolean getPriceSort() {
        return priceSort;
    }

    public void setPriceSort(Boolean priceSort) {
        this.priceSort = priceSort;
    }

    public Distributore getArray() {
        return array;
    }

    public void setArray(Distributore array) {
        this.array = array;
    }
}
