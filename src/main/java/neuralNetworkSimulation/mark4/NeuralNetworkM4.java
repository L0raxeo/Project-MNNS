package neuralNetworkSimulation.mark4;

import neuralNetworkSimulation.mark4.neurons.NeuronManager;
import neuralNetworkSimulation.mark4.paths.PathManager;

import java.util.Scanner;

public class NeuralNetworkM4
{

    /**
     * Mark-IV-NNS allows Mark to learn
     * words through strings of neurons
     * (connected neurons), therefore each
     * word can be referred to by a path
     * instead of each individual character
     * or neuron.
     *
     * The forgetting of a path is a little
     * different. When Mark forgets a char
     * (neuron), he completely forgets it.
     * However, when he forgets a path, he
     * still has that memory stored in his
     * neural network- it just has to be
     * resurfaced again. It is forgotten
     * when that path's memory drops to zero,
     * and it needs to be refreshed in his
     * memory. He may not respond to whatever
     * invokes the path, however, he won't
     * relearn what he has forgotten. The
     * path forgotten will not be deleted.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public void wake()
    {
        System.out.println("Mark-IV Awake and Listening");
        listen();
    }

    public static void listen()
    {
        PathManager.activatePath(scanner.nextLine());

        NeuronManager.decreaseAllNeuronMemory();
    }

}
