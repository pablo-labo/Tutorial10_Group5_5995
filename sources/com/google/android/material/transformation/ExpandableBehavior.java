package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.epg;
import defpackage.prg;
import defpackage.s35;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public ExpandableBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ((s35) view2).a();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        s35 s35Var;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        if (!view.isLaidOut()) {
            ArrayList arrayListD = coordinatorLayout.d(view);
            int size = arrayListD.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    s35Var = null;
                    break;
                }
                View view2 = (View) arrayListD.get(i2);
                if (b(view, view2)) {
                    s35Var = (s35) view2;
                    break;
                }
                i2++;
            }
            if (s35Var != null) {
                s35Var.a();
                throw null;
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
