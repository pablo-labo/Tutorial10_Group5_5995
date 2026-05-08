package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.vz9;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rz9 extends ConstraintLayout implements efa {
    public static final /* synthetic */ int w0 = 0;
    public float k0;
    public int l0;
    public float m0;
    public float n0;
    public long o0;
    public c p0;
    public boolean q0;
    public int r0;
    public float s0;
    public boolean t0;
    public boolean u0;
    public d v0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class b {
        public float a;
        public float b;
        public int c;
        public int d;

        public final void a() {
            throw null;
        }
    }

    public interface c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final /* synthetic */ d[] c;

        /* JADX INFO: Fake field, exist only in values array */
        d EF0;

        static {
            d dVar = new d("UNDEFINED", 0);
            d dVar2 = new d("SETUP", 1);
            d dVar3 = new d("MOVING", 2);
            a = dVar3;
            d dVar4 = new d("FINISHED", 3);
            b = dVar4;
            c = new d[]{dVar, dVar2, dVar3, dVar4};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) c.clone();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        if (this.o0 == -1) {
            this.o0 = getNanoTime();
        }
        float f = this.n0;
        if (f > 0.0f && f < 1.0f) {
            this.l0 = -1;
        }
        boolean z2 = false;
        if (this.q0) {
            float fSignum = Math.signum(1.0f - f);
            long nanoTime = getNanoTime();
            float f2 = (((nanoTime - this.o0) * fSignum) * 1.0E-9f) / 0.0f;
            float f3 = this.n0 + f2;
            if ((fSignum > 0.0f && f3 >= 1.0f) || (fSignum <= 0.0f && f3 <= 1.0f)) {
                f3 = 1.0f;
            }
            this.n0 = f3;
            this.m0 = f3;
            this.o0 = nanoTime;
            this.k0 = f2;
            if (Math.abs(f2) > 1.0E-5f) {
                setState(d.a);
            }
            if ((fSignum > 0.0f && f3 >= 1.0f) || (fSignum <= 0.0f && f3 <= 1.0f)) {
                f3 = 1.0f;
            }
            d dVar = d.b;
            if (f3 >= 1.0f || f3 <= 0.0f) {
                setState(dVar);
            }
            int childCount = getChildCount();
            this.q0 = false;
            getNanoTime();
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z3 = (fSignum > 0.0f && f3 >= 1.0f) || (fSignum <= 0.0f && f3 <= 1.0f);
            if (!this.q0 && z3) {
                setState(dVar);
            }
            boolean z4 = (!z3) | this.q0;
            this.q0 = z4;
            if (f3 >= 1.0d && this.l0 != 0) {
                this.l0 = 0;
                throw null;
            }
            if (z4) {
                invalidate();
            } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                setState(dVar);
            }
            if (!this.q0 && ((fSignum <= 0.0f || f3 != 1.0f) && fSignum < 0.0f)) {
                int i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            }
        }
        float f4 = this.n0;
        if (f4 < 1.0f) {
            if (f4 <= 0.0f) {
                z = this.l0 != -1;
                this.l0 = -1;
            }
            if (z2 && !this.t0) {
                super.requestLayout();
            }
            this.m0 = this.n0;
            super.dispatchDraw(canvas);
        }
        z = this.l0 != 0;
        this.l0 = 0;
        z2 = z;
        if (z2) {
            super.requestLayout();
        }
        this.m0 = this.n0;
        super.dispatchDraw(canvas);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void e(int i) {
        this.c0 = null;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.l0;
    }

    public ArrayList<vz9.a> getDefinedTransitions() {
        return null;
    }

    public v14 getDesignTool() {
        return null;
    }

    public int getEndState() {
        return 0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.n0;
    }

    public int getStartState() {
        return -1;
    }

    public float getTargetPosition() {
        return 1.0f;
    }

    public Bundle getTransitionState() {
        throw null;
    }

    public long getTransitionTimeMs() {
        return 0L;
    }

    public float getVelocity() {
        return this.k0;
    }

    public final void h() {
        this.p0.getClass();
        if (this.s0 != this.m0) {
            if (this.r0 != -1) {
                throw null;
            }
            this.r0 = -1;
            this.s0 = this.m0;
            throw null;
        }
    }

    @Override // defpackage.dfa
    public final void i(View view, View view2, int i, int i2) {
        getNanoTime();
    }

    @Override // defpackage.dfa
    public final void j(View view, int i) {
    }

    @Override // defpackage.dfa
    public final void k(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final void l() {
        this.p0.getClass();
        if (this.r0 != -1) {
            this.p0.getClass();
            throw null;
        }
        this.r0 = this.l0;
        throw null;
    }

    @Override // defpackage.efa
    public final void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i == 0 && i2 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
    }

    @Override // defpackage.dfa
    public final void n(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // defpackage.dfa
    public final boolean o(View view, View view2, int i, int i2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        if (!this.u0) {
            throw null;
        }
        post(new a());
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.t0 = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
        } finally {
            this.t0 = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof qz9) {
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        throw null;
    }

    public void setDebugMode(int i) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.u0 = z;
    }

    public void setInteractionEnabled(boolean z) {
    }

    public void setInterpolatedProgress(float f) {
        setProgress(f);
    }

    public void setOnHide(float f) {
        throw null;
    }

    public void setOnShow(float f) {
        throw null;
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            throw null;
        }
        d dVar = d.b;
        d dVar2 = d.a;
        if (f <= 0.0f) {
            if (this.n0 == 1.0f && this.l0 == 0) {
                setState(dVar2);
            }
            this.l0 = -1;
            if (this.n0 == 0.0f) {
                setState(dVar);
                return;
            }
            return;
        }
        if (f < 1.0f) {
            this.l0 = -1;
            setState(dVar2);
            return;
        }
        if (this.n0 == 0.0f && this.l0 == -1) {
            setState(dVar2);
        }
        this.l0 = 0;
        if (this.n0 == 1.0f) {
            setState(dVar);
        }
    }

    public void setScene(vz9 vz9Var) {
        d();
        throw null;
    }

    public void setStartState(int i) {
        if (!super.isAttachedToWindow()) {
            throw null;
        }
        this.l0 = i;
    }

    public void setState(d dVar) {
        d dVar2 = d.b;
        if (dVar == dVar2 && this.l0 == -1) {
            return;
        }
        d dVar3 = this.v0;
        this.v0 = dVar;
        d dVar4 = d.a;
        if (dVar3 == dVar4 && dVar == dVar4) {
            h();
        }
        int iOrdinal = dVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && dVar == dVar2) {
                l();
                return;
            }
            return;
        }
        if (dVar == dVar4) {
            h();
        }
        if (dVar == dVar2) {
            l();
        }
    }

    public void setTransition(vz9.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.p0 = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        bundle.getFloat("motion.progress");
        throw null;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return ah3.a(context, -1) + "->" + ah3.a(context, 0) + " (pos:" + this.n0 + " Dpos/Dt:" + this.k0;
    }

    public void setTransition(int i) {
    }
}
