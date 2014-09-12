package michaelhurtig.myriadquest;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import static michaelhurtig.myriadquest.R.layout.activity_list;


public class MyListActivity extends ListActivity implements AdapterView.OnItemClickListener {

    private ArrayList<Quests> quests = new ArrayList<Quests>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView)findViewById(android.R.id.list);
        listView.setOnItemClickListener(this);

/*        String[][] values = new String[][] {
                {"item", "second"},
                {"item2", "test"},
                {"item3", "test"}
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.rows, values[0]);*/

        quests.add(new Quests("Test","NG","Test Quest Text"));
        quests.add(new Quests("Test 2","LG","Test 2 Quest Text"));
        simpleAdapter adapter = new simpleAdapter(this, R.layout.rows, quests);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list, menu);
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


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, String.valueOf(id) , Toast.LENGTH_SHORT).show();
    }
}
