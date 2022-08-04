package TestNGMethods;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BokkingTicket {
@Test(dataProvider = "dataprovider_bokkingTicket")
public void bokkingTicket(String src,String dst)
{
	System.out.println("book ticket from "+src+" to "+dst);
}

@DataProvider
public Object[][] dataprovider_bokkingTicket()
{
	Object[][] objArr = new Object[2][2];
	
	objArr[0][0]="bang";
	objArr[0][1]="goa";
	
	objArr[1][0]="dddd";
	objArr[1][1]="ffff";
	return objArr;
}
}
