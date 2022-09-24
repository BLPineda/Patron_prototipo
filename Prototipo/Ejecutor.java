package Prototipo;
import java.util.*;
import Formas.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenín
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> copia = new ArrayList<>();

        Circulo circle = new Circulo();
        circle.x = 10;
        circle.y = 20;
        circle.radio = 15;
        circle.color = "red";
        shapes.add(circle);

        Circulo otroCirculo = (Circulo) circle.clone();
        shapes.add(otroCirculo);

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.ancho = 10;
        rectangulo.altura = 20;
        rectangulo.color = "blue";
        shapes.add(rectangulo);

        ClonarYComparar(shapes, copia);
    }

    private static void ClonarYComparar(List<Shape> shapes, List<Shape> copia) {
        for (Shape shape : shapes) {
            copia.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != copia.get(i)) {
                System.out.println(i + ": Las formas son diferentes objetos");
                if (shapes.get(i).equals(copia.get(i))) {
                    System.out.println(i + ": Y son identicas");
                } else {
                    System.out.println(i + ": No son identicas :c");
                }
            } else {
                System.out.println(i + ": Las formas son iguales :c");
            }
        }
    }
}