package neuralNetworkSimulation.mark3.utils;

import neuralNetworkSimulation.mark3.neurons.Neuron;

public class Utils
{

    public static Neuron[] getShiftedArray(Neuron[] array)
    {
        Neuron[] newArray = new Neuron[array.length - 1];

        for (int i = 0; i < newArray.length + 1; i++)
        {
            if (i - 1 < 0)
                continue;

            newArray[i - 1] = array[i];
        }

        return newArray;
    }

    public static char[] getStringAsCharArray(String inputLineAsString)
    {
        char[] inputLineAsCharArray = new char[inputLineAsString.length()];

        // Copy character by character into array
        for (int i = 0; i < inputLineAsString.length(); i++) {
            inputLineAsCharArray[i] = inputLineAsString.charAt(i);
        }

        return inputLineAsCharArray;
    }

}
