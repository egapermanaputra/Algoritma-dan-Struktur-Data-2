package tugasmodul02;
public class projectno3 {
    public static void main(String[] args) {
        int[][] matriks_a = {
            {1,3,5},
            {7,9,11}
        };
        int[][] matriks_b = {
            {10,20},
            {30,40},
            {50,60}
        };
        
        int baris_a = matriks_a.length;
        int kolom_a = matriks_a[0].length;
        int baris_b = matriks_b.length;
        int kolom_b = matriks_b[0].length;
        int[][] Hasilkali = new int[baris_a][kolom_b];
        
        for (int i=0; i<baris_a; i++){
            for (int j=0; j<kolom_b; j++){
                for (int k=0; k<kolom_a; k++){
                        Hasilkali[i][j] = Hasilkali[i][j] + (matriks_a[i][k]*matriks_b[k][j]);
            }
        }
    }
    for (int[] x: Hasilkali){
    for (int y: x){
        System.out.print(y+" ");
    }
    System.out.println();
    System.out.println("Ega Permana Putra");
}
    }
}
