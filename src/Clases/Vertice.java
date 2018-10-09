/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author vmbarbosa
 */
public class Vertice {
    
    final int x;
    final int y;
    final String Nombre;
    boolean Estado = false;
    ArrayList<Arista> Aristas = new ArrayList();
    ArrayList<Vertice> verticesad = new ArrayList();

    public ArrayList<Vertice> getVerticesad() {
        return verticesad;
    }

    public void setVerticesad(ArrayList<Vertice> verticesad) {
        this.verticesad = verticesad;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Vertice(int x, int y, String Nombre) {
        this.x = x;
        this.y = y;
        this.Nombre = Nombre;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getNombre() {
        return Nombre;
    }

    public ArrayList<Arista> getAristas() {
        return Aristas;
    }

    
    public Arista getArista(Vertice vk) {
        
        for (Arista arista : Aristas) {
            if(arista.getVerticeFin().equals(vk) || arista.getVerticeIn().equals(vk)){
                return arista;
            }
        }
        return null;
    }

    public void setAristas(ArrayList<Arista> Aristas) {
        this.Aristas = Aristas;
    }

    public boolean YaExisteAdyacencia(Vertice vk){
    
        for (Vertice vertad : verticesad) {
            if(vertad.equals(vk)){
            return true;
            }
        }
        return false;
    }
    
    
    
}
