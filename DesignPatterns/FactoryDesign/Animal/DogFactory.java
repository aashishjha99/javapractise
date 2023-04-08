
public class DogFactory implements AnimlsFactory {

    @Override
    public Animls createAnimls() {
        return new Dog();
    }

}