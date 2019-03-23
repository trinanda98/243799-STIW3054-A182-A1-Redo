package secalculator;

public class SoftwareSize extends Manager{
	protected static double SoftwareSizeC(double totalTFactor, double uucp) {
		double tFactor = totalTFactor;
		double useCase = uucp;
		double tcf = (0.01 * tFactor) + 0.6;
		double softwareSize = useCase * tcf;
		return softwareSize;
		
	}
	

}
