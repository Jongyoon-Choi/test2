package tutorials;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
   static int [][] arr;//0=공백 1=*인 배열
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      arr= new int [N][N];
      star(0,0,N);
      for (int i=0;i<N;i++) {//출력
         for (int j=0;j<N;j++) {
            if (arr[i][j]==1) System.out.print('*');
            else System.out.print(" ");
         }
         System.out.println();
      }
   }
   static void star(int x, int y, int N){
      if(N>3) {
         for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
               if(i!=1||j!=1) star(3*x+i,3*y+j,N/3);
            }
         }
      }
      else{//N=3
         for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
               if(i!=1||j!=1) arr[x*3+i][y*3+j]=1;
            }
         }
         return;
      }
   }
}
