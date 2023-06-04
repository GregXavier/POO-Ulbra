import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicioUm();
        exercicioDois();
        exercicioTres();
        exercicioQuatro();
        exercicioSeis();
        exercicioSete();
        exercicioOito();
    }

    public static void exercicioUm () {
        System.out.println("Exercício 1");

        Scanner inputs = new Scanner(System.in);

        System.out.println("Qual o valor do produto?");
        float valorProduto = inputs.nextFloat();

        System.out.println("E o desconto para este produto?");
        float percentualDescontoProduto = inputs.nextFloat();

        float descontoProduto = valorProduto * percentualDescontoProduto / 100;

        System.out.println("O produto recebeu um desconto de: R$ " + descontoProduto);
        System.out.println("O valor do produto com desconto foi de: R$ "  + (valorProduto - descontoProduto));
    };

    public static void exercicioDois () {
        JOptionPane.showMessageDialog(null,"Exercício 2");

        String inputValorTransacao = JOptionPane.showInputDialog("Qual o valor da transação?");
        float valorTransacao = Float.parseFloat(inputValorTransacao);

        String inputValorVenal = JOptionPane.showInputDialog("Qual o valor venal da propriedade?");
        float valorVenal = Float.parseFloat(inputValorVenal);

        String inputPercentualITBI = JOptionPane.showInputDialog("Qual o percentual de ITBI a ser aplicado?");
        float percentualITBI = Float.parseFloat(inputPercentualITBI);

        if (valorTransacao >= valorVenal) {
            JOptionPane.showMessageDialog(null,"O valor de imposto a ser pago é: R$" + valorTransacao * percentualITBI / 100);
        } else {
            JOptionPane.showMessageDialog(null,"O valor de imposto a ser pago é: R$" + valorVenal * percentualITBI / 100);
        }
    };

    public static void exercicioTres () {
        JOptionPane.showMessageDialog(null,"Exercício 3");

        String inputNotaProvaUm = JOptionPane.showInputDialog("Qual a nota da primeira prova?");
        float notaProvaUm = Float.parseFloat(inputNotaProvaUm);

        String inputNotaProvaDois = JOptionPane.showInputDialog("Qual a nota da segunda prova?");
        float notaProvaDois = Float.parseFloat(inputNotaProvaDois);

        String inputNotaTrabalho = JOptionPane.showInputDialog("Qual a nota do trabalho");
        float notaTrabalho = Float.parseFloat(inputNotaTrabalho);

        float mediaFinal = (notaProvaUm + notaProvaDois + notaTrabalho) / 3;

        int mediaFinalAjustada = Math.round(mediaFinal);

        if (mediaFinal >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado com média: " + mediaFinal);
        } if (mediaFinal < 6 && mediaFinalAjustada == 6) {
            JOptionPane.showMessageDialog(null, "Aprovado no arredondamento com média: " + mediaFinal);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado com média: " + mediaFinal);
        }
    };

    public static void exercicioQuatro () {
        JOptionPane.showMessageDialog(null,"Exercício 4");

        String inputIdade = JOptionPane.showInputDialog("Qual a sua idade?");
        int idade = Integer.parseInt(inputIdade);

        String inputTempoContribuicao = JOptionPane.showInputDialog("Quantos anos de contribuição possui?");
        int tempoContribuicao = Integer.parseInt(inputTempoContribuicao);

        int sexo = JOptionPane.showOptionDialog(
                null,
                "Informe seu sexo:",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                new String[] {"Masculino", "Feminino"}, 0
        );

        if (idade >= 65 || sexo == 1 && idade >= 60) {
            System.out.println("Você já tem o direito a aposentadoria");
        } if (tempoContribuicao >= 35 || sexo == 1 && tempoContribuicao >= 30) {
            System.out.println("Você já tem o direito a aposentadoria");
        } if (sexo == 0) {
            int tempoRestanteHomem = Math.min(65 - idade, 35 - tempoContribuicao);
            System.out.println("Ainda faltam " + tempoRestanteHomem + " anos para você se aposentar");
        } else {
            int tempoRestanteMulher = Math.min(60 - idade, 30 - tempoContribuicao);
            System.out.println("Ainda faltam " + tempoRestanteMulher + " anos para você se aposentar");
        }
    };

    public static void exercicioSeis () {
        JOptionPane.showMessageDialog(null,"Exercício 6");

        float resistenciaEquivalente = 0;

        float menorRessitencia = 0;

        float maiorResistencia = 0;

        for (int i = 0; i < 4; i++) {
            float resistenciaAtual = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da resistência\n"));

            resistenciaEquivalente += resistenciaAtual;

            if (i == 0) {
                menorRessitencia = resistenciaAtual;
                maiorResistencia = resistenciaAtual;
            } if (maiorResistencia < resistenciaAtual) {
                maiorResistencia = resistenciaAtual;
            } if (menorRessitencia > resistenciaAtual) {
                menorRessitencia = resistenciaAtual;
            }
        }

        System.out.println("A resistência equivalente deste circuíto é: " + resistenciaEquivalente);
        System.out.println("A menor resistência deste circuíto é: " + menorRessitencia);
        System.out.println("A maior resistência deste circuíto é: " + maiorResistencia);
    }

    public static void exercicioSete () {
        JOptionPane.showMessageDialog(null,"Exercício 7");

        String usuario = "java8";
        String senha = "java8";

        for (int x = 3; x > 0; x--) {
            if (x < 3) {
                JOptionPane.showMessageDialog(null, "Você ainda tem " + x + " tentativas!");
            }
            String inputsUsuario = JOptionPane.showInputDialog("Digite o seu usuário\n");
            String inputsSenha = JOptionPane.showInputDialog("Digite a sua senha\n");

            if (inputsUsuario.equals(usuario) && inputsSenha.equals(senha)) {
                JOptionPane.showMessageDialog(null, "Bem vindo " + usuario + "!");
                x = 0;
            }
        }
    };

    public static void exercicioOito () {
        System.out.println("Exercício 8");

        Scanner inputs = new Scanner(System.in);

        System.out.println("Digite o valor para cálculo da tabuada: ");

        float valor = inputs.nextFloat();

        for (int z = 1; z <= 10; z++) {
            System.out.println(z + " X " + valor + " = " + z * valor);
        }
    }

}