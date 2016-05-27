package fr.siegel.mvpdemo.service;

public interface CustomCallback<T> {

    void onSuccess();

    void onFailure();
}
