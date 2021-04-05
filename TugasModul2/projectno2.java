package tugasmodul02;
public class projectno2 {
    public static void main(String[] args){
        int[][] X = {
            {1,2},
            {3,4},
            {5,6}
        };
        int[][] Y = {
            {10,9},
            {8,7},
            {6,5}
        };
        int baris_a = X.length;
        int kolom_a = X[0].length;
        int[][] hasil = new int [baris_a][kolom_a];
        
        for(int i=0; i<baris_a; i++){
            for(int j=0; j<kolom_a; j++){
                hasil [i][j] = Y[i][j] - X[i][j];
                System.out.print(hasil[i][j]+" ");
            }
            System.out.println();
            System.out.println("Ega Permana Putra");
        }
    }
    
}
