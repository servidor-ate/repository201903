package pe.royalsystems.springerp.model.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by realsystems on 18/10/2015.
 */
@Entity
@javax.persistence.Table(name = "AC_CostCenterMst", schema = "dbo", catalog = "WebCoreManager")
public class AcCostCenterMst extends Entidad implements java.io.Serializable {
    private String costCenter;

    @Id
    @javax.persistence.Column(name = "CostCenter")
    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    private String localName;

    @Basic
    @javax.persistence.Column(name = "LocalName")
    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    private String englishName;

    @Basic
    @javax.persistence.Column(name = "EnglishName")
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    private String costCenterClasification;

    @Basic
    @javax.persistence.Column(name = "CostCenterClasification")
    public String getCostCenterClasification() {
        return costCenterClasification;
    }

    public void setCostCenterClasification(String costCenterClasification) {
        this.costCenterClasification = costCenterClasification;
    }

    private String costCenterGroup;

    @Basic
    @javax.persistence.Column(name = "CostCenterGroup")
    public String getCostCenterGroup() {
        return costCenterGroup;
    }

    public void setCostCenterGroup(String costCenterGroup) {
        this.costCenterGroup = costCenterGroup;
    }

    private String costCenterSubGroup;

    @Basic
    @javax.persistence.Column(name = "CostCenterSubGroup")
    public String getCostCenterSubGroup() {
        return costCenterSubGroup;
    }

    public void setCostCenterSubGroup(String costCenterSubGroup) {
        this.costCenterSubGroup = costCenterSubGroup;
    }

    private String costCenterRelation;

    @Basic
    @javax.persistence.Column(name = "CostCenterRelation")
    public String getCostCenterRelation() {
        return costCenterRelation;
    }

    public void setCostCenterRelation(String costCenterRelation) {
        this.costCenterRelation = costCenterRelation;
    }

    private String responsible;

    @Basic
    @javax.persistence.Column(name = "Responsible")
    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    private String expenseFinanceFlag;

    @Basic
    @javax.persistence.Column(name = "ExpenseFinanceFlag")
    public String getExpenseFinanceFlag() {
        return expenseFinanceFlag;
    }

    public void setExpenseFinanceFlag(String expenseFinanceFlag) {
        this.expenseFinanceFlag = expenseFinanceFlag;
    }

    private String expenseAdministrativeFlag;

    @Basic
    @javax.persistence.Column(name = "ExpenseAdministrativeFlag")
    public String getExpenseAdministrativeFlag() {
        return expenseAdministrativeFlag;
    }

    public void setExpenseAdministrativeFlag(String expenseAdministrativeFlag) {
        this.expenseAdministrativeFlag = expenseAdministrativeFlag;
    }

    private String expenseSalesFlag;

    @Basic
    @javax.persistence.Column(name = "ExpenseSalesFlag")
    public String getExpenseSalesFlag() {
        return expenseSalesFlag;
    }

    public void setExpenseSalesFlag(String expenseSalesFlag) {
        this.expenseSalesFlag = expenseSalesFlag;
    }

    private String expenseProductionFlag;

    @Basic
    @javax.persistence.Column(name = "ExpenseProductionFlag")
    public String getExpenseProductionFlag() {
        return expenseProductionFlag;
    }

    public void setExpenseProductionFlag(String expenseProductionFlag) {
        this.expenseProductionFlag = expenseProductionFlag;
    }

    private String incomeFlag;

    @Basic
    @javax.persistence.Column(name = "IncomeFlag")
    public String getIncomeFlag() {
        return incomeFlag;
    }

    public void setIncomeFlag(String incomeFlag) {
        this.incomeFlag = incomeFlag;
    }

    private String costProductionLevel;

    @Basic
    @javax.persistence.Column(name = "CostProductionLevel")
    public String getCostProductionLevel() {
        return costProductionLevel;
    }

    public void setCostProductionLevel(String costProductionLevel) {
        this.costProductionLevel = costProductionLevel;
    }

    private String costCenterNext;

    @Basic
    @javax.persistence.Column(name = "CostCenterNext")
    public String getCostCenterNext() {
        return costCenterNext;
    }

    public void setCostCenterNext(String costCenterNext) {
        this.costCenterNext = costCenterNext;
    }

    private Integer vendor;

    @Basic
    @javax.persistence.Column(name = "Vendor")
    public Integer getVendor() {
        return vendor;
    }

    public void setVendor(Integer vendor) {
        this.vendor = vendor;
    }

    private BigDecimal amountInvoices;

    @Basic
    @javax.persistence.Column(name = "AmountInvoices")
    public BigDecimal getAmountInvoices() {
        return amountInvoices;
    }

    public void setAmountInvoices(BigDecimal amountInvoices) {
        this.amountInvoices = amountInvoices;
    }

    private BigDecimal amountRequisitions;

    @Basic
    @javax.persistence.Column(name = "AmountRequisitions")
    public BigDecimal getAmountRequisitions() {
        return amountRequisitions;
    }

    public void setAmountRequisitions(BigDecimal amountRequisitions) {
        this.amountRequisitions = amountRequisitions;
    }

    private BigDecimal amountAdvances;

    @Basic
    @javax.persistence.Column(name = "AmountAdvances")
    public BigDecimal getAmountAdvances() {
        return amountAdvances;
    }

    public void setAmountAdvances(BigDecimal amountAdvances) {
        this.amountAdvances = amountAdvances;
    }

    private BigDecimal amountOthers01;

    @Basic
    @javax.persistence.Column(name = "AmountOthers01")
    public BigDecimal getAmountOthers01() {
        return amountOthers01;
    }

    public void setAmountOthers01(BigDecimal amountOthers01) {
        this.amountOthers01 = amountOthers01;
    }

    private BigDecimal amountOthers02;

    @Basic
    @javax.persistence.Column(name = "AmountOthers02")
    public BigDecimal getAmountOthers02() {
        return amountOthers02;
    }

    public void setAmountOthers02(BigDecimal amountOthers02) {
        this.amountOthers02 = amountOthers02;
    }

    private BigDecimal amountOthers03;

    @Basic
    @javax.persistence.Column(name = "AmountOthers03")
    public BigDecimal getAmountOthers03() {
        return amountOthers03;
    }

    public void setAmountOthers03(BigDecimal amountOthers03) {
        this.amountOthers03 = amountOthers03;
    }

    private String vendorSignFile;

    @Basic
    @javax.persistence.Column(name = "VendorSignFile")
    public String getVendorSignFile() {
        return vendorSignFile;
    }

    public void setVendorSignFile(String vendorSignFile) {
        this.vendorSignFile = vendorSignFile;
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

    private String accountDestination;

    @Basic
    @javax.persistence.Column(name = "AccountDestination")
    public String getAccountDestination() {
        return accountDestination;
    }

    public void setAccountDestination(String accountDestination) {
        this.accountDestination = accountDestination;
    }

    private String costCenterType;

    @Basic
    @javax.persistence.Column(name = "CostCenterType")
    public String getCostCenterType() {
        return costCenterType;
    }

    public void setCostCenterType(String costCenterType) {
        this.costCenterType = costCenterType;
    }

    private String accountInflation;

    @Basic
    @javax.persistence.Column(name = "AccountInflation")
    public String getAccountInflation() {
        return accountInflation;
    }

    public void setAccountInflation(String accountInflation) {
        this.accountInflation = accountInflation;
    }

    private String expenseFixedFlag;

    @Basic
    @javax.persistence.Column(name = "ExpenseFixedFlag")
    public String getExpenseFixedFlag() {
        return expenseFixedFlag;
    }

    public void setExpenseFixedFlag(String expenseFixedFlag) {
        this.expenseFixedFlag = expenseFixedFlag;
    }

    private String expenseDirectFlag;

    @Basic
    @javax.persistence.Column(name = "ExpenseDirectFlag")
    public String getExpenseDirectFlag() {
        return expenseDirectFlag;
    }

    public void setExpenseDirectFlag(String expenseDirectFlag) {
        this.expenseDirectFlag = expenseDirectFlag;
    }

    private String sucursal;

    @Basic
    @javax.persistence.Column(name = "Sucursal")
    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
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

    private String cpAutomaticRequFlag;

    @Basic
    @javax.persistence.Column(name = "CPAutomaticRequFlag")
    public String getCpAutomaticRequFlag() {
        return cpAutomaticRequFlag;
    }

    public void setCpAutomaticRequFlag(String cpAutomaticRequFlag) {
        this.cpAutomaticRequFlag = cpAutomaticRequFlag;
    }

    private String cpAutomaticInvoFlag;

    @Basic
    @javax.persistence.Column(name = "CPAutomaticInvoFlag")
    public String getCpAutomaticInvoFlag() {
        return cpAutomaticInvoFlag;
    }

    public void setCpAutomaticInvoFlag(String cpAutomaticInvoFlag) {
        this.cpAutomaticInvoFlag = cpAutomaticInvoFlag;
    }

    private String status;

    @Basic
    @javax.persistence.Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String lastUser;

    @Basic
    @javax.persistence.Column(name = "LastUser")
    public String getLastUser() {
        return lastUser;
    }

    public void setLastUser(String lastUser) {
        this.lastUser = lastUser;
    }

    private Timestamp lastdate;

    @Basic
    @javax.persistence.Column(name = "Lastdate")
    public Timestamp getLastdate() {
        return lastdate;
    }

    public void setLastdate(Timestamp lastdate) {
        this.lastdate = lastdate;
    }

    private String responsibleRrhh;

    @Basic
    @javax.persistence.Column(name = "responsible_rrhh")
    public String getResponsibleRrhh() {
        return responsibleRrhh;
    }

    public void setResponsibleRrhh(String responsibleRrhh) {
        this.responsibleRrhh = responsibleRrhh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcCostCenterMst that = (AcCostCenterMst) o;

        if (costCenter != null ? !costCenter.equals(that.costCenter) : that.costCenter != null) return false;
        if (localName != null ? !localName.equals(that.localName) : that.localName != null) return false;
        if (englishName != null ? !englishName.equals(that.englishName) : that.englishName != null) return false;
        if (costCenterClasification != null ? !costCenterClasification.equals(that.costCenterClasification) : that.costCenterClasification != null)
            return false;
        if (costCenterGroup != null ? !costCenterGroup.equals(that.costCenterGroup) : that.costCenterGroup != null)
            return false;
        if (costCenterSubGroup != null ? !costCenterSubGroup.equals(that.costCenterSubGroup) : that.costCenterSubGroup != null)
            return false;
        if (costCenterRelation != null ? !costCenterRelation.equals(that.costCenterRelation) : that.costCenterRelation != null)
            return false;
        if (responsible != null ? !responsible.equals(that.responsible) : that.responsible != null) return false;
        if (expenseFinanceFlag != null ? !expenseFinanceFlag.equals(that.expenseFinanceFlag) : that.expenseFinanceFlag != null)
            return false;
        if (expenseAdministrativeFlag != null ? !expenseAdministrativeFlag.equals(that.expenseAdministrativeFlag) : that.expenseAdministrativeFlag != null)
            return false;
        if (expenseSalesFlag != null ? !expenseSalesFlag.equals(that.expenseSalesFlag) : that.expenseSalesFlag != null)
            return false;
        if (expenseProductionFlag != null ? !expenseProductionFlag.equals(that.expenseProductionFlag) : that.expenseProductionFlag != null)
            return false;
        if (incomeFlag != null ? !incomeFlag.equals(that.incomeFlag) : that.incomeFlag != null) return false;
        if (costProductionLevel != null ? !costProductionLevel.equals(that.costProductionLevel) : that.costProductionLevel != null)
            return false;
        if (costCenterNext != null ? !costCenterNext.equals(that.costCenterNext) : that.costCenterNext != null)
            return false;
        if (vendor != null ? !vendor.equals(that.vendor) : that.vendor != null) return false;
        if (amountInvoices != null ? !amountInvoices.equals(that.amountInvoices) : that.amountInvoices != null)
            return false;
        if (amountRequisitions != null ? !amountRequisitions.equals(that.amountRequisitions) : that.amountRequisitions != null)
            return false;
        if (amountAdvances != null ? !amountAdvances.equals(that.amountAdvances) : that.amountAdvances != null)
            return false;
        if (amountOthers01 != null ? !amountOthers01.equals(that.amountOthers01) : that.amountOthers01 != null)
            return false;
        if (amountOthers02 != null ? !amountOthers02.equals(that.amountOthers02) : that.amountOthers02 != null)
            return false;
        if (amountOthers03 != null ? !amountOthers03.equals(that.amountOthers03) : that.amountOthers03 != null)
            return false;
        if (vendorSignFile != null ? !vendorSignFile.equals(that.vendorSignFile) : that.vendorSignFile != null)
            return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (accountDestination != null ? !accountDestination.equals(that.accountDestination) : that.accountDestination != null)
            return false;
        if (costCenterType != null ? !costCenterType.equals(that.costCenterType) : that.costCenterType != null)
            return false;
        if (accountInflation != null ? !accountInflation.equals(that.accountInflation) : that.accountInflation != null)
            return false;
        if (expenseFixedFlag != null ? !expenseFixedFlag.equals(that.expenseFixedFlag) : that.expenseFixedFlag != null)
            return false;
        if (expenseDirectFlag != null ? !expenseDirectFlag.equals(that.expenseDirectFlag) : that.expenseDirectFlag != null)
            return false;
        if (sucursal != null ? !sucursal.equals(that.sucursal) : that.sucursal != null) return false;
        if (internalNumber != null ? !internalNumber.equals(that.internalNumber) : that.internalNumber != null)
            return false;
        if (cpAutomaticRequFlag != null ? !cpAutomaticRequFlag.equals(that.cpAutomaticRequFlag) : that.cpAutomaticRequFlag != null)
            return false;
        if (cpAutomaticInvoFlag != null ? !cpAutomaticInvoFlag.equals(that.cpAutomaticInvoFlag) : that.cpAutomaticInvoFlag != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (lastUser != null ? !lastUser.equals(that.lastUser) : that.lastUser != null) return false;
        if (lastdate != null ? !lastdate.equals(that.lastdate) : that.lastdate != null) return false;
        if (responsibleRrhh != null ? !responsibleRrhh.equals(that.responsibleRrhh) : that.responsibleRrhh != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = costCenter != null ? costCenter.hashCode() : 0;
        result = 31 * result + (localName != null ? localName.hashCode() : 0);
        result = 31 * result + (englishName != null ? englishName.hashCode() : 0);
        result = 31 * result + (costCenterClasification != null ? costCenterClasification.hashCode() : 0);
        result = 31 * result + (costCenterGroup != null ? costCenterGroup.hashCode() : 0);
        result = 31 * result + (costCenterSubGroup != null ? costCenterSubGroup.hashCode() : 0);
        result = 31 * result + (costCenterRelation != null ? costCenterRelation.hashCode() : 0);
        result = 31 * result + (responsible != null ? responsible.hashCode() : 0);
        result = 31 * result + (expenseFinanceFlag != null ? expenseFinanceFlag.hashCode() : 0);
        result = 31 * result + (expenseAdministrativeFlag != null ? expenseAdministrativeFlag.hashCode() : 0);
        result = 31 * result + (expenseSalesFlag != null ? expenseSalesFlag.hashCode() : 0);
        result = 31 * result + (expenseProductionFlag != null ? expenseProductionFlag.hashCode() : 0);
        result = 31 * result + (incomeFlag != null ? incomeFlag.hashCode() : 0);
        result = 31 * result + (costProductionLevel != null ? costProductionLevel.hashCode() : 0);
        result = 31 * result + (costCenterNext != null ? costCenterNext.hashCode() : 0);
        result = 31 * result + (vendor != null ? vendor.hashCode() : 0);
        result = 31 * result + (amountInvoices != null ? amountInvoices.hashCode() : 0);
        result = 31 * result + (amountRequisitions != null ? amountRequisitions.hashCode() : 0);
        result = 31 * result + (amountAdvances != null ? amountAdvances.hashCode() : 0);
        result = 31 * result + (amountOthers01 != null ? amountOthers01.hashCode() : 0);
        result = 31 * result + (amountOthers02 != null ? amountOthers02.hashCode() : 0);
        result = 31 * result + (amountOthers03 != null ? amountOthers03.hashCode() : 0);
        result = 31 * result + (vendorSignFile != null ? vendorSignFile.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (accountDestination != null ? accountDestination.hashCode() : 0);
        result = 31 * result + (costCenterType != null ? costCenterType.hashCode() : 0);
        result = 31 * result + (accountInflation != null ? accountInflation.hashCode() : 0);
        result = 31 * result + (expenseFixedFlag != null ? expenseFixedFlag.hashCode() : 0);
        result = 31 * result + (expenseDirectFlag != null ? expenseDirectFlag.hashCode() : 0);
        result = 31 * result + (sucursal != null ? sucursal.hashCode() : 0);
        result = 31 * result + (internalNumber != null ? internalNumber.hashCode() : 0);
        result = 31 * result + (cpAutomaticRequFlag != null ? cpAutomaticRequFlag.hashCode() : 0);
        result = 31 * result + (cpAutomaticInvoFlag != null ? cpAutomaticInvoFlag.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastUser != null ? lastUser.hashCode() : 0);
        result = 31 * result + (lastdate != null ? lastdate.hashCode() : 0);
        result = 31 * result + (responsibleRrhh != null ? responsibleRrhh.hashCode() : 0);
        return result;
    }
}
