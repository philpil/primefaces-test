package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Generated;

public class ParentsDtoV1 implements Serializable {
    private static final long serialVersionUID = -8492088996330246456L;
    private UUID id;
    private String parentId;
    private String name;
    private String description;
    private List<FragmentDtoV1> fragments = new ArrayList();

    @Generated
    public UUID getId() {
        return this.id;
    }

    @Generated
    public String getParentId() {
        return this.parentId;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getDescription() {
        return this.description;
    }

    @Generated
    public List<FragmentDtoV1> getFragments() {
        return this.fragments;
    }

    @Generated
    public void setId(final UUID id) {
        this.id = id;
    }

    @Generated
    public void setParentId(final String parentId) {
        this.parentId = parentId;
    }

    @Generated
    public void setName(final String name) {
        this.name = name;
    }

    @Generated
    public void setDescription(final String description) {
        this.description = description;
    }

    @Generated
    public void setFragments(final List<FragmentDtoV1> fragments) {
        this.fragments = fragments;
    }

    @Generated
    public ParentDtoV1() {
    }

    @Generated
    public ParentDtoV1(final UUID id, final String parentId, final String name, final String description, final List<FragmentDtoV1> fragments) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.description = description;
        this.fragments = fragments;
    }
}
