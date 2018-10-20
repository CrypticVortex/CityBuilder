package com.crypticvortex.cb.core.structure;

public class StructureMine implements IStructure{
    String structureName = "Mine";
    StructureType structureType = StructureType.RESOURCE;
    Short unlockEra = 0;
    Integer cost = 100;
    Integer buildTime = 20;
    Integer size = 10;

    public String getStructureName() {
        return structureName;
    }

    public StructureType getStructureType() {
        return structureType;
    }

    public Short getUnlockEra() {
        return unlockEra;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getBuildTime() {
        return buildTime;
    }

    public Integer getSize() {
        return size;
    }
}
