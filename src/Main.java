public class Main {
    public static void main(String[] args) {
        WordsChecker text = new WordsChecker("""
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt\s
                ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco\s
                laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in\s
                voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat\s
                non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                """);

        System.out.println(text.hasWord("aliqua"));
        System.out.println(text.hasWord("ERROR"));
    }
}