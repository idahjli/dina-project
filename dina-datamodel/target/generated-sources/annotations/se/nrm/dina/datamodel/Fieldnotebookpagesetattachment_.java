package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Fieldnotebookpageset;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T16:50:16")
@StaticMetamodel(Fieldnotebookpagesetattachment.class)
public class Fieldnotebookpagesetattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Fieldnotebookpagesetattachment, Integer> fieldNotebookPageSetAttachmentId;
    public static volatile SingularAttribute<Fieldnotebookpagesetattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Fieldnotebookpagesetattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Fieldnotebookpagesetattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Fieldnotebookpagesetattachment, Fieldnotebookpageset> fieldNotebookPageSetID;
    public static volatile SingularAttribute<Fieldnotebookpagesetattachment, String> remarks;
    public static volatile SingularAttribute<Fieldnotebookpagesetattachment, Integer> ordinal;

}