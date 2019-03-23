package secalculator;

public class Manager implements Calculation {
	

	@Override
	public double UUCP(double a, double b) {
		// TODO Auto-generated method stub
		return new UUCP().UUCPC(a, b);
		
	}

	@Override
	public double SoftwareSize(double a, double b) {
		// TODO Auto-generated method stub
		return new SoftwareSize().SoftwareSizeC(a, b);
		
	}

	@Override
	public double UCP(double a, double b) {
		// TODO Auto-generated method stub
		return new UCP().UseCasePointsC(a, b);
		
	}

	@Override
	public double ManHours(double a, double b) {
		// TODO Auto-generated method stub
		return new ManHours().ManHoursC(a, b);
		
	}

}
