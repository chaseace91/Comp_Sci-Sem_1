// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here

cout<<"Enter the symbol"<<endl;
char symbol;
cin>>symbol;

cout<<"Enter the line length"<<endl;
int x;
cin>>x;


cout<<"Horizontal, vertical, or diagonal?(h/v/d)"<<endl;
char hvd;
cin>>hvd;

if (hvd=='h'){
	
for(int y = 0; y<x;y++){
	cout << symbol;
}
}
else if (hvd=='v'){
	
	for(int y = 0; y<x;y++){
	cout << symbol << endl;
	}
}
else{
	for(int y = 0;y<x;y++){
	gotoxy(1+y,9+y);
	cout<<symbol<<endl;

	}
}
	}

