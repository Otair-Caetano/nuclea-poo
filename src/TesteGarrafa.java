public class TesteGarrafa {

    public static void main(String[] args) {


        GarrafaAgua garrafaComGas = new GarrafaAgua();
        garrafaComGas.temGas = true;

        GarrafaAgua garrafaSemGas = new GarrafaAgua();
        garrafaSemGas.temGas = false;

        garrafaComGas.abrir();

        garrafaSemGas.abrir();


    }
}
