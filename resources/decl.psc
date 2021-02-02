main() {
  int x = 2;
  int y = 1;

  if (x == y) then {
      print("In if");
  } else if (x == y + 1) then {
	
	if (T) then {
		print("inner if");
	} else then {
		print("inner else");
	}

  } else then {
      print("In else");
  }
}