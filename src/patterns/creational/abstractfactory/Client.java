package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.chair.Chair;
import patterns.creational.abstractfactory.factory.FurnitureAbstractFactory;
import patterns.creational.abstractfactory.factory.FurnitureFactory;
import patterns.creational.abstractfactory.table.Table;

public class Client {
    public static void main(String[] args) {

        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);

        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair

        Table table = factory.createTable();
        table.create(); // Create plastic table
    }
}
