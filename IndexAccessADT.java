/**
 * Interface to describe the operations supported directly
 * by the built-in array.
 * 
 * Arguments for building an IndexAccess Object:
 * public int length;
 * public T dataType; //int[], char[], etc.
 */
interface IndexAccessADT<T> {
    /**
     * Print a String representation of an array
     * @return The array as a String
     * @throws NegativeArraySizeException if length of array is < 0
     */
    public String toString() throws NegativeArraySizeException;

    /**
     * Get the first occuring index of a value in an array
     * @param value The specified value
     * @return The index of the first occurence of the value
     * Should return -1 if the value does not exist in the array
     */
    public int getIndex(T value);

    /**
     * Gets the value from a given index of the array
     * @param index The specified index
     * @return The value at the given index in the array
     * @throws ArrayIndexOutOfBoundsException if index is not within the array
     */
    public T getValue(int index) throws ArrayIndexOutOfBoundsException;

    /**
     * Sets the value at the index to a specified value
     * @param index The index at which to change its value
     * @param newValue The new value after setting
     * @throws ArrayIndexOutOfBoundsException if index is not within the array
     */
    public void setValue(int index, T newValue) throws ArrayIndexOutOfBoundsException;

    /**
     * Gets the length of the array
     * @return The length of the array
     */
    public int getArrayLength();

    /*
     * UNIT TESTING
     * -----------------------------------------------------------
     * 1. Object Creation
     * I would make an object with a specific length and data type
     * For instance,
     * 
     * myArray = new int[5] 
     * 
     * int[]: The array stores ints
     * 5: The length of the array is 5
     * 
     * -----------------------------------------------------------
     * 2. Method Calling
     * 
     * a) toString()
     * Call: myArray.toString()
     * -> Expected return: [0,0,0,0,0] - since there are no set values.
     * It should default 0 as each index's value, and retain the length of the array as specified (in this case, 5).
     * 
     * EXCEPTION:
     * Sample case:
     * myArray = int[-1]
     * -> Expected return: NegativeArraySizeException 
     * It is impossible to make an array with a negative length.
     * 
     * b) setValue(index, value)
     * Modify Object/Call: 
     * myArray.setValue(0, 1)
     * myArray.setValue(1, 2)
     * myArray.setValue(2, 3)
     * myArray.setValue(3, 4)
     * myArray.setValue(4, 5)
     * This would not return anything, but rather simply modify myArray.
     * -> If I called myArray.toString(), the expected output would be [1,2,3,7,5]
     * 
     * EXCEPTION:
     * an ArrayIndexOutOfBoundsException should be thrown if index is not within the array
     * Sample case:
     * myArray.setValue(10, 7) 
     * -> Expected return: ArrayIndexOutOfBoundsException
     * 
     * c) getValue(index)
     * Call: myArray.getValue(0)
     * -> Expected return: 1
     * 
     * EXCEPTION:
     * an ArrayIndexOutOfBoundsException should be thrown if index is not within the array
     * Sample case:
     * myArray.getValue(10)
     * -> Expected return: ArrayIndexOutOfBoundsException
     * 
     * d) getIndex(value)
     * Call: myArray.getIndex(3)
     * -> Expected return: 2
     * 
     * (This isn't an exception, but an expected behavior: if a value does not exist in the array, return -1)
     * Call: myArray.getIndex(1000)
     * -> Expected return: -1
     * 
     * e) getArrayLength()
     * Call: myArray.getArrayLength()
     * -> Expected return: 5 (should be the same as the number between square brackets when declaring)
     * 
     */
}