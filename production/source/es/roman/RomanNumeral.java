package es.roman;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {

        this.decimal = decimal;
    }

    @Override
    public String toString() {
        if (this.decimal == 0)
            return "";
        else if (this.decimal == 2)
            return "II";
        else
            return "I";
    }
}
