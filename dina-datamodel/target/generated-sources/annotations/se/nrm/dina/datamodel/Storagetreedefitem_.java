package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Storage;
import se.nrm.dina.datamodel.Storagetreedef;
import se.nrm.dina.datamodel.Storagetreedefitem;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:44")
@StaticMetamodel(Storagetreedefitem.class)
public class Storagetreedefitem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Storagetreedefitem, String> fullNameSeparator;
    public static volatile SingularAttribute<Storagetreedefitem, String> textBefore;
    public static volatile SingularAttribute<Storagetreedefitem, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Storagetreedefitem, String> title;
    public static volatile ListAttribute<Storagetreedefitem, Storagetreedefitem> storagetreedefitemList;
    public static volatile ListAttribute<Storagetreedefitem, Storage> storageList;
    public static volatile SingularAttribute<Storagetreedefitem, String> textAfter;
    public static volatile SingularAttribute<Storagetreedefitem, Storagetreedefitem> parentItemID;
    public static volatile SingularAttribute<Storagetreedefitem, Integer> rankID;
    public static volatile SingularAttribute<Storagetreedefitem, Integer> storageTreeDefItemID;
    public static volatile SingularAttribute<Storagetreedefitem, Boolean> isInFullName;
    public static volatile SingularAttribute<Storagetreedefitem, Boolean> isEnforced;
    public static volatile SingularAttribute<Storagetreedefitem, String> name;
    public static volatile SingularAttribute<Storagetreedefitem, Agent> createdByAgentID;
    public static volatile SingularAttribute<Storagetreedefitem, Storagetreedef> storageTreeDefID;
    public static volatile SingularAttribute<Storagetreedefitem, String> remarks;

}