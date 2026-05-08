package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.ojg;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends RecyclerView.r {
    public final /* synthetic */ j a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ b c;

    public d(b bVar, j jVar, MaterialButton materialButton) {
        this.c = bVar;
        this.a = jVar;
        this.b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void b(RecyclerView recyclerView, int i, int i2) {
        j jVar = this.a;
        CalendarConstraints calendarConstraints = jVar.e;
        b bVar = this.c;
        RecyclerView recyclerView2 = bVar.X;
        int iJ0 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).J0() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).K0();
        Calendar calendarB = ojg.b(calendarConstraints.a.a);
        calendarB.add(2, iJ0);
        bVar.e = new Month(calendarB);
        Calendar calendarB2 = ojg.b(calendarConstraints.a.a);
        calendarB2.add(2, iJ0);
        this.b.setText(new Month(calendarB2).m(jVar.d));
    }
}
