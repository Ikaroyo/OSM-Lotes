/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author emman
 */
public class Lote {

    long nroLote;
    double efectivo = 0;
    double credito = 0;
    double debito = 0;
    double cheques = 0;
    double compensacion = 0;
    double municipalidad = 0;
    LocalDate fecha;
    String usuario = "";

    public Lote() {
    }

    public Lote(long  nroLote, double efectivo, double credito, double debito, double cheques, double compensacion, double municipalidad, LocalDate fecha, String usuario) {
        this.nroLote=nroLote;
        this.efectivo = efectivo;
        this.credito = credito;
        this.debito = debito;
        this.cheques = cheques;
        this.compensacion = compensacion;
        this.municipalidad = municipalidad;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public long getNroLote() {
        return nroLote;
    }

    public void setNroLote(long nroLote) {
        this.nroLote = nroLote;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCheques() {
        return cheques;
    }

    public void setCheques(double cheques) {
        this.cheques = cheques;
    }

    public double getCompensacion() {
        return compensacion;
    }

    public void setCompensacion(double compensacion) {
        this.compensacion = compensacion;
    }

    public double getMunicipalidad() {
        return municipalidad;
    }

    public void setMunicipalidad(double municipalidad) {
        this.municipalidad = municipalidad;
    }

}
