package day01;

public class day01_7 {
    public static void main(String[] args) {
        int x=1,y=1;
        for(;x<10;x++){
            for(y=1;y<10;y++){
                if(y<=x){
                    System.out.print(y+"*"+x+"="+x*y+" ");
                }
            }
            System.out.println();
        }
    }
}
