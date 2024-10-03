package atividades1;

public class Ex6 {
    // Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
    public static void main(String[] args) {
        // Guardar Horas trabahadas = guarda em um atributo
        // Guardar numero quanto recebe por hora = guarda em um atributos
        // multiplique horas trabalhadas * Salario por hora = guarda em um atributo

        // 1h = 50 reais
        // 9h horas trabalhadas
        // 50$ * 9h

        int valorPorHora = 50;
        int tempoTrabalhado = 9;
        int salarioRecebido = valorPorHora * tempoTrabalhado;
        System.out.println("Salario recebido no mes referido: " + salarioRecebido);


    }
}
