/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.otica.testes;

import br.com.otica.util.FabricaConexao;
import java.sql.Connection;

/**
 *
 * @author Rafael
 */
public class TesteConexao {

    public static void main(String[] args) {

        Connection conexao = FabricaConexao.abrirConexao();

        if (conexao != null) {

            System.out.println("\nConectado!\n");

        } else {

            System.out.println("\nNão conectado!!\n");
        }

        FabricaConexao.fecharConexao();

    }
}
