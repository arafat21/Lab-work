package activity.selection.problem;

import java.util.ArrayList;

public class ActivityScheduler {
	public static void activityProcess(ArrayList<ActivitySelectionProblem> activities) {
		int prev = -1;
		for( ActivitySelectionProblem act : activities) {
			if(act.getStart() > prev) {
				System.out.println(act.getActivity());
				prev = act.getStart();
			}
		}
	}
}
