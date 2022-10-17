/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otica.modelos;

/**
 *
 * @author Rafael
 */
public class TSOs {

    private int id;
    private String cpf;
    private String medico;
    private double longe_od_esf;
    private double longe_od_cil;
    private double longe_od_eixo;
    private double longe_oe_esf;
    private double longe_oe_cil;
    private double longe_oe_eixo;
    private double perto_od_esf;
    private double perto_od_cil;
    private double perto_od_eixo;
    private double perto_oe_esf;
    private double perto_oe_cil;
    private double perto_oe_eixo;
    private double altura;
    private String observacao;
    private double valor;

    public TSOs(String cpf, String medico, 
            double longe_od_esf, double longe_od_cil, double longe_od_eixo, 
            double longe_oe_esf, double longe_oe_cil, double longe_oe_eixo, 
            double perto_od_esf, double perto_od_cil, double perto_od_eixo, 
            double perto_oe_esf, double perto_oe_cil, double perto_oe_eixo, 
            double altura, String observacao, double valor) {
        this.cpf = cpf;
        this.medico = medico;
        this.longe_od_esf = longe_od_esf;
        this.longe_od_cil = longe_od_cil;
        this.longe_od_eixo = longe_od_eixo;
        this.longe_oe_esf = longe_oe_esf;
        this.longe_oe_cil = longe_oe_cil;
        this.longe_oe_eixo = longe_oe_eixo;
        this.perto_od_esf = perto_od_esf;
        this.perto_od_cil = perto_od_cil;
        this.perto_od_eixo = perto_od_eixo;
        this.perto_oe_esf = perto_oe_esf;
        this.perto_oe_cil = perto_oe_cil;
        this.perto_oe_eixo = perto_oe_eixo;
        this.altura = altura;
        this.observacao = observacao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public double getLonge_od_esf() {
        return longe_od_esf;
    }

    public void setLonge_od_esf(double longe_od_esf) {
        this.longe_od_esf = longe_od_esf;
    }

    public double getLonge_od_cil() {
        return longe_od_cil;
    }

    public void setLonge_od_cil(double longe_od_cil) {
        this.longe_od_cil = longe_od_cil;
    }

    public double getLonge_od_eixo() {
        return longe_od_eixo;
    }

    public void setLonge_od_eixo(double longe_od_eixo) {
        this.longe_od_eixo = longe_od_eixo;
    }

    public double getLonge_oe_esf() {
        return longe_oe_esf;
    }

    public void setLonge_oe_esf(double longe_oe_esf) {
        this.longe_oe_esf = longe_oe_esf;
    }

    public double getLonge_oe_cil() {
        return longe_oe_cil;
    }

    public void setLonge_oe_cil(double longe_oe_cil) {
        this.longe_oe_cil = longe_oe_cil;
    }

    public double getLonge_oe_eixo() {
        return longe_oe_eixo;
    }

    public void setLonge_oe_eixo(double longe_oe_eixo) {
        this.longe_oe_eixo = longe_oe_eixo;
    }

    public double getPerto_od_esf() {
        return perto_od_esf;
    }

    public void setPerto_od_esf(double perto_od_esf) {
        this.perto_od_esf = perto_od_esf;
    }

    public double getPerto_od_cil() {
        return perto_od_cil;
    }

    public void setPerto_od_cil(double perto_od_cil) {
        this.perto_od_cil = perto_od_cil;
    }

    public double getPerto_od_eixo() {
        return perto_od_eixo;
    }

    public void setPerto_od_eixo(double perto_od_eixo) {
        this.perto_od_eixo = perto_od_eixo;
    }

    public double getPerto_oe_esf() {
        return perto_oe_esf;
    }

    public void setPerto_oe_esf(double perto_oe_esf) {
        this.perto_oe_esf = perto_oe_esf;
    }

    public double getPerto_oe_cil() {
        return perto_oe_cil;
    }

    public void setPerto_oe_cil(double perto_oe_cil) {
        this.perto_oe_cil = perto_oe_cil;
    }

    public double getPerto_oe_eixo() {
        return perto_oe_eixo;
    }

    public void setPerto_oe_eixo(double perto_oe_eixo) {
        this.perto_oe_eixo = perto_oe_eixo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
    @Override
    public String toString() {
        return "TSOs{" + "id=" + id + ", cpf=" + cpf + ", medico=" + medico + ", longe_od_esf=" + longe_od_esf + ", longe_od_cil=" + longe_od_cil + ", longe_od_eixo=" + longe_od_eixo + ", longe_oe_esf=" + longe_oe_esf + ", longe_oe_cil=" + longe_oe_cil + ", longe_oe_eixo=" + longe_oe_eixo + ", perto_od_esf=" + perto_od_esf + ", perto_od_cil=" + perto_od_cil + ", perto_od_eixo=" + perto_od_eixo + ", perto_oe_esf=" + perto_oe_esf + ", perto_oe_cil=" + perto_oe_cil + ", perto_oe_eixo=" + perto_oe_eixo + ", altura=" + altura + ", observacao=" + observacao + ", valor=" + valor + '}';
    }

}
