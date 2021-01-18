/**
 * Java String substring() 
 * The java string substring() method returns a part of the string.
 * 
 * We pass begin index and end index number position in the java substring method where start index is inclusive and end index is exclusive. In other words, start index starts from 0 whereas end index starts from 1.
 * There are two types of substring methods in java string.
 * 
 * 
 * public String substring(int beginIndex)
 * 
 * Returns a new string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.
 * Examples:
 * "unhappy".substring(2) returns "happy"
 * "Harbison".substring(3) returns "bison"
 * "emptiness".substring(9) returns "" (an empty string)
 * 
 * Parameters:
 * beginIndex - the beginning index, inclusive.
 * Returns:
 * the specified substring.
 * Throws:
 * IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object.
 * 
 */

public class SubstringInJava {

    /* Example
    public String substring(int beginIndex) {  
        if (beginIndex < 0) {  
            throw new StringIndexOutOfBoundsException(beginIndex);  
        }  
        int subLen = value.length - beginIndex;  
        if (subLen < 0) {  
            throw new StringIndexOutOfBoundsException(subLen);  
        }  
        return (beginIndex == 0) ? this : new String(value, beginIndex, subLen);  
    }  
    */

    public static void main(String args[]){  
        String s="Quitumba";  
        System.out.println(s.substring(2,6)); //returns itum
        System.out.println(s.substring(4)); // returns umba
    }

}
