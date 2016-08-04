package component;

/**
 * KomponentFacade interface sinifinin bir implementasyonu.
 *
 */
public class FacadeImpl implements KomponentFacade {

	@Override
	public void doSomething() {
		new BirSinif().doSomething();
	}
}
