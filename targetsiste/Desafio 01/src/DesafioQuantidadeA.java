import java.util.Scanner;

public class DesafioQuantidadeA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a frase ou palavra: ");
        String str = input.nextLine();
        input.close();

        int conta = 0;
        int contaa = 0;
        int contaA = 0;

        if(str.contains("A") || str.contains("a")){
            for(int i = 0; i < str.length(); i++){
                char sc = str.charAt(i);
                
                if(sc == 'a' || sc =='A'){
                    conta++;
                }
                if(sc == 'a'){
                    contaa++;
                }
                if(sc == 'A'){
                    contaA++;
                }
            }
            System.out.printf("A String contém %d letras 'A' ou 'a'\n",conta);
            System.out.printf("A String contém %d letras 'a'\n", contaa);
            System.out.printf("A String contém %d letras 'A'\n", contaA);
        }else{
            System.out.println("Não contém nem letras 'A' nem letrs 'a'");}
    }
}
