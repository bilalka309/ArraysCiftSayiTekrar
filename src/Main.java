import java.util.Scanner;

public class Main {
    static boolean isFind(int[] arr,int k){
        for (int i:
             arr) {
            if(i==k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz : ");
        int n = in.nextInt();
        int[] dizi = new int[n];
        int[] duplicate=new int[n];
        int startindex=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". eleman sayısını giriniz : ");
            dizi[i] = in.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int k = i + 1; k < dizi.length; k++) {
                int temp = 0;
                if (dizi[i] > dizi[k]) {
                    temp = dizi[i];
                    dizi[i] = dizi[k];
                    dizi[k] = temp;
                }
            }
        }
        System.out.print("Dizinin küçükten büyüğe sıralanmış hali : ");
        for (int c :
                dizi) {
            System.out.print(" " + c);
        }
        System.out.println("");
        System.out.print("Dizi içerisinde tekrar eden çift sayılar : ");

        for(int i=0;i< dizi.length;i++){
            for(int k=0;k< dizi.length;k++){
                if(dizi[i]%2==0 && i!=k && dizi[i]==dizi[k]){
                    if(!isFind(duplicate,dizi[i])){
                        duplicate[startindex++]=dizi[i];
                    }
                    break;
                }
            }
        }
        for (int m:
             duplicate) {
            if(m!=0){
                System.out.print(" "+m);
            }
        }
    }
}