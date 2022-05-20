
package tareavectoresherencia;
import java.util.Scanner;

public class TareaVectoresHerencia {
    static  Scanner scanner=new Scanner (System.in);
      
    public static void main(String[] args) {
         Calculadora calculador=new Calculadora();
         int opcion = 0;
       do{
        System.out.print("\n Bienvenidos a las calculadoras:");
           System.out.println();
           System.out.println("1" + " suma");
            System.out.println("2" + " Resta");
           System.out.println("3" + " Multiplicacion");
           System.out.println("4" + " Division");
           System.out.println("5" +" Raiz Cuadrada");
           System.out.println("6" +" Potencia");
           System.out.println("7" +" Area");
           System.out.println("8" +" Hipotenusa");
           System.out.println("9" +" operaciones realizadas");
           System.out.print("\n Escoja la operacion  que desea");
             opcion = scanner.nextInt();
       switch(opcion){
               
         case 1 -> { 
             System.out.println( "ingrese el  primer numero de la suma ");
             double operar=scanner.nextDouble();
              System.out.println( "ingrese el  segundo numero de la suma ");
             double nu2=scanner.nextDouble();
             System.out.print(calculador.sumar(operar, nu2));
             calculador.mostrarTransacciones();
               }
          
         case 2 -> {
            System.out.println( "ingrese el  primer numero de la resta ");
             double operar=scanner.nextDouble();
              System.out.println( "ingrese el  segundo numero de la resta");
             double nu2=scanner.nextDouble();
             System.out.print(calculador.restar(operar, nu2));
             calculador.mostrarTransacciones();
               }
           case 3 -> {
            System.out.println( "ingrese el  primer numero de la multiplicacion ");
             double operar=scanner.nextDouble();
              System.out.println( "ingrese el  segundo numero de la multiplicacion");
             double nu2=scanner.nextDouble();
             System.out.print(calculador.multiplicar(operar, nu2));
             calculador.mostrarTransacciones();
               }
           case 4 -> {
            System.out.println( "ingrese el  primer numero de la division ");
             double operar=scanner.nextDouble();
              System.out.println( "ingrese el  segundo numero de la division");
             double nu2=scanner.nextDouble();
             System.out.print(calculador.dividir(operar, nu2));
             calculador.mostrarTransacciones();
               } 
          case 5 -> {
            System.out.println( "ingrese el  numero para la raiz ");
             double operar=scanner.nextDouble();
             System.out.print(calculador.raizCuadrada(operar));
             calculador.mostrarTransaccionEspecial();
             
                   
                   }
                   case 6 -> {
            System.out.println( "ingrese el   primer numero para la potencia  ");
             double operar=scanner.nextDouble();
             System.out.println( "ingrese el  segundo numero para la potencia  ");
             double operarer=scanner.nextDouble();
             System.out.print(calculador.potenciaDeUnNumero(operar, operarer));
             calculador.mostrarTransaccionEspecial();
                   
                   }
                case 7 -> {
            System.out.println( "ingrese la altura  ");
             int operar=scanner.nextInt();
             System.out.println( "ingrese la base  ");
             int numero=scanner.nextInt();
             System.out.print(calculador.area(operar, numero));
             calculador.mostrarTransaccionEspecial();
                   
                   }
           case 8 -> {
            System.out.println( "ingrese el cateto 1  ");
             double operar=scanner.nextInt();
             System.out.println( "ingrese el cateto 2  ");
             double numero=scanner.nextInt();
             System.out.print(calculador.hipotebusa(operar, numero));
             calculador.mostrarTransaccionEspecial();}
                 case 9 -> {
            calculador.mostrarTransaccionEspecial();
            calculador.mostrarTransacciones();
    
            break;
                 }
            
                  

      }
       
       
       }  while (opcion !=9); 
          
        }
        

}

         
        

    
