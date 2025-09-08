/** Interface to describe the operations supported directly 
 * by the built-in array.
 * Arguments for building an IndexAccess Object:
 * public int length;
 * public T dataType; //int[], char[], etc.
 * */
interface IndexAccessADT<T> {
    /**
     * Print a String representation of an array
     * @param arrayT The array to be represented
     * @return The array as a String
     * Throws NegativeArraySizeException if length of array is < 0
     */
    public String toString(T arrayT);

    /**
     * Compares two arrays
     * @param array1 The first array
     * @param array2 The second array
     * @return 0 if two arrays are equal; 
     * @return a negative integer if the array1 is less than array2 lexicographically
     * @return a positive integer if array1 is greater than array2 lexicographically.
     */
    public int compare(T array1, T array2);

    /**
     * Checks whether two arrays are the exact same
     * @param array1 The first array
     * @param array2 The second array
     * @return true/false depending on whether the arrays match
     */
    public boolean equals(T array1, T array2);
  
    /**
     * Fills in an array with a value in a specified range
     * @param arrayT The array to be modified         
     * @param start The index of the first position of the range to fill in (Inclusive)
     * @param end The index of the last position of the range to fill in (Exclusive)
     * @param value The value used to fill in
     * Throws IllegalArgumentException if start index < end index
     * Throws ArrayIndexOutOfBoundsException if either index is not within the array
     */
    public void fill(T arrayT, int start, int end, T value);

    /**
     * Fills in an array with a value 
     * @param arrayT The array to be modified         
     * @param value The value used to fill in
     */
    public void fill(T arrayT, T value);
    
    /**
     * Finds the first index of a mismatch between two arrays
     * @param array1 The first array 
     * @param array2 The second array
     * @return The index of the first instance of a mismatch
     */
    public int mismatch(T array1, T array2);

    /**
     * Sort an array in ascending order
     * @param arrayT The array to be sorted
     */
    public void sort(T arrayT);

    /**
     * Sort a specified range of an array in ascending order
     * @param arrayT The array to be modified
     * @param start The index of the first position of the range to fill in (Inclusive)
     * @param end The index of the last position of the range to fill in (Exclusive)
     * * Throws IllegalArgumentException if start index < end index
     * Throws ArrayIndexOutOfBoundsException if either index is not within the array
     */
    public void sort(T arrayT, int start, int end);
}
