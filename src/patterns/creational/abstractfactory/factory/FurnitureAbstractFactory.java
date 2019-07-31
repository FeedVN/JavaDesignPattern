package patterns.creational.abstractfactory.factory;

import patterns.creational.abstractfactory.chair.Chair;
import patterns.creational.abstractfactory.table.Table;

public abstract class FurnitureAbstractFactory {

    public abstract Chair createChair();

    public abstract Table createTable();

}
