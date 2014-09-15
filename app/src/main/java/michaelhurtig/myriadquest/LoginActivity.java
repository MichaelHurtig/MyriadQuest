package michaelhurtig.myriadquest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


// Branch Test Code. Making sure there are no changes to the master branch.
public class LoginActivity extends ActionBarActivity {

    EditText username;
    EditText password;

    // A fairly terrible login method... no security
    public void login(View view){
        String logName = username.getText().toString();
        String logPass = password.getText().toString();

        //terrible security. Probably want to create a 'User' class that can handle IDs
        if (logName.equals("lancelot") && logPass.equals("kingArthur") ){
            //Display popup message
            Toast.makeText(this, getString(R.string.login_succesful), Toast.LENGTH_SHORT).show();

            //create and pass a new intent... if we were doing a sort bu alignment,
            //would need to pass class
            Intent intent = new Intent(this, MyListActivity.class);
            startActivity(intent);
        }

        // Check for user name
        else if (!nameCheck(logName)){
            username.setError(getString(R.string.username_error));
        }

        // Check for password
        else if (nameCheck(logName)) {
            if(!passCheck(logPass)){
                password.setError(getString(R.string.password_error));
            }
        }

        // Report login failure
        else{
            Toast.makeText(this, getString(R.string.login_failed) , Toast.LENGTH_SHORT).show();
        }
    }

    //Helper method to handle validation... can be updated easier later.
    private boolean nameCheck(String string){
        if(string.length() == 0 ){
            return false;
        }
        else{
            return true;
        }
    }

    //Helper method to handle validation.
    private boolean passCheck(String string){
        if(string.length() == 0){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
