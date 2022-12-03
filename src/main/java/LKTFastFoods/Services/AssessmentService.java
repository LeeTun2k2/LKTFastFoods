package LKTFastFoods.Services;

import java.util.List;

import LKTFastFoods.DAO.*;
import LKTFastFoods.Models.*;

public class AssessmentService implements iAssessmentService {
	private AssessmentDAO assessmentDAO = new AssessmentDAO();

	@Override
	public void Add(Assessment Assessment) {
		assessmentDAO.Add(Assessment);
	}

	@Override
	public void Update(Assessment Assessment) {		
		assessmentDAO.Update(Assessment);
	}

	@Override
	public void Delete(int id) {
		assessmentDAO.Delete(id);
	}

	@Override
	public Assessment GetOne(int id) {
		return assessmentDAO.GetOne(id);
	}

	@Override
	public List<Assessment> GetAll() {
		return assessmentDAO.GetAll();
	}
}