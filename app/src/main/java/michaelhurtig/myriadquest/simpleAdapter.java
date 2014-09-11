package michaelhurtig.myriadquest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Michael Hurtig on 9/11/2014.
 */
public class simpleAdapter extends ArrayAdapter<Quests> {
    private final Activity context;
    private final String title;
    private final String alignment;
    private final String questText;

    public simpleAdapter(Activity context, Quests quest){
        super(context, R.layout.rows);
        this.context = context;
        this.title = quest.Title();
        this.alignment = quest.Alignment();
        this.questText = quest.QuestText();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.rows, null, true);
        TextView rTitle = (TextView)rowView.findViewById(R.id.rowTextView);
        //implement other information spots as soon as this is working. Edit the rows.xml, too.
        rTitle.setText(this.title);
        return rowView;
    }

}
