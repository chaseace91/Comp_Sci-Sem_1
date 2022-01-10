// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int height;
	int width;
	char symbol;
	cout<<"Enter the presents height"<<endl;
	cin>>height;
	cout<<"Enter the presents width"<<endl;
	cin>>width;
	cout<<"Enter presents symbol"<<endl;
	cin>>symbol;

	
	
	

	
	int hig;
	int wid;
	char sym;
	int xcor;
	int ycor;
	cout<<"Enter opened present's height"<<endl;
	cin>>hig;
	cout<<"Enter opened present's width"<<endl;
	cin>>wid;
	cout<<"Enter opened present's symbol"<<endl;
	cin>>sym;
	cout<<"Enter the x coordinate"<<endl;
	cin>>xcor;
	ycor = 6;
	xcor = xcor+6;
	
	
	for(int x=0; x<width; x++){
		cout<<symbol;
	}
	cout<<""<<endl;
	for(int x=0; x<height-2; x++){
	cout<<symbol;
	for(int y=0; y<width-2; y++){
		cout<<" ";
	}
	cout<<symbol<<endl;
}
	for(int x=0; x<width; x++){
		cout<<symbol;
	}
	
	
	
	gotoxy(xcor, ycor);
	for(int x=0; x<wid; x++){
		cout<<sym;
	}
	gotoxy(xcor,ycor+1);
	for(int x=0; x<hig-1; x++){
		cout<<sym;
		for(int y=0;y<wid-2;y++){
			cout<<" ";
		}
	cout<<symbol<<endl;
	gotoxy(xcor, ycor+x);
		
	}
	for(int x=0; x<wid; x++){
		cout<<sym;
	}
gotoxy(width/2, height+1);
	cout<<"><";
	
	
	
	

	gotoxy(15,15);
}
