
package utils;


import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;
import pages.EGiftCardPage;
import pages.HomePage;
import pages.ProductPage;

public class PicoDependencyInjector implements ObjectFactory {

    private PicoFactory delegate = new PicoFactory();

    public PicoDependencyInjector() {
        addClass(SharedDriver.class);
        addClass(HomePage.class);
        addClass(EGiftCardPage.class);
        addClass(ProductPage.class);
    }

    @Override
    public void start() {
        delegate.start();
    }

    @Override
    public void stop() {
        delegate.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return delegate.getInstance(aClass);
    }
}
