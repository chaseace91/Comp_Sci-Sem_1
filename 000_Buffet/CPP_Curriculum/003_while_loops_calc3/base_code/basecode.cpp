// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char quit;
	while(true){
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
		cout<<(x+y)<<endl;
	}
	else if(kk=='-'){
		cout<<(x-y)<<endl;
	}
	else if(kk=='*'){
		cout<<(x*y)<<endl;
	}
	else if(kk=='/'){
		cout<<(x/y)<<endl;
	}



	cout<<"Press q to quit, or any other button to continue."<<endl;
	char q;
	cin>>quit;
	if(quit=='q'){
		break;
	}
}
}