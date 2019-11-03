import java.util.HashMap;

/**
 * @auther Jack D
 * @date 2019/11/4  0:34
 */

public class LeetcodeTrainSimple {
    public static int game(int[] guess, int[] answer) {
        /*
         * int result = 0; for (int i = 0; i < guess.length; i++) { if (guess[i] ==
         * answer[i]) { result++; }
         *
         * } return result;
         */
        return (guess[0] == answer[0] ? 1:0)+(guess[1] == answer[1] ? 1:0)+(guess[2] == answer[2] ? 1:0);
    }

    public static int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> sCount = new HashMap<Character, Integer>();
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            sCount.put(S.charAt(i), sCount.getOrDefault(S.charAt(i), 0)+1);
        }

        for (int i = 0; i < J.length(); i++) {
            if (sCount.containsKey(J.charAt(i))) {
                result += sCount.get(J.charAt(i));
            }
        }

        return result;

    }

    public static String defangIPaddr(String address) {
        /*
         * String parseSymbol = "[.]"; String[] addressParsed = address.split("\\.");
         * StringBuilder result = new StringBuilder(); for (int i = 0; i < 3; i++) {
         * result.append(addressParsed[i]).append(parseSymbol); }
         * result.append(addressParsed[3]); return result.toString();
         */
        return address.replaceAll("\\.", "[.]");
    }
}
