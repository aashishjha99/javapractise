
public class CatFactory implements AnimlsFactory {

    @Override
    public Animls createAnimls() {
        return new Cat();
    }

}