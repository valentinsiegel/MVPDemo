package fr.siegel.mvpdemo.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class PicassoClient {

    private static PicassoApi picassoApi;

    //singleton
    public static PicassoApi getPicassoApi() {

        if (picassoApi == null) {
            picassoApi = createPicassoApi();
        }

        return picassoApi;
    }

    private static PicassoApi createPicassoApi() {

        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(new OkHttpClient());
        builder.baseUrl("http://www.example.fr/");
        return builder.build().create(PicassoApi.class);
    }

}
