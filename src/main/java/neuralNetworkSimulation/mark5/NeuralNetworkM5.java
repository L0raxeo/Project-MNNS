package neuralNetworkSimulation.mark5;

import neuralNetworkSimulation.mark5.neurons.NeuronManager;
import neuralNetworkSimulation.mark5.paths.PathManager;
import neuralNetworkSimulation.mark5.utils.Utils;

import java.util.Scanner;

public class NeuralNetworkM5
{

    /**
     * Mark-V-NNS adds the feature to parse sentences through each
     * space in order to separate each word. Mark-V will be able
     * to store these words in a path, therefore allowing flexibility
     * when creating sentences. Once each word is within a path, a
     * different object called a Cluster combines all the input and
     * builds it into a single string.
     *
     * Mark's source code is also more organized than Mark-IV when
     * it comes to handling messages in general.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public void wake()
    {
        System.out.println("Mark-V Awake and Listening");
        listen();
    }

    private static void handleInput(String input)
    {
        char[] keyAsCharArray = Utils.getStringAsCharArray(input);

        switch (keyAsCharArray.length)
        {
            case 1:
                NeuronManager.triggerNeuron(NeuronManager.getNeuron(keyAsCharArray[0]));
                break;
            case 0:
                listen();
                break;
            default:
                PathManager.triggerPathSequence(input);
                break;
        }
    }

    public static void listen()
    {
        handleInput(scanner.nextLine());

        PathManager.decreaseAllPathMemory();
        NeuronManager.decreaseAllNeuronMemory();
    }

}
