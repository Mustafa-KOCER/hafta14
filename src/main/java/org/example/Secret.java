package org.example;

public class Secret<T>{
    private T secret;

    public void setSecret(T secret){
        this.secret = secret;
    }

    public T getSecret() {
        return secret;
    }

}
