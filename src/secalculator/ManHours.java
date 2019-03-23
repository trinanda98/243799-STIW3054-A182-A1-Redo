package secalculator;

public class ManHours extends Manager{
	protected static double ManHoursC(double useCasePoints, double count) {
		double ucp = useCasePoints;
		double er;
                if(count <= 2){
                    er = 20;
                }else{
                    er = 28;
                }
		double manHours = ucp * er;
		return manHours;
		
	}


}
