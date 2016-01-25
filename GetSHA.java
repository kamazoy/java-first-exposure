import org.apache.commons.codec.digest.DigestUtils;

/**
 * Messing about with password cracking in Java. This is my first ever exposure to the language.
 * 
 * @author Daniel Dainty
 * @version 2016-01-25
 * @license Publihed under the DontJudgeMe 2016 license
 */
public class GetSHA
{



    public GetSHA()
    {
        // initialise instance variables
    }

    public static String GetHash(String input)
    {
        // use this to get a hash from a string input.
        return DigestUtils.sha1Hex(input);
    }
            
    public static String CrackThis(String input)
    {
        
        // use this to find all passwords up to six characters in length.
        // this method calls the other methods. 
        
        // don't judge!

        String attempt = CrackThisOne(input);
        if(attempt==null){
            System.out.println("Attempting two-char password");
            attempt = CrackThisTwo(input);
            if(attempt==null){
                System.out.println("Attempting three-char password");
                attempt = CrackThisThree(input);
                if(attempt==null){
                    System.out.println("Attempting four-char password");
                    attempt = CrackThisFour(input);
                    if(attempt==null){
                        System.out.println("Attempting five-char password");
                        attempt = CrackThisFive(input);
                        if(attempt==null){
                            System.out.println("Attempting six-char password");
                            attempt = CrackThisSix(input);
                        }
                    }
                }
            }
        }
        
        return attempt;
        
        
    }
    
    public static String CrackThisOne(String input)
    {

        
        for(char letter = 'a'; letter <= 'z'; letter++){
            
            if (DigestUtils.sha1Hex(Character.toString(letter)).equals(input)){
                return(Character.toString(letter));
            }
        }
       
        return null;
    }
    
    
    public static String CrackThisTwo(String input)
    {
        
        for(char letter1 = 'a'; letter1 <= 'z'; letter1++){
            for(char letter2 = 'a'; letter2 <= 'z'; letter2++){
                
                if (DigestUtils.sha1Hex(Character.toString(letter1)+Character.toString(letter2)).equals(input)){
                    return(Character.toString(letter1)+Character.toString(letter2));
                }
            
        }
    }
    return null;
    }
    
    public static String CrackThisThree(String input)
    {
        
    for(char letter1 = 'a'; letter1 <= 'z'; letter1++){
        for(char letter2 = 'a'; letter2 <= 'z'; letter2++){
            for(char letter3 = 'a'; letter3 <= 'z'; letter3++){
                
                if (DigestUtils.sha1Hex(Character.toString(letter1)+Character.toString(letter2)+Character.toString(letter3)).equals(input)){
                    return(Character.toString(letter1)+Character.toString(letter2)+Character.toString(letter3));
                }
            }
        }
    }
    return null;
    }
    
    public static String CrackThisFour(String input)
    {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        
        for(int arraypos1 = 0; arraypos1 < chars.length(); arraypos1++){
           for(int arraypos2 = 0; arraypos2 < chars.length(); arraypos2++){
                for(int arraypos3 = 0; arraypos3 < chars.length(); arraypos3++){
                    for(int arraypos4 = 0; arraypos4 < chars.length(); arraypos4++){
                        
                        String char1 = Character.toString(chars.charAt(arraypos1));
                        String char2 = Character.toString(chars.charAt(arraypos2));
                        String char3 = Character.toString(chars.charAt(arraypos3));
                        String char4 = Character.toString(chars.charAt(arraypos4));
                        
                        String attempt = char1 + char2 + char3 + char4;
                        
                        if(DigestUtils.sha1Hex(attempt).equals(input)){
                            return attempt;
                        }
                    }
                }
            }
        }
            
        
        return null;
    }
    public static String CrackThisFive(String input)
    {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        
        for(int arraypos1 = 0; arraypos1 < chars.length(); arraypos1++){
           for(int arraypos2 = 0; arraypos2 < chars.length(); arraypos2++){
                for(int arraypos3 = 0; arraypos3 < chars.length(); arraypos3++){
                    for(int arraypos4 = 0; arraypos4 < chars.length(); arraypos4++){
                        for(int arraypos5 = 0; arraypos5 < chars.length(); arraypos5++){
                        
                            String char1 = Character.toString(chars.charAt(arraypos1));
                            String char2 = Character.toString(chars.charAt(arraypos2));
                            String char3 = Character.toString(chars.charAt(arraypos3));
                            String char4 = Character.toString(chars.charAt(arraypos4));
                            String char5 = Character.toString(chars.charAt(arraypos5));
                            
                            String attempt = char1 + char2 + char3 + char4 + char5;
                            
                            if(DigestUtils.sha1Hex(attempt).equals(input)){
                                return attempt;
                            }
                        }
                    }
                }
            }
        }
            
        
        return null;
    }
    public static String CrackThisSix(String input)
    {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        
        for(int arraypos1 = 0; arraypos1 < chars.length(); arraypos1++){
           for(int arraypos2 = 0; arraypos2 < chars.length(); arraypos2++){
                for(int arraypos3 = 0; arraypos3 < chars.length(); arraypos3++){
                    for(int arraypos4 = 0; arraypos4 < chars.length(); arraypos4++){
                        for(int arraypos5 = 0; arraypos5 < chars.length(); arraypos5++){
                            for(int arraypos6 = 0; arraypos6 < chars.length(); arraypos6++){
                            
                                String char1 = Character.toString(chars.charAt(arraypos1));
                                String char2 = Character.toString(chars.charAt(arraypos2));
                                String char3 = Character.toString(chars.charAt(arraypos3));
                                String char4 = Character.toString(chars.charAt(arraypos4));
                                String char5 = Character.toString(chars.charAt(arraypos5));
                                String char6 = Character.toString(chars.charAt(arraypos6));
                                
                                String attempt = char1 + char2 + char3 + char4 + char5 + char6;
                                
                                if(DigestUtils.sha1Hex(attempt).equals(input)){
                                    return attempt;
                                }
                            }
                        }
                    }
                }
            }
        }
            
        
        return null;
    }
    
    
}
