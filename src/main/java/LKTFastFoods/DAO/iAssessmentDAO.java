package LKTFastFoods.DAO;

import java.util.List;
import LKTFastFoods.Models.*;

public interface iAssessmentDAO {
	void Add(Assessment assessment);

	void Update(Assessment assessment);

	void Delete(int id);

	Assessment GetOne(int id);

	List<Assessment> GetAll();
}