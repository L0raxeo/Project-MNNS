package neuralNetworkSimulation.mark1;

import neuralNetworkSimulation.mark1.neurons.NeuronManager;

import java.util.Scanner;

public class NeuralNetworkM1
{

    /**
     * Mark-I-NNS: Mark-1 Neural Network Simulation- is the
     * prototype of an AI that learns to talk. Communication
     * is the single most important ability of humans when
     * it comes to advancing as a civilization. We all learn
     * to communicate as infants, by observing others around
     * us in order to understand what they are referencing.
     * AI allows programs to communicate, remember, and learn
     * about the person who it is talking to. However, after
     * hours of research, no article nor video was found
     * referencing an AI's ability to learn how to speak.
     * The word "learn", is often used inaccurately when it
     * comes to describing an AI's ability to talk. For example,
     * when "AI learns to talk" is Googled, almost all articles
     * point to an AI that has the ability to talk hard coded
     * into it's neural network. The closest thing that comes
     * to learning how to communicate is Google's AI. Their
     * AI can adapt to communication situations, but ultimately
     * has the ability to process speech hard coded into its
     * program. Therefore, the AI cannot adapt to a language
     * that cannot be identified by Google. For example a made
     * up language cannot be learned since Google's AI cannot
     * learn its speech pattern. The goal of this experiment
     * is to attempt to develop an AI that learns to speak from
     * scratch. Therefore, it can learn to speak any language-
     * even non-official languages.
     */

    private final Scanner scanner = new Scanner(System.in);

    public void wake()
    {
        System.out.println("--Mark I Listening for input--");

        listen();
    }

    private void listen()
    {
        String inputLineAsString = scanner.nextLine();

        char[] inputLineAsCharArray = new char[inputLineAsString.length()];

        // Copy character by character into array
        for (int i = 0; i < inputLineAsString.length(); i++) {
            inputLineAsCharArray[i] = inputLineAsString.charAt(i);
        }

        for (char i : inputLineAsCharArray)
        {
            NeuronManager.activateNeuron(i);
        }

        if (!inputLineAsString.equals("sleep"))
        {
            listen();
        }
        else
        {
            System.out.println("--Sleeping NNSMI--");
        }
    }

}
