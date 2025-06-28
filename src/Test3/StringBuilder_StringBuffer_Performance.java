package Test3;

public class StringBuilder_StringBuffer_Performance {
    public static void main(String[] args) {

        int iterations = 100000; // You can adjust this (e.g., 1000, 1000000)

        // ===============================
        // Test 1: String concatenation
        // ===============================
        String s = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            s = s + "a";
        }
        long endTime = System.nanoTime();
        long stringTime = (endTime - startTime) / 1_000_000;
        System.out.println("String concatenation time: " + stringTime + " ms");

        // ===============================
        // Test 2: StringBuilder
        // ===============================
        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        long stringBuilderTime = (endTime - startTime) / 1_000_000;
        System.out.println("StringBuilder time: " + stringBuilderTime + " ms");

        // ===============================
        // Test 3: StringBuffer
        // ===============================
        StringBuffer sbuf = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuf.append("a");
        }
        endTime = System.nanoTime();
        long stringBufferTime = (endTime - startTime) / 1_000_000;
        System.out.println("StringBuffer time: " + stringBufferTime + " ms");


    }
}
