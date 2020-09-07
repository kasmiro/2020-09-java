package day01;

public class day01_5 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            int time=i+1;
            while(time>0){
                System.out.print("?");
                time--;
            }
            System.out.println();
        }
        for(int i=10;i>=0;i--){
            int time=i+1;
            while(time>0){
                System.out.print("?");
                time--;
            }
            System.out.println();
        }
        for(int i=0;i<10;i++){
            int time=i+1;
            int untime=10-time;
            while(time>0){
                System.out.print(" ");
                time--;
            }
            while(untime>0){
                System.out.print("?");
                untime--;
            }
            System.out.println();
        }
        for(int i=10;i>=0;i--){
            int time=i+1;
            int untime=10-time;
            while(time>0){
                System.out.print(" ");
                time--;
            }
            while(untime>0){
                System.out.print("?");
                untime--;
            }
            System.out.println();
        }
    }
}
