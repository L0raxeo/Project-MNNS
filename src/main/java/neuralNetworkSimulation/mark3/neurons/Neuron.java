package neuralNetworkSimulation.mark3.neurons;

import neuralNetworkSimulation.mark3.NeuralNetworkM3;
import neuralNetworkSimulation.mark3.utils.Utils;

public class Neuron
{
/*
 temp commit
 */
    public final char code;

    public int memory;

    public Neuron(char code)
    {
        this.code = code;

        memory = 15;
    }

    public void activate(Neuron[] connectedNeurons)
    {
        memory += 5;

        if (connectedNeurons.length == 1)
        {
            System.out.println(code);
            NeuralNetworkM3.listen();
        }
        else
        {
            System.out.print(code);
            Neuron[] shiftedNeuronArray = Utils.getShiftedArray(connectedNeurons);
            shiftedNeuronArray[0].activate(shiftedNeuronArray);
        }
    }

}
