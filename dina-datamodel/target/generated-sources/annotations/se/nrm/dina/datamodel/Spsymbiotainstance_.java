package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spexportschemamapping;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:43")
@StaticMetamodel(Spsymbiotainstance.class)
public class Spsymbiotainstance_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spsymbiotainstance, String> symbiotaKey;
    public static volatile SingularAttribute<Spsymbiotainstance, Date> lastPush;
    public static volatile SingularAttribute<Spsymbiotainstance, String> instanceName;
    public static volatile SingularAttribute<Spsymbiotainstance, Date> lastCacheBuild;
    public static volatile SingularAttribute<Spsymbiotainstance, Integer> spSymbiotaInstanceID;
    public static volatile SingularAttribute<Spsymbiotainstance, String> description;
    public static volatile SingularAttribute<Spsymbiotainstance, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spsymbiotainstance, Date> lastPull;
    public static volatile SingularAttribute<Spsymbiotainstance, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spsymbiotainstance, Integer> collectionMemberID;
    public static volatile SingularAttribute<Spsymbiotainstance, Spexportschemamapping> schemaMappingID;
    public static volatile SingularAttribute<Spsymbiotainstance, String> remarks;

}