func int factorial(int i) {
	
    if(i <= 1) then {
        return 1;
    }

    return i * factorial(i - 1);
	
}

main() {
  int x = 3;
    int res = factorial(x);
    print(res);
}