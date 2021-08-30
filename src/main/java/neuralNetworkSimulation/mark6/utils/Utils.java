package neuralNetworkSimulation.mark6.utils;

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

    public static String getCharsAsString(char[] characters)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : characters)
        {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

}
