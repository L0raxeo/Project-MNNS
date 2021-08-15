package neuralNetworkSimulation.mark2;

import neuralNetworkSimulation.mark2.neurons.NeuronManager;
import neuralNetworkSimulation.mark2.utils.Utils;

import java.util.Scanner;

public class NeuronNetworkM2
{

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
