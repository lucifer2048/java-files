public class pattrn4 {
    public static void main(String[] args) {
        int size=5;
        for(int i=size;i>=1;i--){
        for(int j=1;j<=size;j++){
            if(j<i)
        System.out.print(" ");
        else{
            System.out.print("*");
        }
        }
    System.out.println();
}
}
}