import java.util.HashMap;
import java.util.Map;

class RomanTranslator {
    private static Map<String, Integer> romanNumerals = new HashMap<>();
    private static Map<Integer, String> arabicNumbers = new HashMap<>();

    static {
        romanNumerals.put("I", 1);
        romanNumerals.put("II", 2);
        romanNumerals.put("III", 3);
        romanNumerals.put("IV", 4);
        romanNumerals.put("V", 5);
        romanNumerals.put("VI", 6);
        romanNumerals.put("VII", 7);
        romanNumerals.put("VIII", 8);
        romanNumerals.put("IX", 9);
        romanNumerals.put("X", 10);

        arabicNumbers.put(1, "I");
        arabicNumbers.put(2, "II");
        arabicNumbers.put(3, "III");
        arabicNumbers.put(4, "IV");
        arabicNumbers.put(5, "V");
        arabicNumbers.put(6, "VI");
        arabicNumbers.put(7, "VII");
        arabicNumbers.put(8, "VIII");
        arabicNumbers.put(9, "IX");
        arabicNumbers.put(10, "X");
        arabicNumbers.put(11, "XI");
        arabicNumbers.put(12, "XII");
        arabicNumbers.put(13, "XIII");
        arabicNumbers.put(14, "XIV");
        arabicNumbers.put(15, "XV");
        arabicNumbers.put(16, "XVI");
        arabicNumbers.put(17, "XVII");
        arabicNumbers.put(18, "XVIII");
        arabicNumbers.put(19, "XIX");
        arabicNumbers.put(20, "XX");
    }


    public static String convertToRoman(int arabicNumber) {
        return arabicNumbers.get(arabicNumber);
    }

    public static int convertToArabic(String romanNumber) {
        return romanNumerals.get(romanNumber);
    }
}
