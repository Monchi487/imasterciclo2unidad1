
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class junio29 {
    public static void main(String arg[]) {
        // Scanner scanner = new Scanner(System.in);
        // int ingreso = scanner.nextInt();
        // String ingreso = scanner.nextLine();
        // System.out.println(ingreso + "jorge");
        // BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        /*
         * if (5 > 3){ System.out.println("hola"); }else if(4>1){
         * System.out.println(":)"); }else{ System.out.println("Adios"); }
         */
        /*
         * String animal = "Perro";
         * 
         * switch(animal){ case "perro": System.out.println("woff"); break; case "Gato":
         * System.out.println("Miua"); break; default: System.out.println(":)"); }
         */
        /*
         * int contador = 0; while(conbtador<5){ System.out.println(":)"); contador =
         * contador + 1; }
         */
        /*for (int i = 0; i <= 7; i++) {
            System.out.println(i);
        }*/
        /*int numero = 5;
        do{
            System.out.println(":)");
            numero--; //numero = numero -1
        }while(numero>8);*/
        /*String valor = "";
        do{
            Scanner scanner = new Scanner(System.in);
            valor = scanner.nextLine ();
        }while(valor.equals("");)*/

        
            Scanner scanner = new Scanner (System.in);
            int numero = scanner.nextInt ();
            int resultado = calcularDigitos(numero);
            System.out.println(resultado);
        
        

        public static int calcularDigitos(int numero){
            int cifras = 0;
            while(numero!=0){
                // numero = numero / 10;
                numero /= 10;
                cifras++;
            }
        }

        
        

    }

}
