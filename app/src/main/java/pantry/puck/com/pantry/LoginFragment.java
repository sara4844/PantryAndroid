package pantry.puck.com.pantry;

/**
 * Created by Sa on 4/11/2015.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_login, container, false);
       /* User user = User.getSavedUser(rootView.getContext());
        if(user != null){
            User.checkLoggedIn(rootView.getContext());
        }*/
        //otherwise we make them do so
        super.onCreate(savedInstanceState);

        final EditText username = (EditText) rootView.findViewById(R.id.username_field);
        final EditText password = (EditText) rootView.findViewById(R.id.password_field);

        final Button loginButton = (Button) rootView.findViewById(R.id.login_button);
        loginButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check username and password stuff
                // If valid open up map activity thing
               /* User user = new User(null, null, username.getText().toString(),
                        password.getText().toString(), password.getText().toString());
                user.login(view.getContext());*/
            }

        });
        return rootView;
    }
}

