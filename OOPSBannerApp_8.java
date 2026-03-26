
/*
*@author: Toshitaa 
*
*@version: v1.0
*/
import java.util.HashMap;

public class OOPSBannerApp_8 {

    static HashMap<Character, String[]> letters = new HashMap<>();

    static {
        letters.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        letters.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        letters.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    public static void render(String text) {
        text = text.toUpperCase();

        for (int row = 0; row < 5; row++) {
            for (char c : text.toCharArray()) {
                String[] pattern = letters.get(c);
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        render("OOPS");
    }
}