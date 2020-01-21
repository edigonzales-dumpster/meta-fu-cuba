package com.company.metafunctionalunits.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@NamePattern("%s|name")
@Table(name = "METAFUNCTIONALUNITS_COMPONENT")
@Entity(name = "metafunctionalunits_Component")
public class Component extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -4422609765262019241L;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "VCS_URL", length = 512)
    protected String vcsUrl;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FUNCTIONAL_UNIT_ID")
    protected FunctionalUnit functionalUnit;

    public FunctionalUnit getFunctionalUnit() {
        return functionalUnit;
    }

    public void setFunctionalUnit(FunctionalUnit functionalUnit) {
        this.functionalUnit = functionalUnit;
    }

    public String getVcsUrl() {
        return vcsUrl;
    }

    public void setVcsUrl(String vcsUrl) {
        this.vcsUrl = vcsUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}