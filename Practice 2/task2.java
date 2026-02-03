import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int width = s.nextInt();
        StarTriangle small= new StarTriangle(width);
        System.out.println(small.toString());
    }
}

class StarTriangle{
    private int width;

	
    public StarTriangle(int cnt){
        this.width=cnt;
    }
    public String toString(){
        String s="";
        for (int i=1; i<=width;i++){
            for (int j=1; j<=i;j++){
                s+="[0]";
            }
			if(i < width) s+=("\n");
        }
        return s.toString();
    }
}