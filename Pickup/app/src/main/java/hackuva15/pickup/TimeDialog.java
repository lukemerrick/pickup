package hackuva15.pickup;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Henry on 2/28/2015.
 */
public class TimeDialog extends Dialog implements View.OnClickListener {


    public TimeDialog(Context context) {
        super(context);
    }

    public TimeDialog(Context context, int theme) {
        super(context, theme);
    }

    protected TimeDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dialog_time_date);

        ((Button)findViewById(R.id.event_time_submit)).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        dismiss();
    }
}
