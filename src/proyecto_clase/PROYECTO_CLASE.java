/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_clase;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class PROYECTO_CLASE {
    

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        List<CUADRADO_CUBO> LISTA = new ArrayList<>();
        while(true)
        {
            System.out.println("1. NUMERO CUADRADO");
            System.out.println("2. NUMERO CUBO");
            System.out.println("3. MOSTRAR");
            System.out.println("4.SALIR");
            int Num= Entrada.nextInt();
            if(Num==1)
            {
                Entrada.nextLine();
                System.out.println("NOMBRE: ");
                String Nombre=Entrada.nextLine();
                System.out.println("EDAD: ");
                int Edad=Entrada.nextInt();
                System.out.println("NUMERO CUADRADO ");
                int Numero=Entrada.nextInt();
                CUADRADO_CUBO ELEVADOS = new CUADRADO_CUBO(Nombre,Edad,Numero);
                System.out.println("NUMERO CUADRADO: "+ ELEVADOS.cuadrado());
                LISTA.add(ELEVADOS);
               
            }
            else if(Num==2)
            {
                Entrada.nextLine();
                System.out.println("NOMBRE: ");
                String Nombre=Entrada.nextLine();
                System.out.println("EDAD: ");
                int Edad=Entrada.nextInt();
                System.out.println("NUMERO CUBO ");
                int Numero=Entrada.nextInt();
                CUADRADO_CUBO ELEVADOS = new CUADRADO_CUBO(Nombre,Edad,Numero);
                System.out.println("NUMERO CUBO: "+ ELEVADOS.cubo());
                LISTA.add(ELEVADOS);
            }
            else if(Num==3)
            {
                for(CUADRADO_CUBO C: LISTA)
                    C.Mostrar();
            }
            else if(Num==4)
            {
                System.out.println("SALIENDO ");
                System.out.println("MUCHOS EXITOS");
                break;
            }
        }
    }
    
}
