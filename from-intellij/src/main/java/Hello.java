import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by renato
 */
public class Hello {

    public void SayHi(){
        System.out.printf("hi");
    }

    // Complete the solve function below.
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * ((double)tip_percent / 100);
        double tax = meal_cost * ((double)tax_percent / 100);
        int total_cost =  (int)(Math.floor(meal_cost + tip + tax));

        //System.out.printf("%.0f", meal_cost + tip + tax);

       // System.out.println(total_cost);
        int test = 1500000000;
        System.out.println(test);

        /*System.out.println(String.valueOf( Math.pow(2, 31)/2));
        System.out.println(String.valueOf( (Math.pow(2, 31)/2)-1));
        System.out.println(String.valueOf( Math.pow(2, 63)/2));
        System.out.println(String.valueOf( (Math.pow(2, 63)/2)-1));*/


    }

    public static int sockMerchant(int n, int[] ar) {
        int[] arPair;
        int result = 0;
        ArrayList<Integer> processed = new ArrayList<Integer>();



        //iterar o array
       // for (int i=0;i<ar.length; i++){
        for (int i : ar){
            //verificar se o item iterado já foi processado se ja foi ignora e vai para o proximo
            if (processed.indexOf(i) == -1){
                //para cada item achar quanto se repete
                int item = i;
                int qtdRepetition = 0;
                for (int ii : ar ){
                    if (item == ii){
                        qtdRepetition += 1;
                    }
                }

                //dividir por 2 para contar apenas a parden inteiro e adicionar a variavel result
                if (qtdRepetition != 0){
                    result += (int)qtdRepetition/2;
                }
                processed.add(item);
            }
            //adicionar o numero na lista de itens já verificados

        }

        System.out.println(result);


        return result;


    }

    public static void main(String[] args) {
        //solve(100,20,8);
        int ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        sockMerchant(9,ar);
    }

}
