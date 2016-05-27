package fr.siegel.mvpdemo.login;

import android.graphics.Bitmap;
import android.widget.EditText;

import java.util.List;

public class LoginContract {

    interface View {

        void showLoginAnimation(boolean login);

        void showLoginLoading();

        void showAvatarSelection();

        void setAvatar();

        void finishActivity();

        void showErrorMessage();

    }

    interface Presenter {

        void signIn();

        void signUp();

        boolean validateFields(List<EditText> loginFields);

        void saveAvatar(Bitmap bitmap);

    }

}
