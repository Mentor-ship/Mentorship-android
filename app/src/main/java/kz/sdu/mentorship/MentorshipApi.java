package kz.sdu.mentorship;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MentorshipApi {
    @GET("/vacancies")
    Call<List<Vacancy>> getAllVacancies();

    @GET("/employers")
    Call<List<Employer>> getAllEmployers();


    @POST("/vacancies/getCompanyName")
    Call<CompanyName> getCompanyName(@Body EmployerId employerId);
}
