func void hello() {

    print("test");
}

func int test(int x) {
    int y = x;
    return y;
}


main() {
	int[] x = create int[3];
    x[0] = 1;
    x[1] = 2;
    x[2] = x[x[0]];
	
    int y = x[2];

    print(y);

    
}