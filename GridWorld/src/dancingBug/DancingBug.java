package dancingBug;

/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import java.util.Arrays;

import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug
{

    private int[] array;
    private int arr_count;


    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int arr[])
    {
    	if(arr == null) { 
    	    this.array = new int[0]; 
    	  } else { 
    	   this.array = Arrays.copyOf(arr, arr.length); 
    	} 
        arr_count = 0;

    }

    /**
     * Moves to the next location of the square.
     */
    
    public void act()
    {
        for (int i = 0; i < array[arr_count]; i++) {
            turn();
        }
        arr_count++;
        if (arr_count >= array.length)
            arr_count = 0;
        else {
	        if(canMove()) {
	            //if (arr_count < array.length-1)
	            	move();
	        }
        }
       
    }

}