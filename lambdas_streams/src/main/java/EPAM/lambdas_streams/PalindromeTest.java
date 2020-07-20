package EPAM.lambdas_streams;


import java.util.stream.Stream;


public class PalindromeTest {

    public static void main(String[] args) {
        String[] names = {"abc", "aba","aaa"};
        PossibleCombination possibleCombination = new PossibleCombination(
                names, CombinationOption.EXCLUDE_DUPLICATED
        );
        Stream<String> allCombination = possibleCombination.getAll();
        allCombination.forEach((String concatName) -> {
            StringBuilder sb = new StringBuilder(concatName);
            boolean equal = sb.reverse()
                    .toString()
                    .equalsIgnoreCase(concatName);
            if (equal) {
                System.out.println(concatName);
            }
        });
    }
}