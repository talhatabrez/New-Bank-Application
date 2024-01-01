package src;

public interface IBaseRate {

    //methods to return base rate
    default double getBaseRate(){
        return 2.5;
    }
    
} 