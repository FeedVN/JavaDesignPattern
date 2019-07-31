package patterns.creational.abstractfactory.factory.impl;

import patterns.creational.abstractfactory.chair.Chair;
import patterns.creational.abstractfactory.chair.WoodChair;
import patterns.creational.abstractfactory.factory.FurnitureAbstractFactory;
import patterns.creational.abstractfactory.table.Table;
import patterns.creational.abstractfactory.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}