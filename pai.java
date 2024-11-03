public class pai {
    public static void main(String[] args) throws Exception {
    

        Carro c1 = new Carro("Golf");
        Carro c2 = new Carro("HRV");
        CarroCombate c3 = new CarroCombate("striker", 100);
        CarroCombate c4 = new CarroCombate("leopardo", 50);

        

        c4.Atirar();
        c4.Atirar();
        c4.Atirar();
        c3.setligado(true);
        c3.Atirar();
        c4.sofrerDano(35);
        c2.sofrerDano(5);
        c3.sofrerDano(65);
        


        c1.setligado(true);
        c1.info();
        c2.info();
        c3.info();
        c4.info();
        

    }


}
