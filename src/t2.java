
/**) Crie uma aplicação Java que fará o cálculo do valor de locação de um veículo. O
valor total da locação é calculado pela quantidade de dias da locação
multiplicado pelo valor da diária. A aplicação deve ler o valor da diária, a data
de locação e a data de devolução. Use o controle de exceções para que não sejam
informados dados inválidos (valor da diária e datas). Após a leitura dos valores
calcule a quantidade de dias da locação e o valor total, e apresente os resultados
da seguinte forma:
Valor da diária: 180.00
Data de locação: 17/12/2021
Data de devolução: 19/12/2021
Dias de locação: 2
Valor total da locação: 360.00 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class t2 {
    public static void main(String[] args) {

        try {
            String vd = JOptionPane.showInputDialog("Informe o valor da diaria");
            Double diaria = Double.parseDouble(vd);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            String dl = JOptionPane.showInputDialog("Informe a data de locação do veiculo dd/MM/yyyy: ");
            String dd = JOptionPane.showInputDialog("Informe a data de devolução do veiculo dd/MM/yyyy: ");

            Date datal = sdf.parse(dl);
            Date datad = sdf.parse(dd);

            long diffEmMil = Math.abs(datad.getTime()-datal.getTime());
            long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);
            Double valordias = (diff*diaria);




            JOptionPane.showMessageDialog(null,"Valor da diaria: "+ diaria + "\nData informada de locação : " + sdf.format(datal)
                    + "\nData informada de devolução : " + sdf.format(datad)+ "\nDias de locação: "+ diff + "\nValor total da locação: "+valordias);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!\n" + e.getMessage());

        }

    }

}
