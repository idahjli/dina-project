package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Sgrbatchmatchresultset;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:44")
@StaticMetamodel(Sgrmatchconfiguration.class)
public class Sgrmatchconfiguration_ { 

    public static volatile SingularAttribute<Sgrmatchconfiguration, Integer> nRows;
    public static volatile SingularAttribute<Sgrmatchconfiguration, String> queryFields;
    public static volatile SingularAttribute<Sgrmatchconfiguration, String> serverUrl;
    public static volatile ListAttribute<Sgrmatchconfiguration, Sgrbatchmatchresultset> sgrbatchmatchresultsetList;
    public static volatile SingularAttribute<Sgrmatchconfiguration, String> name;
    public static volatile SingularAttribute<Sgrmatchconfiguration, String> similarityFields;
    public static volatile SingularAttribute<Sgrmatchconfiguration, Long> id;
    public static volatile SingularAttribute<Sgrmatchconfiguration, String> remarks;
    public static volatile SingularAttribute<Sgrmatchconfiguration, String> filterQuery;
    public static volatile SingularAttribute<Sgrmatchconfiguration, Boolean> boostInterestingTerms;

}