package neuralNetworkSimulation.mark3.neurons;

import neuralNetworkSimulation.mark3.NeuralNetworkM3;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class NeuronManager
{

    private static final ArrayList<Neuron> neurons = new ArrayList<>();

    public static void createNeuron(Neuron n)
    {
        neurons.add(n);
    }

    public static void forgetNeuron(Neuron n)
    {
        System.out.println("Forgetting Neuron: " + n.code);

        neurons.remove(n);
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

        System.out.println("Learning character: " + code);

        Neuron newNeuron = new Neuron(code);
        createNeuron(newNeuron);

        return null;
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

        try
        {
            for(Neuron n : neurons)
            {
                n.memory--;

                if (n.memory <= 0)
                    forgetNeuron(n);
            }
        }
        catch (ConcurrentModificationException ignored) { }

        try
        {
            neuronSequence[0].activate(neuronSequence);
        }
        catch (NullPointerException e)
        {
            NeuralNetworkM3.listen();
        }
    }

}
