import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ExpressionMember {

    private static final Pattern ROMAN_NUMERALS = Pattern.compile("^[IVXLCDM]{1,}$");

    private boolean isRoman;

    private int value;

    public ExpressionMember(String value) throws Exception {
        Matcher matcher = ROMAN_NUMERALS.matcher(value);
        if (matcher.matches()) {
            this.isRoman = true;
            this.value = RomanTranslator.convertToArabic(value);
        } else {
            int uncheckedValue = Integer.parseInt(value);
            if (uncheckedValue > 0 && uncheckedValue <= 10) {
                this.value = uncheckedValue;
            } else {
                throw new Exception("Expression terms must be between 1 and 10 inclusive");
            }

        }
    }

    public boolean isRoman() {
        return isRoman;
    }

    public void setRoman(boolean roman) {
        isRoman = roman;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
