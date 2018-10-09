/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Arista {

    int Peso;
    int centrox, centroy;
    Vertice VerticeIn;
    Vertice VerticeFin;

    public Arista(int Peso, Vertice VerticeIn, Vertice VerticeFin) {
        this.Peso = Peso;
        this.VerticeIn = VerticeIn;
        this.VerticeFin = VerticeFin;
        VerticeIn.getAristas().add(this);
        VerticeIn.getVerticesad().add(VerticeFin);
        VerticeFin.getAristas().add(this);
        VerticeFin.getVerticesad().add(VerticeIn);
        BuscarCentro();
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getCentrox() {
        return centrox;
    }

    public void setCentrox(int centrox) {
        this.centrox = centrox;
    }

    public int getCentroy() {
        return centroy;
    }

    public void setCentroy(int centroy) {
        this.centroy = centroy;
    }

    public Vertice getVerticeIn() {
        return VerticeIn;
    }

    public void setVerticeIn(Vertice VerticeIn) {
        this.VerticeIn = VerticeIn;
    }

    public Vertice getVerticeFin() {
        return VerticeFin;
    }

    public void setVerticeFin(Vertice VerticeFin) {
        this.VerticeFin = VerticeFin;
    }


public void BuscarCentro(){
    int ymax, xmax, ymin,xmin;
    ymax = Math.max(VerticeIn.getY(), VerticeFin.getY());
    xmax = Math.max(VerticeIn.getX(), VerticeFin.getX());
    ymin = Math.min(VerticeIn.getY(), VerticeFin.getY());
    xmin = Math.min(VerticeIn.getX(), VerticeFin.getX());
    centrox = ((xmax - xmin)/2)+ xmin;
    centroy = ((ymax - ymin)/2)+ ymin;
}
    
    
    
    
}
