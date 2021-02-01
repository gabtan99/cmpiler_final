func int hello(int x) {
	return x + 1;
}
main() {
    int x = 0;
	x= hello(hello(10));
	print(x);
}  