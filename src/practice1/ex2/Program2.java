package practice1.ex2;

public class Program2 {
    public static void main(String[] args) {
        int b=5;
        int [][] arr=new int[b][b];
        int a =1;
        for (int i =0; i<=b-1; i++) {
            for (int j = 0; j <= b-1; j++) {
                arr[i][j] = a;
                a++;
                if (i==j||i+j==b-1)
                    System.out.print("*\t");
                else
                    System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
