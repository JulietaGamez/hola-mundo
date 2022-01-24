/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase deber tener un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su respectivos set. Deberá además implementar los siguientes 
métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. 
Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se
debe obtener el valor absoluto del número.
 */
package Servicio;

import Entidades.Matematicas;

public class ServicioMatematica {

    public Matematicas crearNumeros (){
        Matematicas m1= new Matematicas();
        m1.setNum1((int) (Math.random()*10));
        m1.setNum2((int) (Math.random()*10));
        return m1;
    }
    public void devolverMayor (Matematicas m1){
        if (m1.getNum1()>m1.getNum2()) {
            System.out.println("El numero 1: "+ m1.getNum1() + " es mayor que el numero 2: "+ m1.getNum2());
        }else if (m1.getNum2()>m1.getNum1()){
            System.out.println("El numero 2: "+ m1.getNum2() + " es mayor que el numero 1: "+ m1.getNum1());
        }else {
            System.out.println("El numero 1: "+ m1.getNum1() + " es igual al numero 2: "+ m1.getNum2());
        }
    
        
    }
    public void calcularPotencia (Matematicas m1){
         if (m1.getNum1()>m1.getNum2()) {
             System.out.println("La potencia es "+ Math.pow(Math.round(m1.getNum1()),(Math.round(m1.getNum2()))));
         }else{
             System.out.println("La potencia es "+ Math.pow(Math.round(m1.getNum2()),(Math.round(m1.getNum1()))));
         }
}
    public void calcularRaiz (Matematicas m1){
         if (m1.getNum1()<m1.getNum2()) {
             System.out.println("La raiz es "+ Math.sqrt(Math.abs(m1.getNum1())));
         }else{
             System.out.println("La raiz es "+ Math.sqrt(Math.abs(m1.getNum2())));
         }
    }
}