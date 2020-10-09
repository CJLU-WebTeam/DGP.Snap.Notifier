package dgp.snap.notifier;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;


public class NoteView extends RelativeLayout {

    public NoteView(Context context) {
        this(context,null);
    }

    public NoteView(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public NoteView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //View view = (View) View.inflate(context, R.layout.note_view, this);
        LayoutInflater.from(context).inflate(R.layout.note_view, this, true);

        System.out.println("load");
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }


}
