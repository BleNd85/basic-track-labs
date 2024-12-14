package lab4;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("  \tIn a distant galaxy, far away from the Earth, there was a small planet named Exoterra. "
                + "This planet was unique because it was inhabited by creatures that thrived on creativity and innovation. "
                + "\nThe Exoterians spent their days inventing gadgets, writing stories, and composing music that resonated "
                + "through the cosmos. \tHowever, Exoterra had one peculiar rule: every invention or piece of art must serve a purpose. "
                + "This rule ensured that their creativity always had practical applications.\n\nOne day, an Exoterian named Zymon "
                + "decided to create a machine that could harness the power of stars. He worked tirelessly, facing numerous challenges "
                + "and setbacks. But Zymon never gave up, and his persistence inspired the entire community. \n\tEventually, Zymon's "
                + "machine was completed, and it brought an era of unparalleled prosperity to Exoterra. \nThe energy harnessed from the stars ");
        System.out.println("Original text:");
        System.out.println(text);

        int wordLengthToReplace = 4;
        String replacementWord = "replacement";

        text.replaceWordsOfLength(wordLengthToReplace, replacementWord);

        System.out.println("\nModified text:");
        System.out.println(text);
    }

}
