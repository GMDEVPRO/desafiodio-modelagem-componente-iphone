public class Main {
    public static void main(String[] args) {
       IPhone2007 iphone = new IPhone2007();

        iphone.selecionarMusica("Camberris");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("123-456-7890");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://casaiphone.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

