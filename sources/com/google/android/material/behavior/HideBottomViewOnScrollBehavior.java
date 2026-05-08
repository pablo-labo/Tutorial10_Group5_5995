package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.be0;
import defpackage.wh6;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int a;
    public int b;
    public ViewPropertyAnimator c;

    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.b = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.b = 1;
            this.c = view.animate().translationY(this.a).setInterpolator(be0.c).setDuration(175L).setListener(new wh6(this));
            return;
        }
        if (i >= 0 || this.b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.b = 2;
        this.c = view.animate().translationY(0.0f).setInterpolator(be0.d).setDuration(225L).setListener(new wh6(this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 2;
    }
}
