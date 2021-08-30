package neuralNetworkSimulation.mark5.paths;

import neuralNetworkSimulation.mark5.neurons.Neuron;

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

        System.out.println(def);
    }

}
