sdadclass Solution {
    public int compress(char[] chars) {
        int index = 0;   // position to write
        int i = 0;// position to read

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // count same characters
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // write character
            chars[index++] = current;

            // write count if greater than 1
            if (count > 1) {
                String num = Integer.toString(count);
                for (char c : num.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}