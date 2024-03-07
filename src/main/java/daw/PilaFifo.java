/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edu
 */
public class PilaFifo<Generico> {

    private List<Generico> pila;
    private int tamanio;

    public PilaFifo(int tamanio) {
        this.pila = new ArrayList(tamanio);
    }
    
    private boolean pilaLlena() {
        if (this.pila.size() == tamanio) {
            return true;
        } else {
            return false;
        }

    }

    private void añadirElementoPila(Generico o) {
        if (!pilaLlena()) {
            this.pila.add(o);
        }
    }

    private void eliminarElementoPila() {
        this.pila.remove(0);
    }

    public List<Generico> getPila() {
        return pila;
    }

    public void setPila(List<Generico> pila) {
        this.pila = pila;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila = ").append(pila);
        return sb.toString();
    }
}
