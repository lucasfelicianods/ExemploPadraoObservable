package br.com.estacaocoleta;

import br.com.estacaocoleta.model.*;
import br.com.estacaocoleta.model.Interface.Observer;

public class App {

    public static void main(String[] args) {

        // Criando objeto observavel
        ColetorInformacoesMetereologicas coletorInformacoesMetereologicas = new ColetorInformacoesMetereologicas();

        // Criando Obervador e inscrevendo ele para receber mudanças
        ClimaTempo climaTempo = new ClimaTempo(coletorInformacoesMetereologicas);
        coletorInformacoesMetereologicas.subscribe(climaTempo);

        // Criando Obervador e inscrevendo ele para receber mudanças
        CampusUniversitario campusUniversitario = new CampusUniversitario(coletorInformacoesMetereologicas);
        coletorInformacoesMetereologicas.subscribe(campusUniversitario);

        // Criando Obervador e inscrevendo ele para receber mudanças
        Inmet inmet = new Inmet(coletorInformacoesMetereologicas);
        coletorInformacoesMetereologicas.subscribe(inmet);

        // Realizando mudanças para mostar resultado
        coletorInformacoesMetereologicas.setTemperatura(33.0);

        exibirAssinantes(climaTempo, campusUniversitario, inmet);

        coletorInformacoesMetereologicas.setUmidade(22.0);

        exibirAssinantes(climaTempo, campusUniversitario, inmet);

        coletorInformacoesMetereologicas.setPressao(50.0);

        exibirAssinantes(climaTempo, campusUniversitario, inmet);

        coletorInformacoesMetereologicas.unsubscribe(campusUniversitario);

        InformacaoMetereologica informacaoMetereologica = new InformacaoMetereologica(10.0, 15.0, 30.0);
        coletorInformacoesMetereologicas.setInformacaoMetereologica(informacaoMetereologica);

        exibirAssinantes(climaTempo, campusUniversitario, inmet);
    }


    public static void exibirInformacaometereologica(String assinante, InformacaoMetereologica informacaoMetereologica) {
        System.out.println("Assinante: " + assinante + ": " + informacaoMetereologica.toString());
    }

    private static void exibirAssinantes(ClimaTempo climaTempo, CampusUniversitario campusUniversitario, Inmet inmet) {
        System.out.println("------------------- ASSINANANTES ----------------------------------------");
        exibirInformacaometereologica("Clima Tempo", climaTempo.getInformacaoMetereologica());
        exibirInformacaometereologica("Campus Universitário", campusUniversitario.getInformacaoMetereologica());
        exibirInformacaometereologica("Inmnet", inmet.getInformacaoMetereologica());
        System.out.println("\n");
    }

}
