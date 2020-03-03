/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author Grbeš
 */
@Entity(name="smjer")
public class Smjer extends Entitet{
    private String naziv;
    private BigDecimal trajanje;
    private BigDecimal cijena;
    private BigDecimal upisnina;
    private Boolean verificiran;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(BigDecimal trajanje) {
        this.trajanje = trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public BigDecimal getUpisnina() {
        return upisnina;
    }

    public void setUpisnina(BigDecimal upisnina) {
        this.upisnina = upisnina;
    }

    public Boolean getVerificiran() {
        return verificiran;
    }

    public void setVerificiran(Boolean verificiran) {
        this.verificiran = verificiran;
    }
    
    
    
}
