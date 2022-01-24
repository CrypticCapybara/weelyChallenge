/**
 * Create a function that will test if a string is a valid PIN or not via a regular expression.
 *
 * A valid PIN has:
 * Exactly 4 or 6 characters.
 * Only numeric characters (0-9).
 * No whitespace.
 *
 * Examples
 * validate("121317") ➞ true
 * validate("1234") ➞ true
 * validate("45135") ➞ false
 * validate("89abc1") ➞ false
 * validate("900876") ➞ true
 * validate(" 4983") ➞ false
 *
 * Notes: Empty strings should return 'false' when tested.
 */
public class ValidPin {
    public static void main(String[] args) {

        System.out.println(validate("121317"));
        System.out.println(validate("1234"));
        System.out.println(validate("45135"));
        System.out.println(validate("89abc1"));
        System.out.println(validate("900876"));
        System.out.println(validate(" 4983"));

    }

    public static boolean validate(String target){
        if(target.length()!=4 && target.length() != 6) return false;
        for(int i = 0; i < target.length(); i++){
            try {
                int k = Integer.parseInt(target.substring(i, i+1));
            } catch(Exception e){
                return false;
            }
        }
        return true;
    }
}
