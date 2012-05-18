package MyGCC;

public enum InstructionType{
  RETURN,
  EXIT,
  EQL,
  IF,
  WHILE,
  READ_INT,
  PRINTF;

	public static boolean isLogical(InstructionType it) {
		switch(it) {
		case IF:
			return true;
		case WHILE:
			return true;
    default:
			return false;
		}
	}
}
