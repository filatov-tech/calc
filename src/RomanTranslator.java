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
        arabicNumbers.put(20, "XX");
        arabicNumbers.put(30, "XXX");
        arabicNumbers.put(40, "XL");
        arabicNumbers.put(50, "L");
        arabicNumbers.put(60, "LX");
        arabicNumbers.put(70, "LXX");
        arabicNumbers.put(80, "LXXX");
        arabicNumbers.put(90, "XC");
        arabicNumbers.put(100, "C");
    }


    public static String convertToRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder("");
        for (int i = 100; i > 0; i /= 10) {
            int index = (arabicNumber / i) * i;
            if (index > 0) {
                result.append(arabicNumbers.get(index));
                arabicNumber -= (arabicNumber / i) * i;
            }
        }
        return result.toString();
    }

    public static int convertToArabic(String romanNumber) {
        return romanNumerals.get(romanNumber);
    }
}
