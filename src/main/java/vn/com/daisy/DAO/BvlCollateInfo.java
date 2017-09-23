package vn.com.daisy.DAO;
// Generated Sep 28, 2016 9:13:03 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BvlCollateInfo generated by hbm2java
 */
@Entity
@Table(name="BVL_COLLATE_INFO"
    ,schema="ebanktest"
)
public class BvlCollateInfo  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BvlCollateInfoId id;
     private String bciCollateResult;
     private String bciExportStatus;
     private String bciInputter;
     private Date bciInputDate;
     private String bciRefNo;

    public BvlCollateInfo() {
    }

	
    public BvlCollateInfo(BvlCollateInfoId id, String bciCollateResult, String bciExportStatus) {
        this.id = id;
        this.bciCollateResult = bciCollateResult;
        this.bciExportStatus = bciExportStatus;
    }
    public BvlCollateInfo(BvlCollateInfoId id, String bciCollateResult, String bciExportStatus, String bciInputter, Date bciInputDate, String bciRefNo) {
       this.id = id;
       this.bciCollateResult = bciCollateResult;
       this.bciExportStatus = bciExportStatus;
       this.bciInputter = bciInputter;
       this.bciInputDate = bciInputDate;
       this.bciRefNo = bciRefNo;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="bciDate", column=@Column(name="BCI_DATE", nullable=false, length=7) ), 
        @AttributeOverride(name="bciCollateType", column=@Column(name="BCI_COLLATE_TYPE", nullable=false, precision=2, scale=0) ) } )
    public BvlCollateInfoId getId() {
        return this.id;
    }
    
    public void setId(BvlCollateInfoId id) {
        this.id = id;
    }

    
    @Column(name="BCI_COLLATE_RESULT", nullable=false, length=5)
    public String getBciCollateResult() {
        return this.bciCollateResult;
    }
    
    public void setBciCollateResult(String bciCollateResult) {
        this.bciCollateResult = bciCollateResult;
    }

    
    @Column(name="BCI_EXPORT_STATUS", nullable=false, length=3)
    public String getBciExportStatus() {
        return this.bciExportStatus;
    }
    
    public void setBciExportStatus(String bciExportStatus) {
        this.bciExportStatus = bciExportStatus;
    }

    
    @Column(name="BCI_INPUTTER", length=20)
    public String getBciInputter() {
        return this.bciInputter;
    }
    
    public void setBciInputter(String bciInputter) {
        this.bciInputter = bciInputter;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="BCI_INPUT_DATE", length=7)
    public Date getBciInputDate() {
        return this.bciInputDate;
    }
    
    public void setBciInputDate(Date bciInputDate) {
        this.bciInputDate = bciInputDate;
    }

    
    @Column(name="BCI_REF_NO", length=100)
    public String getbciRefNo() {
        return this.bciRefNo;
    }
    
    public void setbciRefNo(String bciRefNo) {
        this.bciRefNo = bciRefNo;
    }




}


