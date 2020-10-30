public class laba1 {

    final static int n = 12;
    final static int m = 18;
    static short[] d1 = new short[n];
    static double[] x = new double[m];
    static double[][] d2 = new double[n][m];

    public static int massiveFillerD1(){
        for (int i = 0; i < n; i++){
            d1[i] = (short) (22 - i*2);
        }
        return 0;
    }

    public static int massiveFillerX(){
        for (int i = 0; i < n; i++){
           x[i] = Math.random() * 15 - 10;
        }
        return 0;
    }

    public static int caseChecker(int i) {
            if (d1[i] == 20) {
                    return 1;
            } else if ((d1[i] == 2) || (d1[i] == 6) || (d1[i] == 8) || (d1[i] == 14) || (d1[i] == 16) || (d1[i] == 18)) {
                    return 2;
            } else {
                    return 3;
            }
    }

    public static double magicMaker(){
        for(int i = 0; i < n; i++){
            switch (caseChecker(i)){
                case 1:
                    for(int j = 0; j < m; j++){
                        d2[i][j] = Math.atan(Math.cos(Math.sin(Math.tan(x[j]))));
                    }
                    break;
                case 2:
                    for(int j = 0; j < m; j++) {
                        d2[i][j] = Math.tan(Math.sin(Math.atan((x[j]-3)/14)));
                    }
                    break;
                case 3:
                    for(int j = 0; j < m; j++) {
                        d2[i][j] = Math.pow((Math.pow(Math.atan(1/Math.exp(Math.abs(x[j]))), 1/4*Math.log(Math.pow(Math.cos(x[j]), 2)))-1)/Math.PI, 2);
                    }
                    break;
            }
        }
        return 0;
    }

    public static double printer(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%9.5f", d2[i][j]);
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args){
        massiveFillerD1();
        massiveFillerX();
        magicMaker();
        printer();
    }
}
