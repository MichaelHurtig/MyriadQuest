package michaelhurtig.myriadquest;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
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

        quests.add(new Quests("Bug Hunt!","NG","Looking for individuals who want to " +
                "track down and destroy any and all bugs. Prospective must have a " +
                "flexible attitude and not want to take advantage of others to qualify. " +
                "See Magus Brindlehauf for details!"));
        quests.add(new Quests("Imperium Romanum","LN","Offendicula de Imperium Romanorum. " +
                "Bene mereretur imperium merces et servite salis, et sors in civitate Roman. " +
                "Nam et de gloria Romae !"));
        quests.add(new Quests("Rat Season", "NN", "Looking for some person to come clear out" +
                "my cellar of the darned varmints. Paying in 'taters."));
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
//        Toast.makeText(this, String.valueOf(id) , Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, QuestDisplayActivity.class );
        intent.putExtra("Quest", quests.get(position));

        startActivity(intent);
    }
}
