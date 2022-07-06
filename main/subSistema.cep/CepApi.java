package subSistema.cep;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public void recuperarCidade(String cep) {
        return "Rio de Janeiro";
    }

    public void recuperarCep(String cep) {
        return "RJ";
    }
}
