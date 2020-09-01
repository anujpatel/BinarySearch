BinarySearch
============

Java program for Binary Search Algorithm

Binary search works faster than sequential search.It search on sorted elements.
In Binary Search, Let's say You have an array and you want to search specific item in array

How it Works :

    1. Initialize low=0 and high as max length of search array - 1.
    2. while low<=high each item you, take middle element of array and if given searchItem is less than middle element          then you need to search in array of elements array which are less than middle element. Hence, high = middle - 1
    3. If given searchItem is larger than middle element then search in array of elements which are greater than middle         element. Hence low = middle+1
    4. If searchItem == middle element then you have found your element
    
    
For more info, Visit - https://goldenpackagebyanuj.blogspot.com/2014/07/binary-search-algorithm-using-java.html
