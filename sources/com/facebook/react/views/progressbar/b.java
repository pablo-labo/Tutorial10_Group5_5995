package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.yoga.YogaNodeJNIBase;
import defpackage.hh1;
import defpackage.l6h;
import defpackage.m6h;
import defpackage.mkf;
import defpackage.snc;
import defpackage.wtf;
import defpackage.xm8;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends xm8 implements l6h {
    public final SparseIntArray o0 = new SparseIntArray();
    public final SparseIntArray p0 = new SparseIntArray();
    public final HashSet q0 = new HashSet();
    public String r0;

    public b() {
        this.j0.Y(this);
        this.r0 = ReactProgressBarViewManager.DEFAULT_STYLE;
    }

    @Override // defpackage.l6h
    public final long N(YogaNodeJNIBase yogaNodeJNIBase, float f, m6h m6hVar, float f2, m6h m6hVar2) {
        ReactProgressBarViewManager.Companion aVar = ReactProgressBarViewManager.INSTANCE;
        String str = this.r0;
        aVar.getClass();
        int iB = ReactProgressBarViewManager.Companion.b(str);
        Integer numValueOf = Integer.valueOf(iB);
        HashSet hashSet = this.q0;
        boolean zContains = hashSet.contains(numValueOf);
        SparseIntArray sparseIntArray = this.p0;
        SparseIntArray sparseIntArray2 = this.o0;
        if (!zContains) {
            mkf mkfVar = this.d;
            hh1.n(mkfVar);
            ProgressBar progressBarA = ReactProgressBarViewManager.Companion.a(mkfVar, iB);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            sparseIntArray2.put(iB, progressBarA.getMeasuredHeight());
            sparseIntArray.put(iB, progressBarA.getMeasuredWidth());
            hashSet.add(Integer.valueOf(iB));
        }
        return wtf.e(sparseIntArray.get(iB), sparseIntArray2.get(iB));
    }

    @snc(name = ReactProgressBarViewManager.PROP_STYLE)
    public final void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.r0 = str;
    }
}
