package neuralNetworkSimulation.mark8.utils;

import neuralNetworkSimulation.mark8.nuclei.Nucleus;

import java.util.*;

public class Utils
{

    public static char[] getStringAsCharArray(String inputLineAsString)
    {
        char[] inputLineAsCharArray = new char[inputLineAsString.length()];

        // Copy character by character into array
        for (int i = 0; i < inputLineAsString.length(); i++)
        {
            inputLineAsCharArray[i] = inputLineAsString.charAt(i);
        }

        return inputLineAsCharArray;
    }

    // function to sort hashmap by values
    public static HashMap<Nucleus, Integer> sortHashMapByValue(HashMap<Nucleus, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Nucleus, Integer> > list =
                new LinkedList<>(hm.entrySet());

        // Sort the list
        list.sort(Map.Entry.comparingByValue());

        // put data from sorted list to hashmap
        HashMap<Nucleus, Integer> temp = new LinkedHashMap<>();

        for (Map.Entry<Nucleus, Integer> aa : list)
        {
            temp.put(aa.getKey(), aa.getValue());
        }

        return temp;
    }

}
