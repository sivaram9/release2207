package Port;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;

public class PortInt {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	public String getFlow() {
		String flowType = "Vlanbased";
		String constructedFlowName = null;
		String cvlan = null;
		HashMap HM = new HashMap();
		HashMap flowResultsHM = new HashMap();
		HM.put("cvlan", cvlan);

		flowResultsHM.put("flowType", flowType);
		if ((String) HM.get("cvlan") != null) {
			HM.put("valnanotbased", "SivARam");
			System.out.println("If block");
		} else {
			HM.put("Vlanbased", "Krishna");
			System.out.println("else block");
		}
		System.out.println(HM.get("Vlanbased"));

		constructedFlowName = (String) HM.get(flowResultsHM.get("flowType"));
		System.out.println("constructedFlowName    " + constructedFlowName);
		return constructedFlowName;
	}

		public static void main(String[] args) {
		
		
	}

}
