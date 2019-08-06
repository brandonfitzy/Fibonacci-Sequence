/*Fibonacci Sequence*/

/*This function asks the user to input a integer for how many elements of the fibonacci sequence they would like printed 
and then prints the fibonacci sequence up to that number*/

#include <stdio.h> //for the print function

int main() {
		//asking the user for the amount to print
		int n;
		printf("Please enter how many elements of the Fibonacci Sequence you would like printed: \n");
		scanf("%d", &n);
		int x0=0; //two elementes behind
		int x1=1; //one element behind
		int i; //index counter
		int seq[n]; //array to put fib seq into
		int new; //sum of the previous two elements
		for (i=0; i<n; i++){
			//if its the first element 
			if (i==0) {
				seq[i]=x0;
			//if its the second
			} else if (i==1){
				seq[i]=x1;
			//then all other values past index 1
			} else {
				new=x1+x0;
				seq[i]=new;
				x0=x1;
				x1=new;
			}
		}
		//printing the fib seq to n elements
		printf("The first %d elements of the Fibonacci Sequence are... \n",n);
		int j;
		for (j=0; j<n; j++) {
			printf("%d ", seq[j]);
		}
		

	
	return 0;
}