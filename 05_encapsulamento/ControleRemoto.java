public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private void setVolume(int volume){this.volume = volume;}
    private int getVolume(){return volume;}
    private void  setligado(boolean ligado){this.ligado = ligado;}
    private boolean getLigado(){return ligado;}
    private void setTocando(boolean tocando){this.tocando = tocando;}
    private boolean getTocando(){return tocando;}

    @Override
    public void ligar() {
         this.setligado(true);
    }

    @Override
    public void desligar() {
        this.setligado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(" ");
        System.out.println("-------Menu-------");
        System.out.println("está ligado? " + this.getLigado());
        System.out.println("está tocando? " + this.getTocando());
        System.out.print("volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print(" |");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu fechado.");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+10);
        }

    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()-10);
        }

    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }

    }
}


