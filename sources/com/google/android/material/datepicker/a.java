package com.google.android.material.datepicker;

import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.indeed.android.jobsearch.R;
import defpackage.fg3;
import defpackage.gg3;
import defpackage.gkf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends gkf {
    public final TextInputLayout a;
    public final SimpleDateFormat b;
    public final CalendarConstraints c;
    public final String d;
    public final fg3 e;
    public gg3 f;

    public a(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.b = simpleDateFormat;
        this.a = textInputLayout;
        this.c = calendarConstraints;
        this.d = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.e = new fg3(this, str);
    }

    public abstract void a();

    public abstract void b(Long l);

    @Override // defpackage.gkf, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CalendarConstraints calendarConstraints = this.c;
        TextInputLayout textInputLayout = this.a;
        fg3 fg3Var = this.e;
        textInputLayout.removeCallbacks(fg3Var);
        textInputLayout.removeCallbacks(this.f);
        textInputLayout.setError(null);
        b(null);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        try {
            Date date = this.b.parse(charSequence.toString());
            textInputLayout.setError(null);
            long time = date.getTime();
            if (calendarConstraints.c.h0(time) && calendarConstraints.a.h(1) <= time) {
                Month month = calendarConstraints.b;
                if (time <= month.h(month.e)) {
                    b(Long.valueOf(date.getTime()));
                    return;
                }
            }
            gg3 gg3Var = new gg3(this, time);
            this.f = gg3Var;
            textInputLayout.postDelayed(gg3Var, 1000L);
        } catch (ParseException unused) {
            textInputLayout.postDelayed(fg3Var, 1000L);
        }
    }
}
