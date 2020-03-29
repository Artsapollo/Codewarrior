package leetcode;

/*
Input: 00000010100101000001111010011100
Output: 00111001011110000010100101000000
Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
so return 964176192 which its binary representation is 00111001011110000010100101000000.
 */
public class ReverseBites {
    public static void main(String[] args) {
        System.out.println(reverse(43261596));
//        System.out.println(reverse(964176192));
    }
//    Input: 0000001010010100000111101001 1100
    public static int reverse(int n) {
        int result = 0;
//0011100100
        for (int i = 0; i < 32; i++) {
            result = result << 1;       //добавляет один бит справа
            result = result | (n & 1);  // если n & 1 == 1 добавит его в result
            n = n >> 1;                 //убирает один бит справа
        }
//    Output: 00111001011110000010100101000000
        return result;
    }
}
/*
char[] bi = Integer.toBinaryString(n).toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = bi.length - 1; i >= 0; i--) {
            sb.append(bi[i]);
        }
        return Integer.parseInt(sb.toString(), 2);
 */

/*
n & 1 - оператор & проверяет если n и 1 == 1 - вернёт 1, иначе 0
result | (n & 1) - оператор | проверяет если один из битов равен 1, он дает 1, иначе дает 0
 */