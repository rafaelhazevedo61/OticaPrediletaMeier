/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otica.modelos;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Usuarios {

    private int id;
    private String usuario;
    private String senha;
    private String nome;
    private String email;
    private int permissao;
    private Date data_criacao;
    private String quem_criou;
    private Date data_alteracao;
    private String quem_alterou;

    public Usuarios(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }

    public Date getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(Date data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getQuem_criou() {
        return quem_criou;
    }

    public void setQuem_criou(String quem_criou) {
        this.quem_criou = quem_criou;
    }

    public Date getData_alteracao() {
        return data_alteracao;
    }

    public void setData_alteracao(Date data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    public String getQuem_alterou() {
        return quem_alterou;
    }

    public void setQuem_alterou(String quem_alterou) {
        this.quem_alterou = quem_alterou;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", usuario=" + usuario + ", senha=" + senha + ", nome=" + nome + ", email=" + email + ", permissao=" + permissao + ", data_criacao=" + data_criacao + ", quem_criou=" + quem_criou + ", data_alteracao=" + data_alteracao + ", quem_alterou=" + quem_alterou + '}';
    }
    
    

}
