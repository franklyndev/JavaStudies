package intro.poo.util;

public class CurrencyConverter {

    public static double iof = 0.06;

    public static double dolarConverter(double dolar, double amount){
        return dolar * amount * (1 + iof);
    }


}
