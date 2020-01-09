package codewars.kyu7_6;

/*
Your task is to check weather a given integer is a perfect power.
If it is a perfect power, return a pair m and k with mk = n as a proof.
Otherwise return Nothing, Nil, null, NULL, None or your language's equivalent.

Note: For a perfect power, there might be several pairs.
For example 81 = 3^4 = 9^2, so (3,4) and (9,2) are valid solutions.
However, the tests take care of this, so if a number is a perfect power, return any pair that proves it.

Examples
isPerfectPower(4) => new int[]{2,2}
isPerfectPower(5) => null
isPerfectPower(8) => new int[]{2,3}
isPerfectPower(9) => new int[]{3,2}
 */
public class Task16 {
    public static int[] isPerfectPower(int n) {

        int res = 1;

        for(int i = 1; i < n; i++){
            for(int j = i; j < n; j++){
                if(res != n){
                    res = i * i;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] var4 = isPerfectPower(4);
        int[] var5 = isPerfectPower(5);
        int[] var8 = isPerfectPower(8);
        int[] var9 = isPerfectPower(9);
    }
}
