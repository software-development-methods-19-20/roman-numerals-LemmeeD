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
        else if (this.decimal==4)
            return "IV";
        else
            return "I".repeat(decimal);
    }


}
