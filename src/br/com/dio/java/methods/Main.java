package br.com.dio.java.methods;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(5,25);
        Calculadora.subtracao(10,3);
        Calculadora.multiplicacao(6,3);
        Calculadora.divisao(10, 2.5);


        System.out.println("Exercício Mensagens de Acordo com Hora do Dia");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(55);

        System.out.println("Calcular empréstimo!");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000,5);
        Emprestimo.calcular(1000,14);



    }
}
