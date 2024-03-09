public class Main {
    public static void main(String[] args) {

        int [] diagonal = new int[5];
        int[][] m = {{10,15,20,35,40},
                    {50,60,70,80,90},
                    {12,23,45,65,76},
                    {98,76,54,43,23},
                    {360,200,40,100,120}};

        for (int i=0;i<m.length;i++){
            diagonal[i] =  m[i][i];
            System.out.println(diagonal[i]);
        }
    }
}