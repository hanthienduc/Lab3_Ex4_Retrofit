package example.com.android.lab3_ex4_retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Han on 27/12/2016.
 */

public interface RequestInterface {
    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
