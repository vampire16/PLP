import com.bridgelabz.service.ParkingLotSystem;
import com.bridgelabz.utility.Owner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotProblemTestCases {
    ParkingLotSystem parkingLotSystem = null;
    Object car = null;
    Object bike = null;
    Object bus =null;

    @Before
    public void setUp() throws Exception {
        parkingLotSystem = new ParkingLotSystem(2);
        car = new Object();
        bike = new Object();
        bus = new Object();
    }

    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        boolean isParked = parkingLotSystem.park(car);
        Assert.assertTrue(isParked);
    }

    @Test
    public void givenVehicle_WhenUnParked_ShouldReturnTrue() {
        parkingLotSystem.park(car);
        boolean isUnParked = parkingLotSystem.unPark(car);
        Assert.assertTrue(isUnParked);
    }

    @Test
    public void givenVehicle_WhenUnParkedDifferentVehicle_ShouldReturnTrue() {
        parkingLotSystem.park(car);
        boolean isUnParked = parkingLotSystem.unPark(bike);
        Assert.assertFalse(isUnParked);
    }

    @Test
    public void givenVehicles_WhenFull_ShouldInformOwner() {
        parkingLotSystem.park(car);
        parkingLotSystem.park(bike);
        parkingLotSystem.park(bus);
        Assert.assertEquals("Parking lot is full", Owner.parkingLotInfo);
    }
}
