class A{
    public void display() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
class B extends A{
    public void X(){
        System.out.println("I do nothing");
    }
}



public class TransposeMatrix {
    public static void main(String[] args) {
        
        B obj = new B();
obj.display();
    }
}
