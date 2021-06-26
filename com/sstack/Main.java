package com.sstack;

import com.sstack.Driver.IDriverService;
import com.sstack.Driver.DriverServiceImpl;
import com.sstack.ParkingService.IParkingService;
import com.sstack.ParkingService.ParkingServiceImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // injecting Driver & Parking Service
        IDriverService driverService = DriverServiceImpl.getInstance();
        IParkingService parkingService = ParkingServiceImpl.getInstance();

        try {
            // read the input file
            URL url = Main.class.getResource("input.txt");
            File myObj = new File(url.getPath());
            Scanner myReader = new Scanner(myObj);

            //Read the file until it has a next line
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                // split string by space
                String[] command = data.trim().split("\\s+"); 

                Integer capacity, driverAge, slot;
                String vehicleRegNumber;
                
                //different cases to execute different commands
                switch(command[0]) {
                    case "Create_parking_lot":
                        capacity = Integer.parseInt(command[1]);
                        parkingService.setParkingService(capacity);
                        break;
                    case "Park":
                        vehicleRegNumber = command[1];
                        driverAge = Integer.parseInt(command[3]);
                        parkingService.park(vehicleRegNumber,driverAge);
                        break;
                    case "Slot_numbers_for_driver_of_age":
                        driverAge = Integer.parseInt(command[1]);
                        parkingService.printSlotNumber(driverAge);
                        break;
                    case "Slot_number_for_car_with_number":
                        vehicleRegNumber = command[1];
                        parkingService.printSlotNumber(vehicleRegNumber);
                        break;
                    case "Leave":
                        slot = Integer.parseInt(command[1]);
                        parkingService.leave(slot);
                        break;
                    case "Vehicle_registration_number_for_driver_of_age":
                        driverAge = Integer.parseInt(command[1]);
                        driverService.printAllVehicles(driverAge);
                        break;
                    default:
                        System.out.println("INVALID COMMAND!");
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not found!!.");
            e.printStackTrace();
        }
    }
}

