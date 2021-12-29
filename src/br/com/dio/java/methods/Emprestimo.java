package br.com.dio.java.methods;

public class Emprestimo {

    public static  int getDuasParcelas() {
        return  2;
    }

    public static double getTaxaDuasParcelas() {
        return  0.3;
    }

    public static  int getTresParcelas() {
        return  3;
    }

    public static double getTaxaTresParcelas() {
        return  0.45;
    }

    public static double getTaxaMaxima() {
        return  0.65;
    }

    public static void  calcular(double valor, int parcelas) {

        if( parcelas == 2 ){

            double valorFinal = valor + ( valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);

        } else if ( parcelas == 3 ) {

            double valorFinal = valor + ( valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);

        } else if ( parcelas > 3 && parcelas <= 12) {

            double valorFinal = valor + ( valor * getTaxaMaxima());
            System.out.println("Valor final do empréstimo para " + parcelas + " parcelas: R$ " + valorFinal);

        }else {

            System.out.println("Quantidade de parcelas '" + parcelas +"' não é aceita");

        }


    }
}
