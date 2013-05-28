package com.alorma.lib.lipsum;

import android.os.AsyncTask;
import android.text.Html;

/**
 * This class allows devs to use loremipsum generator as web developer
 * to fill textView, editText, and similiar view controls that contains text.
 *
 * Created by alorma on 23/05/13.
 */
public class LipsumAsync extends AsyncTask<Void, Void, String> {

    private LipsumType type;
    private int amount;
    private boolean startWithLipsum;
    private LipsumListener lipsumListener;

    /**
    * Constructor of asyncTask.
    *
    * @param LipsumType type: paras (paragraphs), words, bytes.
    * @param int amount: number of words, params or bytes to generate.
    * @param boolean startWithLipsum: allow dev to decide if wants text start
    *        with "Loremipsum dolor est"
    */
    public LipsumAsync(LipsumType type, int amount, boolean startWithLipsum) {
        this.type = type;
        this.amount = amount;
        this.startWithLipsum = startWithLipsum;
    }

    @Override
    protected String doInBackground(Void... voids) {

        LoremIpsum4J lipsum = new LoremIpsum4J();
        lipsum.setStartWithLoremIpsum(startWithLipsum);
        String[] paragrs = lipsum.getLoremIpsum(type.toString(), amount);

        StringBuffer buf = new StringBuffer();
        if (paragrs != null) {
            for(String par : paragrs) {
                buf.append(par);
                buf.append("<br />");
            }
        }

        return buf.toString();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        if (lipsumListener != null) {
            lipsumListener.onLipsumLoaded(Html.fromHtml(s));
        }
    }

    public LipsumListener getLipsumListener() {
        return lipsumListener;
    }

    /**
    * Callback to receive lorem ipsum text
    */
    public void setLipsumListener(LipsumListener lipsumListener) {
        this.lipsumListener = lipsumListener;
    }
}
