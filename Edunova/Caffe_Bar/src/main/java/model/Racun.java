/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Grbeš
 */
@Entity
public class Racun extends Entitet{
    @ManyToOne
    private Zaposlenik zaposlenik;
    
    private Date datVrijeme;
    private Integer brojRacuna;

    public Zaposlenik getZaposlenik() {
        return zaposlenik;
    }

    public void setZaposlenik(Zaposlenik zaposlenik) {
        this.zaposlenik = zaposlenik;
    }

    public Date getDatVrijeme() {
        return datVrijeme;
    }

    public void setDatVrijeme(Date datVrijeme) {
        this.datVrijeme = datVrijeme;
    }

    public Integer getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(Integer brojRacuna) {
        this.brojRacuna = brojRacuna;
    }
    
}
