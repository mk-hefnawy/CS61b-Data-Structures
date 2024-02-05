package org.example.generalization;

public interface OurComparable {

    /*
    * returns 1 if this is greater than other
    * returns 0 if this is equal to other
    * returns -1 if this is less than other
    * */

    // More Efficient
    /*
     * returns a positive number if this is greater than other
     * returns 0 if this is equal to other
     * returns a negative if this is less than other
     * */
    int compareTo(Object other);
}
