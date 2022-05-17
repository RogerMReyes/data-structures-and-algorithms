# Insert to Middle of an Array

In this challenge the problem domain was to take a given array and insert the given value into the center of the array

## WhiteBoard Process 02

![Code Challenge 01](/java/imgs/CodeChallenge02.jpg)

## Approach & Efficiency 02

In this approach I decided to create a new array that will take in the values of the initial array. I iterated over the initial array and pushed the value at that iteration into the new array. If the iteration equaled to half the initial array length rounded up then the given value was pushed into first then continued on. Once the loop ended the function then returned the new array. The effieciency should be O(n) timing since a single for loop was used.
