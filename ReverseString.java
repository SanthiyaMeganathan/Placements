class ReverseString {
    public static void main(String[] args) {
        String name = "dev";

        int length = name.length();

        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(name.charAt(i));
        }

        System.out.println(reversed);
    }
}
