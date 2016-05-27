package fr.siegel.mvpdemo.api;

import okhttp3.Response;
import retrofit2.Call;

public interface PicassoApi {

    Call<Response> signIn();

    Call<Response> signUp();

}
