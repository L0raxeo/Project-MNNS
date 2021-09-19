package neuralNetworkSimulation.mark8;

import neuralNetworkSimulation.mark8.nuclei.NucleusManager;
import neuralNetworkSimulation.mark8.utils.Utils;

import java.util.Scanner;

public class NeuralNetworkM8
{

    /**
     * Mark-VIII-NNS
     */

    private static final Scanner scanner = new Scanner(System.in);

    public void wake()
    {
        System.out.println("Mark-VIII Awake and Listening");
        listen();
    }

    private static void handleInput(String input)
    {
        char[] keyAsCharArray = Utils.getStringAsCharArray(input);

        if (keyAsCharArray.length != 0)
        {
            NucleusManager.triggerNucleus(input);
        }

        listen();
    }

    public static void listen()
    {
        handleInput(scanner.nextLine());
    }

}
