package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.MaterialType;
import patterns.creational.abstractfactory.factory.impl.FlasticFactory;
import patterns.creational.abstractfactory.factory.impl.WoodFactory;

public class FurnitureFactory {
    private FurnitureFactory() {

    }

    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case FLASTIC:
                return new FlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
