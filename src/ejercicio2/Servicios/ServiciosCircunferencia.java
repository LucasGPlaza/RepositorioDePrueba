/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio2.Servicios;

import ejercicio2.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ServiciosCircunferencia {
    public Circunferencia crearCircunferencia(){

Circunferencia c1=new Circunferencia();
     Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        c1.setRadio(leer.nextInt());
        return c1;
    }
    public void Area(Circunferencia c1, int Radio){
        c1.area=c1.getRadio()*3.14;
        System.out.println("El area de la Circunferencia es"+ c1.area);
        
    }
    public void Perimetro(Circunferencia c1,int Radio){
        c1.perimetro=2*3.14*c1.getRadio();
        System.out.println("El Perímetro de la circunferencia es "+c1.perimetro);
        
    }
}