package pantry.puck.com.pantry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;


public class HomeFridgeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_fridge);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home_fridge, menu);

        MenuItem shareItem = menu.findItem(R.id.action_settings);
        //int groupId, int itemId, int order, CharSequence title
        menu.addSubMenu(0, 0, 1, "Checked Items").setIcon(shareItem.getIcon());
        menu.addSubMenu(0, 1, 1, "Switch Puck").setIcon(shareItem.getIcon());
        menu.addSubMenu(0, 2, 1, "Add Puck").setIcon(shareItem.getIcon());
        menu.addSubMenu(0, 3, 1, "Logout").setIcon(shareItem.getIcon());
        menu.addSubMenu(0, 4, 1, "Remove Puck").setIcon(shareItem.getIcon());

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
             switch (id) {
                 //checked items
                 case 0:
                     Intent checkItems = new Intent(this, CheckedItems.class);
                     startActivity(checkItems);
                     return true;
                 // switch puck
                 case 1:
                     Intent switchPuck = new Intent(this, SwitchPuck.class);
                     startActivity(switchPuck);
                     return true;
                 // add puck
                 case 2:
                     Intent addPuck = new Intent(this, AddPuck.class);
                     startActivity(addPuck);
                     return true;
                 // logout
                 case 3:
                     Intent logout = new Intent(this, Logout.class);
                     startActivity(logout);
                     return true;
                 //remove puck
                 case 4:
                     Intent removePuck = new Intent(this, RemovePuck.class);
                     startActivity(removePuck);
                     return true;
                 default:
                     //idk

             }
            return true;

    }
}
