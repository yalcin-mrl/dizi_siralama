import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args){
        int n;
        System.out.print("Dizi Boyutu: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] number = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println((i +1 ) +". Elemanı: ");
            number[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int tmp = number[i];
                if(number[i]>number[j]){
                    number[i]=number[j];
                    number[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
