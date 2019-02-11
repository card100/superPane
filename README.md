# superPane
Lets you make a JOptionpane quickly-er

## To Use
Download from <a href="https://github.com/card100/superPane/releases">releases</a> or compile the <a href="https://raw.githubusercontent.com/card100/superPane/master/superPane.java">current and unreliable source code</a>.

<b>To get an int:</b>
``` java
int myVar = superPane.getInt(1, "Enter in a number", "Number not entered, try again");
``` 
```
Parameters: loop?   main message      error message
            (0/1)    String             string
Return: int
```
   
The 1 tells getInt to loop if the user enters something that is not an int. Enter in a 0 to just except the error.

If the loop is off and it receives an error it will return 0.

<b>To get a String:</b>
``` java
String myVar = superPane.getString("Enter in a String");
```
```
Parameters: message

Return: string
```
<b>To get a choice:</b>
``` java
String[] myChoicesArray = {"Ye", "Yeet", "Yay", "Nay"};
int choice = superPane.getOption("Choose a choice", "This is a title", myChoicesArray, 0);
```
```
Parameters: Message     Title     Choices      Default Choice
	    String      String    String[]   int 0 - arrayLength
Return: int
```
