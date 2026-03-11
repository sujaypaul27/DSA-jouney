
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);// sort the heaters array to perform binary search
        int radius = 0;// initialize the radius to 0

        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);// perform binary search to find the index of the heater that is closest to the house

            if (index < 0) {// if the house is not found in the heaters array, the binary search returns a negative index. We can convert it to the index of the next heater by negating it and subtracting 1.
                index = -index - 1;// if the house is not found in the heaters array, the binary search returns a negative index. We can convert it to the index of the next heater by negating it and subtracting 1.
            }

            int dist1 = index < heaters.length ? Math.abs(heaters[index] - house) : Integer.MAX_VALUE;// if the index is within the bounds of the heaters array, calculate the distance from the house to the heater at that index. Otherwise, set the distance to Integer.MAX_VALUE to indicate that there is no heater on that side.
            int dist2 = index > 0 ? Math.abs(house - heaters[index - 1]) : Integer.MAX_VALUE;// if the index is greater than 0, calculate the distance from the house to the heater at the previous index. Otherwise, set the distance to Integer.MAX_VALUE to indicate that there is no heater on that side.

            int closest = Math.min(dist1, dist2);// the closest heater is the one with the smaller distance to the house
            radius = Math.max(radius, closest);// update the radius to be the maximum of the current radius and the distance to the closest heater for this house
        }

        return radius;
    }
}
