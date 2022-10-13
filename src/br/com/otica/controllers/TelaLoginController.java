/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otica.controllers;

import br.com.otica.dao.UsuariosDAO;
import br.com.otica.modelos.Usuarios;
import br.com.otica.view.TelaLogin;
import br.com.otica.view.TelaSelecaoModulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class TelaLoginController {

    private final TelaLogin view;

    private final UsuariosDAO usuariosDAO = new UsuariosDAO();

    //CONSTRUTOR
    public TelaLoginController(TelaLogin view) {
        this.view = view;
    }
    
    public void autenticarUsuarios(){

        String usuario = view.getjTextFieldUsuario().getText();
        String capturaSenha = new String(view.getjPasswordFieldSenha().getPassword()); 
        String senha = capturaSenha;
        
        Usuarios validaUsuario = new Usuarios(usuario, senha);

        boolean usuarioExiste = usuariosDAO.ExisteUsuario(validaUsuario);

        if (usuarioExiste == true) {

            JOptionPane.showMessageDialog(null, "Usuário conectado com sucesso!");

            System.setProperty("usuarioLogado", usuario);

            chamarTelaPrincipal();
            
        } else {

            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");

        }
        
    }
    
    public void chamarTelaPrincipal(){
        
        System.out.println("Monitoramento - Classe LoginController - Método chamarTelaSelecaoModulo()");
        
        TelaSelecaoModulo tela = new TelaSelecaoModulo();
        tela.setVisible(true);
        view.dispose();
        
    }
    
}
