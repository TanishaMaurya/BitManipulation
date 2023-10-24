public class IntBinary {
    public static void main(String args[]){
        int d=10;
        int i=0;
        int b[]=new int[20];
        while(d>0){
            b[i++]=d%2;
            d=d/2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(b[j]);
        }


        //OR

        System.out.println(Integer.toBinaryString(d));
    }
}
