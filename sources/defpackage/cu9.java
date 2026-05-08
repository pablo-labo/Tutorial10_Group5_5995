package defpackage;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import androidx.fragment.app.g;
import com.datadog.android.core.internal.CoreFeature;
import com.indeed.android.jobsearch.R;
import com.reactcommunity.rndatetimepicker.TimePickerModule;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class cu9 extends TimePickerDialog {
    public static final /* synthetic */ int W = 0;
    public final Context V;
    public TimePicker a;
    public final int b;
    public final mhc c;
    public final TimePickerDialog.OnTimeSetListener d;
    public final Handler e;
    public bu9 f;

    public cu9(g gVar, TimePickerModule.a aVar, int i, int i2, int i3, boolean z, mhc mhcVar, int i4) {
        super(gVar, R.style.SpinnerTimePickerDialog, aVar, i, i2, z);
        this.e = new Handler();
        this.b = i3;
        this.d = aVar;
        this.c = mhcVar;
        this.V = gVar;
    }

    public final boolean a() {
        return this.c == mhc.a;
    }

    public final int b(int i) {
        int i2 = this.b;
        int iRound = Math.round(i / i2) * i2;
        return iRound == 60 ? iRound - i2 : iRound;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = this.V;
        TimePicker timePicker = (TimePicker) findViewById(context.getResources().getIdentifier("timePicker", "id", CoreFeature.DEFAULT_SOURCE_NAME));
        this.a = timePicker;
        int i = this.b;
        if (i != 1) {
            if (timePicker == null) {
                Log.e("RN-datetimepicker", "time picker was null");
                return;
            }
            int iIntValue = timePicker.getCurrentMinute().intValue();
            if (!a()) {
                this.a.setCurrentMinute(Integer.valueOf(b(iIntValue)));
                return;
            }
            NumberPicker numberPicker = (NumberPicker) findViewById(context.getResources().getIdentifier("minute", "id", CoreFeature.DEFAULT_SOURCE_NAME));
            numberPicker.setMinValue(0);
            int i2 = 60 / i;
            numberPicker.setMaxValue(i2 - 1);
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < 60; i3 += i) {
                arrayList.add(String.format("%02d", Integer.valueOf(i3)));
            }
            numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
            this.a.setCurrentMinute(Integer.valueOf(b(iIntValue) / i));
        }
    }

    @Override // android.app.TimePickerDialog, android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        boolean z = i2 != 1 || a();
        TimePicker timePicker = this.a;
        if (timePicker == null || i != -1 || !z) {
            super.onClick(dialogInterface, i);
            return;
        }
        timePicker.clearFocus();
        int iIntValue = this.a.getCurrentHour().intValue();
        int iIntValue2 = this.a.getCurrentMinute().intValue();
        if (a()) {
            iIntValue2 *= i2;
        }
        if (i2 != 1) {
            iIntValue2 = b(iIntValue2);
        }
        TimePickerDialog.OnTimeSetListener onTimeSetListener = this.d;
        if (onTimeSetListener != null) {
            onTimeSetListener.onTimeSet(this.a, iIntValue, iIntValue2);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.e.removeCallbacks(this.f);
        super.onDetachedFromWindow();
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
        boolean zA = a();
        int i3 = this.b;
        int i4 = zA ? i2 * i3 : i2;
        bu9 bu9Var = this.f;
        Handler handler = this.e;
        handler.removeCallbacks(bu9Var);
        if (!a()) {
            if (a()) {
                b0.o("minutesNeedCorrection is not intended to be used with spinner, spinner won't allow picking invalid values");
                return;
            }
            if (i3 != 1 && i4 != b(i4)) {
                int iB = b(i4);
                if (a()) {
                    b0.o("spinner never needs to be corrected because wrong values are not offered to user (both in scrolling and textInput mode)!");
                    return;
                }
                bu9 bu9Var2 = new bu9(this, iB, timePicker, i);
                this.f = bu9Var2;
                handler.postDelayed(bu9Var2, 500L);
                return;
            }
        }
        super.onTimeChanged(timePicker, i, i2);
    }

    @Override // android.app.TimePickerDialog
    public final void updateTime(int i, int i2) {
        int i3 = this.b;
        if (i3 == 1) {
            super.updateTime(i, i2);
            return;
        }
        if (!a()) {
            super.updateTime(i, b(i2));
            return;
        }
        int iIntValue = this.a.getCurrentMinute().intValue();
        if (a()) {
            iIntValue *= i3;
        }
        super.updateTime(i, b(iIntValue) / i3);
    }

    public cu9(g gVar, TimePickerModule.a aVar, int i, int i2, int i3, boolean z, mhc mhcVar) {
        super(gVar, aVar, i, i2, z);
        this.e = new Handler();
        this.b = i3;
        this.d = aVar;
        this.c = mhcVar;
        this.V = gVar;
    }
}
