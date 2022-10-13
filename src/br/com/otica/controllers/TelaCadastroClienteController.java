/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otica.controllers;

import br.com.otica.dao.ClientesDAO;
import br.com.otica.modelos.Clientes;
import br.com.otica.view.atendimento.TelaCadastroCliente;

/**
 *
 * @author Rafael
 */
public class TelaCadastroClienteController {

    private final TelaCadastroCliente view;

    //CONSTRUTOR
    public TelaCadastroClienteController(TelaCadastroCliente view) {
        this.view = view;
    }
    
    public void cadastrarCliente(){
        
        String nome = view.getjTextFieldNome().getText();
        String cpf = view.getjFormattedTextFieldCPF().getText();
        String email = view.getjTextFieldEmail().getText();
        String celular1 = view.getjFormattedTextFieldTelefone().getText();
        String celular2 = view.getjFormattedTextFieldCelular().getText();
        String data_nascimento = view.getjFormattedTextFieldDatNasc().getText();
        
        Clientes novoCliente = new Clientes(nome, cpf, email, celular1, celular2, data_nascimento);
        
        ClientesDAO dao = new ClientesDAO();
        
        dao.cadastrarCliente(novoCliente);
        
    }
    
}
