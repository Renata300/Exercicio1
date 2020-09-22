package com.renatam;

import java.text.SimpleDateFormat;

public class CalculaCusto {

    private double valor;

    public calculaCusto(double valor){
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void calculaDescontoPessoa(){
        if(tipo == ALUNO){
            valor -= (valor*25)/100;
        }
        else if(tipo == FUNCIONARIO){
            valor -= (valor*10)/100;
        }
        else{
            valor = 25;
        }
    }

    public void calculaDescontoQuantidade(){
        if(quantidade > 10 && quantidade <= 50){
            valor -= (valor*5)/100;
        }
        else if(quantidade > 50){
            int quantidadeMais = quantidade - 50;
            valor -= ((valor*10)/100 + (50*25*5)/100);
        }
        else{
            valor *= quantidade;
        }
    }

    public String toString(){
        return "Valor final= "+valor;
    }
}