import component.FacadeFactory;

public class Test {

	public static void main(final String[] args) {
		FacadeFactory.instance().getFacade().doSomething();
	}
}
