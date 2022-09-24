/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;
import java.util.Objects;
/**
 *
 * @author Lenín
 */
public class Circulo extends Shape{
public int radio;


 public Circulo() {
    }

    public Circulo(Circulo objetivo) {
        super(objetivo);
        if (objetivo != null) {
            this.radio = objetivo.radio;
        }
    }
    @Override
    public Shape clone() {
        return new Circulo(this);
    }
    
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circulo)) return false;
        Circulo shape2 = (Circulo) object2;
        return shape2.radio == radio;
    }
    
}
