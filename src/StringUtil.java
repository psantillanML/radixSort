import java.util.ArrayList;

public class StringUtil
{
	public static String lpad(String s, int n, char c)
	{
		String lenght = "%"+n+"s";
		String str2 = String.format(lenght, s).replace(' ', '0');
		return str2;
	}

	public static int getMaxLength(int arr[])
	{
		int maxLength = 0;
		for(int i=0; i<arr.length; i++ )
		{
			String value = Integer.toString(arr[i]);
			maxLength = Math.max(maxLength, value.length());
		}
		return maxLength;
	}

	public static ArrayList arrIntToArrString(int arr[], int maxLength){
		ArrayList<String> arrStrings = new ArrayList<>();
		for(int i=0; i<arr.length; i++ )
		{
			String value = Integer.toString(arr[i]);
			String valueFull = value;
			if(!(value.length() == maxLength)){
				valueFull = StringUtil.lpad(value, maxLength, '0');
			}
			arrStrings.add(valueFull);
		}
		return arrStrings;
	}

	public static ArrayList listByValue(int value, int position, ArrayList<String> arrStrings){
		ArrayList<String> arrayAux = new ArrayList<>();
		String valueString = Integer.toString(value);

		for(int i=0; i<arrStrings.size(); i++ )
		{
			String valAux = arrStrings.get(i);
			char charVal = valAux.charAt(position);
			if(charVal == valueString.charAt(0)){
				arrayAux.add(valAux);
			}
		}

		return arrayAux;
	}
}
