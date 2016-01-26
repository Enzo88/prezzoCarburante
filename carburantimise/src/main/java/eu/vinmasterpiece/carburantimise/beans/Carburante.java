package eu.vinmasterpiece.carburantimise.beans;

/**
 * Created by vincenzo on 26/01/16.
 */
public class Carburante {
    private Integer idDettCarbRid;
    private Integer idCarb;
    private String carb;
    private int isSelf;
    private Double prezzo;

    public Integer getIdDettCarbRid() {
        return idDettCarbRid;
    }

    public void setIdDettCarbRid(Integer idDettCarbRid) {
        this.idDettCarbRid = idDettCarbRid;
    }

    public Integer getIdCarb() {
        return idCarb;
    }

    public void setIdCarb(Integer idCarb) {
        this.idCarb = idCarb;
    }

    public String getCarb() {
        return carb;
    }

    public void setCarb(String carb) {
        this.carb = carb;
    }

    public int getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(int isSelf) {
        this.isSelf = isSelf;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
}
