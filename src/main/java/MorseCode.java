public class MorseCode {

    String letters;
    String morse;

    public MorseCode(String i) {

         letters = i;
    }


    public String convertMorseToLetters(char convert)
    {
        switch (convert)
        {
            case ' ':
                //return "";
                System.out.print("/ ");
                break;

            case 'A':
                System.out.print(".- ");
                break;

            case 'B':
                System.out.print("-... ");
                break;

            case 'C':
                System.out.print("-.-. ");
                break;
            case 'D':
                System.out.print("-.. ");
                break;
            case 'E':
                System.out.print(". ");
                break;

            case 'F':
                System.out.print("..-. ");
                break;

            case 'G':
                System.out.print("--. ");
                break;

            case 'H':
                System.out.print(".... ");
                break;

            case 'I':
                System.out.print(".. ");
                break;

            case 'J':
                System.out.print(".--- ");
                break;

            case 'K':
                System.out.print("-.- ");
                break;

            case 'L':
                System.out.print(".-.. ");
                break;

            case 'M':
                System.out.print("-- ");
                break;

            case 'N':
                System.out.print("-. ");
                break;

            case 'O':
                System.out.print("--- ");
                break;

            case 'P':
                System.out.print(".--. ");
                break;

            case 'Q':
                System.out.print("--.- ");
                break;

            case 'R':
                System.out.print(".-. ");
                break;

            case 'S':
                System.out.print("... ");
                break;

            case 'T':
                System.out.print("- ");
                break;

            case 'U':
                System.out.print("..- ");
               break;

            case 'V':
                System.out.print("...- ");
                break;

            case 'W':
                System.out.print(".-- ");
                break;

            case 'X':
                System.out.print("-..- ");
                break;

            case 'Y':
                System.out.print("-.-- ");
               break;

            case 'Z':
                System.out.print("--.. ");
                 break;
                 default:
        }
        return " ";
    }

    public String lettersToMorse()
    {
        morse = " ";
        for(int i=0; i<letters.length(); i++)
        {
            morse += convertMorseToLetters(Character.toUpperCase(letters.charAt(i)))+ " ";
        }
        return morse;
    }

    public String morseToLetters()
    {
        letters="";
        for(int i=0; i<morse.length(); i++)
        {
            letters +=convertMorseToLetters(morse.charAt(i));
        }
        return letters;
    }

}
