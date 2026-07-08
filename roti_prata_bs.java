class Solution {

    // Checks if p pratas can be cooked within 'limit' time
    boolean isValid(int p, int cooks[], int totalCooks, int limit) {

        int totalPrata = 0;

        for (int i = 0; i < totalCooks; i++) {

            int currRank = cooks[i];
            int timeTaken = 0;
            int j = 1;

            while (timeTaken + j * currRank <= limit) {

                timeTaken += j * currRank;
                totalPrata++;

                if (totalPrata >= p) {
                    return true;
                }

                j++;
            }
        }

        return false;
    }

    public int minTimeToCook(int p, int[] cook, int n) {

        int maxRank = 0;

        for (int i = 0; i < n; i++) {
            maxRank = Math.max(maxRank, cook[i]);
        }

        int start = 0;
        int end = maxRank * (p * (p + 1) / 2);
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (isValid(p, cook, n, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int p = 10;
        int[] cooks = {1, 2, 3, 4};
        int n = cooks.length;

        System.out.println(obj.minTimeToCook(p, cooks, n));
    }
}
