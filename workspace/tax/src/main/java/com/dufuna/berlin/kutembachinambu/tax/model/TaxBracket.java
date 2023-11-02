package com.dufuna.berlin.kutembachinambu.tax.model;

import javax.persistence.*;

@Entity
@Table(name = "tax_brackets")
public class TaxBracket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(nullable = false)
    private float bracketStart;

    @Column(nullable = false)
    private float bracketEnd;

    @Column(nullable = false)
    private float dueTax;

    @Column(nullable = false)
    private float rate;


    public TaxBracket(){
        this.id = id;
        this.bracketStart = bracketStart;
        this.bracketEnd = bracketEnd;
        this.dueTax = dueTax;
        this.rate = rate;
    }
    public TaxBracket(Integer id, Float bracketStart,Float bracketEnd, Float dueTax, Float rate){
        this.id = id;
        this.bracketStart = bracketStart;
        this.bracketEnd = bracketEnd;
        this.dueTax = dueTax;
        this.rate = rate;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public float getBracketStart() {
        return bracketStart;
    }
    public void setBracketStart(float bracketStart) {

        this.bracketStart = bracketStart;
    }

    public float getBracketEnd() {
        return bracketEnd;
    }
    public void setBracketEnd(float bracketEnd) {

        this.bracketEnd = bracketEnd;
    }
    public float getDueTax() {

        return dueTax;
    }
    public void setDueTax(float dueTax) {

        this.dueTax = dueTax;
    }
    public float getRate() {

        return rate;
    }
    public void setRate(float rate) {

        this.rate = rate;
    }

}
