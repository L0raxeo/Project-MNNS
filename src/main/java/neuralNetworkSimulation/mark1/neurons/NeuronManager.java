package neuralNetworkSimulation.mark1.neurons;

import java.util.ArrayList;

public class NeuronManager
{

    private static final ArrayList<Neuron> neurons = new ArrayList<>();

    public static void createNeuron(Neuron n)
    {
        neurons.add(n);
    }

    public static void activateNeuron(char code)
    {
        for (Neuron n : neurons)
        {
            if (n.code == code)
            {
                n.activate();
                return;
            }
        }

        createNeuron(new Neuron(code));
    }

}
