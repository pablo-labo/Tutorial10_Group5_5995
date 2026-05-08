package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class d40<T> {
    public final Function1<Float, Float> a;
    public final gu5<Float> b;
    public final yd0<Float> c;
    public final Function1<T, Boolean> d;
    public final g4a g;
    public final az3 h;
    public final az3 i;
    public final x2a k;
    public final g4a l;
    public final g4a m;
    public final u30 n;
    public final vi7 e = new vi7();
    public final z30 f = new z30(this);
    public final x2a j = g.a(Float.NaN);

    public d40(Enum r1, Function1 function1, gu5 gu5Var, yd0 yd0Var, Function1 function12) {
        this.a = function1;
        this.b = gu5Var;
        this.c = yd0Var;
        this.d = function12;
        this.g = r.f(r1);
        int i = 0;
        this.h = r.c(new i30(this, i));
        this.i = r.c(new j30(this, i));
        r.d(new k30(this, i), wab.a0);
        this.k = g.a(0.0f);
        this.l = r.f(null);
        this.m = r.f(new mb9(bs4.a));
        this.n = new u30(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.n4a r8, defpackage.x30 r9, defpackage.pu2 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.m30
            if (r0 == 0) goto L13
            r0 = r10
            m30 r0 = (defpackage.m30) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            m30 r0 = new m30
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 0
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r3 = r7.d
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            x2a r6 = r7.j
            if (r1 == 0) goto L34
            if (r1 != r5) goto L2e
            defpackage.r7d.b(r10)     // Catch: java.lang.Throwable -> L2c
            goto L51
        L2c:
            r8 = move-exception
            goto L88
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L34:
            defpackage.r7d.b(r10)
            vi7 r10 = r7.e     // Catch: java.lang.Throwable -> L2c
            p30 r1 = new p30     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r7, r2, r9)     // Catch: java.lang.Throwable -> L2c
            r0.label = r5     // Catch: java.lang.Throwable -> L2c
            r10.getClass()     // Catch: java.lang.Throwable -> L2c
            xi7 r9 = new xi7     // Catch: java.lang.Throwable -> L2c
            r9.<init>(r8, r10, r1, r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = defpackage.f13.d(r9, r0)     // Catch: java.lang.Throwable -> L2c
            g13 r9 = defpackage.g13.a
            if (r8 != r9) goto L51
            return r9
        L51:
            pa4 r8 = r7.e()
            cme r6 = (defpackage.cme) r6
            float r9 = r6.g()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto L85
            float r9 = r6.g()
            pa4 r10 = r7.e()
            float r10 = r10.f(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 > 0) goto L85
            java.lang.Object r9 = r3.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L85
            r7.h(r8)
        L85:
            j6g r7 = defpackage.j6g.a
            return r7
        L88:
            pa4 r9 = r7.e()
            cme r6 = (defpackage.cme) r6
            float r10 = r6.g()
            java.lang.Object r9 = r9.c(r10)
            if (r9 == 0) goto Lbc
            float r10 = r6.g()
            pa4 r0 = r7.e()
            float r0 = r0.f(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto Lbc
            java.lang.Object r10 = r3.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lbc
            r7.h(r9)
        Lbc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d40.a(n4a, x30, pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9, defpackage.n4a r10, e30.a r11, defpackage.lu2 r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d40.b(java.lang.Object, n4a, e30$a, lu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(float f, float f2, Object obj) {
        pa4<T> pa4VarE = e();
        float f3 = pa4VarE.f(obj);
        float fFloatValue = this.b.invoke().floatValue();
        if (f3 != f && !Float.isNaN(f3)) {
            Function1<Float, Float> function1 = this.a;
            if (f3 < f) {
                if (f2 >= fFloatValue) {
                    T tB = pa4VarE.b(f, true);
                    tB.getClass();
                    return tB;
                }
                T tB2 = pa4VarE.b(f, true);
                tB2.getClass();
                if (f >= Math.abs(Math.abs(function1.invoke(Float.valueOf(Math.abs(pa4VarE.f(tB2) - f3))).floatValue()) + f3)) {
                    return tB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    T tB3 = pa4VarE.b(f, false);
                    tB3.getClass();
                    return tB3;
                }
                T tB4 = pa4VarE.b(f, false);
                tB4.getClass();
                float fAbs = Math.abs(f3 - Math.abs(function1.invoke(Float.valueOf(Math.abs(f3 - pa4VarE.f(tB4)))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return tB4;
                }
            }
        }
        return obj;
    }

    public final float d(float f) {
        float f2 = f(f);
        x2a x2aVar = this.j;
        cme cmeVar = (cme) x2aVar;
        float fG = Float.isNaN(cmeVar.g()) ? 0.0f : cmeVar.g();
        ((cme) x2aVar).q(f2);
        return f2 - fG;
    }

    public final pa4<T> e() {
        return (pa4) ((gme) this.m).getValue();
    }

    public final float f(float f) {
        cme cmeVar = (cme) this.j;
        return nic.B((Float.isNaN(cmeVar.g()) ? 0.0f : cmeVar.g()) + f, e().e(), e().g());
    }

    public final float g() {
        x2a x2aVar = this.j;
        if (!Float.isNaN(((cme) x2aVar).g())) {
            return ((cme) x2aVar).g();
        }
        r6.g("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public final void h(T t) {
        ((gme) this.g).setValue(t);
    }

    public final Object i(float f, pu2 pu2Var) {
        Object value = ((gme) this.g).getValue();
        Object objC = c(g(), f, value);
        boolean zBooleanValue = this.d.invoke((T) objC).booleanValue();
        g13 g13Var = g13.a;
        if (zBooleanValue) {
            Object objB = e30.b(this, objC, f, pu2Var);
            return objB == g13Var ? objB : j6g.a;
        }
        Object objB2 = e30.b(this, value, f, pu2Var);
        return objB2 == g13Var ? objB2 : j6g.a;
    }
}
