package com.java.bodysignal;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.auth.FacebookAuthProvider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class LoginActivity extends AppCompatActivity {

    LoginButton SigninFacebookButton;
    CallbackManager FacebookCallbackManager;

    public void onClick(View view) {
        FacebookCallbackManager = CallbackManager.Factory.create();


        SigninFacebookButton = (LoginButton) findViewById(R.id.login_button);
        SigninFacebookButton.setReadPermissions("email");
        // If using in a fragment


        // Callback registration
        SigninFacebookButton.registerCallback(FacebookCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
            }

            @Override
            public void onCancel() {
                // App code
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        FacebookCallbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
}