package br.com.rafaelcosta.application.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class IndexBean implements Serializable{

	public String getMensagem() {
		return "Esta é uma mensagem vinda do bean!";
	}

}
