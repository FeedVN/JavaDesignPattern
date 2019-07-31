package patterns.creational.abstractfactory.factory.impl;

import patterns.creational.abstractfactory.chair.Chair;
import patterns.creational.abstractfactory.chair.PlasticChair;
import patterns.creational.abstractfactory.factory.FurnitureAbstractFactory;
import patterns.creational.abstractfactory.table.PlasticTable;
import patterns.creational.abstractfactory.table.Table;

public class FlasticFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

}
