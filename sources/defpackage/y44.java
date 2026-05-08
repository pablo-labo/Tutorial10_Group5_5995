package defpackage;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class y44 extends ViewGroup implements zjc, rnc {
    public final d54 a;

    public y44(mkf mkfVar, float f) {
        mkfVar.getClass();
        d54 d54Var = new d54();
        d54Var.a = null;
        super(mkfVar);
        this.a = d54Var;
        d54Var.a = new c54(this);
        setBackgroundColor(-16777216);
        setAlpha(f);
    }

    public final boolean getBlockGestures$react_native_screens_release() {
        return !(Math.abs(getAlpha() - 0.0f) <= 1.0E-4f);
    }

    @Override // defpackage.rnc
    public qeb getPointerEvents() {
        return this.a.getPointerEvents();
    }

    @Override // defpackage.zjc
    public final boolean interceptsTouchEvent(float f, float f2) {
        return getBlockGestures$react_native_screens_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBlockGestures$react_native_screens_release()) {
            callOnClick();
        }
        return getBlockGestures$react_native_screens_release();
    }

    @Override // defpackage.yjc
    public final int reactTagForTouch(float f, float f2) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }
}
