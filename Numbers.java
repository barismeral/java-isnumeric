package com.baris.example.isnumeric;


/**
* @author Barış Meral
* @since 2018.10.26;
* @version 2.0.0
*/


public class Numbers {

static char[] numbers={'1','2','3','4','5',
'6','7','8','9','0'};

/**
* @param input as Object
* @return boolean true or false
* @version 2.0.0
* <p> Checks whether the entered value is numeric. </p> <br>
* <p> Returns true if it contains a numeric value </p> <br>
* <p> double and float number control feature added</p>
*
*/
public static boolean isNumeric(Object input){
    
  String temp = String.valueOf(input);
  if(temp=="")return false;
  char[] array = temp.toCharArray();
  
  int numberCount=0,doubleControl=0,dot=0;
  
  for(int i = 0;i<array.length;i++,dot++){
    if(array[0]=='.'||array[0]==' ')
    return false;
    
    if(array[dot]=='.'){
    doubleControl++;
    numberCount++;
    }
    
    for(int j = 0;j<numbers.length;j++){
      
      if(array[i]==numbers[j])
      numberCount++;
     
    }
  }

    
  if(numberCount==temp.length() && 
  (doubleControl==1 || doubleControl==0))
  return true;
  
  else
  return false;
}

}
