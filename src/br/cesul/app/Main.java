package br.cesul.app;

import br.cesul.draw.Draw;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception{
        Random random = new Random();
        Draw draw = new Draw();

        while (true) {
            int userGuess = random.nextInt(10);

            System.out.println("Palpite: " + userGuess);
            boolean guessResult = draw.guess(userGuess);

            if (guessResult) {
                System.out.println("Acertou!");
                break;
            } else {
                System.out.println("Errou!");
            }
        }
    }

}
