package se.nrm.dina.datamodel;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Appraisal;
import se.nrm.dina.datamodel.Collectingevent;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Collectionobjectattachment;
import se.nrm.dina.datamodel.Collectionobjectattr;
import se.nrm.dina.datamodel.Collectionobjectattribute;
import se.nrm.dina.datamodel.Collectionobjectcitation;
import se.nrm.dina.datamodel.Collectionrelationship;
import se.nrm.dina.datamodel.Conservdescription;
import se.nrm.dina.datamodel.Container;
import se.nrm.dina.datamodel.Determination;
import se.nrm.dina.datamodel.Dnasequence;
import se.nrm.dina.datamodel.Exsiccataitem;
import se.nrm.dina.datamodel.Fieldnotebookpage;
import se.nrm.dina.datamodel.Otheridentifier;
import se.nrm.dina.datamodel.Paleocontext;
import se.nrm.dina.datamodel.Preparation;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Treatmentevent;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:43")
@StaticMetamodel(Collectionobject.class)
public class Collectionobject_ extends BaseEntity_ {

    public static volatile ListAttribute<Collectionobject, Exsiccataitem> exsiccataitemList;
    public static volatile SingularAttribute<Collectionobject, String> modifier;
    public static volatile SingularAttribute<Collectionobject, String> fieldNumber;
    public static volatile SingularAttribute<Collectionobject, Agent> modifiedByAgentID;
    public static volatile ListAttribute<Collectionobject, Determination> determinationList;
    public static volatile SingularAttribute<Collectionobject, Boolean> yesNo6;
    public static volatile SingularAttribute<Collectionobject, String> catalogNumber;
    public static volatile SingularAttribute<Collectionobject, Short> catalogedDatePrecision;
    public static volatile SingularAttribute<Collectionobject, Boolean> yesNo5;
    public static volatile SingularAttribute<Collectionobject, Boolean> yesNo4;
    public static volatile SingularAttribute<Collectionobject, Short> sGRStatus;
    public static volatile ListAttribute<Collectionobject, Collectionobjectattr> collectionobjectattrList;
    public static volatile SingularAttribute<Collectionobject, String> catalogedDateVerbatim;
    public static volatile SingularAttribute<Collectionobject, Boolean> yesNo3;
    public static volatile SingularAttribute<Collectionobject, Boolean> yesNo2;
    public static volatile SingularAttribute<Collectionobject, Integer> reservedInteger3;
    public static volatile SingularAttribute<Collectionobject, Boolean> yesNo1;
    public static volatile SingularAttribute<Collectionobject, Integer> reservedInteger4;
    public static volatile ListAttribute<Collectionobject, Collectionrelationship> collectionrelationshipList1;
    public static volatile SingularAttribute<Collectionobject, String> ocr;
    public static volatile SingularAttribute<Collectionobject, Short> visibility;
    public static volatile SingularAttribute<Collectionobject, Collectionobjectattribute> collectionObjectAttributeID;
    public static volatile SingularAttribute<Collectionobject, Date> inventoryDate;
    public static volatile SingularAttribute<Collectionobject, String> objectCondition;
    public static volatile SingularAttribute<Collectionobject, String> restrictions;
    public static volatile ListAttribute<Collectionobject, Collectionobjectattachment> collectionobjectattachmentList;
    public static volatile SingularAttribute<Collectionobject, Appraisal> appraisalID;
    public static volatile SingularAttribute<Collectionobject, String> text3;
    public static volatile SingularAttribute<Collectionobject, String> text1;
    public static volatile SingularAttribute<Collectionobject, String> text2;
    public static volatile SingularAttribute<Collectionobject, String> name;
    public static volatile SingularAttribute<Collectionobject, String> guid;
    public static volatile SingularAttribute<Collectionobject, Agent> createdByAgentID;
    public static volatile ListAttribute<Collectionobject, Collectionobjectcitation> collectionobjectcitationList;
    public static volatile SingularAttribute<Collectionobject, Container> containerID;
    public static volatile SingularAttribute<Collectionobject, Collection> collectionID;
    public static volatile SingularAttribute<Collectionobject, String> notifications;
    public static volatile SingularAttribute<Collectionobject, Accession> accessionID;
    public static volatile SingularAttribute<Collectionobject, Date> catalogedDate;
    public static volatile SingularAttribute<Collectionobject, String> description;
    public static volatile SingularAttribute<Collectionobject, Integer> integer1;
    public static volatile SingularAttribute<Collectionobject, Float> number1;
    public static volatile SingularAttribute<Collectionobject, String> availability;
    public static volatile SingularAttribute<Collectionobject, Float> number2;
    public static volatile SingularAttribute<Collectionobject, String> reservedText;
    public static volatile SingularAttribute<Collectionobject, Integer> integer2;
    public static volatile SingularAttribute<Collectionobject, Container> containerOwnerID;
    public static volatile ListAttribute<Collectionobject, Treatmentevent> treatmenteventList;
    public static volatile SingularAttribute<Collectionobject, String> altCatalogNumber;
    public static volatile ListAttribute<Collectionobject, Preparation> preparationList;
    public static volatile SingularAttribute<Collectionobject, Agent> catalogerID;
    public static volatile ListAttribute<Collectionobject, Dnasequence> dnasequenceList;
    public static volatile SingularAttribute<Collectionobject, BigDecimal> totalValue;
    public static volatile SingularAttribute<Collectionobject, Paleocontext> paleoContextID;
    public static volatile SingularAttribute<Collectionobject, Boolean> deaccessioned;
    public static volatile SingularAttribute<Collectionobject, String> projectNumber;
    public static volatile SingularAttribute<Collectionobject, Integer> countAmt;
    public static volatile SingularAttribute<Collectionobject, String> reservedText3;
    public static volatile ListAttribute<Collectionobject, Conservdescription> conservdescriptionList;
    public static volatile SingularAttribute<Collectionobject, String> reservedText2;
    public static volatile ListAttribute<Collectionobject, Otheridentifier> otheridentifierList;
    public static volatile SingularAttribute<Collectionobject, Fieldnotebookpage> fieldNotebookPageID;
    public static volatile ListAttribute<Collectionobject, Collectionrelationship> collectionrelationshipList;
    public static volatile SingularAttribute<Collectionobject, Specifyuser> visibilitySetByID;
    public static volatile SingularAttribute<Collectionobject, Collectingevent> collectingEventID;
    public static volatile SingularAttribute<Collectionobject, Integer> collectionObjectID;
    public static volatile SingularAttribute<Collectionobject, Integer> collectionMemberID;
    public static volatile SingularAttribute<Collectionobject, String> remarks;

}