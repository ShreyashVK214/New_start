public class sample {

    public static void main(String[] args) {
        int c = 0;
        int arr [][]= {{1,2,3},{4,5,6}};
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c=(i*10)+j;
                //int newVariable = arr[i][j];
                //arr[i][j]=c;
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(/**arr[i][j]*/ " "+ c);
            }
            System.out.println();
        }

    }
}