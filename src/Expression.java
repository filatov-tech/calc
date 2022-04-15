public class Expression {
    private ExpressionMember firstMember;
    private ExpressionMember secondMember;
    private String sign;

    public Expression(String firstMember, String sign, String secondMember) throws Exception {
        setFirstMember(new ExpressionMember(firstMember));
        setSecondMember(new ExpressionMember(secondMember));
        setSign(sign);
    }

    public ExpressionMember getFirstMember() {
        return firstMember;
    }

    public void setFirstMember(ExpressionMember firstMember) throws Exception {
        ExpressionMember secondMember = this.getSecondMember();
        if (secondMember == null || (firstMember.isRoman() == secondMember.isRoman())) {
            this.firstMember = firstMember;
        } else {
            throw new Exception("Both members must be either arabic or roman");
        }
    }

    public ExpressionMember getSecondMember() {
        return secondMember;
    }

    public void setSecondMember(ExpressionMember secondMember) throws Exception {
        ExpressionMember firstMember = this.getFirstMember();
        if (firstMember == null || (firstMember.isRoman() == secondMember.isRoman())) {
            this.secondMember = secondMember;
        } else {
            throw new Exception("Both members must be either arabic or roman");
        }
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) throws Exception {
        switch(sign) {
            case("+"):
            case("-"):
            case("*"):
            case("/"):
                this.sign = sign;
                break;
            default:
                throw new Exception("The sign must be only an arithmetic sign '+', '-', '*', or '/'");
        }
    }

    public String calculate() throws Exception {
        int result;
        int firstMember = this.getFirstMember().getValue();
        int secondMember = this.getSecondMember().getValue();
        boolean isRomanExpression = this.getFirstMember().isRoman();
        switch (this.getSign()) {
            case ("+"):
                result = firstMember + secondMember;
                break;
            case ("-"):
                result = firstMember - secondMember;
                if (isRomanExpression && result < 0) {
                    throw new Exception("Can't be calculated: there are no negative numbers in the roman numeral system");
                }
                break;
            case ("*"):
                result = firstMember * secondMember;
                break;
            case ("/"):
                result = firstMember / secondMember;
                break;
            default:
                throw new Exception("Can't be calculated: sign have to be only arithmetic signs '+', '-', '*', or '/'");
        }
        if (isRomanExpression) {
            return RomanTranslator.convertToRoman(result);
        } else {
            return String.valueOf(result);
        }
    }
}
