package com.crypticvortex.cb.core.structure;

interface IStructure {
    int getCost();
    int getBuildTime();
    int getSize();
    String getStructureName();
    StructureType getStructureType();
}
