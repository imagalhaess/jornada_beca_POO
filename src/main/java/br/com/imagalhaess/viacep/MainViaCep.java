package br.com.imagalhaess.viacep;

import br.com.imagalhaess.viacep.exceptions.CepNotFound;
import br.com.imagalhaess.viacep.exceptions.InvalidParameter;
import br.com.imagalhaess.viacep.models.Dados;
import br.com.imagalhaess.viacep.services.ViaCepService;

import java.io.IOException;
import java.util.Scanner;

public class MainViaCep {
    public static void main (String[] args) throws CepNotFound, IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        ViaCepService service = new ViaCepService();
        String cep = "";
        System.out.println("****** INICIANDO PROGRAMA ******");
        while (true) {
                System.out.println("Digite o número do CEP para a busca ou 'sair' para encerrar. ");
                cep = input.nextLine();
                if (cep.equalsIgnoreCase("sair")) {
                    break;
                }
            try {
                Dados dados = service.buscar(cep);
                System.out.println(dados);
            } catch (CepNotFound e) {
                System.out.println(e.getMessage());
            } catch (InvalidParameter e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("****** FINALIZANDO PROGRAMA ******");
    }
}
