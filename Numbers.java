package com.baris.example.isnumeric;

public class Numbers {

static String[] numbers={"0","1","2","3","4","5",
"6","7","8","9"};


public static boolean isNumeric(Object o){
    
  String temp = String.valueOf(o);
  String[] array = new String[temp.length()];
  
  for(int i=0;i<temp.length();i++){
    
    array[i] = String.valueOf(temp.charAt(i));
    
  }
  
  
  int count=0;
  for(String s : array){
    
    if(s.equals(numbers[0])||s.equals(numbers[1])||
s.equals(numbers[2])||s.equals(numbers[3])||s.equals(numbers[3])||s.equals(numbers[4])||s.equals(numbers[5])||s.equals(numbers[6])||s.equals(numbers[7])||s.equals(numbers[8])||
s.equals(numbers[9])){
      count++;
    }
       
  }
  
    
  if(count==temp.length())
  return true;
  else
  return false;
}




}
