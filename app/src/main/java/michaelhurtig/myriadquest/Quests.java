package michaelhurtig.myriadquest;

import java.io.Serializable;

/**
 * Created by Michael Hurtig on 9/11/2014.
 */
public class Quests implements Serializable {

    private String title;
    private String alignment;
    private String questText;

    private enum alignments { LG, LN, LE, NG, NN, NE, CG, CN, CE }

    public Quests(String title, String alignment, String questText){
        this.setTitle(title);
        this.setAlignment(alignment);
        this.setQuestText(questText);
    }

    public String getTitle(){
        return title;
    }

    public String getAlignment(){
        return alignment;
    }

    public String getQuestText(){
        return questText;
    }

    public boolean setTitle(String string){
        try{
            this.title = string;
            return true;
        }
        catch (Exception exc ){
            return false;
        }

    }

    public boolean setAlignment(String string){
        try{
            alignments al = alignments.valueOf(string);
            switch (al){
                case LG: this.alignment = string; break;
                case LN: this.alignment = string; break;
                case LE: this.alignment = string; break;
                case NG: this.alignment = string; break;
                case NN: this.alignment = string; break;
                case NE: this.alignment = string; break;
                case CG: this.alignment = string; break;
                case CN: this.alignment = string; break;
                case CE: this.alignment = string; break;
                default: return false;
            }
            return true;
        }
        catch (Exception exc){
            return false;
        }
    }

    public boolean setQuestText(String string){
        try{
            this.questText = string;
            return true;
        }
        catch(Exception exc){
            return false;
        }
    }


}
