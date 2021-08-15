package neuralNetworkSimulation.mark1;

import neuralNetworkSimulation.mark1.neurons.NeuronManager;

import java.util.Scanner;

public class NeuralNetworkM1
{

    private final Scanner scanner = new Scanner(System.in);

    public void wake()
    {
        System.out.println("--Mark I Listening for input--");

        listen();
    }

    public void listen()
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
            System.out.println("--Sleeping NNS--");
        }
    }

}
