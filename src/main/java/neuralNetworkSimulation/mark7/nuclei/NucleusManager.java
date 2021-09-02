package neuralNetworkSimulation.mark7.nuclei;

import neuralNetworkSimulation.mark7.paths.Path;
import neuralNetworkSimulation.mark7.paths.PathManager;

public class NucleusManager
{

    public static void triggerNucleus(String input)
    {
        Path[] inputAsPaths = PathManager.stringToPathArray(input);

        if (inputAsPaths != null)
        {
            StringBuilder response = new StringBuilder();

            for (Path p : inputAsPaths)
            {
                response.append(p.def).append(" ");

                p.memory += 3;
            }

            System.out.println("[Mark]: " + response);
        }

        PathManager.decreaseMemoryOfAllNeurons();
    }

}
