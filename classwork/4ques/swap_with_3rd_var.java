class swap_with_3rd_var
{
    public static void main(String args[])
    {
        int a = 10,b = 20;
        int temp;
        System.out.println("a: "+a+"  b: "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a: "+a+"  b: "+b);
    }
}