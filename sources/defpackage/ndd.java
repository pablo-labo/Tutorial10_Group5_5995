package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import defpackage.hmb;

/* JADX INFO: loaded from: classes.dex */
public final class ndd extends View {
    public w6g a;
    public Boolean b;
    public Long c;
    public p4 d;
    public gu5<j6g> e;
    public static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] V = new int[0];

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? f : V;
            w6g w6gVar = this.a;
            if (w6gVar != null) {
                w6gVar.setState(iArr);
            }
        } else {
            p4 p4Var = new p4(this, 4);
            this.d = p4Var;
            postDelayed(p4Var, 50L);
        }
        this.c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(ndd nddVar) {
        w6g w6gVar = nddVar.a;
        if (w6gVar != null) {
            w6gVar.setState(V);
        }
        nddVar.d = null;
    }

    public final void b(hmb.b bVar, boolean z, long j, int i, long j2, float f2, gu5<j6g> gu5Var) {
        if (this.a == null || !Boolean.valueOf(z).equals(this.b)) {
            w6g w6gVar = new w6g(z);
            setBackground(w6gVar);
            this.a = w6gVar;
            this.b = Boolean.valueOf(z);
        }
        w6g w6gVar2 = this.a;
        w6gVar2.getClass();
        this.e = gu5Var;
        e(j, i, j2, f2);
        if (z) {
            w6gVar2.setHotspot(Float.intBitsToFloat((int) (bVar.a >> 32)), Float.intBitsToFloat((int) (bVar.a & 4294967295L)));
        } else {
            w6gVar2.setHotspot(w6gVar2.getBounds().centerX(), w6gVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.e = null;
        p4 p4Var = this.d;
        if (p4Var != null) {
            removeCallbacks(p4Var);
            p4 p4Var2 = this.d;
            p4Var2.getClass();
            p4Var2.run();
        } else {
            w6g w6gVar = this.a;
            if (w6gVar != null) {
                w6gVar.setState(V);
            }
        }
        w6g w6gVar2 = this.a;
        if (w6gVar2 == null) {
            return;
        }
        w6gVar2.setVisible(false, false);
        unscheduleDrawable(w6gVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i, long j2, float f2) {
        w6g w6gVar = this.a;
        if (w6gVar == null) {
            return;
        }
        Integer num = w6gVar.c;
        if (num == null || num.intValue() != i) {
            w6gVar.c = Integer.valueOf(i);
            w6gVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long jB = da2.b(j2, f2);
        da2 da2Var = w6gVar.b;
        if (!(da2Var == null ? false : da2.c(da2Var.a, jB))) {
            w6gVar.b = new da2(jB);
            w6gVar.setColor(ColorStateList.valueOf(pnb.P(jB)));
        }
        Rect rect = new Rect(0, 0, gf9.b(kie.d(j)), gf9.b(kie.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        w6gVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        gu5<j6g> gu5Var = this.e;
        if (gu5Var != null) {
            gu5Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
