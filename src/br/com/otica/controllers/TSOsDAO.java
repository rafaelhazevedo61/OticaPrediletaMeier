/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otica.controllers;

import br.com.otica.dao.UsuariosDAO;
import br.com.otica.modelos.TSOs;
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
class TSOsDAO {
    
    public void cadastrarTSO(TSOs novoTSO){

        try {

            Connection conexao = FabricaConexao.abrirConexao();

            PreparedStatement pst = null;

            String sql = "INSERT INTO tl_tsos ";
            sql += " ( ";
            sql += " cpf, medico, ";
            sql += " longe_od_esf, longe_od_cil, longe_od_eixo, ";
            sql += " longe_oe_esf, longe_oe_cil, longe_oe_eixo, ";
            sql += " perto_od_esf, perto_od_cil, perto_od_eixo, ";
            sql += " perto_oe_esf, perto_oe_cil, perto_oe_eixo, ";
            sql += " altura, observacao, valor ";
            sql += " ) ";
            sql += " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

            pst = conexao.prepareStatement(sql);

            pst.setString(1, novoTSO.getCpf());
            pst.setString(2, novoTSO.getMedico());
            pst.setDouble(3, novoTSO.getLonge_od_esf());
            pst.setDouble(4, novoTSO.getLonge_od_cil());
            pst.setDouble(5, novoTSO.getLonge_od_eixo());
            pst.setDouble(6, novoTSO.getLonge_oe_esf());
            pst.setDouble(7, novoTSO.getLonge_oe_cil());
            pst.setDouble(8, novoTSO.getLonge_oe_eixo());
            pst.setDouble(9, novoTSO.getPerto_od_esf());
            pst.setDouble(10, novoTSO.getPerto_od_cil());
            pst.setDouble(11, novoTSO.getPerto_od_eixo());
            pst.setDouble(12, novoTSO.getPerto_oe_esf());
            pst.setDouble(13, novoTSO.getPerto_oe_cil());
            pst.setDouble(14, novoTSO.getPerto_oe_eixo());
            pst.setDouble(15, novoTSO.getAltura());
            pst.setString(16, novoTSO.getObservacao());
            pst.setDouble(17, novoTSO.getValor());

            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(TSOsDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            FabricaConexao.fecharConexao();
        }
        
    }
    
}
