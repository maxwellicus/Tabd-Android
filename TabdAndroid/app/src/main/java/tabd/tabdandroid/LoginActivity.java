package tabd.tabdandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "tabdAndroid.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportFragmentManager().beginTransaction().add(R.id.login_register_container,new LoginFragment()).commit();
    }

    public void sendLogin(View view) {
        Intent loginIntent = new Intent(this, HomeActivity.class);
        EditText usernameEdittext = (EditText) findViewById(R.id.username_edittext);
        String usernameString = usernameEdittext.getText().toString();
        loginIntent.putExtra(EXTRA_MESSAGE, usernameString);
        EditText passwordEdittext = (EditText) findViewById(R.id.password_edittext);
        String passwordString = passwordEdittext.getText().toString();
        loginIntent.putExtra(EXTRA_MESSAGE, passwordString);
        startActivity(loginIntent);
    }

    public void goToRegister(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.login_register_container,new RegisterFragment()).commit();
    }

    public void goToLogin(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.login_register_container,new LoginFragment()).commit();
    }
}