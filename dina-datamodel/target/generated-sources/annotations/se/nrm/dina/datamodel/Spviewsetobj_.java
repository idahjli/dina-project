package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spappresourcedata;
import se.nrm.dina.datamodel.Spappresourcedir;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:43")
@StaticMetamodel(Spviewsetobj.class)
public class Spviewsetobj_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spviewsetobj, String> metaData;
    public static volatile SingularAttribute<Spviewsetobj, String> fileName;
    public static volatile SingularAttribute<Spviewsetobj, Short> level;
    public static volatile ListAttribute<Spviewsetobj, Spappresourcedata> spappresourcedataList;
    public static volatile SingularAttribute<Spviewsetobj, String> name;
    public static volatile SingularAttribute<Spviewsetobj, String> description;
    public static volatile SingularAttribute<Spviewsetobj, Integer> spViewSetObjID;
    public static volatile SingularAttribute<Spviewsetobj, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spviewsetobj, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spviewsetobj, Spappresourcedir> spAppResourceDirID;

}