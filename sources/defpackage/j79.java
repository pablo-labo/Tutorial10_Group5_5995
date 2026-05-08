package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import com.airbnb.lottie.parser.moshi.a;
import defpackage.hl8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class j79 extends Drawable implements Drawable.Callback, Animatable {
    public static final List<String> B0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor C0 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new s79());
    public float A0;
    public l07 V;
    public ln5 W;
    public Map<String, Typeface> X;
    public final m79 Y;
    public boolean Z;
    public s69 a;
    public boolean a0;
    public final t79 b;
    public lm2 b0;
    public final boolean c;
    public int c0;
    public boolean d;
    public boolean d0;
    public b e;
    public boolean e0;
    public final ArrayList<a> f;
    public boolean f0;
    public boolean g0;
    public s1d h0;
    public boolean i0;
    public final Matrix j0;
    public Bitmap k0;
    public Canvas l0;
    public Rect m0;
    public RectF n0;
    public ij8 o0;
    public Rect p0;
    public Rect q0;
    public RectF r0;
    public RectF s0;
    public Matrix t0;
    public final float[] u0;
    public Matrix v0;
    public boolean w0;
    public aw0 x0;
    public final Semaphore y0;
    public final qr3 z0;

    public interface a {
        void run();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("NONE", 0);
            a = bVar;
            b bVar2 = new b("PLAY", 1);
            b = bVar2;
            b bVar3 = new b("RESUME", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public j79() {
        t79 t79Var = new t79();
        t79Var.d = 1.0f;
        t79Var.e = false;
        t79Var.f = 0L;
        t79Var.V = 0.0f;
        t79Var.W = 0.0f;
        t79Var.X = 0;
        t79Var.Y = -2.14748365E9f;
        t79Var.Z = 2.14748365E9f;
        t79Var.b0 = false;
        this.b = t79Var;
        this.c = true;
        this.d = false;
        this.e = b.a;
        this.f = new ArrayList<>();
        this.Y = new m79();
        this.Z = false;
        this.a0 = true;
        this.c0 = 255;
        this.g0 = false;
        this.h0 = s1d.a;
        this.i0 = false;
        this.j0 = new Matrix();
        this.u0 = new float[9];
        this.w0 = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: f79
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j79 j79Var = this.a;
                aw0 aw0Var = j79Var.x0;
                if (aw0Var == null) {
                    aw0Var = aw0.a;
                }
                if (aw0Var == aw0.b) {
                    j79Var.invalidateSelf();
                    return;
                }
                lm2 lm2Var = j79Var.b0;
                if (lm2Var != null) {
                    lm2Var.p(j79Var.b.e());
                }
            }
        };
        this.y0 = new Semaphore(1);
        this.z0 = new qr3(this, 1);
        this.A0 = -3.4028235E38f;
        t79Var.addUpdateListener(animatorUpdateListener);
    }

    public static void d(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.content.Context r3) {
        /*
            r2 = this;
            boolean r2 = r2.c
            if (r2 == 0) goto L24
            guc r2 = defpackage.guc.a
            if (r3 == 0) goto L1f
            android.graphics.Matrix r0 = defpackage.ckg.a
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r0 = "animator_duration_scale"
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = android.provider.Settings.Global.getFloat(r3, r0, r1)
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            guc r3 = defpackage.guc.b
            goto L20
        L1f:
            r3 = r2
        L20:
            if (r3 != r2) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j79.a(android.content.Context):boolean");
    }

    public final void b() {
        s69 s69Var = this.a;
        if (s69Var == null) {
            return;
        }
        a.C0108a c0108a = il8.a;
        Rect rect = s69Var.k;
        List list = Collections.EMPTY_LIST;
        lm2 lm2Var = new lm2(this, new hl8(list, s69Var, "__container", -1L, hl8.a.a, -1L, null, list, new rc0(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, hl8.b.a, null, false, null, null, hj8.a), s69Var.j, s69Var);
        this.b0 = lm2Var;
        if (this.d0) {
            lm2Var.o(true);
        }
        this.b0.L = this.a0;
    }

    public final void c() {
        s69 s69Var = this.a;
        if (s69Var == null) {
            return;
        }
        s1d s1dVar = this.h0;
        int i = Build.VERSION.SDK_INT;
        boolean z = s69Var.o;
        int i2 = s69Var.p;
        int iOrdinal = s1dVar.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4))) {
            z2 = true;
        }
        this.i0 = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        lm2 lm2Var = this.b0;
        if (lm2Var == null) {
            return;
        }
        aw0 aw0Var = this.x0;
        if (aw0Var == null) {
            aw0Var = aw0.a;
        }
        boolean z = aw0Var == aw0.b;
        qr3 qr3Var = this.z0;
        ThreadPoolExecutor threadPoolExecutor = C0;
        t79 t79Var = this.b;
        Semaphore semaphore = this.y0;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (lm2Var.K == t79Var.e()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (lm2Var.K != t79Var.e()) {
                        threadPoolExecutor.execute(qr3Var);
                    }
                }
                throw th;
            }
        }
        if (z && m()) {
            l(t79Var.e());
        }
        boolean z2 = this.d;
        boolean z3 = this.i0;
        if (z2) {
            try {
                if (z3) {
                    i(canvas, lm2Var);
                } else {
                    e(canvas);
                }
            } catch (Throwable unused2) {
                a49.a.getClass();
            }
        } else if (z3) {
            i(canvas, lm2Var);
        } else {
            e(canvas);
        }
        this.w0 = false;
        if (z) {
            semaphore.release();
            if (lm2Var.K == t79Var.e()) {
                return;
            }
            threadPoolExecutor.execute(qr3Var);
        }
    }

    public final void e(Canvas canvas) {
        lm2 lm2Var = this.b0;
        s69 s69Var = this.a;
        if (lm2Var == null || s69Var == null) {
            return;
        }
        Matrix matrix = this.j0;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / s69Var.k.width(), r3.height() / s69Var.k.height());
        }
        lm2Var.h(canvas, matrix, this.c0, null);
    }

    public final Context f() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final be9 g() {
        be9 be9Var = null;
        for (String str : B0) {
            s69 s69Var = this.a;
            int size = s69Var.g.size();
            for (int i = 0; i < size; i++) {
                be9 be9Var2 = (be9) s69Var.g.get(i);
                String str2 = be9Var2.a;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    be9Var = be9Var2;
                    break;
                }
            }
            be9Var = null;
            if (be9Var != null) {
                break;
            }
        }
        return be9Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        s69 s69Var = this.a;
        if (s69Var == null) {
            return -1;
        }
        return s69Var.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        s69 s69Var = this.a;
        if (s69Var == null) {
            return -1;
        }
        return s69Var.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        if (this.b0 == null) {
            this.f.add(new a() { // from class: g79
                @Override // j79.a
                public final void run() {
                    this.a.h();
                }
            });
            return;
        }
        c();
        boolean zA = a(f());
        b bVar = b.a;
        t79 t79Var = this.b;
        if (zA || t79Var.getRepeatCount() == 0) {
            if (isVisible()) {
                t79Var.b0 = true;
                boolean zH = t79Var.h();
                Iterator it = t79Var.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(t79Var, zH);
                }
                t79Var.j((int) (t79Var.h() ? t79Var.f() : t79Var.g()));
                t79Var.f = 0L;
                t79Var.X = 0;
                if (t79Var.b0) {
                    t79Var.i(false);
                    Choreographer.getInstance().postFrameCallback(t79Var);
                }
                this.e = bVar;
            } else {
                this.e = b.b;
            }
        }
        if (a(f())) {
            return;
        }
        be9 be9VarG = g();
        if (be9VarG != null) {
            k((int) be9VarG.b);
        } else {
            k((int) (t79Var.d < 0.0f ? t79Var.g() : t79Var.f()));
        }
        t79Var.i(true);
        t79Var.c(t79Var.h());
        if (isVisible()) {
            return;
        }
        this.e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.graphics.Canvas r11, defpackage.lm2 r12) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j79.i(android.graphics.Canvas, lm2):void");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.w0) {
            return;
        }
        this.w0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        t79 t79Var = this.b;
        if (t79Var == null) {
            return false;
        }
        return t79Var.b0;
    }

    public final void j() {
        if (this.b0 == null) {
            this.f.add(new a() { // from class: e79
                @Override // j79.a
                public final void run() {
                    this.a.j();
                }
            });
            return;
        }
        c();
        boolean zA = a(f());
        b bVar = b.a;
        t79 t79Var = this.b;
        if (zA || t79Var.getRepeatCount() == 0) {
            if (isVisible()) {
                t79Var.b0 = true;
                t79Var.i(false);
                Choreographer.getInstance().postFrameCallback(t79Var);
                t79Var.f = 0L;
                if (t79Var.h() && t79Var.W == t79Var.g()) {
                    t79Var.j(t79Var.f());
                } else if (!t79Var.h() && t79Var.W == t79Var.f()) {
                    t79Var.j(t79Var.g());
                }
                Iterator it = t79Var.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(t79Var);
                }
                this.e = bVar;
            } else {
                this.e = b.c;
            }
        }
        if (a(f())) {
            return;
        }
        k((int) (t79Var.d < 0.0f ? t79Var.g() : t79Var.f()));
        t79Var.i(true);
        t79Var.c(t79Var.h());
        if (isVisible()) {
            return;
        }
        this.e = bVar;
    }

    public final void k(final int i) {
        if (this.a != null) {
            this.b.j(i);
        } else {
            this.f.add(new a() { // from class: i79
                @Override // j79.a
                public final void run() {
                    this.a.k(i);
                }
            });
        }
    }

    public final void l(final float f) {
        s69 s69Var = this.a;
        if (s69Var == null) {
            this.f.add(new a() { // from class: h79
                @Override // j79.a
                public final void run() {
                    this.a.l(f);
                }
            });
        } else {
            this.b.j(du9.e(s69Var.l, s69Var.m, f));
        }
    }

    public final boolean m() {
        s69 s69Var = this.a;
        if (s69Var == null) {
            return false;
        }
        float f = this.A0;
        float fE = this.b.e();
        this.A0 = fE;
        return Math.abs(fE - f) * s69Var.b() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        a49.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        b bVar = b.c;
        if (z) {
            b bVar2 = this.e;
            if (bVar2 == b.b) {
                h();
                return visible;
            }
            if (bVar2 == bVar) {
                j();
                return visible;
            }
        } else {
            t79 t79Var = this.b;
            boolean z3 = t79Var.b0;
            b bVar3 = b.a;
            if (z3) {
                this.f.clear();
                t79Var.i(true);
                Iterator it = t79Var.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(t79Var);
                }
                if (!isVisible()) {
                    this.e = bVar3;
                }
                this.e = bVar;
                return visible;
            }
            if (zIsVisible) {
                this.e = bVar3;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        h();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clear();
        t79 t79Var = this.b;
        t79Var.i(true);
        t79Var.c(t79Var.h());
        if (isVisible()) {
            return;
        }
        this.e = b.a;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
