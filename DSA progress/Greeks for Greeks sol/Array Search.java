class Solution {
    public int search(int arr[], int x) {
        int n = arr.length;
        int index = -1;
        for(int i = 0 ; i < n ; i++)
        {
            if(arr [i] == x)
            {
                index =i;
                break;
            }
        }
        return index;
    }
}
