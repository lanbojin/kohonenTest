package kohonenNeuro;

import kohonen.LearningData;
import learningFactorFunctional.ConstantFunctionalFactor;
import network.DefaultNetwork;
import topology.MatrixTopology;

public class KohonenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixTopology topology = new MatrixTopology(5,5);
		
		double[] maxWeight = {200,100};
		
		DefaultNetwork network = new DefaultNetwork(1500,maxWeight,topology);
		
		ConstantFunctionalFactor constantFactor = new ConstantFunctionalFactor(0.8);
		
		LearningData fileData = new LearningData("c:/trainning_data.txt");

	}

}
