package com.proyecto.cardjitsu.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cartas {
    private Elementos elementos;
    private String urlImagen;

    
    private int valor;
    
    public Cartas() {
    }
    
    public Cartas(Elementos elementos, int valor) {
        this.elementos = elementos;
        this.valor = valor;
    }
    
    public void setElementos(Elementos elementos) {
        this.elementos = elementos;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Elementos getElementos() {
        return elementos;
    }
    public int getValor() {
        return valor;
    }
    
    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
    
    public List<Cartas> barajarCartas(){
        List<Cartas> cartas = new ArrayList<>();
        for (Elementos element : Elementos.values()) {
            for (int i = 1; i <= 10; i++) {
                cartas.add(new Cartas(element, i));
            }
        }
        Collections.shuffle(cartas);
        
        return cartas;
    }

}
