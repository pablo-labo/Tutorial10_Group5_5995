package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import defpackage.b74;
import defpackage.epg;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rzg {
    public static final rzg b;
    public final j a;

    public static class j {
        public static final rzg b;
        public final rzg a;

        static {
            int i = Build.VERSION.SDK_INT;
            b = (i >= 30 ? new c() : i >= 29 ? new b() : new a()).b().a.a().a.b().a.c();
        }

        public j(rzg rzgVar) {
            this.a = rzgVar;
        }

        public rzg a() {
            return this.a;
        }

        public rzg b() {
            return this.a;
        }

        public rzg c() {
            return this.a;
        }

        public void d(View view) {
        }

        public void e(rzg rzgVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return p() == jVar.p() && o() == jVar.o() && Objects.equals(l(), jVar.l()) && Objects.equals(j(), jVar.j()) && Objects.equals(f(), jVar.f());
        }

        public b74 f() {
            return null;
        }

        public kf7 g(int i) {
            return kf7.e;
        }

        public kf7 h(int i) {
            if ((i & 8) == 0) {
                return kf7.e;
            }
            l5.q("Unable to query the maximum insets for IME");
            return null;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public kf7 i() {
            return l();
        }

        public kf7 j() {
            return kf7.e;
        }

        public kf7 k() {
            return l();
        }

        public kf7 l() {
            return kf7.e;
        }

        public kf7 m() {
            return l();
        }

        public rzg n(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i) {
            return true;
        }

        public void r(kf7[] kf7VarArr) {
        }

        public void s(kf7 kf7Var) {
        }

        public void t(rzg rzgVar) {
        }

        public void u(kf7 kf7Var) {
        }
    }

    public static final class k {
        public static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            l5.q(p6.c(i, "type needs to be >= FIRST and <= LAST, type="));
            return 0;
        }
    }

    public static final class l {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = i.q;
        } else {
            b = j.b;
        }
    }

    public rzg(rzg rzgVar) {
        if (rzgVar == null) {
            this.a = new j(this);
            return;
        }
        j jVar = rzgVar.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && (jVar instanceof i)) {
            this.a = new i(this, (i) jVar);
        } else if (i2 >= 29 && (jVar instanceof h)) {
            this.a = new h(this, (h) jVar);
        } else if (i2 >= 28 && (jVar instanceof g)) {
            this.a = new g(this, (g) jVar);
        } else if (jVar instanceof f) {
            this.a = new f(this, (f) jVar);
        } else if (jVar instanceof e) {
            this.a = new e(this, (e) jVar);
        } else {
            this.a = new j(this);
        }
        jVar.e(this);
    }

    public static kf7 e(kf7 kf7Var, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, kf7Var.a - i2);
        int iMax2 = Math.max(0, kf7Var.b - i3);
        int iMax3 = Math.max(0, kf7Var.c - i4);
        int iMax4 = Math.max(0, kf7Var.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? kf7Var : kf7.b(iMax, iMax2, iMax3, iMax4);
    }

    public static rzg h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        rzg rzgVar = new rzg(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            rzg rzgVarA = epg.e.a(view);
            j jVar = rzgVar.a;
            jVar.t(rzgVarA);
            jVar.d(view.getRootView());
        }
        return rzgVar;
    }

    @Deprecated
    public final int a() {
        return this.a.l().d;
    }

    @Deprecated
    public final int b() {
        return this.a.l().a;
    }

    @Deprecated
    public final int c() {
        return this.a.l().c;
    }

    @Deprecated
    public final int d() {
        return this.a.l().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rzg) {
            return Objects.equals(this.a, ((rzg) obj).a);
        }
        return false;
    }

    @Deprecated
    public final rzg f(int i2, int i3, int i4, int i5) {
        int i6 = Build.VERSION.SDK_INT;
        d cVar = i6 >= 30 ? new c(this) : i6 >= 29 ? new b(this) : new a(this);
        cVar.g(kf7.b(i2, i3, i4, i5));
        return cVar.b();
    }

    public final WindowInsets g() {
        j jVar = this.a;
        if (jVar instanceof e) {
            return ((e) jVar).c;
        }
        return null;
    }

    public final int hashCode() {
        j jVar = this.a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    public static class c extends b {
        public c() {
        }

        @Override // rzg.d
        public void c(int i, kf7 kf7Var) {
            this.c.setInsets(l.a(i), kf7Var.d());
        }

        public c(rzg rzgVar) {
            super(rzgVar);
        }
    }

    public static class g extends f {
        public g(rzg rzgVar, WindowInsets windowInsets) {
            super(rzgVar, windowInsets);
        }

        @Override // rzg.j
        public rzg a() {
            return rzg.h(null, this.c.consumeDisplayCutout());
        }

        @Override // rzg.e, rzg.j
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.c, gVar.c) && Objects.equals(this.g, gVar.g);
        }

        @Override // rzg.j
        public b74 f() {
            DisplayCutout displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new b74(displayCutout);
        }

        @Override // rzg.j
        public int hashCode() {
            return this.c.hashCode();
        }

        public g(rzg rzgVar, g gVar) {
            super(rzgVar, gVar);
        }
    }

    public static class i extends h {
        public static final rzg q = rzg.h(null, WindowInsets.CONSUMED);

        public i(rzg rzgVar, WindowInsets windowInsets) {
            super(rzgVar, windowInsets);
        }

        @Override // rzg.e, rzg.j
        public final void d(View view) {
        }

        @Override // rzg.e, rzg.j
        public kf7 g(int i) {
            return kf7.c(this.c.getInsets(l.a(i)));
        }

        @Override // rzg.e, rzg.j
        public kf7 h(int i) {
            return kf7.c(this.c.getInsetsIgnoringVisibility(l.a(i)));
        }

        @Override // rzg.e, rzg.j
        public boolean q(int i) {
            return this.c.isVisible(l.a(i));
        }

        public i(rzg rzgVar, i iVar) {
            super(rzgVar, iVar);
        }
    }

    public static class a extends d {
        public static Field e = null;
        public static boolean f = false;
        public static Constructor<WindowInsets> g = null;
        public static boolean h = false;
        public WindowInsets c;
        public kf7 d;

        public a() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // rzg.d
        public rzg b() {
            a();
            rzg rzgVarH = rzg.h(null, this.c);
            kf7[] kf7VarArr = this.b;
            j jVar = rzgVarH.a;
            jVar.r(kf7VarArr);
            jVar.u(this.d);
            return rzgVarH;
        }

        @Override // rzg.d
        public void e(kf7 kf7Var) {
            this.d = kf7Var;
        }

        @Override // rzg.d
        public void g(kf7 kf7Var) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(kf7Var.a, kf7Var.b, kf7Var.c, kf7Var.d);
            }
        }

        public a(rzg rzgVar) {
            super(rzgVar);
            this.c = rzgVar.g();
        }
    }

    public static class d {
        public final rzg a;
        public kf7[] b;

        public d() {
            this(new rzg((rzg) null));
        }

        public final void a() {
            kf7[] kf7VarArr = this.b;
            if (kf7VarArr != null) {
                kf7 kf7VarG = kf7VarArr[0];
                kf7 kf7VarG2 = kf7VarArr[1];
                rzg rzgVar = this.a;
                if (kf7VarG2 == null) {
                    kf7VarG2 = rzgVar.a.g(2);
                }
                if (kf7VarG == null) {
                    kf7VarG = rzgVar.a.g(1);
                }
                g(kf7.a(kf7VarG, kf7VarG2));
                kf7 kf7Var = this.b[k.a(16)];
                if (kf7Var != null) {
                    f(kf7Var);
                }
                kf7 kf7Var2 = this.b[k.a(32)];
                if (kf7Var2 != null) {
                    d(kf7Var2);
                }
                kf7 kf7Var3 = this.b[k.a(64)];
                if (kf7Var3 != null) {
                    h(kf7Var3);
                }
            }
        }

        public rzg b() {
            throw null;
        }

        public void c(int i, kf7 kf7Var) {
            if (this.b == null) {
                this.b = new kf7[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[k.a(i2)] = kf7Var;
                }
            }
        }

        public void d(kf7 kf7Var) {
        }

        public void e(kf7 kf7Var) {
            throw null;
        }

        public void f(kf7 kf7Var) {
        }

        public void g(kf7 kf7Var) {
            throw null;
        }

        public void h(kf7 kf7Var) {
        }

        public d(rzg rzgVar) {
            this.a = rzgVar;
        }
    }

    public static class e extends j {
        public static boolean h = false;
        public static Method i;
        public static Class<?> j;
        public static Field k;
        public static Field l;
        public final WindowInsets c;
        public kf7[] d;
        public kf7 e;
        public rzg f;
        public kf7 g;

        public e(rzg rzgVar, e eVar) {
            this(rzgVar, new WindowInsets(eVar.c));
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            h = true;
        }

        @SuppressLint({"WrongConstant"})
        private kf7 v(int i2, boolean z) {
            kf7 kf7VarA = kf7.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    kf7VarA = kf7.a(kf7VarA, w(i3, z));
                }
            }
            return kf7VarA;
        }

        private kf7 x() {
            rzg rzgVar = this.f;
            return rzgVar != null ? rzgVar.a.j() : kf7.e;
        }

        private kf7 y(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                b0.u("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                return null;
            }
            if (!h) {
                A();
            }
            Method method = i;
            if (method != null && j != null && k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(objInvoke));
                    if (rect != null) {
                        return kf7.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @Override // rzg.j
        public void d(View view) {
            kf7 kf7VarY = y(view);
            if (kf7VarY == null) {
                kf7VarY = kf7.e;
            }
            s(kf7VarY);
        }

        @Override // rzg.j
        public void e(rzg rzgVar) {
            rzgVar.a.t(this.f);
            rzgVar.a.s(this.g);
        }

        @Override // rzg.j
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((e) obj).g);
            }
            return false;
        }

        @Override // rzg.j
        public kf7 g(int i2) {
            return v(i2, false);
        }

        @Override // rzg.j
        public kf7 h(int i2) {
            return v(i2, true);
        }

        @Override // rzg.j
        public final kf7 l() {
            if (this.e == null) {
                WindowInsets windowInsets = this.c;
                this.e = kf7.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // rzg.j
        public rzg n(int i2, int i3, int i4, int i5) {
            rzg rzgVarH = rzg.h(null, this.c);
            int i6 = Build.VERSION.SDK_INT;
            d cVar = i6 >= 30 ? new c(rzgVarH) : i6 >= 29 ? new b(rzgVarH) : new a(rzgVarH);
            cVar.g(rzg.e(l(), i2, i3, i4, i5));
            cVar.e(rzg.e(j(), i2, i3, i4, i5));
            return cVar.b();
        }

        @Override // rzg.j
        public boolean p() {
            return this.c.isRound();
        }

        @Override // rzg.j
        @SuppressLint({"WrongConstant"})
        public boolean q(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0 && !z(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // rzg.j
        public void r(kf7[] kf7VarArr) {
            this.d = kf7VarArr;
        }

        @Override // rzg.j
        public void s(kf7 kf7Var) {
            this.g = kf7Var;
        }

        @Override // rzg.j
        public void t(rzg rzgVar) {
            this.f = rzgVar;
        }

        public kf7 w(int i2, boolean z) {
            kf7 kf7VarJ;
            int i3;
            if (i2 == 1) {
                return z ? kf7.b(0, Math.max(x().b, l().b), 0, 0) : kf7.b(0, l().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    kf7 kf7VarX = x();
                    kf7 kf7VarJ2 = j();
                    return kf7.b(Math.max(kf7VarX.a, kf7VarJ2.a), 0, Math.max(kf7VarX.c, kf7VarJ2.c), Math.max(kf7VarX.d, kf7VarJ2.d));
                }
                kf7 kf7VarL = l();
                rzg rzgVar = this.f;
                kf7VarJ = rzgVar != null ? rzgVar.a.j() : null;
                int iMin = kf7VarL.d;
                if (kf7VarJ != null) {
                    iMin = Math.min(iMin, kf7VarJ.d);
                }
                return kf7.b(kf7VarL.a, 0, kf7VarL.c, iMin);
            }
            kf7 kf7Var = kf7.e;
            if (i2 == 8) {
                kf7[] kf7VarArr = this.d;
                kf7VarJ = kf7VarArr != null ? kf7VarArr[k.a(8)] : null;
                if (kf7VarJ != null) {
                    return kf7VarJ;
                }
                kf7 kf7VarL2 = l();
                kf7 kf7VarX2 = x();
                int i4 = kf7VarL2.d;
                if (i4 > kf7VarX2.d) {
                    return kf7.b(0, 0, 0, i4);
                }
                kf7 kf7Var2 = this.g;
                if (kf7Var2 != null && !kf7Var2.equals(kf7Var) && (i3 = this.g.d) > kf7VarX2.d) {
                    return kf7.b(0, 0, 0, i3);
                }
            } else {
                if (i2 == 16) {
                    return k();
                }
                if (i2 == 32) {
                    return i();
                }
                if (i2 == 64) {
                    return m();
                }
                if (i2 == 128) {
                    rzg rzgVar2 = this.f;
                    b74 b74VarF = rzgVar2 != null ? rzgVar2.a.f() : f();
                    if (b74VarF != null) {
                        int i5 = Build.VERSION.SDK_INT;
                        return kf7.b(i5 >= 28 ? b74.a.c(b74VarF.a) : 0, i5 >= 28 ? b74.a.e(b74VarF.a) : 0, i5 >= 28 ? b74.a.d(b74VarF.a) : 0, i5 >= 28 ? b74.a.b(b74VarF.a) : 0);
                    }
                }
            }
            return kf7Var;
        }

        public boolean z(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !w(i2, false).equals(kf7.e);
        }

        public e(rzg rzgVar, WindowInsets windowInsets) {
            super(rzgVar);
            this.e = null;
            this.c = windowInsets;
        }
    }

    public static class f extends e {
        public kf7 m;

        public f(rzg rzgVar, f fVar) {
            super(rzgVar, fVar);
            this.m = null;
            this.m = fVar.m;
        }

        @Override // rzg.j
        public rzg b() {
            return rzg.h(null, this.c.consumeStableInsets());
        }

        @Override // rzg.j
        public rzg c() {
            return rzg.h(null, this.c.consumeSystemWindowInsets());
        }

        @Override // rzg.j
        public final kf7 j() {
            if (this.m == null) {
                WindowInsets windowInsets = this.c;
                this.m = kf7.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // rzg.j
        public boolean o() {
            return this.c.isConsumed();
        }

        @Override // rzg.j
        public void u(kf7 kf7Var) {
            this.m = kf7Var;
        }

        public f(rzg rzgVar, WindowInsets windowInsets) {
            super(rzgVar, windowInsets);
            this.m = null;
        }
    }

    public static class h extends g {
        public kf7 n;
        public kf7 o;
        public kf7 p;

        public h(rzg rzgVar, WindowInsets windowInsets) {
            super(rzgVar, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // rzg.j
        public kf7 i() {
            if (this.o == null) {
                this.o = kf7.c(this.c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // rzg.j
        public kf7 k() {
            if (this.n == null) {
                this.n = kf7.c(this.c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // rzg.j
        public kf7 m() {
            if (this.p == null) {
                this.p = kf7.c(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // rzg.e, rzg.j
        public rzg n(int i, int i2, int i3, int i4) {
            return rzg.h(null, this.c.inset(i, i2, i3, i4));
        }

        @Override // rzg.f, rzg.j
        public void u(kf7 kf7Var) {
        }

        public h(rzg rzgVar, h hVar) {
            super(rzgVar, hVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }
    }

    public static class b extends d {
        public final WindowInsets.Builder c;

        public b(rzg rzgVar) {
            super(rzgVar);
            WindowInsets windowInsetsG = rzgVar.g();
            this.c = windowInsetsG != null ? tzg.a(windowInsetsG) : szg.a();
        }

        @Override // rzg.d
        public rzg b() {
            a();
            rzg rzgVarH = rzg.h(null, this.c.build());
            rzgVarH.a.r(this.b);
            return rzgVarH;
        }

        @Override // rzg.d
        public void d(kf7 kf7Var) {
            this.c.setMandatorySystemGestureInsets(kf7Var.d());
        }

        @Override // rzg.d
        public void e(kf7 kf7Var) {
            this.c.setStableInsets(kf7Var.d());
        }

        @Override // rzg.d
        public void f(kf7 kf7Var) {
            this.c.setSystemGestureInsets(kf7Var.d());
        }

        @Override // rzg.d
        public void g(kf7 kf7Var) {
            this.c.setSystemWindowInsets(kf7Var.d());
        }

        @Override // rzg.d
        public void h(kf7 kf7Var) {
            this.c.setTappableElementInsets(kf7Var.d());
        }

        public b() {
            this.c = szg.a();
        }
    }

    public rzg(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new i(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.a = new h(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new g(this, windowInsets);
        } else {
            this.a = new f(this, windowInsets);
        }
    }
}
