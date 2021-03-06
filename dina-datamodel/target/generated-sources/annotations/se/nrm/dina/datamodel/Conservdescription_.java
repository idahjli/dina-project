package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Conservdescriptionattachment;
import se.nrm.dina.datamodel.Conservevent;
import se.nrm.dina.datamodel.Division;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:43")
@StaticMetamodel(Conservdescription.class)
public class Conservdescription_ extends BaseEntity_ {

    public static volatile SingularAttribute<Conservdescription, String> displayRecommendations;
    public static volatile SingularAttribute<Conservdescription, String> description;
    public static volatile SingularAttribute<Conservdescription, Agent> modifiedByAgentID;
    public static volatile ListAttribute<Conservdescription, Conservdescriptionattachment> conservdescriptionattachmentList;
    public static volatile SingularAttribute<Conservdescription, Integer> conservDescriptionID;
    public static volatile SingularAttribute<Conservdescription, String> source;
    public static volatile SingularAttribute<Conservdescription, String> units;
    public static volatile SingularAttribute<Conservdescription, String> backgroundInfo;
    public static volatile SingularAttribute<Conservdescription, String> otherRecommendations;
    public static volatile SingularAttribute<Conservdescription, String> composition;
    public static volatile SingularAttribute<Conservdescription, Float> width;
    public static volatile ListAttribute<Conservdescription, Conservevent> conserveventList;
    public static volatile SingularAttribute<Conservdescription, String> shortDesc;
    public static volatile SingularAttribute<Conservdescription, Agent> createdByAgentID;
    public static volatile SingularAttribute<Conservdescription, String> lightRecommendations;
    public static volatile SingularAttribute<Conservdescription, Float> objLength;
    public static volatile SingularAttribute<Conservdescription, Collectionobject> collectionObjectID;
    public static volatile SingularAttribute<Conservdescription, Division> divisionID;
    public static volatile SingularAttribute<Conservdescription, String> remarks;
    public static volatile SingularAttribute<Conservdescription, Float> height;

}