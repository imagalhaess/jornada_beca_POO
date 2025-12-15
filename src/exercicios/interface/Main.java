public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Vai Corinthians!");
        livro1.setAutor("Isa");
        livro1.exibirDetalhes();

        Carro carro = new ModeloCarro();
        carro.definirPrecos(15000, 20000, 50000);
        carro.definirModelo("Gol");
        carro.exibirInfo();
        System.out.println("\nMaior preço: " + carro.calcularMaiorPreco() + " | "
                                   + "Menor preço: " + carro.calcularMenorPreco());

        Cachorro cachorro = new Cachorro();
        cachorro.abanarRabo();
        cachorro.emitirSom();
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        Animal cachorro1 = new Cachorro();
        cachorro1.emitirSom();

        ContaCorrente conta = new ContaCorrente();
        conta.consultarSaldo();
        conta.depositar(100);
        conta.sacar(50);
        conta.consultarSaldo();
        conta.cobrarTarifaMensal(10);
        conta.consultarSaldo();

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarPrimalidade(8);
        verificador.listarPrimos(20);

        GeradorPrimo gerador = new GeradorPrimo();
        gerador.verificarPrimalidade(13);
        gerador.gerarProximoPrimo(10);
        gerador.listarPrimos(50);

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.println(conversorMoeda.converterDolarParaReal(10));

        CalculoGeometrico calculoGeometrico = new CalculadoraSalaRetangular(4, 5);
        System.out.println(calculoGeometrico.calcularPerimetro());
        System.out.println(calculoGeometrico.calcularArea());

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(2);
        tabuada.mostrarTabuada();

        ConversorTemperatura conversorTemperatura = new ConversorTemperaturaPadrao(88);
        conversorTemperatura.fahrenheitParaCelsius();
        ConversorTemperatura conversorTemperatura1 = new ConversorTemperaturaPadrao(20);
        conversorTemperatura1.celsiusParaFahrenheit();

        ProdutoFisico produtoFisico = new ProdutoFisico(20, 10);
        produtoFisico.calcularPrecoFinal();
        System.out.println(produtoFisico.novoPreco);
        Livro_ livro_ = new Livro_(10, 2.5);
        livro_.calcularPrecoFinal();
        System.out.println(livro_.novoPreco);

        Produtos produtos = new Produtos(50);
        produtos.calcularPrecoTotal(3);
        System.out.println(produtos.valorTotal);
        produtos.aplicarDesconto(20);
        System.out.println(produtos.valorTotal);
        Servicos servicos = new Servicos(60);
        servicos.calcularPrecoTotal(2);
        System.out.println(servicos.valorTotal);
        servicos.aplicarDesconto(40);
        System.out.println(servicos.valorTotal);


    }

}