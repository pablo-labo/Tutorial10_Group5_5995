package com.facebook.react.views.progressbar;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.indeed.android.jobsearch.R;
import defpackage.m6;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends FrameLayout {
    public Integer a;
    public boolean b;
    public boolean c;
    public double d;
    public ProgressBar e;

    private final void setColor(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.a;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void a() {
        ProgressBar progressBar = this.e;
        if (progressBar == null) {
            m6.m("setStyle() not called");
            return;
        }
        progressBar.setIndeterminate(this.b);
        setColor(progressBar);
        progressBar.setProgress((int) (this.d * 1000.0d));
        progressBar.setVisibility(this.c ? 0 : 4);
    }

    public final boolean getAnimating$ReactAndroid_release() {
        return this.c;
    }

    public final Integer getColor$ReactAndroid_release() {
        return this.a;
    }

    public final boolean getIndeterminate$ReactAndroid_release() {
        return this.b;
    }

    public final double getProgress$ReactAndroid_release() {
        return this.d;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.getClass();
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(R.id.react_test_id);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    public final void setAnimating$ReactAndroid_release(boolean z) {
        this.c = z;
    }

    public final void setColor$ReactAndroid_release(Integer num) {
        this.a = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z) {
        this.b = z;
    }

    public final void setProgress$ReactAndroid_release(double d) {
        this.d = d;
    }

    public final void setStyle$ReactAndroid_release(String str) {
        ReactProgressBarViewManager.INSTANCE.getClass();
        ProgressBar progressBarA = ReactProgressBarViewManager.Companion.a(getContext(), ReactProgressBarViewManager.Companion.b(str));
        progressBarA.setMax(1000);
        this.e = progressBarA;
        removeAllViews();
        addView(this.e, new ViewGroup.LayoutParams(-1, -1));
    }
}
