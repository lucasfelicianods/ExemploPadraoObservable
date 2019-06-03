package br.com.estacaocoleta.model;

import br.com.estacaocoleta.model.Abstract.SubjectAbstract;

public class ColetorInformacoesMetereologicas extends SubjectAbstract {

    private InformacaoMetereologica informacaoMetereologica;

    public ColetorInformacoesMetereologicas() {
        this.informacaoMetereologica = new InformacaoMetereologica();
    }

    public ColetorInformacoesMetereologicas(InformacaoMetereologica informacaoMetereologica) {
        this.informacaoMetereologica = informacaoMetereologica;
    }

    public void setInformacaoMetereologica(InformacaoMetereologica informacaoMetereologica) {
        this.informacaoMetereologica = informacaoMetereologica;

        setChanged();
        notifyObservers();
    }

    public InformacaoMetereologica getState() {
        return informacaoMetereologica;
    }


    public void setTemperatura(Double temperatura) {
        this.getState().setTemperatura(temperatura);
        setChanged();
        notifyObservers();
    }

    public Double getTemperatura() {
        return this.getState().getTemperatura();
    }

    public void setUmidade(Double umidade) {
        this.informacaoMetereologica.setUmidade(umidade);
        setChanged();
        notifyObservers();
    }

    public Double getUmidade() {
        return this.informacaoMetereologica.getUmidade();
    }

    public void setPressao(Double pressao) {
        this.getState().setPressao(pressao);
        setChanged();
        notifyObservers();
    }

    public Double getPressao() {
        return this.informacaoMetereologica.getPressao();
    }
}
