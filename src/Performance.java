public class Performance {
    private String performanceID;
    private String performanceName;
    private String performanceLeadName;
    private char performanceGroup;

    public Performance(String performanceID, String performanceName, String performanceLeadName, char performanceGroup) {  
        this.performanceID = performanceID;  
        this.performanceName = performanceName;  
        this.performanceLeadName = performanceLeadName;  
        this.performanceGroup = performanceGroup;  
    }  
  
    
    public Performance() {  
        
    }  
  
    
    public String getPerformanceID() {  
        return performanceID;  
    }  
  
    public String getPerformanceName() {  
        return performanceName;  
    }  
  
    public String getPerformanceLeadName() {  
        return performanceLeadName;  
    }  
  
    public char getPerformanceGroup() {  
        return performanceGroup;  
    }  
  
    
    public void setPerformanceID(String performanceID) {  
        this.performanceID = performanceID;  
    }  
  
    public void setPerformanceName(String performanceName) {  
        this.performanceName = performanceName;  
    }  
  
    public void setPerformanceLeadName(String performanceLeadName) {  
        this.performanceLeadName = performanceLeadName;  
    }  
  
    public void setPerformanceGroup(char performanceGroup) {  
        this.performanceGroup = performanceGroup;  
    }


}
