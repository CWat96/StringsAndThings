package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int count = 0;

// fetch all of the characters in the sentence
        char[] allCharacters = input.toCharArray();

// evaluate each character indivudually
        for(char character : allCharacters) {
            boolean isY = 'y' == character;
            boolean isZ = 'z' == character;
            boolean shouldCount = isY || isZ;
            if(shouldCount) {
                count++;
            }
        }
        return count;

    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String result = base.replace(remove, ""); // String is the type I'm pulling from, result is what i expect to return, base is the word i'm removing words from
        //.replace method searches for a specified value (the test was created with the specified value replaced).
        //(remove, "") removes those chararcters!
        return result;

//        char Hello = remove.replace(2) // I originally put char because I thought I was removing characters and thought I needed to declare a word
//        return base + remove; // I wrote the objects + (adding) because I thought I needed to print out the result
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int isCount = (input.length() - input.replace("is", "").length())/2;
        // isCount is counting "is" -- .length returns the length of string -- .replace searches for "is" and returns a new string where "is" are replaced
        int notCount = (input.length() - input.replace("not", "").length())/3;
        // notCount is counting "not" -- .length returns the length of string -- .replace searches for "not" and returns a new string where "not" are replaced
        return isCount == notCount;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        return null;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        return null;
    }
}