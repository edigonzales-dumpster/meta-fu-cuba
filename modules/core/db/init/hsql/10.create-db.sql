-- begin METAFUNCTIONALUNITS_FUNCTIONAL_UNIT
create table METAFUNCTIONALUNITS_FUNCTIONAL_UNIT (
    ID integer not null,
    UUID varchar(36),
    --
    NAME varchar(255) not null,
    DESCRIPTION longvarchar,
    ISSUE_TRACKER varchar(512),
    --
    primary key (ID)
)^
-- end METAFUNCTIONALUNITS_FUNCTIONAL_UNIT
-- begin METAFUNCTIONALUNITS_COMPONENT
create table METAFUNCTIONALUNITS_COMPONENT (
    ID integer not null,
    UUID varchar(36),
    --
    NAME varchar(255) not null,
    DESCRIPTION longvarchar,
    VCS_URL varchar(512),
    FUNCTIONAL_UNIT_ID integer not null,
    --
    primary key (ID)
)^
-- end METAFUNCTIONALUNITS_COMPONENT
