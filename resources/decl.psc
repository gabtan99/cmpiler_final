func int  hello(int x) {
	print(x);
	hello(x);
	
}
main() {
    hello(4);
}