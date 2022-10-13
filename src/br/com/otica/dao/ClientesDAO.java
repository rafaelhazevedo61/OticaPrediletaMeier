/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otica.dao;

import br.com.otica.modelos.Clientes;
import br.com.otica.util.Data;
import br.com.otica.util.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ClientesDAO {

    public void cadastrarCliente(Clientes novoCliente) {

        try {

            Connection conexao = FabricaConexao.abrirConexao();

            PreparedStatement pst = null;

            String sql = "INSERT INTO tl_clientes ";
            sql += " (nome, cpf, email, celular1, celular2, data_nascimento) ";
            sql += " VALUES (?,?,?,?,?,?);";

            pst = conexao.prepareStatement(sql);

            pst.setString(1, novoCliente.getNome());
            pst.setString(2, novoCliente.getCpf());
            pst.setString(3, novoCliente.getEmail());
            pst.setString(4, novoCliente.getCelular1());
            pst.setString(5, novoCliente.getCelular2());
            pst.setDate(6, Data.ConvertDataFormParaBanco(novoCliente.getData_nascimento()));

            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            FabricaConexao.fecharConexao();
        }

    }

}
