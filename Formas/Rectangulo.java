/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author Lenín
 */
public class Rectangulo extends Shape {

    public int ancho;
    public int altura;

    public Rectangulo() {
    }

    public Rectangulo(Rectangulo objetivo) {
        super(objetivo);
        if (objetivo != null) {
            this.ancho = objetivo.ancho;
            this.altura = objetivo.altura;
        }
    }
    
    @Override
    public Shape clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangulo) || !super.equals(object2)) return false;
        Rectangulo shape2 = (Rectangulo) object2;
        return shape2.ancho == ancho && shape2.altura == altura;
    }
    
}
