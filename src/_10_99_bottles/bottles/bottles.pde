int i = 99;
void setup() {

}

void draw() { 
  
  if(i >2) {
       print(i + " bottles of beer on the wall, " + i + " bottles of beer. \nTake one down and pass it around, " + (i-1) +  " bottles of beer on the wall.\n\n");
   }
   else if (i == 2) {
       print(i + " bottles of beer on the wall, " + i + " bottles of beer. \nTake one down and pass it around, 1 bottle of beer on the wall.\n\n");
   }
   else if (i == 1) {
       print("1 bottle of beer on the wall, 1 bottle of beer. \nTake one down and pass it around, no bottles of beer on the wall.");
   }
   i--;
   
   
}
