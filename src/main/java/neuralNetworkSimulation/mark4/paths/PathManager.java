package neuralNetworkSimulation.mark4.paths;

import neuralNetworkSimulation.mark4.utils.Utils;
import neuralNetworkSimulation.mark4.NeuralNetworkM4;
import neuralNetworkSimulation.mark4.neurons.Neuron;
import neuralNetworkSimulation.mark4.neurons.NeuronManager;

import java.util.ArrayList;

public class PathManager
{

    public static ArrayList<Path> paths = new ArrayList<>();

    public static Path getPath(String def)
    {
        for (Path p : paths)
        {
            if (p.def.equals(def))
            {
                return p;
            }
        }

        definePath(NeuronManager.charToNeuronArray(Utils.getStringAsCharArray(def))); // something here

        return null;
    }

    public static void definePath(Neuron[] neurons)
    {
        paths.add(new Path(neurons));
        System.out.println("Defining path: " + NeuronManager.getNeuronsAsString(neurons));
    }

    public static void activatePath(String key)
    {
        char[] keyAsCharArray = Utils.getStringAsCharArray(key);

        if (keyAsCharArray.length == 1)
        {
            Neuron neuron = NeuronManager.getNeuron(keyAsCharArray[0]);

            neuron.trigger();
        }
        else if (keyAsCharArray.length == 0)
        {
            NeuralNetworkM4.listen();
        }
        else
        {
            Path path = getPath(key);

            if (path != null)
                path.trigger();
            else
            {
                NeuralNetworkM4.listen();
            }
        }
    }

}
