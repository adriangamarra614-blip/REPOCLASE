/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_clase;

/**
 *
 * @author JHON ADRIAN
 */
public class CUADRADO_CUBO {
    public String Nombre;
    public int Edad;
    public int numReal;
    public CUADRADO_CUBO(String nombre, int edad,int numreal)
    {
    Nombre=nombre;
    Edad=edad;
    numReal=numreal;
    }
    public int cuadrado()
    {
        return numReal*numReal;
    }
    public int cubo()
    {
        return numReal*numReal*numReal;
    }
    public void Mostrar()
    {
        System.out.println("NOMBRE: " + Nombre + " EDAD: " + Edad + " NUMERO ELEVADO: " + numReal);
    }
}
