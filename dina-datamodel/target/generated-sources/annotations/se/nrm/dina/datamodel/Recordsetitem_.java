package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Recordset;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T17:07:59")
@StaticMetamodel(Recordsetitem.class)
public class Recordsetitem_ { 

    public static volatile SingularAttribute<Recordsetitem, Integer> recordId;
    public static volatile SingularAttribute<Recordsetitem, Integer> recordSetItemID;
    public static volatile SingularAttribute<Recordsetitem, Integer> orderNumber;
    public static volatile SingularAttribute<Recordsetitem, Recordset> recordSetID;

}