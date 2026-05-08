package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3b;
import defpackage.ojg;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends RecyclerView.l {
    public final Calendar a = ojg.f(null);
    public final Calendar b = ojg.f(null);
    public final /* synthetic */ b c;

    public c(b bVar) {
        this.c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof l) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            l lVar = (l) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            b bVar = this.c;
            for (a3b a3bVar : bVar.c.N0()) {
                F f = a3bVar.a;
                S s = a3bVar.b;
                if (f != 0 && s != 0) {
                    long jLongValue = ((Long) f).longValue();
                    Calendar calendar = this.a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) s).longValue();
                    Calendar calendar2 = this.b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - lVar.d.d.a.c;
                    int i2 = calendar2.get(1) - lVar.d.d.a.c;
                    View viewQ = gridLayoutManager.q(i);
                    View viewQ2 = gridLayoutManager.q(i2);
                    int i3 = gridLayoutManager.F;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View viewQ3 = gridLayoutManager.q(gridLayoutManager.F * i6);
                        if (viewQ3 != null) {
                            int top = viewQ3.getTop() + bVar.V.d.a.top;
                            int bottom = viewQ3.getBottom() - bVar.V.d.a.bottom;
                            canvas.drawRect(i6 == i4 ? (viewQ.getWidth() / 2) + viewQ.getLeft() : 0, top, i6 == i5 ? (viewQ2.getWidth() / 2) + viewQ2.getLeft() : recyclerView.getWidth(), bottom, bVar.V.h);
                        }
                    }
                }
            }
        }
    }
}
