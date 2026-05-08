package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.ojg;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements View.OnClickListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ b b;

    public f(b bVar, j jVar) {
        this.b = bVar;
        this.a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.b;
        int iK0 = ((LinearLayoutManager) bVar.X.getLayoutManager()).K0() - 1;
        if (iK0 >= 0) {
            Calendar calendarB = ojg.b(this.a.e.a.a);
            calendarB.add(2, iK0);
            bVar.E(new Month(calendarB));
        }
    }
}
