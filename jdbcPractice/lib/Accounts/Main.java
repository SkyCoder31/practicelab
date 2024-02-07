package jdbcPractice.lib.Accounts;

public class Main { 

public static void main(String[] args) { 
    
PatientDAO patientDAO = new PatientDAO(); 
    
     
    

    
  Patient patient1 = new Patient(); 
    
 patient1.setPatientName("John Doe"); 
    
 patient1.setMedicalHistory("High Sugar"); 
    
 patientDAO.createPatient(patient1); 
    
     
 // Retrieve a patient's medical record by patientID 
    
 try { 
    
 Patient retrievedPatient = patientDAO.getPatientByID(patient1.getPatientID()); 
    
 System.out.println("Retrieved Patient: " + retrievedPatient.getPatientName()); 
 System.out.println("Medical p History: " + retrievedPatient.getMedicalHistory()); 

 } catch (RecordNotFoundException e) { 

System.out.println(e.getMessage()); 

} 

 // Clean up and close the database connection 

 patientDAO.close(); 
} 

} 

 