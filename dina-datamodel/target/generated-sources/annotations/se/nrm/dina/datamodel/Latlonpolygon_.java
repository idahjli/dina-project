package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-16T16:33:04")
@StaticMetamodel(Latlonpolygon.class)
public class Latlonpolygon_ extends BaseEntity_ {

    public static volatile SingularAttribute<Latlonpolygon, Integer> latLonPolygonID;
    public static volatile SingularAttribute<Latlonpolygon, String> name;
    public static volatile SingularAttribute<Latlonpolygon, String> description;
    public static volatile SingularAttribute<Latlonpolygon, Integer> createdByAgentID;
    public static volatile SingularAttribute<Latlonpolygon, Integer> modifiedByAgentID;
    public static volatile SingularAttribute<Latlonpolygon, Boolean> isPolyline;
    public static volatile SingularAttribute<Latlonpolygon, Integer> localityID;
    public static volatile SingularAttribute<Latlonpolygon, Integer> spVisualQueryID;

}