package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Spprincipal;
import se.nrm.dina.datamodel.Workbenchrow;
import se.nrm.dina.datamodel.Workbenchtemplate;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:43")
@StaticMetamodel(Workbench.class)
public class Workbench_ extends BaseEntity_ {

    public static volatile SingularAttribute<Workbench, Integer> formId;
    public static volatile SingularAttribute<Workbench, Integer> ownerPermissionLevel;
    public static volatile SingularAttribute<Workbench, String> exportedFromTableName;
    public static volatile SingularAttribute<Workbench, Specifyuser> specifyUserID;
    public static volatile SingularAttribute<Workbench, Integer> allPermissionLevel;
    public static volatile SingularAttribute<Workbench, String> exportInstitutionName;
    public static volatile SingularAttribute<Workbench, String> lockedByUserName;
    public static volatile SingularAttribute<Workbench, Agent> modifiedByAgentID;
    public static volatile ListAttribute<Workbench, Workbenchrow> workbenchrowList;
    public static volatile SingularAttribute<Workbench, Integer> workbenchID;
    public static volatile SingularAttribute<Workbench, String> srcFilePath;
    public static volatile SingularAttribute<Workbench, Spprincipal> spPrincipalID;
    public static volatile SingularAttribute<Workbench, Workbenchtemplate> workbenchTemplateID;
    public static volatile SingularAttribute<Workbench, String> name;
    public static volatile SingularAttribute<Workbench, Integer> tableID;
    public static volatile SingularAttribute<Workbench, Agent> createdByAgentID;
    public static volatile SingularAttribute<Workbench, Integer> groupPermissionLevel;
    public static volatile SingularAttribute<Workbench, String> remarks;

}