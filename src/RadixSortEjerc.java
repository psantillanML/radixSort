import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		int maxLength = StringUtil.getMaxLength(arr);
		ArrayList<String> arrStrings = StringUtil.arrIntToArrString(arr, maxLength);
		int posicionActual = maxLength - 1;
		while(posicionActual != -1){
			HashMap<String,ArrayList> hm = new HashMap<>();
			for(int j=0; j<10; j++ )
			{
				String list = "L"+j;
				ArrayList<String> arrValues = StringUtil.listByValue(j, posicionActual, arrStrings);
				if(!(arrValues.size() == 0))
					hm.put(list,arrValues);
			}
			ArrayList<String> arrayAux2 = new ArrayList<>();
			for(Map.Entry<String,ArrayList> entry:hm.entrySet())
			{
				ArrayList<String> value = entry.getValue();
				for( int k=0; k<value.size(); k++ )
				{
					arrayAux2.add(value.get(k));
				}
			}
			for( int l=0; l<arrayAux2.size(); l++ )
			{
				arrStrings.set( l, arrayAux2.get(l) );
			}
			posicionActual--;
		}

		System.out.println( "New array strings: ");
		for( int i=0; i<arrStrings.size(); i++ )
		{
			System.out.print( arrStrings.get(i) +(i<arrStrings.size()-1?",":""));
		}

		System.out.println(" ");
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
