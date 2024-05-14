 /**
 * <h1>SmartTv</h1>
 * A SmartTv realiza funções básicas de uma televisão.
 * <p>
 * <b>Nota:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor.
 *
 *
 * @Author   Guilherme A. Paim
 * @Version  1.0
 * @since    14/05/2024
 */

public class SmartTv {
    boolean ligada = false;
    int canal = 1, volume = 25;

     /** Método para ligar a televisão. */
    public void ligar(){
        ligada = true;
    }

     /** Método para desligar a televisão. */
    public void desligar(){
        ligada = false;
    }

     /** Método para aumentar o volume da televisão. */
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    /** Método para diminuir o volume da televisão. */
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

     /** Método para mudar o canal da televisão. */
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

     /** Método para subir o canal da televisão. */
    public void aumentarCanal(){
        canal++;
    }

     /** Método para descer o canal da televisão. */
    public void diminuirCanal(){
        canal--;
    }
}
