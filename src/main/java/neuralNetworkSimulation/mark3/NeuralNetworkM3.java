package neuralNetworkSimulation.mark3;

import neuralNetworkSimulation.mark3.neurons.NeuronManager;
import neuralNetworkSimulation.mark3.utils.Utils;

import java.util.Scanner;

public class NeuralNetworkM3
{

    /**
     * Mark-III-NNS adds the ability to forget
     * in order to relearn outdated memories
     *
     * The ability to forget is done by the
     * frequency in which the neuron is used.
     * There is a variable in each neuron that
     * represents how many stages it takes
     * until that neuron is forgotten and
     * deleted. Each time Mark receives an
     * input, each neuron's variable decreases.
     * If that variable reaches 0, then the
     * neuron is deleted and forgotten. It will
     * then have to be relearned. But if that
     * Neuron is used before it's forgotten,
     * then the variable increases, simulating
     * the strengthening of an idea during
     * memorization in the human brain. Each
     * neuron starts off with a memory of 15.
     * Although this number may seem low, chars
     * are used quite often. However, later on
     * when it comes to the AI remembering words,
     * that initial value will be substantially
     * more, since the average word is used a lot
     * less than the average character.
     *
     * An additional feature makes it so that
     * if Mark is first learning a character
     * in the input string, it will learn the
     * characters without spitting back the
     * input line. This makes Mark more
     * realistic and sets up future features
     * such as the ability to create neural
     * paths resulting in the memorization of
     * words- not just characters.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public void wake()
    {
        System.out.println("--Mark III Listening for input--");

        listen();
    }

    public static void listen()
    {
        NeuronManager.activateNeuronSequence(Utils.getStringAsCharArray(scanner.nextLine()));
    }

}
