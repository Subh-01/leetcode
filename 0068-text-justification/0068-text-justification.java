class Solution {
   public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> result = new ArrayList<>();
    List<String> cur = new ArrayList<>();
    int numOfLetters = 0;

    for (String word : words) {
        if (numOfLetters + word.length() + cur.size() > maxWidth) {
            int spacesToAdd = maxWidth - numOfLetters;
            if (cur.size() == 1) {
                result.add(cur.get(0) + " ".repeat(spacesToAdd));
            } else {
                for (int i = 0; i < spacesToAdd; i++) {
                    cur.set(i % (cur.size() - 1), cur.get(i % (cur.size() - 1)) + " ");
                }
                result.add(String.join("", cur));
            }
            cur.clear();
            numOfLetters = 0;
        }

        cur.add(word);
        numOfLetters += word.length();
    }

    result.add(String.join(" ", cur) + " ".repeat(maxWidth - numOfLetters - cur.size() + 1));

    return result;
}

}