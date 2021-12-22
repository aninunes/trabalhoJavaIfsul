
/**
 * Crie uma aplicação Java que deve fazer a leitura do nome de uma pessoa e do
seu salário. Com base no salário informado deve ser calculado o valor do
desconto do INSS e o valor do salário líquido. O valor de desconto do INSS
deve ser calculado conforme a faixa de valores da Tabela 1. Quando o salário
ultrapassa o valor máximo, o desconto será da maior alíquota sobre o teto do
INSS. O valor do salário liquido corresponde ao valor do salário bruto menos o
valor do desconto do INSS. Use o controle de exceções para realizar a leitura
dos dados. Após realizar os cálculos apresente a seguinte saída para o usuário:
Nome: João da Silva
Salário bruto: 1900.00
INSS: 171.00
Salário líquido: 1729.00
 */
import javax.swing.JOptionPane;

public class t1 {

    public static void main(String[] args) {

        try {

            String nome = JOptionPane.showInputDialog("Informe o nome");
            String sb = JOptionPane.showInputDialog("Informe o salario");
            Double salarioBruto = Double.parseDouble(sb);
            Double inss = 0.0, descontos = 0.0;

            if (salarioBruto <= 1100) {
                inss = 7.5;
            } else if (salarioBruto >= 1100.01 && salarioBruto <= 2203.48) {
                inss = 9.0;
            } else if (salarioBruto >= 2203.49 && salarioBruto <= 3305.22) {
                inss = 12.0;
            } else if (salarioBruto >= 3305.23) {
                inss = 14.0;
            }
            descontos = (inss / 100) * salarioBruto;
            Double salarioLiquido = salarioBruto - descontos;

            JOptionPane.showMessageDialog(null,
                    "\nNome: " + nome + "\nSalario Bruto: " + salarioBruto + "\nINSS: " + descontos
                            + "\nTotal Liquido: " + salarioLiquido);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro!\n"+ e.getMessage());
        }

    }

}