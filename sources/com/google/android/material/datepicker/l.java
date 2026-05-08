package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.indeed.android.jobsearch.R;
import defpackage.ojg;
import defpackage.yu1;
import defpackage.zu1;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends RecyclerView.e<a> {
    public final b<?> d;

    public static class a extends RecyclerView.b0 {
        public final TextView u;

        public a(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public l(b<?> bVar) {
        this.d = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.d.d.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.b0 b0Var, int i) {
        b<?> bVar = this.d;
        int i2 = bVar.d.a.c + i;
        TextView textView = ((a) b0Var).u;
        String string = textView.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        textView.setContentDescription(String.format(string, Integer.valueOf(i2)));
        zu1 zu1Var = bVar.V;
        Calendar calendarE = ojg.e();
        yu1 yu1Var = calendarE.get(1) == i2 ? zu1Var.f : zu1Var.d;
        Iterator it = bVar.c.A1().iterator();
        while (it.hasNext()) {
            calendarE.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarE.get(1) == i2) {
                yu1Var = zu1Var.e;
            }
        }
        yu1Var.b(textView);
        textView.setOnClickListener(new k(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
