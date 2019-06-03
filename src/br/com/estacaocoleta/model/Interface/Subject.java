package br.com.estacaocoleta.model.Interface;

public interface Subject {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();

}
