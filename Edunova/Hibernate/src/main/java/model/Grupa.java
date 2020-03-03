/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Grbeš
 */

@Entity(name="grupa")
public class Grupa extends Entitet{
    private String naziv;
    @ManyToOne
    private Smjer smjer;
    @ManyToOne
    private Predavac predavac;
    
    private Integer brojPolaznika;
    
    private Date datumPocetka;
    @ManyToMany
    @Column(name="clan")
    private List<Polaznik> polaznici=new ArrayList<>();

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public Integer getBrojPolaznika() {
        return brojPolaznika;
    }

    public void setBrojPolaznika(Integer brojPolaznika) {
        this.brojPolaznika = brojPolaznika;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
    
    
}
