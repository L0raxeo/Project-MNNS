package neuralNetworkSimulation.mark6.paths;

import neuralNetworkSimulation.mark6.utils.Utils;

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

        definePath(def);

        return null;
    }

    public static void definePath(String def)
    {
        paths.add(new Path(Utils.getStringAsCharArray(def))); // Passes neurons
        System.out.println("Defining Path: " + def);
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
