package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Lithostrat;
import se.nrm.dina.datamodel.Lithostrattreedef;
import se.nrm.dina.datamodel.Lithostrattreedefitem;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:44")
@StaticMetamodel(Lithostrattreedefitem.class)
public class Lithostrattreedefitem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Lithostrattreedefitem, String> fullNameSeparator;
    public static volatile SingularAttribute<Lithostrattreedefitem, Lithostrattreedef> lithoStratTreeDefID;
    public static volatile ListAttribute<Lithostrattreedefitem, Lithostrat> lithostratList;
    public static volatile SingularAttribute<Lithostrattreedefitem, String> textBefore;
    public static volatile SingularAttribute<Lithostrattreedefitem, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Lithostrattreedefitem, String> title;
    public static volatile SingularAttribute<Lithostrattreedefitem, Integer> lithoStratTreeDefItemID;
    public static volatile SingularAttribute<Lithostrattreedefitem, String> textAfter;
    public static volatile SingularAttribute<Lithostrattreedefitem, Lithostrattreedefitem> parentItemID;
    public static volatile SingularAttribute<Lithostrattreedefitem, Integer> rankID;
    public static volatile SingularAttribute<Lithostrattreedefitem, Boolean> isInFullName;
    public static volatile SingularAttribute<Lithostrattreedefitem, Boolean> isEnforced;
    public static volatile SingularAttribute<Lithostrattreedefitem, String> name;
    public static volatile SingularAttribute<Lithostrattreedefitem, Agent> createdByAgentID;
    public static volatile ListAttribute<Lithostrattreedefitem, Lithostrattreedefitem> lithostrattreedefitemList;
    public static volatile SingularAttribute<Lithostrattreedefitem, String> remarks;

}