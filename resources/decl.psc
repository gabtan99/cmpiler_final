func int hello(int x) {
	if (x <= 1) then {
		return 1;
	}

	return x * hello(x-1);

}

main() {
	int t = hello(3);
	print(t);
}