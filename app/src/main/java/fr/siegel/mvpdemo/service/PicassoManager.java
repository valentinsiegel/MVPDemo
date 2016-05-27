package fr.siegel.mvpdemo.service;

import fr.siegel.mvpdemo.api.PicassoApi;
import fr.siegel.mvpdemo.api.PicassoClient;
import okhttp3.Response;
import retrofit2.Callback;

public class PicassoManager {

    private static PicassoManager picassoManager;
    private static PicassoApi picassoApi;

    public static PicassoManager getPicassoManager() {

        if (picassoManager == null) {
            picassoManager = PicassoManager.createPicassoManager();
        }
        return picassoManager;
    }

    //private constructor
    private static PicassoManager createPicassoManager() {

        return new PicassoManager();
    }

    public PicassoManager() {

        picassoApi = PicassoClient.getPicassoApi();
    }

    public void signIn(Callback<Response> responseCallback) {

        picassoApi.signUp().enqueue(responseCallback);
    }

    public void signUp(Callback<Response> responseCallback) {

        picassoApi.signUp().enqueue(responseCallback);
    }

}
