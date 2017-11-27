package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by realsystems on 18/10/2015.
 */
@Entity
public class Afemst extends Entidad implements java.io.Serializable {
    private String afe;

    @Id
    @javax.persistence.Column(name = "afe")
    public String getAfe() {
        return afe;
    }

    public void setAfe(String afe) {
        this.afe = afe;
    }

    private String companyowner;

    @Basic
    @javax.persistence.Column(name = "companyowner")
    public String getCompanyowner() {
        return companyowner;
    }

    public void setCompanyowner(String companyowner) {
        this.companyowner = companyowner;
    }

    private String localname;

    @Basic
    @javax.persistence.Column(name = "localname")
    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }

    private String englishname;

    @Basic
    @javax.persistence.Column(name = "englishname")
    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname;
    }

    private Timestamp approveddate;

    @Basic
    @javax.persistence.Column(name = "approveddate")
    public Timestamp getApproveddate() {
        return approveddate;
    }

    public void setApproveddate(Timestamp approveddate) {
        this.approveddate = approveddate;
    }

    private Timestamp startdate;

    @Basic
    @javax.persistence.Column(name = "startdate")
    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    private Timestamp completeddate;

    @Basic
    @javax.persistence.Column(name = "completeddate")
    public Timestamp getCompleteddate() {
        return completeddate;
    }

    public void setCompleteddate(Timestamp completeddate) {
        this.completeddate = completeddate;
    }

    private String responsible;

    @Basic
    @javax.persistence.Column(name = "responsible")
    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    private Double appropriationamount;

    @Basic
    @javax.persistence.Column(name = "appropriationamount")
    public Double getAppropriationamount() {
        return appropriationamount;
    }

    public void setAppropriationamount(Double appropriationamount) {
        this.appropriationamount = appropriationamount;
    }

    private String account;

    @Basic
    @javax.persistence.Column(name = "Account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    private String accountClearing;

    @Basic
    @javax.persistence.Column(name = "AccountClearing")
    public String getAccountClearing() {
        return accountClearing;
    }

    public void setAccountClearing(String accountClearing) {
        this.accountClearing = accountClearing;
    }

    private String afetype;

    @Basic
    @javax.persistence.Column(name = "afetype")
    public String getAfetype() {
        return afetype;
    }

    public void setAfetype(String afetype) {
        this.afetype = afetype;
    }

    private String afeGroup;

    @Basic
    @javax.persistence.Column(name = "AfeGroup")
    public String getAfeGroup() {
        return afeGroup;
    }

    public void setAfeGroup(String afeGroup) {
        this.afeGroup = afeGroup;
    }

    private String elementDefault;

    @Basic
    @javax.persistence.Column(name = "ElementDefault")
    public String getElementDefault() {
        return elementDefault;
    }

    public void setElementDefault(String elementDefault) {
        this.elementDefault = elementDefault;
    }

    private String costCenter;

    @Basic
    @javax.persistence.Column(name = "CostCenter")
    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    private String appropriationcurrency;

    @Basic
    @javax.persistence.Column(name = "appropriationcurrency")
    public String getAppropriationcurrency() {
        return appropriationcurrency;
    }

    public void setAppropriationcurrency(String appropriationcurrency) {
        this.appropriationcurrency = appropriationcurrency;
    }

    private String group01;

    @Basic
    @javax.persistence.Column(name = "Group01")
    public String getGroup01() {
        return group01;
    }

    public void setGroup01(String group01) {
        this.group01 = group01;
    }

    private String group02;

    @Basic
    @javax.persistence.Column(name = "Group02")
    public String getGroup02() {
        return group02;
    }

    public void setGroup02(String group02) {
        this.group02 = group02;
    }

    private String group03;

    @Basic
    @javax.persistence.Column(name = "Group03")
    public String getGroup03() {
        return group03;
    }

    public void setGroup03(String group03) {
        this.group03 = group03;
    }

    private String group04;

    @Basic
    @javax.persistence.Column(name = "Group04")
    public String getGroup04() {
        return group04;
    }

    public void setGroup04(String group04) {
        this.group04 = group04;
    }

    private String group05;

    @Basic
    @javax.persistence.Column(name = "Group05")
    public String getGroup05() {
        return group05;
    }

    public void setGroup05(String group05) {
        this.group05 = group05;
    }

    private String group06;

    @Basic
    @javax.persistence.Column(name = "Group06")
    public String getGroup06() {
        return group06;
    }

    public void setGroup06(String group06) {
        this.group06 = group06;
    }

    private String internalNumber;

    @Basic
    @javax.persistence.Column(name = "InternalNumber")
    public String getInternalNumber() {
        return internalNumber;
    }

    public void setInternalNumber(String internalNumber) {
        this.internalNumber = internalNumber;
    }

    private String userStatus;

    @Basic
    @javax.persistence.Column(name = "UserStatus")
    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    private String status;

    @Basic
    @javax.persistence.Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String lastuser;

    @Basic
    @javax.persistence.Column(name = "lastuser")
    public String getLastuser() {
        return lastuser;
    }

    public void setLastuser(String lastuser) {
        this.lastuser = lastuser;
    }

    private Timestamp lastdate;

    @Basic
    @javax.persistence.Column(name = "lastdate")
    public Timestamp getLastdate() {
        return lastdate;
    }

    public void setLastdate(Timestamp lastdate) {
        this.lastdate = lastdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Afemst afemst = (Afemst) o;

        if (afe != null ? !afe.equals(afemst.afe) : afemst.afe != null) return false;
        if (companyowner != null ? !companyowner.equals(afemst.companyowner) : afemst.companyowner != null)
            return false;
        if (localname != null ? !localname.equals(afemst.localname) : afemst.localname != null) return false;
        if (englishname != null ? !englishname.equals(afemst.englishname) : afemst.englishname != null) return false;
        if (approveddate != null ? !approveddate.equals(afemst.approveddate) : afemst.approveddate != null)
            return false;
        if (startdate != null ? !startdate.equals(afemst.startdate) : afemst.startdate != null) return false;
        if (completeddate != null ? !completeddate.equals(afemst.completeddate) : afemst.completeddate != null)
            return false;
        if (responsible != null ? !responsible.equals(afemst.responsible) : afemst.responsible != null) return false;
        if (appropriationamount != null ? !appropriationamount.equals(afemst.appropriationamount) : afemst.appropriationamount != null)
            return false;
        if (account != null ? !account.equals(afemst.account) : afemst.account != null) return false;
        if (accountClearing != null ? !accountClearing.equals(afemst.accountClearing) : afemst.accountClearing != null)
            return false;
        if (afetype != null ? !afetype.equals(afemst.afetype) : afemst.afetype != null) return false;
        if (afeGroup != null ? !afeGroup.equals(afemst.afeGroup) : afemst.afeGroup != null) return false;
        if (elementDefault != null ? !elementDefault.equals(afemst.elementDefault) : afemst.elementDefault != null)
            return false;
        if (costCenter != null ? !costCenter.equals(afemst.costCenter) : afemst.costCenter != null) return false;
        if (appropriationcurrency != null ? !appropriationcurrency.equals(afemst.appropriationcurrency) : afemst.appropriationcurrency != null)
            return false;
        if (group01 != null ? !group01.equals(afemst.group01) : afemst.group01 != null) return false;
        if (group02 != null ? !group02.equals(afemst.group02) : afemst.group02 != null) return false;
        if (group03 != null ? !group03.equals(afemst.group03) : afemst.group03 != null) return false;
        if (group04 != null ? !group04.equals(afemst.group04) : afemst.group04 != null) return false;
        if (group05 != null ? !group05.equals(afemst.group05) : afemst.group05 != null) return false;
        if (group06 != null ? !group06.equals(afemst.group06) : afemst.group06 != null) return false;
        if (internalNumber != null ? !internalNumber.equals(afemst.internalNumber) : afemst.internalNumber != null)
            return false;
        if (userStatus != null ? !userStatus.equals(afemst.userStatus) : afemst.userStatus != null) return false;
        if (status != null ? !status.equals(afemst.status) : afemst.status != null) return false;
        if (lastuser != null ? !lastuser.equals(afemst.lastuser) : afemst.lastuser != null) return false;
        if (lastdate != null ? !lastdate.equals(afemst.lastdate) : afemst.lastdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = afe != null ? afe.hashCode() : 0;
        result = 31 * result + (companyowner != null ? companyowner.hashCode() : 0);
        result = 31 * result + (localname != null ? localname.hashCode() : 0);
        result = 31 * result + (englishname != null ? englishname.hashCode() : 0);
        result = 31 * result + (approveddate != null ? approveddate.hashCode() : 0);
        result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
        result = 31 * result + (completeddate != null ? completeddate.hashCode() : 0);
        result = 31 * result + (responsible != null ? responsible.hashCode() : 0);
        result = 31 * result + (appropriationamount != null ? appropriationamount.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (accountClearing != null ? accountClearing.hashCode() : 0);
        result = 31 * result + (afetype != null ? afetype.hashCode() : 0);
        result = 31 * result + (afeGroup != null ? afeGroup.hashCode() : 0);
        result = 31 * result + (elementDefault != null ? elementDefault.hashCode() : 0);
        result = 31 * result + (costCenter != null ? costCenter.hashCode() : 0);
        result = 31 * result + (appropriationcurrency != null ? appropriationcurrency.hashCode() : 0);
        result = 31 * result + (group01 != null ? group01.hashCode() : 0);
        result = 31 * result + (group02 != null ? group02.hashCode() : 0);
        result = 31 * result + (group03 != null ? group03.hashCode() : 0);
        result = 31 * result + (group04 != null ? group04.hashCode() : 0);
        result = 31 * result + (group05 != null ? group05.hashCode() : 0);
        result = 31 * result + (group06 != null ? group06.hashCode() : 0);
        result = 31 * result + (internalNumber != null ? internalNumber.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastuser != null ? lastuser.hashCode() : 0);
        result = 31 * result + (lastdate != null ? lastdate.hashCode() : 0);
        return result;
    }
}
