package mates;

public class MatesApp {
    public static void main(String[] args) {
 //N�mero combinatorio de m sobre n
    int m=8, n=3;
    System.out.print("El n�mero combinatorio "+m +" sobre "+ n);
    long numerador=Matematicas.factorial(m);
    long denominador=Matematicas.factorial(m-n)*Matematicas.factorial(n);
    System.out.println(" vale "+numerador +" / "+ denominador);
    System.out.println("*************************");

 //n�meros primos comprendidos entre 100 y 200
        System.out.println("N�meros primos comprendidos entre 100 y 200");
        for(int num=100; num<200; num++){
            if(Matematicas.esPrimo(num)){
                System.out.print(num+" - ");
            }
        }

        System.out.println("");
        System.out.println("*************************");
//Potencia de un n�mero
        System.out.print("La potencia 5 elevado a 4 ");
        System.out.print("vale "+Matematicas.potencia(5, 4));

//Valor absoluto de un n�mero real
        System.out.println("");
        System.out.println("*************************");
        double y=-2.5;
        System.out.print("El valor absoluto de "+y);
        System.out.println(" vale "+Matematicas.absoluto(y));

//Valor absoluto de un n�mero entero
        System.out.println("");
        System.out.println("*************************");
        int z=-2;
        System.out.print("El valor absoluto de "+z);
        System.out.println(" vale "+Matematicas.absoluto(z));

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

