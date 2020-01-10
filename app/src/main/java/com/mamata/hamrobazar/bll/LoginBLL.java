package com.mamata.hamrobazar.bll;

import android.widget.Toast;
import com.mamata.hamrobazar.api.UsersAPI;
import com.mamata.hamrobazar.serverresponse.SignUpResponse;
import com.mamata.hamrobazar.url.Url;
import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;


public class LoginBLL {

    boolean isSuccess = false;

    public boolean checkUser(String email, String password) {

        UsersAPI usersAPI = Url.getInstance().create(UsersAPI.class);
        Call<SignUpResponse> usersCall = usersAPI.checkUser(email, password);

        try {
            Response<SignUpResponse> loginResponse = usersCall.execute();
            if (loginResponse.isSuccessful() &&
                    loginResponse.body().getStatus().equals("Login success!")) {

                Url.token += loginResponse.body().getToken();
                // Url.Cookie = imageResponseResponse.headers().get("Set-Cookie");
                isSuccess = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}
