public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Remove duplicates from a list of integers using imperative programming
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        System.out.println("Unique numbers (imperative): " + uniqueNumbers);
        //Remove duplicates from a list of integers using declarative programming
        List<Integer> uniqueNumbersDeclarative = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique numbers (declarative): " + uniqueNumbersDeclarative);
    }
}
