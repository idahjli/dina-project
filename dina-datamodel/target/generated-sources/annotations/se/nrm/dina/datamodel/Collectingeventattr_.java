package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attributedef;
import se.nrm.dina.datamodel.Collectingevent;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T16:50:16")
@StaticMetamodel(Collectingeventattr.class)
public class Collectingeventattr_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collectingeventattr, Attributedef> attributeDefID;
    public static volatile SingularAttribute<Collectingeventattr, Integer> attrID;
    public static volatile SingularAttribute<Collectingeventattr, Collectingevent> collectingEventID;
    public static volatile SingularAttribute<Collectingeventattr, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collectingeventattr, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collectingeventattr, Integer> collectionMemberID;
    public static volatile SingularAttribute<Collectingeventattr, Double> doubleValue;
    public static volatile SingularAttribute<Collectingeventattr, String> strValue;

}