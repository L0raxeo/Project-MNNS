package neuralNetworkSimulation.mark2;

import neuralNetworkSimulation.mark2.neurons.NeuronManager;
import neuralNetworkSimulation.mark2.utils.Utils;

import java.util.Scanner;

public class NeuronNetworkM2
{

    /**
     * Mark-II-NNS polishes Mark-I-NNS
     * by having a more efficient memory system.
     *
     * The new system is more flexible in order
     * to allow the additions of other features
     * that may be added in the future
     *
     * Mark-II-NNS has the exact same
     * function as Mark-I-NNS, however
     * the new memory system allows
     * Mark to create a new line at
     * the end of his sentence. This proves
     * that he can differentiate between
     * the beginning of a sentence and
     * the end of one.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public void wake()
    {
        System.out.println("--Mark II Listening for input--");

        listen();
    }

    public static void listen()
    {
        NeuronManager.activateNeuronSequence(Utils.getStringAsCharArray(scanner.nextLine()));
    }

}
