package LKTFastFoods.Services;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iAssessmentService {
	void Add(Assessment assessment);

	void Update(Assessment assessment);

	void Delete(int id);

	Assessment GetOne(int id);

	List<Assessment> GetAll();
}