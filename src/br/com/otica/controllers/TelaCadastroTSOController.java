package br.com.otica.controllers;

import br.com.otica.modelos.TSOs;
import br.com.otica.view.atendimento.TelaCadastroTSO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class TelaCadastroTSOController {

    private final TelaCadastroTSO view;

    //CONSTRUTOR
    public TelaCadastroTSOController(TelaCadastroTSO view) {
        this.view = view;
    }
    
    public void cadastrarTSO(){
        
        String numeroTSO = view.getjTextFieldTSO().getText();
        String cpf = view.getjTextFieldCPF().getText();
        String medico = view.getjTextFieldMedico().getText();
        double longe_od_esf = Double.parseDouble(view.getjTextFieldLongeODESF().getText());
        double longe_od_cil = Double.parseDouble(view.getjTextFieldLongeODCIL().getText());
        double longe_od_eixo = Double.parseDouble(view.getjTextFieldLongeODEIXO().getText());
        double longe_oe_esf = Double.parseDouble(view.getjTextFieldLongeOEEIXO().getText());
        double longe_oe_cil = Double.parseDouble(view.getjTextFieldLongeOECIL().getText());
        double longe_oe_eixo = Double.parseDouble(view.getjTextFieldLongeOEEIXO().getText());
        double dnp_od = Double.parseDouble(view.getjTextFieldDNPOD().getText());
        double dnp_oe = Double.parseDouble(view.getjTextFieldDNPOE().getText());
        double perto_od_esf = Double.parseDouble(view.getjTextFieldPertoODESF().getText());
        double perto_od_cil = Double.parseDouble(view.getjTextFieldPertoODCIL().getText());
        double perto_od_eixo = Double.parseDouble(view.getjTextFieldPertoODEIXO().getText());
        double perto_oe_esf = Double.parseDouble(view.getjTextFieldPertoOEESF().getText());
        double perto_oe_cil = Double.parseDouble(view.getjTextFieldPertoOEEIXO().getText());
        double perto_oe_eixo = Double.parseDouble(view.getjTextFieldPertoOEEIXO().getText());
        double altura = Double.parseDouble(view.getjTextFieldAltura().getText());
        String observacao = view.getjTextAreaObservacao().getText();
        double valor = Double.parseDouble(view.getjFormattedTextFieldValor().getText());
        
        TSOs novoTSO = new TSOs(cpf,medico,
                                longe_od_esf,longe_od_cil,longe_od_eixo,
                                longe_oe_esf,longe_oe_cil,longe_oe_eixo,
                                perto_od_esf,perto_od_cil,perto_od_eixo,
                                perto_od_esf,perto_oe_cil,perto_oe_eixo,
                                altura,observacao,valor);
        
        TSOsDAO dao = new TSOsDAO();
        
        dao.cadastrarTSO(novoTSO);
        
    }
    
}
