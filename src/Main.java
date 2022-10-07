public class Main {
    public static void main(String[] args) {
        System.out.println("The purpose of the program is to check if there are any same numbers in the array");
        System.out.println("You could put an additional condition");
        boolean flag=false;
        int[] a={0, 6, 7, 8, 9, 10};
        int[] b={1,2,3,4,5,-2, -100, -1};


        for(int n=0; n<a.length||flag==true; n++)
            for(int m=0; m<b.length||flag==true; m++)
                if(a[n]==b[m])
                    flag=true;

        System.out.println(flag);
    }
}