/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question , Assignment 
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 
public class RentalVehicle {
    private int CarRate,CarkmRate,TruckRate,TruckkmRate;
    private int HeavyRate,HeavykmRate,Ccount,Tcount,Hcount;
    
    int getNumberOfCars(){
        return Ccount;
    }
    
    int getNumberOfTrucks(){
        return Tcount;
    }
    
    int getNumberOfHeavyTrucks(){
        return Hcount;
    }
    
    int getCarRate(int choice){
        if (choice == 1)
            return CarRate;
        else
            return CarkmRate;
    }
    
    int getTruckRate(int choice){
        if (choice == 1)
            return TruckRate;
        else
            return TruckkmRate;
    }
    
    int getHeavyTruckRate(int choice){
        if (choice == 1)
            return HeavyRate;
        else
            return HeavykmRate;
    }
    
    void setCarRate(int carDayRate,int carKilometerRate){
        CarRate = carDayRate;
        CarkmRate = carKilometerRate;
    }
    
    void setTruckRate(int truckDayRate,int truckKilometerRate){
        TruckRate = truckDayRate;
        TruckkmRate = truckKilometerRate;
    }
    
     void setHeavyTruckRate(int heavytruckDayRate,int heavytruckKilometerRate){
        HeavyRate = heavytruckDayRate;
        HeavykmRate = heavytruckKilometerRate;
    }
    
    void setVehicleCount(int carCount,int truckCount,int heavyTruckCount){
        Ccount = carCount;
        Tcount = truckCount;
        Hcount = heavyTruckCount;
    }
    
    int truckCost(int days,int kilometers){
        return ((TruckRate * days) + (TruckkmRate*kilometers));
        
    }
    
    int heavyTruckCost(int days,int kilometers){
        return ((HeavyRate * days) + (HeavykmRate*kilometers));
        
    }
    
    int carCost(int days,int kilometers){
        return ((CarRate * days) + (CarkmRate*kilometers));
        
    }
    
    public RentalVehicle(int carDayRate,int carKilometerRate,int truckDayRate,int truckKilometerRate, int heavyTruckDayRate,int heavyTruckKilometerRate,int carCount,int truckCount,int heavyTruckCount){
        CarRate = carDayRate;
        CarkmRate = carKilometerRate;
        TruckRate = truckDayRate;
        TruckkmRate = truckKilometerRate;
        HeavyRate = heavyTruckDayRate;
        HeavykmRate = heavyTruckKilometerRate;
        Ccount = carCount;
        Tcount = truckCount;
        Hcount = heavyTruckCount;
    }

}
