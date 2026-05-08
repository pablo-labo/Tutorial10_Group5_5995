package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.ojg;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements View.OnClickListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ b b;

    public e(b bVar, j jVar) {
        this.b = bVar;
        this.a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.b;
        int iJ0 = ((LinearLayoutManager) bVar.X.getLayoutManager()).J0() + 1;
        if (iJ0 < bVar.X.getAdapter().c()) {
            Calendar calendarB = ojg.b(this.a.e.a.a);
            calendarB.add(2, iJ0);
            bVar.E(new Month(calendarB));
        }
    }
}
