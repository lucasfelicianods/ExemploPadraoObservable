package br.com.estacaocoleta.model.Abstract;

import br.com.estacaocoleta.model.Interface.Observer;
import br.com.estacaocoleta.model.Interface.Subject;

import java.util.List;
import java.util.Vector;

public abstract class SubjectAbstract implements Subject {
    List<Observer> observers;

    private Boolean changed = Boolean.FALSE;

    public SubjectAbstract() {
        this.observers = new Vector<>();
    }

    public void setChanged() {
        changed = Boolean.TRUE;
    }

    public Boolean hasChanged() {
        return changed;
    }

    protected void clearChanged() {
        changed = false;
    }

    @Override
    public void subscribe(Observer observer) {
        if (observer == null)
            throw new NullPointerException();
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (!changed)
            return;
        clearChanged();

        observers.stream().forEach(observer -> observer.update());
    }
}
