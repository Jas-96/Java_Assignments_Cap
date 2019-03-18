class Lab {

	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("Enter ur choice : ");
		System.out.println("1 for RED");
		System.out.println("2 for YELLOW");
		System.out.println("3 for GREEN");
		s = new Scanner(System.in);
		int ch = s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("STOP");
			break;
		case 2:
			System.out.println("READY");
			break;
		case 3:
			System.out.println("GO");
			break;
		default:
			System.out.println("INVALID");
		}

	}

}
