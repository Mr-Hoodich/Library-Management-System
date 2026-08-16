// Fields

String tit[]=new String [a];
String aut[]=new String [a];
int vol[]=new int [a];
int isb[]=new int [a];
boolean avl[]=new boolean [a];


// Add Book

void addBook{
System.out.println("Enter the number of books");
int a=Sc.nextInt();

System.out.println("Enter the title(s) of the book(s)");
for (int i=0; i<a; i++){
System.out.println("Title of book " + (i+1) + " is: ");
tit[i]=Sc.nextLine();
}

System.out.println("Enter the author(s) of the book(s)");
for (int i=0; i<a; i++){
System.out.println("Author(s) of book " + (i+1) + " is/are: ");
aut[i]=Sc.nextLine();
}

System.out.println("Enter the number of volume(s) the book(s)");
for (int i=0; i<a; i++){
System.out.println("Volume(s) of book " + (i+1) + " is/are: ");
vol[i]=Sc.nextInt();
}

System.out.println("Enter the International Standard Book (ISB) number of the book(s)");
for (int i=0; i<a; i++){
System.out.println("ISBN of book " + (i+1) + " is: ");
isb[i]=Sc.nextInt();
}


// View Book

void viewBook {

Try{
System.out.println("Title     Author     Volume       ISB Number        Availability")

for (int i=0;i<a;i++){
System.out.println (tit [i]+ ".       "+ aut[i]+"         "+vol[i]+".         "+isb[i]+".        "+avl[i]);
}
}

Catch (Exception e){
System.out.println ("No books");
}
}


// Search Book

void searchBook{

System.out.println ("How would you like to search for your book?");
System.out.println("1. Author  2. Title  3. ISB Number")
System.out.println("Please enter your choice as corresponding number");

int ch = Sc.nextInt();
Sc.nextLine();

Switch (ch) {

Case 1:

System.out.println("Enter the name of author");
String author=Sc.nextLine();

int findings=0;

System.out.println("Here are the details of books in the library written by "+author+": ");

System.out.println("ISB Number   Title   Volume   Author");

for (int i=0;i<a;i++){

if (author.equalsIngoreCase(aut[i])='True')
{
System.out.println(isb[i]+".   "+tit[i]+".   "+vol[i]+".   "+aut[i]+".   " +avl[i]););
findings++;
}
findings=0?System.out.println("Sorry, we currently do not have any book by "+author+"."):findings=0;

Break;


// Similarly case 2 and 3...

}


// Issue Book

static void issueBook (){

System.out.println ("Which book do you want?");
System.out.println ("Enter '1' if you have Title");
System.out.println ("Enter '2' if you have ISB Number");

int ch=Sc.nextInt();
Sc.nextLine();

Switch (ch){

case 1:

System.out.println("Enter the Title of the book.");
String title=Sc.nextLine();

for (int i=0; i<a; i++){

if (title.equalsIgnoreCase(tit[i]){

System.out.println("Title Volume ISB Number Author");
System.out.println(tit[i]+" "+vol[i]+" "+isb[i]+" "aut[i"]);

System.out.println("Is this the book you were searching for?");
System.out.println("Please enter 1 for 'Yes' and 2 for 'No'");

int yn=Sc.nextInt();

if (yn==1){

System.out.println("Enjoy your time and don't forget to return in time to avoid extra charges.");
avl[i]='false';

}
}

else {

System.out.println("Sorry we could not find the book you're searching for.");
System.out.println("**What you can do?**");
System.out.println("If you saw the name in the list, make sure you've entered the correct spelling and it does not contain any typo or extraaa spaces.");

}
}


// Similarly case 2 with ISB number...

}


// Return Book

static void returnBook (){

int result=0;

System.out.println("Enter name of the book you want to return.");
System.out.println("Enter ISB Number: ");

int isbn= Sc.nextInt();

for (int i=0; i<a; i++){

if (isbn==isb[i]){

if (avl[i]==false){

avl[i]=true;
result=1;

}

else{

System.out.println("Something looks funny");
System.out.println("The book with that ISB Number already exists");

}
}

if (result=0){

System.out.println("Wait, that book doesn't exists in our database");
System.out.println("Quick Fix: Please try checking the ISB Number");

}
}


// Main

public static void main (String args []){   

Scanner Sc=new Scanner (System.in); 

int a; //the one which initialises the size of array right now instead of bookCount which will be introduced in V2.

boolean run = true;    

while (run==true){    

System.out.println("***Welcome***");    

System.out.println("What are we doing?");    

System.out.println("1. Add book.  2. View all books.  3. Search a specific book.  4. Issue a book.  5. Return a previously issued book.  6. Exit.");    

int choice=Sc.nextInt();    
Sc.nextLine();    

switch (choice){    

case 1:    
addBook();    
break;    

case 2:    
viewBook();    
break;    

case 3:    
searchBook();    
break;    

case 4:    
issueBook();    
break;    

case 5:    
returnBook();    
break;    

case 6:    
System.out.println("Exit Succesful");    
run=false;    
break;    

default:    
System.out.println("");    
break;    
}

}
