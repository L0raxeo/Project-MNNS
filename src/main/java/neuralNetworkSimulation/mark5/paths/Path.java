package neuralNetworkSimulation.mark5.paths;

import neuralNetworkSimulation.mark5.NeuralNetworkM5;
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

    public void trigger(boolean isLastPath)
    {
        memory *= 2;

        if (isLastPath)
        {
            System.out.println(def);

            NeuralNetworkM5.listen();
        }
        else
        {
            System.out.print(def);
        }
    }

}
