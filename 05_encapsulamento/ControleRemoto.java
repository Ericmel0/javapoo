public class ControleRemoto implements Encapsulamento {
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

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}


