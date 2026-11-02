
class Solution {
    public int candy(int[] ratings) {

        int n = ratings.length;

        int[] candies = new int[n];

        // Give every child 1 candy
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // First pass: Left to Right
        for (int i = 1; i < n; i++) {

            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Second pass: Right to Left
        for (int i = n - 2; i >= 0; i--) {

            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(
                    candies[i],
                    candies[i + 1] + 1
                );
            }
        }

        // Calculate total candies
        int total = 0;

        for (int i = 0; i < n; i++) {
            total = total + candies[i];
        }

        return total;
    }
}
