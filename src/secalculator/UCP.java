package secalculator;

public class UCP extends Manager{
	protected static double UseCasePointsC(double totalEFactor, double softwareSize) {
		double tEFactor = totalEFactor;
		double szuc = softwareSize;
		double eFactor = (-0.03 * tEFactor) + 1.4;
		double useCasePoints = eFactor * szuc;
		return useCasePoints;
		
	}

}
