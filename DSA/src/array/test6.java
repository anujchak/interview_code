package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test6{

public static void main(String[] args) {
		
		
		//System.out.println("hi");
	String s="I am a java data engineer";
	
	List<String>l=Arrays.asList(s.split(""));
	System.out.println(l.stream().filter(e->!e.equals(" ")).map(e->e.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

	}

    
     	
    }
    
    
	



