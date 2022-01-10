// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x;
	int y;
	char kk;
		cout<<"Input a number"<<endl;
	cin>>x;
		cout<<"Input another number"<<endl;
	cin>>y;
	cout<<"You can add, subtract, multiply, or divide the two numbers"<<endl;
	cin>>kk;
	if(kk=='+'){
		cout<<(x+y);
	}
	else if(kk=='-'){
		cout<<(x-y);
	}
	else if(kk=='*'){
		cout<<(x*y);
	}
	else if(kk=='/'){
		cout<<(x/y);
	}



	
}
