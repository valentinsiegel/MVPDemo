package fr.siegel.mvpdemo.login;

import android.graphics.Bitmap;
import android.widget.EditText;

import java.util.List;

import fr.siegel.mvpdemo.service.PicassoManager;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;

public class LoginPresenter implements LoginContract.Presenter {

    private final LoginContract.View mView;
    private final PicassoManager mPicassoManager = PicassoManager.getPicassoManager();

    public LoginPresenter(LoginContract.View view) {

        mView = view;
    }

    @Override
    public void signIn() {

        mView.showLoginLoading();
        mPicassoManager.signIn(onSignInCallback);
    }

    @Override
    public void signUp() {

        mView.showLoginLoading();
        mPicassoManager.signUp(onSignUpCallback);
    }

    @Override
    public boolean validateFields(List<EditText> loginFields) {

        return true;
        //check every fields
    }

    @Override
    public void saveAvatar(Bitmap bitmap) {

        //saves avatar on storage
    }

    private Callback<Response> onSignInCallback = new Callback<Response>() {
        @Override
        public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

            mView.finishActivity();
        }

        @Override
        public void onFailure(Call<Response> call, Throwable t) {

            mView.showErrorMessage();
        }
    };

    private Callback<Response> onSignUpCallback = new Callback<Response>() {
        @Override
        public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {

            mView.finishActivity();
        }

        @Override
        public void onFailure(Call<Response> call, Throwable t) {

            mView.showErrorMessage();
        }
    };
}
