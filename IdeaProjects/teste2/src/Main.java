public class Main {

    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Prata", true, 0);
        Carro outroCarro = new Carro("Ford", "Fiesta", 2019, "Preto", false, 0);

        // Chamando métodos dos objetos
        //meuCarro.acelerar();
        //outroCarro.acelerar();
        //outroCarro.frear();
        //meuCarro.mostra();
        //meuCarro.desligar();
        //meuCarro.mostra();
        outroCarro.mostra();
        outroCarro.ligar();
        outroCarro.acelerar(100);
        outroCarro.frear(30);
        outroCarro.mostra();

    }

}
