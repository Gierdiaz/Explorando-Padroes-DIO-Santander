package Facade;

import subSistema.cep.CepApi;
import subSistema.crm.CrmServer;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarCidade(cep);
        
        CrmServer.gravarCliente(nome, cep, cidade, estado);
    }
}