package defpackage;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import com.datadog.android.core.internal.CoreFeature;

/* JADX INFO: loaded from: classes3.dex */
public final class bu9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TimePicker b;
    public final /* synthetic */ int c;
    public final /* synthetic */ cu9 d;

    public bu9(cu9 cu9Var, int i, TimePicker timePicker, int i2) {
        this.d = cu9Var;
        this.a = i;
        this.b = timePicker;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cu9 cu9Var = this.d;
        View viewFindViewById = cu9Var.findViewById(cu9Var.V.getResources().getIdentifier("input_mode", "id", CoreFeature.DEFAULT_SOURCE_NAME));
        int i = this.c;
        TimePicker timePicker = this.b;
        int i2 = this.a;
        if (viewFindViewById == null || !viewFindViewById.hasFocus()) {
            timePicker.setHour(i);
            timePicker.setMinute(i2);
        } else if (i2 > 5) {
            timePicker.setHour(i);
            timePicker.setMinute(i2);
            View viewFindFocus = timePicker.findFocus();
            if (!(viewFindFocus instanceof EditText)) {
                Log.e("RN-datetimepicker", "could not set selection on time picker, this is a known issue on some Huawei devices");
            } else {
                EditText editText = (EditText) viewFindFocus;
                editText.setSelection(editText.getText().length());
            }
        }
    }
}
