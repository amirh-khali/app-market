package login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appmarket.R;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final EditText editTextname = findViewById(R.id.editTextname);
        final EditText editTextemail = findViewById(R.id.editTextemail);
        final EditText editTextphone = findViewById(R.id.editTextphone);
        final EditText editTextpassword = findViewById(R.id.editTextpassword);
        Button button = findViewById(R.id.submitbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextname.getText().toString().trim();
                String email = editTextemail.getText().toString().trim();
                String phone = editTextphone.getText().toString().trim();
                String password = editTextpassword.getText().toString().trim();
                if (isValidinput(name , email , phone , password)){


                }
            }

            private boolean isValidinput(String name, String email, String phone, String password) {

                if (name.length()<3){
                    Toast.makeText(Signup.this, "name should ne at least 3 caharacters", Toast.LENGTH_SHORT).show();
                    editTextname.requestFocus();
                    return false;
                }

                if  (phone.length() !=11 || !phone.startsWith("09")){
                    Toast.makeText(Signup.this, "wrong phone number", Toast.LENGTH_SHORT).show();
                    editTextphone.requestFocus();
                    return false;
                }
                if (email.lastIndexOf('@')<=0 ||!email.contains(".")
                        ||email.lastIndexOf('.')<email.lastIndexOf('@')
                        ||email.split("@").length>2){
                    Toast.makeText(Signup.this, "wrong email address", Toast.LENGTH_SHORT).show();
                    editTextemail.requestFocus();
                    return false;
                }
                if (password.length()<8 || password.length()>18){
                    Toast.makeText(Signup.this, "wrong password", Toast.LENGTH_SHORT).show();
                    editTextpassword.requestFocus();
                    return false;
                }
                return true;
            }
        });
    }
}
