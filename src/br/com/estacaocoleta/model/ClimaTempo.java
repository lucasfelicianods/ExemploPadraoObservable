package br.com.estacaocoleta.model;

import br.com.estacaocoleta.model.Interface.Observer;
import br.com.estacaocoleta.model.Interface.Subject;

public class ClimaTempo implements Observer {

    private ColetorInformacoesMetereologicas coletorInformacoesMetereologicas;

    private InformacaoMetereologica informacaoMetereologica;

    public ClimaTempo(ColetorInformacoesMetereologicas coletorInformacoesMetereologicas) {
        this.coletorInformacoesMetereologicas = coletorInformacoesMetereologicas;
    }

    public InformacaoMetereologica getInformacaoMetereologica() {
        return informacaoMetereologica;
    }

    public void setInformacaoMetereologica(InformacaoMetereologica informacaoMetereologica) {
        this.informacaoMetereologica = informacaoMetereologica;
    }

    @Override
    public void update() {
        this.informacaoMetereologica = coletorInformacoesMetereologicas.getState();
    }
}
