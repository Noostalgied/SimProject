package com.sim.ws.SimProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Bug {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String  videojoc;
    private String  usuari;
    private Date    dataDelBug;
    private String  plataforma;
    private String  paisDeConnexio;
    private String  email;
    private String  descripcioBreu;
    private String  descripcio;
    private String  categoria;
    private String  prioritat;
    private String  estat;

    public String getVideojoc() {
        return videojoc;
    }

    public void setVideojoc(String videojoc) {
        this.videojoc = videojoc;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public Date getDataDelBug() {
        return dataDelBug;
    }

    public void setDataDelBug(Date dataDelBug) {
        this.dataDelBug = dataDelBug;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getPaisDeConnexio() {
        return paisDeConnexio;
    }

    public void setPaisDeConnexio(String paisDeConnexio) {
        this.paisDeConnexio = paisDeConnexio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcioBreu() {
        return descripcioBreu;
    }

    public void setDescripcioBreu(String descripcioBreu) {
        this.descripcioBreu = descripcioBreu;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrioritat() {
        return prioritat;
    }

    public void setPrioritat(String prioritat) {
        this.prioritat = prioritat;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "videojoc=" + videojoc +
                ", usuari='" + usuari + '\'' +
                ", dataDelBug='" + dataDelBug + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", paisDeConnexio=" + paisDeConnexio +
                ", email='" + email + '\'' +
                ", descripcioBreu='" + descripcioBreu + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", categoria='" + categoria + '\'' +
                ", prioritat='" + prioritat + '\'' +
                ", estat='" + estat + '\'' +
                '}';
    }
}

