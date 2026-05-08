package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.c0h;
import defpackage.gb1;
import defpackage.jle;

/* JADX INFO: loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final c0h h;

    public BaseTransientBottomBar$Behavior() {
        c0h c0hVar = new c0h(13);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.c = 0;
        this.h = c0hVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (jle.b == null) {
                    jle.b = new jle();
                }
                synchronized (jle.b.a) {
                }
            }
        } else if (coordinatorLayout.l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (jle.b == null) {
                jle.b = new jle();
            }
            synchronized (jle.b.a) {
            }
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view) {
        this.h.getClass();
        return view instanceof gb1;
    }
}
