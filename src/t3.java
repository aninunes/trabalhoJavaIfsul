
/**
 * Crie uma aplicação Java que realize a leitura de uma data, para simular datas de
pagamento. A partir da data lida, calcule 5 datas de pagamento, com intervalos
de 7 dias entre uma data e outra. Utilize o controle de exceções para que a data
lida seja válida. Imprima no console a data informada pelo usuário a as datas de
vencimento, como na saída abaixo:
Data informada: 16/11/2021
Data de pagamento: 23/11/2021
Data de pagamento: 30/11/2021
Data de pagamento: 07/12/2021
Data de pagamento: 14/12/2021
Data de pagamento: 21/12/2021
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class t3 {
    public static void main(String[] args) {

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            String dl = JOptionPane.showInputDialog("Informe a data para simulação de pagamento dd/MM/yyyy: ");
            Date datal = sdf.parse(dl);            
            String formato = "dd/MM/yyyy";
            SimpleDateFormat dataFormatada = new SimpleDateFormat(formato); 
            for (int i = 0; i < 5; i++){
                datal.setDate(datal.getDate() + 7);   
            System.out.println("Data de pagamento: " + dataFormatada.format(datal));}
             
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!\n" + e.getMessage());

        }

    }

}
