func int fib(int x) {
	
	if (x == 0) then {
		return 0;
	} else if (x == 1 || x == 2) then {
		return 1;
	}

	return fib(x - 2) + fib(x - 1);
}

main() {
  int m = fib(5);

	print(m);
}