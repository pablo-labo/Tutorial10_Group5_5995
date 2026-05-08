package androidx.compose.foundation.layout;

import defpackage.af1;
import defpackage.c20;
import defpackage.ct;
import defpackage.e45;
import defpackage.lr;
import defpackage.o54;
import defpackage.tf7;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;
    public static final WrapContentElement f;
    public static final WrapContentElement g;
    public static final WrapContentElement h;
    public static final WrapContentElement i;

    static {
        o54 o54Var = o54.b;
        a = new FillElement(o54Var, 1.0f);
        o54 o54Var2 = o54.a;
        b = new FillElement(o54Var2, 1.0f);
        o54 o54Var3 = o54.c;
        c = new FillElement(o54Var3, 1.0f);
        af1.a aVar = c20.a.n;
        int i2 = 10;
        d = new WrapContentElement(o54Var, new e45(aVar, i2), aVar);
        af1.a aVar2 = c20.a.m;
        e = new WrapContentElement(o54Var, new e45(aVar2, i2), aVar2);
        af1.b bVar = c20.a.k;
        int i3 = 15;
        f = new WrapContentElement(o54Var2, new lr(bVar, i3), bVar);
        af1.b bVar2 = c20.a.j;
        g = new WrapContentElement(o54Var2, new lr(bVar2, i3), bVar2);
        af1 af1Var = c20.a.e;
        int i4 = 17;
        h = new WrapContentElement(o54Var3, new ct(af1Var, i4), af1Var);
        af1 af1Var2 = c20.a.a;
        i = new WrapContentElement(o54Var3, new ct(af1Var2, i4), af1Var2);
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f2, float f3) {
        return eVar.o(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f2, int i2) {
        float f3 = (i2 & 1) != 0 ? Float.NaN : 280.0f;
        if ((i2 & 2) != 0) {
            f2 = Float.NaN;
        }
        return a(eVar, f3, f2);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f2) {
        return eVar.o(f2 == 1.0f ? b : new FillElement(o54.a, f2));
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, float f2) {
        return eVar.o(f2 == 1.0f ? c : new FillElement(o54.c, f2));
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f2) {
        return eVar.o(f2 == 1.0f ? a : new FillElement(o54.b, f2));
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f2) {
        return eVar.o(new SizeElement(0.0f, f2, 0.0f, f2, true, tf7.a, 5));
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, float f2, float f3) {
        return eVar.o(new SizeElement(0.0f, f2, 0.0f, f3, true, tf7.a, 5));
    }

    public static /* synthetic */ androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return i(eVar, f2, f3);
    }

    public static final androidx.compose.ui.e k(androidx.compose.ui.e eVar, float f2) {
        return eVar.o(new SizeElement(0.0f, f2, 0.0f, f2, false, tf7.a, 5));
    }

    public static final androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f2) {
        return eVar.o(new SizeElement(f2, f2, f2, f2, false, tf7.a));
    }

    public static androidx.compose.ui.e m(androidx.compose.ui.e eVar, float f2, float f3, float f4, float f5, int i2) {
        return eVar.o(new SizeElement(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false, tf7.a));
    }

    public static final androidx.compose.ui.e n(androidx.compose.ui.e eVar, float f2) {
        return eVar.o(new SizeElement(f2, f2, f2, f2, true, tf7.a));
    }

    public static final androidx.compose.ui.e o(androidx.compose.ui.e eVar, float f2, float f3) {
        return eVar.o(new SizeElement(f2, f3, f2, f3, true, tf7.a));
    }

    public static final androidx.compose.ui.e p(androidx.compose.ui.e eVar, float f2, float f3, float f4, float f5) {
        return eVar.o(new SizeElement(f2, f3, f4, f5, true, tf7.a));
    }

    public static /* synthetic */ androidx.compose.ui.e q(androidx.compose.ui.e eVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return p(eVar, f2, f3, f4, f5);
    }

    public static final androidx.compose.ui.e r(androidx.compose.ui.e eVar, float f2) {
        return eVar.o(new SizeElement(f2, 0.0f, f2, 0.0f, true, tf7.a, 10));
    }

    public static final androidx.compose.ui.e s(androidx.compose.ui.e eVar, float f2, float f3) {
        return eVar.o(new SizeElement(f2, 0.0f, f3, 0.0f, true, tf7.a, 10));
    }

    public static /* synthetic */ androidx.compose.ui.e t(androidx.compose.ui.e eVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return s(eVar, f2, f3);
    }

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
    public static androidx.compose.ui.e u(androidx.compose.ui.e eVar, int i2) {
        WrapContentElement wrapContentElement;
        af1.b bVar = c20.a.k;
        if (bVar.equals(bVar)) {
            wrapContentElement = f;
        } else if (bVar.equals(c20.a.j)) {
            wrapContentElement = g;
        } else {
            wrapContentElement = new WrapContentElement(o54.a, new lr(bVar, 15), bVar);
        }
        return eVar.o(wrapContentElement);
    }

    public static androidx.compose.ui.e v(androidx.compose.ui.e eVar, af1 af1Var, int i2) {
        WrapContentElement wrapContentElement;
        int i3 = i2 & 1;
        af1 af1Var2 = c20.a.e;
        if (i3 != 0) {
            af1Var = af1Var2;
        }
        if (af1Var.equals(af1Var2)) {
            wrapContentElement = h;
        } else if (af1Var.equals(c20.a.a)) {
            wrapContentElement = i;
        } else {
            wrapContentElement = new WrapContentElement(o54.c, new ct(af1Var, 17), af1Var);
        }
        return eVar.o(wrapContentElement);
    }

    public static androidx.compose.ui.e w(androidx.compose.ui.e eVar, af1.a aVar, int i2) {
        WrapContentElement wrapContentElement;
        int i3 = i2 & 1;
        af1.a aVar2 = c20.a.n;
        if (i3 != 0) {
            aVar = aVar2;
        }
        if (aVar.equals(aVar2)) {
            wrapContentElement = d;
        } else if (aVar.equals(c20.a.m)) {
            wrapContentElement = e;
        } else {
            wrapContentElement = new WrapContentElement(o54.b, new e45(aVar, 10), aVar);
        }
        return eVar.o(wrapContentElement);
    }
}
