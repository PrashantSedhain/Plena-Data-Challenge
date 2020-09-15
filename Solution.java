import java.util.*;

public class Solution {


	public char firstNonRepeatingCharacter(String inputString)
	{
		char answer = '\0';
        LinkedHashMap<Character, Integer> dict = new LinkedHashMap<>();

		for(int i = 0; i < inputString.length(); i++)
		{
			char c = inputString.charAt(i);

			if(!dict.containsKey(c))
			{
				dict.put(c, 1);
			}

			else
			{

				int count = dict.get(c);
				count += 1;
				dict.replace(c, count);
			}

		}


		for(char key: dict.keySet())
		{
			if(dict.get(key) == 1)
			{
				answer = key;
				break;
			}
		}

		String orderedStr = printInNumberOfOccurences(dict);
		System.out.println("\nThe string ordered in terms of their occurence is " + orderedStr);
		return answer;
	}


	public String printInNumberOfOccurences(LinkedHashMap<Character, Integer> dict)
	{
		String answer = "";
		List<Integer> list = new ArrayList<>();
		for(char key: dict.keySet())
		{
			int num = dict.get(key);
			if(!list.contains(num))
			{
				list.add(num);
			}
		}

		Collections.sort(list);
		for(int num: list)
		{
			for(char c: dict.keySet())
			{
				if(dict.get(c) == num)
				{
					for(int i = 0; i < num; i++)
						answer += c;
				}
			}
		}

		return answer;
	}
}