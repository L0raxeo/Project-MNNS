package neuralNetworkSimulation.mark6;

import neuralNetworkSimulation.mark6.nuclei.NucleusManager;
import neuralNetworkSimulation.mark6.utils.Utils;

import java.util.Scanner;

public class NeuralNetworkM6
{

    /**
     * Mark-VI-NNS will remove Neurons as an object.
     * This allows Mark-VI to eliminate a variable
     * in its neural network, making it easier to
     * navigate, maintain, control, and think. Not
     * only was the idea of a Neuron a bit pointless,
     * but it was also making it harder to understand.
     * The end goal for mark will be an assistant that
     * can remember and override memories. However,
     * there are still plans for the AI to split off
     * into multiple purposes.
     *
     * Because Mark-VI focus' on improving the current
     * system of input management, the memory has been
     * removed. This will make it easier to create and
     * code Mark-VI, but it also means that when I do
     * re-implement the memory system, it will be
     * updated, and work better (and have a better system)
     * with that current version of Mark (currently
     * planned to be in Mark-VII)
     */

    private static final Scanner scanner = new Scanner(System.in);

    public void wake()
    {
        System.out.println("Mark-VI Awake and Listening");
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
