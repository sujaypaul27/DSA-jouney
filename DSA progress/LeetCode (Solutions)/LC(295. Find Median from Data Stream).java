import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> maxHeap;// to store the smaller half of the numbers
    PriorityQueue<Integer> minHeap;// to store the larger half of the numbers

    public MedianFinder() {

        maxHeap = new PriorityQueue<>(Collections.reverseOrder());// max heap to store the smaller half of the numbers 
        minHeap = new PriorityQueue<>();// min heap to store the larger half of the numbers
    }

    public void addNum(int num) {

        maxHeap.offer(num);// add the number to the max heap
        minHeap.offer(maxHeap.poll());// move the largest number from the max heap to the min heap

        if (maxHeap.size() < minHeap.size()) {// if the min heap has more elements than the max heap, move the smallest number from the min heap to the max heap/
            maxHeap.offer(minHeap.poll());// move the smallest number from the min heap to the max heap
        }// this ensures that the max heap always has the same number of elements as the min heap or one more element than the min heap
    }

    public double findMedian() {

        if (maxHeap.size() > minHeap.size()) {// if the max heap has more elements than the min heap, the median is the largest number in the max heap
            return maxHeap.peek();// return the largest number in the max heap
        }

        return (maxHeap.peek() + minHeap.peek()) / 2.0;// if the max heap and min heap have the same number of elements, the median is the average of the largest number in the max heap and the smallest number in the min heap
    }
}