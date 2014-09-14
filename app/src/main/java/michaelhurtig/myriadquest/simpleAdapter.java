package michaelhurtig.myriadquest;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.graphics.LayerRasterizer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Michael Hurtig on 9/11/2014.
 */
public class simpleAdapter extends ArrayAdapter<Quests> {
    private Activity context;
    private String title;
    private String alignment;
    private String questText;
    private ArrayList<Quests> objects;

    public simpleAdapter(Context context, int id, ArrayList<Quests> objects){
        super(context, id, objects);
        this.objects = objects;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        View var = view;

        if( var == null){
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            var = inflater.inflate(R.layout.rows, null);
        }

        Quests quests = objects.get(position);

        if( quests != null){
            TextView _title = (TextView) var.findViewById(R.id.rowTextView);
            TextView _align = (TextView) var.findViewById(R.id.rowAlignView);
            TextView _quest = (TextView) var.findViewById(R.id.rowQuestView);


            if(_title != null){
                _title.setText(quests.getTitle());
            }

            if(_align != null){
                _align.setText(quests.getAlignment());
            }

            if(_quest != null){
                _quest.setText(quests.getQuestText());
            }

        }

        return var;
    }

}
