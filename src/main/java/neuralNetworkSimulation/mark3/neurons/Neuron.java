package neuralNetworkSimulation.mark3.neurons;

import neuralNetworkSimulation.mark3.NeuronNetworkM3;
import neuralNetworkSimulation.mark3.utils.Utils;

public class Neuron
{

    public final char code;

    public Neuron(char code)
    {
        this.code = code;
    }

    public void activate(Neuron[] connectedNeurons)
    {
        if (connectedNeurons.length == 1)
        {
            System.out.println(code);
            NeuronNetworkM3.listen();
        }
        else
        {
            System.out.print(code);
            Neuron[] shiftedNeuronArray = Utils.getShiftedArray(connectedNeurons);
            shiftedNeuronArray[0].activate(shiftedNeuronArray);
        }
    }

}
