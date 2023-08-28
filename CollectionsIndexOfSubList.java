package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsIndexOfSubList {

	public static void main(String[] args) {
		/*
		 * Collections.indexOfSubList(sourceList,targetList)\
		 * used to find the first occurence  of a  specified sublist 
		 * within  a larger list.It returns the start index of the targetList
		 * within the sourceList
		 * 
		 */
		
		 List<String> sourceList = new ArrayList<>();
	        sourceList.add("Apple");
	        sourceList.add("Banana");
	        sourceList.add("Cherry");
	        sourceList.add("Date");
	        sourceList.add("Fig");
	        
	        List<String> targetList = new ArrayList<>();
	        targetList.add("Cherry");
	        targetList.add("Date");
	        
	        int index = Collections.indexOfSubList(sourceList, targetList);
	        
	        if (index != -1) {
	            System.out.println("Sublist found at index: " + index);
	        } else {
	            System.out.println("Sublist not found");
	        }
		}
		
	}
