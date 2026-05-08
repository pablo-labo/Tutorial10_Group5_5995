package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.a;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class pqd extends tpc {
    public final nqd V;
    public final ReactContext a;
    public int b;
    public boolean c;
    public float d;
    public int e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqd(mkf mkfVar) {
        super(mkfVar);
        mkfVar.getClass();
        this.a = mkfVar;
        oqd oqdVar = new oqd(this);
        Activity currentActivity = mkfVar.a.getCurrentActivity();
        if (currentActivity == null) {
            r6.g("[RNScreens] Context detached from activity while creating ScreenFooter");
            throw null;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        decorView.getClass();
        epg.q(decorView, oqdVar);
        this.V = new nqd(this);
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        return this.b > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final a getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof a) {
            return (a) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<a> getSheetBehavior() {
        a screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent.getSheetBehavior();
        }
        l5.q("Required value was null.");
        return null;
    }

    public static final int h(pqd pqdVar, float f) {
        a screenParent = pqdVar.getScreenParent();
        if (screenParent != null) {
            return screenParent.getTop();
        }
        return (int) ((f * pqdVar.l(3)) + ((1.0f - f) * pqdVar.l(4)));
    }

    public final ReactContext getReactContext() {
        return this.a;
    }

    public final void i(int i, int i2, int i3, int i4) {
        int iMax = ((i - i2) - i3) - Math.max(i4, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(iMax, 0));
        setBottom(getTop() + reactHeight);
    }

    public final void j(int i) {
        this.b = i;
        int reactHeight = getReactHeight();
        BottomSheetBehavior<a> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            i(i, reactHeight, l(sheetBehavior.G), 0);
        } else {
            l5.q("Required value was null.");
        }
    }

    public final void k(BottomSheetBehavior<a> bottomSheetBehavior) {
        if (this.f) {
            return;
        }
        bottomSheetBehavior.s(this.V);
        this.f = true;
    }

    public final int l(int i) {
        BottomSheetBehavior<a> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null) {
            l5.q("Required value was null.");
            return 0;
        }
        if (i == 3) {
            return sheetBehavior.A();
        }
        if (i == 4) {
            return this.b - (sheetBehavior.e ? -1 : sheetBehavior.d);
        }
        if (i == 5) {
            return this.b;
        }
        if (i == 6) {
            return (int) ((1.0f - sheetBehavior.A) * this.b);
        }
        l5.q("[RNScreens] use of stable-state method for unstable state");
        return 0;
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<a> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            k(sheetBehavior);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<a> sheetBehavior = getSheetBehavior();
        if (sheetBehavior == null || !this.f) {
            return;
        }
        sheetBehavior.B(this.V);
        this.f = false;
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getHasReceivedInitialLayoutFromParent()) {
            int i5 = this.b;
            int i6 = i4 - i2;
            BottomSheetBehavior<a> sheetBehavior = getSheetBehavior();
            if (sheetBehavior != null) {
                i(i5, i6, l(sheetBehavior.G), this.e);
            } else {
                l5.q("Required value was null.");
            }
        }
    }
}
