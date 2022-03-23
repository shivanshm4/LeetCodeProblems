package Heap;


// This is an implementation of heap
// Store the element of the Tree in an Array: Root at i, left child: 2*i, right child: 2*i+1, parent = floor(i/2)
public class MinHeap {

    int[] minHeap;
    int realSize;
    int maxSize;

    MinHeap(int maxSize){
        this.minHeap = new int[maxSize+1];
        this.maxSize = maxSize;
        this.realSize = 0;
    }

    void add(int num){
        realSize++;
        if(realSize > maxSize){
            realSize--;
            System.out.println("All elements filled; Can't add anymore elements");
            return;
        }
        // Add the element at the end of the Heap;

        this.minHeap[realSize] = num;
        int index = realSize;
        int parent = index / 2;
        while(this.minHeap[index] < this.minHeap[parent] && index > 1){
            int temp = this.minHeap[index];
            this.minHeap[index] = this.minHeap[parent];
            this.minHeap[parent] = temp;
            index  = parent;
            parent = index/2;
        }
    }
    void peek(){
        System.out.println(this.minHeap[1]);
    }
    void delete(){
        if(realSize<1){
            System.out.println("Heap empty; Can't delete");
            return;
        }
        
        this.minHeap[1] = this.minHeap[realSize];
        int index = realSize;
        int parent = index / 2;
        while (index <= realSize / 2) {
            // the left child of the deleted element
            int left = index * 2;
            // the right child of the deleted element
            int right = (index * 2) + 1;
            // If the deleted element is larger than the left or right child
            // its value needs to be exchanged with the smaller value
            // of the left and right child
            if (minHeap[index] > minHeap[left] || minHeap[index] > minHeap[right]) {
                if (minHeap[left] < minHeap[right]) {
                    int temp = minHeap[left];
                    minHeap[left] = minHeap[index];
                    minHeap[index] = temp;
                    index = left;
                } else {
                    // maxHeap[left] >= maxHeap[right]
                    int temp = minHeap[right];
                    minHeap[right] = minHeap[index];
                    minHeap[index] = temp;
                    index = right;
                }
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.add(3);
        minHeap.add(10);
        minHeap.add(15);
        minHeap.add(1);

        for(int i = 0; i <= minHeap.realSize; i++){
            System.out.println(minHeap.minHeap[i]);
        }
    }
}
