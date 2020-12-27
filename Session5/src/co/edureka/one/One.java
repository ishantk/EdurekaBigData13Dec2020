package co.edureka.one;

public class One {	// public class

	private void pvtShow() {
		System.out.println("This is private show of One");
	}
	
	void defShow() {
		System.out.println("This is default show of One");
	}
	
	protected void protShow() {
		System.out.println("This is protected show of One");
	}
	
	public void pubShow() {
		System.out.println("This is public show of One");
	}
	
}

// We cannot create more than 1 public class in the same .java file
// as Java has a RULE source file name should be same name as that of public class name
/*public class Two{ // err
	
}*/

// we can have as many as default classes in the same .java file
class Two{	// default class
	
	private void pvtShow() {
		System.out.println("This is private show of Two");
	}
	
	void defShow() {
		System.out.println("This is default show of Two");
	}
	
	protected void protShow() {
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow() {
		System.out.println("This is public show of Two");
	}
	
}

/*
private class Three{    // err
	
}

protected class Four{	// err
	
}*/