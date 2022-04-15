import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionMember {

    private static final Pattern ROMAN_NUMERALS = Pattern.compile("^[IVXLCDM]{1,}$");

    private boolean isRoman;

    private int value;

    public ExpressionMember(String value) {
        Matcher matcher = ROMAN_NUMERALS.matcher(value);
        if (matcher.matches()) {
            this.isRoman = true;
            this.value = RomanTranslator.convertToArabic(value);
        } else {
            this.value = Integer.parseInt(value);
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
