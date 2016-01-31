package eu.vinmasterpiece.carburantimise.beans;

import java.util.List;

/**
 * Created by vincenzo on 26/01/16.
 */
public class CarburantiResponse {
    private Boolean success;
    private Position center;
    private Boolean priceSort;
    private List<Distributore> array;

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

    public List<Distributore> getArray() {
        return array;
    }

    public void setArray(List<Distributore> array) {
        this.array = array;
    }
}
