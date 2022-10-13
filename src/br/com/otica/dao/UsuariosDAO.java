/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otica.dao;

import br.com.otica.modelos.Usuarios;
import br.com.otica.util.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael
 */
public class UsuariosDAO {
    

    public boolean ExisteUsuario(Usuarios usuario) {

        Connection conexao = FabricaConexao.abrirConexao();

        PreparedStatement pst = null;
        ResultSet rs = null;

        boolean retorno = false;

        try {

            String sql = "select * "
                    + "from usuarios "
                    + "where "
                    + "usuario = ? "
                    + "and senha = ? ";

            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getSenha());

            pst.execute();

            rs = pst.getResultSet();

            if (rs.next() == true) {

                retorno = true;

            } else {

                retorno = false;

            }

        } catch (SQLException ex) {

            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {

            FabricaConexao.fecharConexao();

        }

        return retorno;

    }
}
