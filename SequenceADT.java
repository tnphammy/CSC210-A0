interface SequenceADT<T> {
    /*
     * Interface shows the operations one could do with a sequence, a sequence with
     * an index, and two sequences
     */

    /* 1. A Sequence Alone */
    /**
     * Print a String representation of an sequence
     * @return The sequence as a String
     * @throws NegativeArraySizeException if length of sequence is < 0
     */
    public String toString() throws NegativeArraySizeException;

    /**
     * Gets the length of the sequence
     * @return The length of the sequence
     */
    public int getArrayLength();

    /* 2. A Sequence with Indeces */
    /**
     * Get the first occuring index of a value in an sequence
     * @param value The specified value
     * @return The index of the first occurence of the value
     * Should return -1 if the value does not exist in the sequence
     */
    public int getIndex(T value);

    /**
     * Sets the value at the index to a specified value
     * @param index The index at which to change its value
     * @param newValue The new value after setting
     * @throws ArrayIndexOutOfBoundsException if index is not within the sequence
     */
    public void setValue(int index, T newValue) throws ArrayIndexOutOfBoundsException;

    /**
     * Gets the value from a given index of the sequence
     * @param index The specified index
     * @return The value at the given index in the sequence
     * @throws ArrayIndexOutOfBoundsException if index is not within the sequence
     */
    public T getValue(int index) throws ArrayIndexOutOfBoundsException;

    /**
     * Sort a specified range of an sequence in ascending order
     * @param arrayT The sequence to be modified
     * @param start The index of the first position of the range to fill in (Inclusive)
     * @param end The index of the last position of the range to fill in (Exclusive)
     * @throws IllegalArgumentException if start index < end index
     * @throws ArrayIndexOutOfBoundsException if either index is not within the sequence
     */
    public void sort(T arrayT, int start, int end) throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

    /* 3. Two Sequences */
    /**
     * Compares two sequences
     * @param array1 The first sequence
     * @param array2 The second sequence
     * @return 0 if two arrays are equal;
     * @return a negative integer if the array1 is less than array2 lexicographically
     * @return a positive integer if array1 is greater than array2 lexicographically.
     */
    public int compare(T array1, T array2);

    /**
     * Checks whether two sequences are the exact same
     * @param array1 The first sequence
     * @param array2 The second sequence
     * @return true/false depending on whether the arrays match
     */
    public boolean equals(T array1, T array2);

    /**
     * Finds the first index of a mismatch between two sequences
     * @param array1 The first sequence
     * @param array2 The second sequence
     * @return The index of the first instance of a mismatch
     * (Provided all sequences have indices)
     */
    public int mismatch(T array1, T array2);
}
