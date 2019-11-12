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
        else if(this.decimal == 10)
            return "X";
        else if(this.decimal == 9)
            return "IX";
        else if (this.decimal>=5) {
            return "V"+(new RomanNumeral(this.decimal-5)).toString();
        }
        else
            return "I".repeat(decimal);
    }


}
