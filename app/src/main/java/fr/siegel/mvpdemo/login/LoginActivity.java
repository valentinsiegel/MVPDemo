package fr.siegel.mvpdemo.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.List;

import butterknife.BindViews;
import butterknife.OnClick;
import fr.siegel.mvpdemo.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    private final LoginContract.Presenter mPresenter = new LoginPresenter(this);

    @BindViews({R.id.edit_text_1, R.id.edit_text_2, R.id.edit_text_2}) List<EditText> loginFields;


    @OnClick({R.id.sign_in_button, R.id.sign_up_button})
    public void signIn(View view) {

        if (mPresenter.validateFields(loginFields)) {

            if (view.getId() == R.id.sign_in_button) {
                mPresenter.signIn();
            } else {
                mPresenter.signUp();
            }

            showLoginAnimation(true);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void showLoginAnimation(boolean login) {

        if (login) {
            //sign in animation ...
        } else {
            //sign up animation
        }
    }

    @Override
    public void showLoginLoading() {
        //loading animation
    }

    @Override
    public void showAvatarSelection() {
        //create a dialog to pick avatar
    }

    @Override
    public void setAvatar() {
        //set avatar in the image view
    }

    @Override
    public void finishActivity() {
        //login success activity finish
        finish();
    }

    @Override
    public void showErrorMessage() {

        //show errors
    }
}
