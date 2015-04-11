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


public class CreateUserFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_create_user, container, false);

        final EditText username = (EditText) rootView.findViewById(R.id.create_username_field);
        final EditText password = (EditText) rootView.findViewById(R.id.create_password_field);
        final EditText confPassword = (EditText) rootView.findViewById(R.id.create_confirm_field);

        final Button createButton = (Button) rootView.findViewById(R.id.create_user_button);
        createButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check username and password stuff
                // If valid open up map activity thing
                /*User user = new User(null, null, username.getText().toString(),
                        password.getText().toString(), confPassword.getText().toString());
                user.createAccount(view.getContext());*/

            }

        });

        return rootView;
    }
}
