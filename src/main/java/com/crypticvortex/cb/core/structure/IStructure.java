package com.crypticvortex.cb.core.structure;

interface IStructure {
    String getStructureName();
    StructureType getStructureType();
    Short getUnlockEra();
    Integer getCost();
    Integer getBuildTime();
    Integer getSize();
}
