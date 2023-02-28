public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("----------------------------");

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);
        smartTv.aumentararCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);


        System.out.println("----------------------------");


        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("----------------------------");
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

    }
}
