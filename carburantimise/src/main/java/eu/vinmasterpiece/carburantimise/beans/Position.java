package eu.vinmasterpiece.carburantimise.beans;

/**
 * Created by vincenzo on 26/01/16.
 */
public class Position {
    private Double second;
    private Double first;

    public Double getSecond() {
        return second;
    }

    public void setSecond(Double second) {
        this.second = second;
    }

    public Double getFirst() {
        return first;
    }

    public void setFirst(Double first) {
        this.first = first;
    }

    public Position(Double second, Double first) {
        this.second = second;
        this.first = first;
    }

    public Position() {}
}
