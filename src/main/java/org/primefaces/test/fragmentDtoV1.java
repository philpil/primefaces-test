package org.primefaces.test;

import java.io.Serializable;
import java.util.UUID;
import lombok.Generated;

public class FragmentDtoV1 implements Serializable {
    private static final long serialVersionUID = 3620179888980228110L;
    private UUID id;
    private Double frequency;

    @Generated
    public UUID getId() {
        return this.id;
    }

    @Generated
    public Double getFrequency() {
        return this.frequency;
    }

    @Generated
    public FragmentDtoV1() {
    }

    @Generated
    public FragmentDtoV1(final UUID id, final Double frequency) {
        this.id = id;
        this.frequency = frequency;
    }
}
