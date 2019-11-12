package es.roman;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {

        this.decimal = decimal;
    }

    @Override
    public String toString() {
        int dec = this.decimal % 10;
        int mod = this.decimal / 10;
        if (mod >= 1) {
            // 12 / 10 = 2..... 12 % 10 = 1....
            for (int i = 0; i <= mod; i++) {
                return "X" + (new RomanNumeral(this.decimal - 10)).toString();
            }
        }
        else {
            if (this.decimal == 0)
                return "";
            else if (this.decimal == 4)
                return "IV";
            else if (this.decimal == 10)
                return "X";
            else if (this.decimal == 9)
                return "IX";
            else if (this.decimal >= 5) {
                return "V" + (new RomanNumeral(this.decimal - 5)).toString();
            } else
                return "I".repeat(decimal);
        }

        return "ERR";
    }
}
