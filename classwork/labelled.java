
public class labelled {
    public static void main(String args[]){
        outerloop:
        for(int i = 0;i<=4;i++){
            firstinnerloop:
            for(int j = 0;j<=4;j++){
                System.out.println("i: "+i);
                if(i==3 && j==3){
                    break outerloop;
                }
            }
        }
    }
}
