package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t79 extends da1 implements Choreographer.FrameCallback {
    public float V;
    public float W;
    public int X;
    public float Y;
    public float Z;
    public s69 a0;
    public boolean b0;
    public float d;
    public boolean e;
    public long f;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        c(h());
        i(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.b0) {
            i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        s69 s69Var = this.a0;
        if (s69Var == null || !this.b0) {
            return;
        }
        float fAbs = (this.f != 0 ? j - r2 : 0L) / ((1.0E9f / s69Var.n) / Math.abs(this.d));
        float f = this.V;
        if (h()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fG = g();
        float f3 = f();
        PointF pointF = du9.a;
        if (f2 >= fG && f2 <= f3) {
            z = true;
        }
        float fB = du9.b(f2, g(), f());
        this.V = fB;
        this.W = fB;
        this.f = j;
        if (z) {
            d();
        } else if (getRepeatCount() == -1 || this.X < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.e = !this.e;
                this.d = -this.d;
            } else {
                float f4 = h() ? f() : g();
                this.V = f4;
                this.W = f4;
            }
            this.f = j;
            d();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.X++;
        } else {
            float fG2 = this.d < 0.0f ? g() : f();
            this.V = fG2;
            this.W = fG2;
            i(true);
            d();
            c(h());
        }
        if (this.a0 == null) {
            return;
        }
        float f5 = this.W;
        float f6 = this.Y;
        if (f5 < f6 || f5 > this.Z) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f6), Float.valueOf(this.Z), Float.valueOf(this.W)));
        }
    }

    public final float e() {
        s69 s69Var = this.a0;
        if (s69Var == null) {
            return 0.0f;
        }
        float f = this.W;
        float f2 = s69Var.l;
        return (f - f2) / (s69Var.m - f2);
    }

    public final float f() {
        s69 s69Var = this.a0;
        if (s69Var == null) {
            return 0.0f;
        }
        float f = this.Z;
        return f == 2.14748365E9f ? s69Var.m : f;
    }

    public final float g() {
        s69 s69Var = this.a0;
        if (s69Var == null) {
            return 0.0f;
        }
        float f = this.Y;
        return f == -2.14748365E9f ? s69Var.l : f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fG;
        float f;
        float fG2;
        if (this.a0 == null) {
            return 0.0f;
        }
        if (h()) {
            fG = f() - this.W;
            f = f();
            fG2 = g();
        } else {
            fG = this.W - g();
            f = f();
            fG2 = g();
        }
        return fG / (f - fG2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(e());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        s69 s69Var = this.a0;
        if (s69Var == null) {
            return 0L;
        }
        return (long) s69Var.b();
    }

    public final boolean h() {
        return this.d < 0.0f;
    }

    public final void i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.b0 = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.b0;
    }

    public final void j(float f) {
        if (this.V == f) {
            return;
        }
        float fB = du9.b(f, g(), f());
        this.V = fB;
        this.W = fB;
        this.f = 0L;
        d();
    }

    public final void k(float f, float f2) {
        if (f > f2) {
            q6.i("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        s69 s69Var = this.a0;
        float f3 = s69Var == null ? -3.4028235E38f : s69Var.l;
        float f4 = s69Var == null ? Float.MAX_VALUE : s69Var.m;
        float fB = du9.b(f, f3, f4);
        float fB2 = du9.b(f2, f3, f4);
        if (fB == this.Y && fB2 == this.Z) {
            return;
        }
        this.Y = fB;
        this.Z = fB2;
        j((int) du9.b(this.W, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }
}
