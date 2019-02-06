import java.util.HashMap;

public class Demo{
  public static void main(String[] args) {
    String string1 = "abacabad";
    String string2 = "abacabaabacaba";
    String string3 ="z";
    String string4 = "bcb";
    System.out.println(firstNonRepeating(string1));
    System.out.println(firstNonRepeating(string2));
    System.out.println(firstNonRepeating(string3));
    System.out.println(firstNonRepeating(string4));
  }

   static char firstNonRepeating(String s){

     HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
Character c;

//iterate over the string and store the number of times each character appears
for (int i = 0; i < s.length(); i++){
  c = s.charAt(i);
  if (myMap.containsKey(c)){
    myMap.put(c, myMap.get(c) + 1);
  } else {
    myMap.put(c, 1);
  }
}

//iterate over the string and return first occurrence of a non-repeated character
for (int j = 0; j < s.length(); j++){
  c = s.charAt(j);
  if (myMap.get(c) == 1){
    return c;
  }
}
return '_';
   }

}
