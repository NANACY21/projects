package partition2;

/**
 * 1-1000的素数
 */
public class SuShu {

    public static void main(String[] args) {
        int j;
        boolean flag;
        for (int i = 2; i < 1000; i++) {
            flag = false;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(i + "\t");
            }
        }
    }
}
