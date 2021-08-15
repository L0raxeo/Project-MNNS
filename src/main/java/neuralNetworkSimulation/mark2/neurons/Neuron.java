package neuralNetworkSimulation.mark2.neurons;

import neuralNetworkSimulation.mark2.NeuronNetworkM2;
import neuralNetworkSimulation.mark2.utils.Utils;

public class Neuron
{

    public final char code;

    public Neuron(char code)
    {
        this.code = code;
    }

    public void activate(Neuron[] connectedNeurons)
    {
        try
        {
            if (connectedNeurons[1] == null)
            {
                System.out.println("Exception Thrown");
            }
            else
            {
                System.out.print(code);
                Neuron[] shiftedNeuronArray = Utils.getShiftedArray(connectedNeurons);
                shiftedNeuronArray[0].activate(shiftedNeuronArray);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(code);
            NeuronNetworkM2.listen();
        }
    }

}
