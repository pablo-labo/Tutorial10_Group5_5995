package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.ze9;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ze9 a;
    public final /* synthetic */ AppBarLayout b;

    public a(AppBarLayout appBarLayout, ze9 ze9Var) {
        this.b = appBarLayout;
        this.a = ze9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.j(fFloatValue);
        AppBarLayout appBarLayout = this.b;
        Drawable drawable = appBarLayout.i0;
        if (drawable instanceof ze9) {
            ((ze9) drawable).j(fFloatValue);
        }
        Iterator it = appBarLayout.g0.iterator();
        while (it.hasNext()) {
            ((AppBarLayout.d) it.next()).a();
        }
    }
}
