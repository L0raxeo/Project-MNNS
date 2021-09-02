package neuralNetworkSimulation.mark7;

import neuralNetworkSimulation.mark7.nuclei.NucleusManager;
import neuralNetworkSimulation.mark7.utils.Utils;

import java.util.Scanner;

public class NeuralNetworkM7
{

    /**
     * Mark-VII-NNS updates the memory
     * system in order to forget paths.
     *
     * The learning system has also been
     * reworked in order to learn unknown
     * words all at once.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public void wake()
    {
        System.out.println("Mark-VII Awake and Listening");
        listen();
    }

    private static void handleInput(String input)
    {
        char[] keyAsCharArray = Utils.getStringAsCharArray(input);

        switch (keyAsCharArray.length)
        {
            case 1:
                System.out.println(keyAsCharArray[0]);
                listen();
                break;
            case 0:
                listen();
                break;
            default:
                NucleusManager.triggerNucleus(input);
                listen();
                break;
        }
    }

    public static void listen()
    {
        handleInput(scanner.nextLine());
    }

}
