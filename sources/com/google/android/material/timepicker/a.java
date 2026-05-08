package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public a(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        ClockHandView clockHandView = clockFaceView.n0;
        if (clockFaceView.isShown()) {
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockHandView.b) - clockFaceView.u0;
            if (height != clockFaceView.l0) {
                clockFaceView.l0 = height;
                clockFaceView.h();
                clockHandView.b0 = clockFaceView.l0;
                clockHandView.invalidate();
            }
        }
        return true;
    }
}
