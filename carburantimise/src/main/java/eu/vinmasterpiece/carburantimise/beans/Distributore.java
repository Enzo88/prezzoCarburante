package eu.vinmasterpiece.carburantimise.beans;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Date;
import java.util.List;

import eu.vinmasterpiece.carburantimise.util.DateConverter;

/**
 * Created by vincenzo on 26/01/16.
 */
public class Distributore {
    private String bnd;
    private String addr;
    @JsonDeserialize(converter = DateConverter.class)
    private Date dIns;
    private Double lat;
    private Double lon;
    private List<Carburante> carburanti;
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBnd() {
        return bnd;
    }

    public void setBnd(String bnd) {
        this.bnd = bnd;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Date getdIns() {
        return dIns;
    }

    public void setdIns(Date dIns) {
        this.dIns = dIns;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public List<Carburante> getCarburanti() {
        return carburanti;
    }

    public void setCarburanti(List<Carburante> carburanti) {
        this.carburanti = carburanti;
    }
}
