/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otica.modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class Clientes {
    
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private Date data_nascimento;
    private String celular1;
    private String celular2;
    
    public Clientes(String nome, String cpf, String email, String celular1, String celular2, String data_nascimento){
        
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular1 = celular1;
        this.celular2 = celular2;
        
        try {
            this.data_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data_nascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", data_nascimento=" + data_nascimento + ", celular1=" + celular1 + ", celular2=" + celular2 + '}';
    }
    
    
    
}
