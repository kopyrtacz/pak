package pl.riscosoftware.pak;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class CreditContract implements java.io.Serializable
{

   static final long serialVersionUID = 1L;
   @org.kie.api.definition.type.Label("Identyfikator")
   private Long id;

   @org.kie.api.definition.type.Label("Typ")
   private java.lang.String type;

   @org.kie.api.definition.type.Label("Data utworzenia")
   private java.util.Date createdOn;

   @org.kie.api.definition.type.Label("Klient")
   private pl.riscosoftware.pak.Customer customer;

   @org.kie.api.definition.type.Label("Liczba transz")
   private int trancheNumber;
   @org.kie.api.definition.type.Label("Następna data transzy")
   private java.util.Date trancheDate;
   @org.kie.api.definition.type.Label("Data podpisania kredytu")
   private java.util.Date contractDate;

   @org.kie.api.definition.type.Label("Dokumenty")
   private java.util.List<pl.riscosoftware.pak.Document> documentList;

   private java.util.List<pl.riscosoftware.pak.Tranche> trancheList;

   @org.kie.api.definition.type.Label(value = "Kowenant")
   private java.util.List<pl.riscosoftware.pak.Convenant> convenantList;

   public CreditContract()
   {
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.util.Date getCreatedOn()
   {
      return this.createdOn;
   }

   public void setCreatedOn(java.util.Date createdOn)
   {
      this.createdOn = createdOn;
   }

   public pl.riscosoftware.pak.Customer getCustomer()
   {
      return this.customer;
   }

   public void setCustomer(pl.riscosoftware.pak.Customer customer)
   {
      this.customer = customer;
   }

   public int getTrancheNumber()
   {
      return this.trancheNumber;
   }

   public void setTrancheNumber(int trancheNumber)
   {
      this.trancheNumber = trancheNumber;
   }

   public java.util.Date getTrancheDate()
   {
      return this.trancheDate;
   }

   public void setTrancheDate(java.util.Date trancheDate)
   {
      this.trancheDate = trancheDate;
   }

   public java.util.Date getContractDate()
   {
      return this.contractDate;
   }

   public void setContractDate(java.util.Date contractDate)
   {
      this.contractDate = contractDate;
   }

   public String toString()
   {
      return id + " | " +
            type + " | " +
            createdOn + " | " +
            trancheNumber + " | " +
            trancheNumber + " | " +
            contractDate + " | " +
            customer + " | ";
   }

   public java.util.List<pl.riscosoftware.pak.Document> getDocumentList()
   {
      return this.documentList;
   }

   public void setDocumentList(
         java.util.List<pl.riscosoftware.pak.Document> documentList)
   {
      this.documentList = documentList;
   }

   public java.util.List<pl.riscosoftware.pak.Tranche> getTrancheList()
   {
      return this.trancheList;
   }

   public void setTrancheList(
         java.util.List<pl.riscosoftware.pak.Tranche> trancheList)
   {
      this.trancheList = trancheList;
   }

   public java.util.List<pl.riscosoftware.pak.Convenant> getConvenantList()
   {
      return this.convenantList;
   }

   public void setConvenantList(
         java.util.List<pl.riscosoftware.pak.Convenant> convenantList)
   {
      this.convenantList = convenantList;
   }

   public CreditContract(java.lang.Long id, java.lang.String type,
         java.util.Date createdOn, pl.riscosoftware.pak.Customer customer,
         int trancheNumber, java.util.Date trancheDate,
         java.util.Date contractDate,
         java.util.List<pl.riscosoftware.pak.Document> documentList,
         java.util.List<pl.riscosoftware.pak.Tranche> trancheList,
         java.util.List<pl.riscosoftware.pak.Convenant> convenantList)
   {
      this.id = id;
      this.type = type;
      this.createdOn = createdOn;
      this.customer = customer;
      this.trancheNumber = trancheNumber;
      this.trancheDate = trancheDate;
      this.contractDate = contractDate;
      this.documentList = documentList;
      this.trancheList = trancheList;
      this.convenantList = convenantList;
   }
}