package neuralNetworkSimulation.mark7.utils;

public class Utils
{

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
