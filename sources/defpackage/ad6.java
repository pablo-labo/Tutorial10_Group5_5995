package defpackage;

import android.graphics.Canvas;
import defpackage.ax1;
import defpackage.jwa;

/* JADX INFO: loaded from: classes.dex */
public final class ad6 {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(gb4 gb4Var, xc6 xc6Var) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f;
        ww1 ww1VarA = gb4Var.w1().a();
        xc6 xc6Var2 = gb4Var.w1().b;
        zc6 zc6Var = xc6Var.a;
        if (xc6Var.s) {
            return;
        }
        xc6Var.a();
        if (!zc6Var.C()) {
            try {
                xc6Var.a.O(xc6Var.b, xc6Var.c, xc6Var, xc6Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = zc6Var.S() > 0.0f;
        if (z4) {
            ww1VarA.j();
        }
        Canvas canvasA = z40.a(ww1VarA);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = xc6Var.t;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = xc6Var.u;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float fA = zc6Var.a();
            ga2 ga2VarG = zc6Var.g();
            int I = zc6Var.I();
            if (fA < 1.0f || I != 3 || ga2VarG != null || zc6Var.z() == 1) {
                f80 f80VarA = xc6Var.p;
                if (f80VarA == null) {
                    f80VarA = g80.a();
                    xc6Var.p = f80VarA;
                }
                f80VarA.b(fA);
                f80VarA.j(I);
                f80VarA.k(ga2VarG);
                canvasA = canvasA;
                f = f2;
                canvasA.saveLayer(f, f3, f4, f5, f80VarA.a);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f = f2;
            }
            canvasA.translate(f, f3);
            canvasA.concat(zc6Var.H());
        }
        boolean z5 = !zIsHardwareAccelerated && xc6Var.w;
        if (z5) {
            ww1VarA.o();
            jwa jwaVarD = xc6Var.d();
            if (jwaVarD instanceof jwa.b) {
                ww1VarA.i(((jwa.b) jwaVarD).a);
            } else if (jwaVarD instanceof jwa.c) {
                m80 m80VarA = xc6Var.m;
                if (m80VarA != null) {
                    m80VarA.k();
                } else {
                    m80VarA = p80.a();
                    xc6Var.m = m80VarA;
                }
                m80VarA.o(((jwa.c) jwaVarD).a);
                ww1VarA.c(m80VarA);
            } else {
                if (!(jwaVarD instanceof jwa.a)) {
                    l.g();
                    return;
                }
                ww1VarA.c(((jwa.a) jwaVarD).a);
            }
        }
        if (xc6Var2 != null) {
            f42 f42Var = xc6Var2.r;
            if (!f42Var.e) {
                zd7.a("Only add dependencies during a tracking");
            }
            a4a<xc6> a4aVar = f42Var.c;
            if (a4aVar != null) {
                a4aVar.d(xc6Var);
            } else if (f42Var.a != null) {
                a4a<xc6> a4aVarA = nnd.a();
                xc6 xc6Var3 = f42Var.a;
                xc6Var3.getClass();
                a4aVarA.d(xc6Var3);
                a4aVarA.d(xc6Var);
                f42Var.c = a4aVarA;
                f42Var.a = null;
            } else {
                f42Var.a = xc6Var;
            }
            a4a<xc6> a4aVar2 = f42Var.d;
            if (a4aVar2 != null) {
                z3 = !a4aVar2.l(xc6Var);
            } else if (f42Var.b != xc6Var) {
                z3 = true;
            } else {
                f42Var.b = null;
                z3 = false;
            }
            if (z3) {
                xc6Var.q++;
            }
        }
        if (((y40) ww1VarA).a.isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = canvasA;
            zc6Var.L(ww1VarA);
        } else {
            ax1 ax1Var = xc6Var.o;
            if (ax1Var == null) {
                ax1Var = new ax1();
                xc6Var.o = ax1Var;
            }
            ax1.b bVar = ax1Var.b;
            iy3 iy3Var = xc6Var.b;
            vl8 vl8Var = xc6Var.c;
            long jY = hh1.Y(xc6Var.u);
            iy3 iy3VarB = bVar.b();
            vl8 vl8VarC = bVar.c();
            ww1 ww1VarA2 = bVar.a();
            z2 = z5;
            canvas = canvasA;
            long jD = bVar.d();
            z = z4;
            xc6 xc6Var4 = bVar.b;
            bVar.f(iy3Var);
            bVar.g(vl8Var);
            bVar.e(ww1VarA);
            bVar.h(jY);
            bVar.b = xc6Var;
            ww1VarA.o();
            try {
                xc6Var.c(ax1Var);
            } finally {
                ww1VarA.h();
                bVar.f(iy3VarB);
                bVar.g(vl8VarC);
                bVar.e(ww1VarA2);
                bVar.h(jD);
                bVar.b = xc6Var4;
            }
        }
        if (z2) {
            ww1VarA.h();
        }
        if (z) {
            ww1VarA.p();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }
}
