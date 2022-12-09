package LKTFastFoods.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import LKTFastFoods.Connections.DBConnection;
import LKTFastFoods.Models.*;

public class AssessmentDAO extends DBConnection implements iAssessmentDAO{
	@Override
	public void Add(Assessment assessment) {
<<<<<<< HEAD
		String sql = "exec AddAssessment ?, ?, ? ";
=======
		String sql = "exec AddAssessment ? ? ?";
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, assessment.getOrder_id());
<<<<<<< HEAD
			ps.setInt(2, assessment.getStar());
=======
			ps.setFloat(2, assessment.getStar());
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
			ps.setNString(3, assessment.getComment());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Assessment assessment) {
<<<<<<< HEAD
		String sql = "exec UpdateAssessment ?, ?, ?, ?";
=======
		String sql = "exec UpdateAssessment ? ? ? ?";
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, assessment.getId());
			ps.setInt(2, assessment.getOrder_id());
			ps.setFloat(3, assessment.getStar());
			ps.setNString(4, assessment.getComment());
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(int id) {
		String sql = "exec DeleteAssessment ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Assessment GetOne(int id) {
		String sql = "exec GetOneAssessment ?";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Assessment assessment = new Assessment(
						id,
						rs.getInt("Order_ID"),
<<<<<<< HEAD
						rs.getInt("Stars"),
=======
						rs.getFloat("Stars"),
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
						rs.getNString("Comment")	
				);
				return assessment;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Assessment> GetAll() {
		String sql = "exec GetAllAssessments";
		try {
			Connection con = super.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Assessment> assessments = new ArrayList<Assessment>();
			while (rs.next()) {
				Assessment assessment = new Assessment(
						rs.getInt("ID"),
						rs.getInt("Order_ID"),
<<<<<<< HEAD
						rs.getInt("Stars"),
=======
						rs.getFloat("Stars"),
>>>>>>> 1877eec9609203ec346f68b8e14f2420cdf01c4b
						rs.getNString("Comment")	
				);
				assessments.add(assessment);
			}
			return assessments;
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
