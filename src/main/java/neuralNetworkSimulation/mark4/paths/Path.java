package neuralNetworkSimulation.mark4.paths;

import neuralNetworkSimulation.mark4.NeuralNetworkM4;
import neuralNetworkSimulation.mark4.neurons.Neuron;

public class Path
{

    public String def;

    public int memory = 1;

    public Path(Neuron[] neurons)
    {
        StringBuilder sBuilder = new StringBuilder();

        for (Neuron n : neurons)
        {
            sBuilder.append(n.code);
        }

        def = sBuilder.toString();
    }

    public void trigger()
    {
        memory *= 2;
        System.out.println("[Mark]: " + def);

        NeuralNetworkM4.listen();
    }

}
