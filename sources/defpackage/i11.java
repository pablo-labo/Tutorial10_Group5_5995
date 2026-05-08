package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i11 implements View.OnTouchListener {
    public static final int f0 = ViewConfiguration.getTapTimeout();
    public final int V;
    public final int W;
    public final float[] X;
    public final float[] Y;
    public final float[] Z;
    public final a a;
    public boolean a0;
    public final AccelerateInterpolator b;
    public boolean b0;
    public final fd4 c;
    public boolean c0;
    public b d;
    public boolean d0;
    public final float[] e;
    public boolean e0;
    public final float[] f;

    public static class a {
        public int a;
        public int b;
        public float c;
        public float d;
        public long e;
        public long f;
        public long g;
        public float h;
        public int i;

        public final float a(long j) {
            if (j < this.e) {
                return 0.0f;
            }
            long j2 = this.g;
            if (j2 < 0 || j < j2) {
                return i11.b((j - r0) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.h;
            return (i11.b((j - j2) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i11 i11Var = i11.this;
            fd4 fd4Var = i11Var.c;
            a aVar = i11Var.a;
            if (i11Var.d0) {
                if (i11Var.b0) {
                    i11Var.b0 = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.e = jCurrentAnimationTimeMillis;
                    aVar.g = -1L;
                    aVar.f = jCurrentAnimationTimeMillis;
                    aVar.h = 0.5f;
                }
                if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + ((long) aVar.i)) || !i11Var.e()) {
                    i11Var.d0 = false;
                    return;
                }
                if (i11Var.c0) {
                    i11Var.c0 = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    fd4Var.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (aVar.f == 0) {
                    b0.o("Cannot compute scroll delta before calling start()");
                    return;
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = aVar.a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - aVar.f;
                aVar.f = jCurrentAnimationTimeMillis2;
                ((gz8) i11Var).g0.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.d));
                WeakHashMap<View, prg> weakHashMap = epg.a;
                fd4Var.postOnAnimation(this);
            }
        }
    }

    public i11(fd4 fd4Var) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f = 0L;
        this.a = aVar;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.X = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.Y = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.Z = fArr5;
        this.c = fd4Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.V = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.W = f0;
        aVar.a = 500;
        aVar.b = 500;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.e
            r0 = r0[r7]
            float[] r1 = r3.f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.X
            r0 = r0[r7]
            float[] r1 = r3.Y
            r1 = r1[r7]
            float[] r3 = r3.Z
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            return r3
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i11.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.V;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.d0 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.b0) {
            this.d0 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.a;
        int i2 = (int) (jCurrentAnimationTimeMillis - aVar.e);
        int i3 = aVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.i = i;
        aVar.h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        fd4 fd4Var;
        int count;
        a aVar = this.a;
        float f = aVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(aVar.c);
        if (iAbs != 0 && (count = (fd4Var = ((gz8) this).g0).getCount()) != 0) {
            int childCount = fd4Var.getChildCount();
            int firstVisiblePosition = fd4Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && fd4Var.getChildAt(0).getTop() >= 0)) : !(i >= count && fd4Var.getChildAt(childCount - 1).getBottom() <= fd4Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.e0
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r1
        L1b:
            r7.c0 = r2
            r7.a0 = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            fd4 r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            i11$a r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.d0
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            i11$b r8 = r7.d
            if (r8 != 0) goto L60
            i11$b r8 = new i11$b
            r8.<init>()
            r7.d = r8
        L60:
            r7.d0 = r2
            r7.b0 = r2
            boolean r8 = r7.a0
            if (r8 != 0) goto L75
            int r8 = r7.W
            if (r8 <= 0) goto L75
            i11$b r9 = r7.d
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, prg> r8 = defpackage.epg.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            i11$b r8 = r7.d
            r8.run()
        L7a:
            r7.a0 = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i11.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
