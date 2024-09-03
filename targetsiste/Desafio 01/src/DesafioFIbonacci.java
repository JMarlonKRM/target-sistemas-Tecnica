import java.util.Scanner;

public class DesafioFIbonacci {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um Valor: ");
        int numero = input.nextInt();
        input.close();

        if(FIBO(numero)){
            System.out.println(numero + " = pertence a FIBONACCI");}
            else{System.out.println(numero + " =  não pertence a FIBONACCI");}
    }

    public static boolean FIBO(int numero){
        int anterior = 0;
        int atual = 1;

        if(numero == anterior || numero == atual){
            return true;}

        while (atual < numero){
            int prox = anterior + atual;
            anterior = atual;
            atual = prox;

            if (atual == numero){
                return true;}
        }

        
        return false;
    }
}
