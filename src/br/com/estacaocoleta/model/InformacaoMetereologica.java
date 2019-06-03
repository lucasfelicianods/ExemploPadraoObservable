package br.com.estacaocoleta.model;

public class InformacaoMetereologica {

    private Double temperatura;

    private Double pressao;

    private Double umidade;

    public InformacaoMetereologica() {
        temperatura = 0.0;
        pressao = 0.0;
        umidade = 0.0;
    }

    public InformacaoMetereologica(Double temperatura, Double pressao, Double umidade) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.umidade = umidade;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getPressao() {
        return pressao;
    }

    public void setPressao(Double pressao) {
        this.pressao = pressao;
    }

    public Double getUmidade() {
        return umidade;
    }

    public void setUmidade(Double umidade) {
        this.umidade = umidade;
    }

    @Override
    public String toString() {
        return "Informação Metereológica {" +
                "temperatura: " + temperatura +
                ", pressao: " + pressao +
                ", umidade: " + umidade +
                '}';
    }
}
