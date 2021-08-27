package neuralNetworkSimulation.mark5.paths;

import neuralNetworkSimulation.mark5.neurons.Neuron;
import neuralNetworkSimulation.mark5.neurons.NeuronManager;
import neuralNetworkSimulation.mark5.utils.Utils;

import java.util.ArrayList;
import java.util.ListIterator;

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

        definePath(NeuronManager.charToNeuronArray(Utils.getStringAsCharArray(def)));

        return null;
    }

    public static void definePath(Neuron[] neurons)
    {
        paths.add(new Path(neurons));
        System.out.println("Defining path: " + NeuronManager.getNeuronsAsString(neurons));
    }

    public static void decreaseAllPathMemory()
    {
        ListIterator<Path> it = paths.listIterator();

        while (it.hasNext())
        {
            try
            {
                Path n = it.next();

                n.memory--;

                if (n.memory <= 0)
                {
                    System.out.println("Forgetting path: " + n.def);
                    it.remove();
                }
            }
            catch (Exception e)
            {
                return;
            }
        }
    }

    public static Path[] stringToPathArray(String input)
    {
        String[] splitStrings = input.split(" ");

        Path[] convertedPaths = new Path[splitStrings.length];

        for (int i = 0; i < convertedPaths.length; i++)
        {
            Path path = getPath(splitStrings[i]);
            convertedPaths[i] = path;

            if (path == null)
                return null;
        }

        return convertedPaths;
    }

}
