package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Commonnametx;
import se.nrm.dina.datamodel.Referencework;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:43")
@StaticMetamodel(Commonnametxcitation.class)
public class Commonnametxcitation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Commonnametxcitation, Integer> commonNameTxCitationID;
    public static volatile SingularAttribute<Commonnametxcitation, Commonnametx> commonNameTxID;
    public static volatile SingularAttribute<Commonnametxcitation, Boolean> yesNo2;
    public static volatile SingularAttribute<Commonnametxcitation, String> text1;
    public static volatile SingularAttribute<Commonnametxcitation, Boolean> yesNo1;
    public static volatile SingularAttribute<Commonnametxcitation, String> text2;
    public static volatile SingularAttribute<Commonnametxcitation, Float> number1;
    public static volatile SingularAttribute<Commonnametxcitation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Commonnametxcitation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Commonnametxcitation, Float> number2;
    public static volatile SingularAttribute<Commonnametxcitation, Referencework> referenceWorkID;
    public static volatile SingularAttribute<Commonnametxcitation, String> remarks;

}