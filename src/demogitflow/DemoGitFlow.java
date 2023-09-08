/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demogitflow;

/**
 *
 * @author libar
 */
public class DemoGitFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        var resultadoSuma = Suma(10,8);
        System.out.println("El resultado de la suma es:" + resultadoSuma);

        var resultadoResta = Resta(10,8);
        System.out.println("El resultado de la resta es:" + resultadoResta);
    }


    public static int Suma(int a, int b){
        return a + b;
    }

    public static int Resta(int a, int b){
        return a - b;
    }
    
}
