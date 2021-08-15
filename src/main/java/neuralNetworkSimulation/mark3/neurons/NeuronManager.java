package neuralNetworkSimulation.mark3.neurons;

import java.util.ArrayList;

public class NeuronManager
{

    private static final ArrayList<Neuron> neurons = new ArrayList<>();

    public static void createNeuron(Neuron n)
    {
        neurons.add(n);
    }

    public static Neuron getNeuron(char code)
    {
        for (Neuron n : neurons)
        {
            if (n.code == code)
            {
                return n;
            }
        }

        System.out.println("Creating Neuron for character: " + code);

        Neuron newNeuron = new Neuron(code);
        createNeuron(newNeuron);

        return newNeuron;
    }

    public static Neuron[] charToNeuronArray(char[] splitInput)
    {
        Neuron[] neuronSequence = new Neuron[splitInput.length];

        for (int i = 0; i < splitInput.length; i++)
        {
            neuronSequence[i] = getNeuron(splitInput[i]);
        }

        return neuronSequence;
    }

    public static void activateNeuronSequence(char[] splitInput)
    {
        Neuron[] neuronSequence = charToNeuronArray(splitInput);

        neuronSequence[0].activate(neuronSequence);
    }

}
