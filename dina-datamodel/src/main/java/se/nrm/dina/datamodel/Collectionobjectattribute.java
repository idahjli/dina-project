/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.datamodel;
 
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table; 
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import se.nrm.dina.datamodel.util.Util;

/**
 *
 * @author idali
 */
@Entity
@Table(name = "collectionobjectattribute")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Collectionobjectattribute.findAll", query = "SELECT c FROM Collectionobjectattribute c"),
    @NamedQuery(name = "Collectionobjectattribute.findByCollectionObjectAttributeID", query = "SELECT c FROM Collectionobjectattribute c WHERE c.collectionObjectAttributeID = :collectionObjectAttributeID"), 
    @NamedQuery(name = "Collectionobjectattribute.findByCollectionMemberID", query = "SELECT c FROM Collectionobjectattribute c WHERE c.collectionMemberID = :collectionMemberID"),    
    @NamedQuery(name = "Collectionobjectattribute.findByTopDistance", query = "SELECT c FROM Collectionobjectattribute c WHERE c.topDistance = :topDistance")})
public class Collectionobjectattribute extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CollectionObjectAttributeID")
    private Integer collectionObjectAttributeID;
    
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "CollectionMemberID")
    private int collectionMemberID;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Number1")
    private Float number1;
    
    @Column(name = "Number10")
    private Float number10;
    
    @Column(name = "Number11")
    private Float number11;
    
    @Column(name = "Number12")
    private Float number12;
    
    @Column(name = "Number13")
    private Float number13;
    
    @Column(name = "Number14")
    private Float number14;
    
    @Column(name = "Number15")
    private Float number15;
    
    @Column(name = "Number16")
    private Float number16;
    
    @Column(name = "Number17")
    private Float number17;
    
    @Column(name = "Number18")
    private Float number18;
    
    @Column(name = "Number19")
    private Float number19;
    
    @Column(name = "Number2")
    private Float number2;
    
    @Column(name = "Number20")
    private Float number20;
    
    @Column(name = "Number21")
    private Float number21;
    
    @Column(name = "Number22")
    private Float number22;
    
    @Column(name = "Number23")
    private Float number23;
    
    @Column(name = "Number24")
    private Float number24;
    
    @Column(name = "Number25")
    private Float number25;
    
    @Column(name = "Number26")
    private Float number26;
    
    @Column(name = "Number27")
    private Float number27;
    
    @Column(name = "Number28")
    private Float number28;
    
    @Column(name = "Number29")
    private Float number29;
    
    @Column(name = "Number3")
    private Float number3;
    
    @Column(name = "Number30")
    private Short number30;
    
    @Column(name = "Number31")
    private Float number31;
    
    @Column(name = "Number32")
    private Float number32;
    
    @Column(name = "Number33")
    private Float number33;
    
    @Column(name = "Number34")
    private Float number34;
    
    @Column(name = "Number35")
    private Float number35;
    
    @Column(name = "Number36")
    private Float number36;
    
    @Column(name = "Number37")
    private Float number37;
    
    @Column(name = "Number38")
    private Float number38;
    
    @Column(name = "Number39")
    private Float number39;
    
    @Column(name = "Number4")
    private Float number4;
    
    @Column(name = "Number40")
    private Float number40;
    
    @Column(name = "Number41")
    private Float number41;
    
    @Column(name = "Number42")
    private Float number42;
    
    @Column(name = "Number5")
    private Float number5;
    
    @Column(name = "Number6")
    private Float number6;
    
    @Column(name = "Number7")
    private Float number7;
    
    @Column(name = "Number8")
    private Short number8;
    
    @Column(name = "Number9")
    private Float number9;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "Remarks")
    private String remarks;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "Text1")
    private String text1;
    
    @Size(max = 50)
    @Column(name = "Text10")
    private String text10;
    
    @Size(max = 50)
    @Column(name = "Text11")
    private String text11;
    
    @Size(max = 50)
    @Column(name = "Text12")
    private String text12;
    
    @Size(max = 50)
    @Column(name = "Text13")
    private String text13;
    
    @Size(max = 50)
    @Column(name = "Text14")
    private String text14;
    
    @Size(max = 64)
    @Column(name = "Text15")
    private String text15;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "Text2")
    private String text2;
    
    @Lob
    @Size(max = 65535)
    @Column(name = "Text3")
    private String text3;
    
    @Size(max = 50)
    @Column(name = "Text4")
    private String text4;
    
    @Size(max = 50)
    @Column(name = "Text5")
    private String text5;
    
    @Size(max = 100)
    @Column(name = "Text6")
    private String text6;
    
    @Size(max = 100)
    @Column(name = "Text7")
    private String text7;
    
    @Size(max = 50)
    @Column(name = "Text8")
    private String text8;
    
    @Size(max = 50)
    @Column(name = "Text9")
    private String text9;
    
    @Column(name = "YesNo1")
    private Boolean yesNo1;
    
    @Column(name = "YesNo2")
    private Boolean yesNo2;
    
    @Column(name = "YesNo3")
    private Boolean yesNo3;
    
    @Column(name = "YesNo4")
    private Boolean yesNo4;
    
    @Column(name = "YesNo5")
    private Boolean yesNo5;
    
    @Column(name = "YesNo6")
    private Boolean yesNo6;
    
    @Column(name = "YesNo7")
    private Boolean yesNo7;
    
    @Column(name = "BottomDistance")
    private Float bottomDistance;
    
    @Size(max = 32)
    @Column(name = "Direction")
    private String direction;
    
    @Size(max = 16)
    @Column(name = "DistanceUnits")
    private String distanceUnits;
    
    @Size(max = 32)
    @Column(name = "PositionState")
    private String positionState;
    
    @Column(name = "TopDistance")
    private Float topDistance;
    
    @JoinColumn(name = "ModifiedByAgentID", referencedColumnName = "AgentID")
    @ManyToOne
    private Agent modifiedByAgentID;
    
    @JoinColumn(name = "CreatedByAgentID", referencedColumnName = "AgentID")
    @ManyToOne
    private Agent createdByAgentID;
    
    @OneToMany(mappedBy = "collectionObjectAttributeID", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Collectionobject> collectionobjectList;

    public Collectionobjectattribute() {
    }

    public Collectionobjectattribute(Integer collectionObjectAttributeID) {
        this.collectionObjectAttributeID = collectionObjectAttributeID;
    }

    public Collectionobjectattribute(Integer collectionObjectAttributeID, Date timestampCreated, int collectionMemberID) {
        this.collectionObjectAttributeID = collectionObjectAttributeID;
        this.timestampCreated = timestampCreated;
        this.collectionMemberID = collectionMemberID;
    }
    
    @XmlID
    @XmlAttribute(name = "id")
    @Override
    public String getIdentityString() {
        return String.valueOf(collectionObjectAttributeID);
    }
    
    
    @XmlAttribute(name = "uuid") 
    @Override
    public String getUUID() {
        return Util.getInstance().getURLLink(this.getClass().getSimpleName()) + collectionObjectAttributeID;
    }
    
    @Override
    public int getEntityId() {
        return collectionObjectAttributeID;
    }

    public Integer getCollectionObjectAttributeID() {
        return collectionObjectAttributeID;
    }

    public void setCollectionObjectAttributeID(Integer collectionObjectAttributeID) {
        this.collectionObjectAttributeID = collectionObjectAttributeID;
    }
 

    public int getCollectionMemberID() {
        return collectionMemberID;
    }

    public void setCollectionMemberID(int collectionMemberID) {
        this.collectionMemberID = collectionMemberID;
    }

    public Float getNumber1() {
        return number1;
    }

    public void setNumber1(Float number1) {
        this.number1 = number1;
    }

    public Float getNumber10() {
        return number10;
    }

    public void setNumber10(Float number10) {
        this.number10 = number10;
    }

    public Float getNumber11() {
        return number11;
    }

    public void setNumber11(Float number11) {
        this.number11 = number11;
    }

    public Float getNumber12() {
        return number12;
    }

    public void setNumber12(Float number12) {
        this.number12 = number12;
    }

    public Float getNumber13() {
        return number13;
    }

    public void setNumber13(Float number13) {
        this.number13 = number13;
    }

    public Float getNumber14() {
        return number14;
    }

    public void setNumber14(Float number14) {
        this.number14 = number14;
    }

    public Float getNumber15() {
        return number15;
    }

    public void setNumber15(Float number15) {
        this.number15 = number15;
    }

    public Float getNumber16() {
        return number16;
    }

    public void setNumber16(Float number16) {
        this.number16 = number16;
    }

    public Float getNumber17() {
        return number17;
    }

    public void setNumber17(Float number17) {
        this.number17 = number17;
    }

    public Float getNumber18() {
        return number18;
    }

    public void setNumber18(Float number18) {
        this.number18 = number18;
    }

    public Float getNumber19() {
        return number19;
    }

    public void setNumber19(Float number19) {
        this.number19 = number19;
    }

    public Float getNumber2() {
        return number2;
    }

    public void setNumber2(Float number2) {
        this.number2 = number2;
    }

    public Float getNumber20() {
        return number20;
    }

    public void setNumber20(Float number20) {
        this.number20 = number20;
    }

    public Float getNumber21() {
        return number21;
    }

    public void setNumber21(Float number21) {
        this.number21 = number21;
    }

    public Float getNumber22() {
        return number22;
    }

    public void setNumber22(Float number22) {
        this.number22 = number22;
    }

    public Float getNumber23() {
        return number23;
    }

    public void setNumber23(Float number23) {
        this.number23 = number23;
    }

    public Float getNumber24() {
        return number24;
    }

    public void setNumber24(Float number24) {
        this.number24 = number24;
    }

    public Float getNumber25() {
        return number25;
    }

    public void setNumber25(Float number25) {
        this.number25 = number25;
    }

    public Float getNumber26() {
        return number26;
    }

    public void setNumber26(Float number26) {
        this.number26 = number26;
    }

    public Float getNumber27() {
        return number27;
    }

    public void setNumber27(Float number27) {
        this.number27 = number27;
    }

    public Float getNumber28() {
        return number28;
    }

    public void setNumber28(Float number28) {
        this.number28 = number28;
    }

    public Float getNumber29() {
        return number29;
    }

    public void setNumber29(Float number29) {
        this.number29 = number29;
    }

    public Float getNumber3() {
        return number3;
    }

    public void setNumber3(Float number3) {
        this.number3 = number3;
    }

    public Short getNumber30() {
        return number30;
    }

    public void setNumber30(Short number30) {
        this.number30 = number30;
    }

    public Float getNumber31() {
        return number31;
    }

    public void setNumber31(Float number31) {
        this.number31 = number31;
    }

    public Float getNumber32() {
        return number32;
    }

    public void setNumber32(Float number32) {
        this.number32 = number32;
    }

    public Float getNumber33() {
        return number33;
    }

    public void setNumber33(Float number33) {
        this.number33 = number33;
    }

    public Float getNumber34() {
        return number34;
    }

    public void setNumber34(Float number34) {
        this.number34 = number34;
    }

    public Float getNumber35() {
        return number35;
    }

    public void setNumber35(Float number35) {
        this.number35 = number35;
    }

    public Float getNumber36() {
        return number36;
    }

    public void setNumber36(Float number36) {
        this.number36 = number36;
    }

    public Float getNumber37() {
        return number37;
    }

    public void setNumber37(Float number37) {
        this.number37 = number37;
    }

    public Float getNumber38() {
        return number38;
    }

    public void setNumber38(Float number38) {
        this.number38 = number38;
    }

    public Float getNumber39() {
        return number39;
    }

    public void setNumber39(Float number39) {
        this.number39 = number39;
    }

    public Float getNumber4() {
        return number4;
    }

    public void setNumber4(Float number4) {
        this.number4 = number4;
    }

    public Float getNumber40() {
        return number40;
    }

    public void setNumber40(Float number40) {
        this.number40 = number40;
    }

    public Float getNumber41() {
        return number41;
    }

    public void setNumber41(Float number41) {
        this.number41 = number41;
    }

    public Float getNumber42() {
        return number42;
    }

    public void setNumber42(Float number42) {
        this.number42 = number42;
    }

    public Float getNumber5() {
        return number5;
    }

    public void setNumber5(Float number5) {
        this.number5 = number5;
    }

    public Float getNumber6() {
        return number6;
    }

    public void setNumber6(Float number6) {
        this.number6 = number6;
    }

    public Float getNumber7() {
        return number7;
    }

    public void setNumber7(Float number7) {
        this.number7 = number7;
    }

    public Short getNumber8() {
        return number8;
    }

    public void setNumber8(Short number8) {
        this.number8 = number8;
    }

    public Float getNumber9() {
        return number9;
    }

    public void setNumber9(Float number9) {
        this.number9 = number9;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText10() {
        return text10;
    }

    public void setText10(String text10) {
        this.text10 = text10;
    }

    public String getText11() {
        return text11;
    }

    public void setText11(String text11) {
        this.text11 = text11;
    }

    public String getText12() {
        return text12;
    }

    public void setText12(String text12) {
        this.text12 = text12;
    }

    public String getText13() {
        return text13;
    }

    public void setText13(String text13) {
        this.text13 = text13;
    }

    public String getText14() {
        return text14;
    }

    public void setText14(String text14) {
        this.text14 = text14;
    }

    public String getText15() {
        return text15;
    }

    public void setText15(String text15) {
        this.text15 = text15;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public String getText5() {
        return text5;
    }

    public void setText5(String text5) {
        this.text5 = text5;
    }

    public String getText6() {
        return text6;
    }

    public void setText6(String text6) {
        this.text6 = text6;
    }

    public String getText7() {
        return text7;
    }

    public void setText7(String text7) {
        this.text7 = text7;
    }

    public String getText8() {
        return text8;
    }

    public void setText8(String text8) {
        this.text8 = text8;
    }

    public String getText9() {
        return text9;
    }

    public void setText9(String text9) {
        this.text9 = text9;
    }

    public Boolean getYesNo1() {
        return yesNo1;
    }

    public void setYesNo1(Boolean yesNo1) {
        this.yesNo1 = yesNo1;
    }

    public Boolean getYesNo2() {
        return yesNo2;
    }

    public void setYesNo2(Boolean yesNo2) {
        this.yesNo2 = yesNo2;
    }

    public Boolean getYesNo3() {
        return yesNo3;
    }

    public void setYesNo3(Boolean yesNo3) {
        this.yesNo3 = yesNo3;
    }

    public Boolean getYesNo4() {
        return yesNo4;
    }

    public void setYesNo4(Boolean yesNo4) {
        this.yesNo4 = yesNo4;
    }

    public Boolean getYesNo5() {
        return yesNo5;
    }

    public void setYesNo5(Boolean yesNo5) {
        this.yesNo5 = yesNo5;
    }

    public Boolean getYesNo6() {
        return yesNo6;
    }

    public void setYesNo6(Boolean yesNo6) {
        this.yesNo6 = yesNo6;
    }

    public Boolean getYesNo7() {
        return yesNo7;
    }

    public void setYesNo7(Boolean yesNo7) {
        this.yesNo7 = yesNo7;
    }

    public Float getBottomDistance() {
        return bottomDistance;
    }

    public void setBottomDistance(Float bottomDistance) {
        this.bottomDistance = bottomDistance;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDistanceUnits() {
        return distanceUnits;
    }

    public void setDistanceUnits(String distanceUnits) {
        this.distanceUnits = distanceUnits;
    }

    public String getPositionState() {
        return positionState;
    }

    public void setPositionState(String positionState) {
        this.positionState = positionState;
    }

    public Float getTopDistance() {
        return topDistance;
    }

    public void setTopDistance(Float topDistance) {
        this.topDistance = topDistance;
    }

    @XmlIDREF
    public Agent getModifiedByAgentID() {
        return modifiedByAgentID;
    }

    public void setModifiedByAgentID(Agent modifiedByAgentID) {
        this.modifiedByAgentID = modifiedByAgentID;
    }

    @XmlIDREF
    public Agent getCreatedByAgentID() {
        return createdByAgentID;
    }

    public void setCreatedByAgentID(Agent createdByAgentID) {
        this.createdByAgentID = createdByAgentID;
    }

    @XmlTransient
    public List<Collectionobject> getCollectionobjectList() {
        return collectionobjectList;
    }

    public void setCollectionobjectList(List<Collectionobject> collectionobjectList) {
        this.collectionobjectList = collectionobjectList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (collectionObjectAttributeID != null ? collectionObjectAttributeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Collectionobjectattribute)) {
            return false;
        }
        Collectionobjectattribute other = (Collectionobjectattribute) object;
        return !((this.collectionObjectAttributeID == null && other.collectionObjectAttributeID != null) || (this.collectionObjectAttributeID != null && !this.collectionObjectAttributeID.equals(other.collectionObjectAttributeID)));
    }

    @Override
    public String toString() {
        return "se.nrm.dina.datamodel.Collectionobjectattribute[ collectionObjectAttributeID=" + collectionObjectAttributeID + " ]";
    }
    
}
