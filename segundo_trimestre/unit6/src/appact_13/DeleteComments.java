package appact_13;

/**
 * This program gets a sentece in C language with comments, and deletes them
 *
 * @author Adriano Díaz Benítez <Adriano.Díaz>
 */
public class DeleteComments {

    /**
     * This function deletes all comments on a string
     * @param sentence the sentence to check for comments
     * @return 
     */
    static String deleteComments(String sentence) {
        int start, end;
        boolean commentsPresent = sentence.contains("/*");
        while (commentsPresent) {
            String comment;
            start = sentence.indexOf("/*");
            end = sentence.indexOf("*/") + 2;
            comment = sentence.substring(start, end);
            sentence = sentence.replace(comment, "");
            commentsPresent = sentence.contains("/*");
        }
        /* cleans double spaces if present */
        sentence = sentence.replace("  ", " ");
        return (sentence);
    }

    public static void main(String[] args) {
        String sentence = "if (a==3) /* comment to delete */ a++; "
                + "/* another comment to delete */";
        sentence = deleteComments(sentence);
        System.out.println(sentence);
    }

}
