package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.b;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public k(l lVar, int i) {
        this.b = lVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b<?> bVar = this.b.d;
        Month monthC = Month.c(this.a, bVar.e.b);
        CalendarConstraints calendarConstraints = bVar.d;
        Month month = calendarConstraints.b;
        Month month2 = calendarConstraints.a;
        if (monthC.compareTo(month2) < 0) {
            monthC = month2;
        } else if (monthC.compareTo(month) > 0) {
            monthC = month;
        }
        bVar.E(monthC);
        bVar.F(b.d.a);
    }
}
