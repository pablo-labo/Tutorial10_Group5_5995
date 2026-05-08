package kotlin.reflect.jvm.internal.impl.types;

import defpackage.byf;
import defpackage.ie7;
import defpackage.jx1;
import defpackage.kx1;
import defpackage.kx4;
import defpackage.kyf;
import defpackage.lx4;
import defpackage.np1;
import defpackage.nwf;
import defpackage.ui8;
import defpackage.v54;
import defpackage.wxf;
import defpackage.ylg;
import defpackage.yxf;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeSubstitutor {
    public static final TypeSubstitutor b = e(byf.a);
    public final byf a;

    public static final class SubstitutionException extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NO_CONFLICT", 0);
            a = aVar;
            a aVar2 = new a("IN_IN_OUT_POSITION", 1);
            b = aVar2;
            a aVar3 = new a("OUT_IN_IN_POSITION", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public TypeSubstitutor(byf byfVar) {
        if (byfVar != null) {
            this.a = byfVar;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.a(int):void");
    }

    public static ylg b(ylg ylgVar, ylg ylgVar2) {
        if (ylgVar == null) {
            a(38);
            throw null;
        }
        if (ylgVar2 == null) {
            a(39);
            throw null;
        }
        ylg ylgVar3 = ylg.INVARIANT;
        if (ylgVar == ylgVar3) {
            if (ylgVar2 != null) {
                return ylgVar2;
            }
            a(40);
            throw null;
        }
        if (ylgVar2 == ylgVar3) {
            if (ylgVar != null) {
                return ylgVar;
            }
            a(41);
            throw null;
        }
        if (ylgVar == ylgVar2) {
            if (ylgVar2 != null) {
                return ylgVar2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + ylgVar + "' and projection kind '" + ylgVar2 + "' cannot be combined");
    }

    public static a c(ylg ylgVar, ylg ylgVar2) {
        ylg ylgVar3 = ylg.OUT_VARIANCE;
        ylg ylgVar4 = ylg.IN_VARIANCE;
        return (ylgVar == ylgVar4 && ylgVar2 == ylgVar3) ? a.c : (ylgVar == ylgVar3 && ylgVar2 == ylgVar4) ? a.b : a.a;
    }

    public static TypeSubstitutor d(ui8 ui8Var) {
        if (ui8Var == null) {
            a(6);
            throw null;
        }
        return e(nwf.b.a(ui8Var.M0(), ui8Var.K0()));
    }

    public static TypeSubstitutor e(byf byfVar) {
        if (byfVar != null) {
            return new TypeSubstitutor(byfVar);
        }
        a(0);
        throw null;
    }

    public static TypeSubstitutor f(byf byfVar, byf byfVar2) {
        if (byfVar == null) {
            a(3);
            throw null;
        }
        if (byfVar2 == null) {
            a(4);
            throw null;
        }
        int i = v54.d;
        if (byfVar.e()) {
            byfVar = byfVar2;
        } else if (!byfVar2.e()) {
            byfVar = new v54(byfVar, byfVar2);
        }
        return e(byfVar);
    }

    public static String i(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ie7.o(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final byf g() {
        byf byfVar = this.a;
        if (byfVar != null) {
            return byfVar;
        }
        a(8);
        throw null;
    }

    public final ui8 h(ui8 ui8Var, ylg ylgVar) {
        if (ui8Var == null) {
            a(9);
            throw null;
        }
        if (this.a.e()) {
            return ui8Var;
        }
        try {
            ui8 type = k(new yxf(ui8Var, ylgVar), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (SubstitutionException e) {
            return lx4.c(kx4.X, e.getMessage());
        }
    }

    public final ui8 j(ui8 ui8Var, ylg ylgVar) {
        if (ui8Var == null) {
            a(14);
            throw null;
        }
        if (ylgVar == null) {
            a(15);
            throw null;
        }
        wxf yxfVar = new yxf(g().f(ui8Var, ylgVar), ylgVar);
        byf byfVar = this.a;
        if (!byfVar.e()) {
            try {
                yxfVar = k(yxfVar, null, 0);
            } catch (SubstitutionException unused) {
                yxfVar = null;
            }
        }
        if (byfVar.a() || byfVar.b()) {
            boolean zB = byfVar.b();
            if (yxfVar == null) {
                yxfVar = null;
            } else if (!yxfVar.b()) {
                ui8 type = yxfVar.getType();
                type.getClass();
                if (kyf.c(type, np1.c, null)) {
                    ylg ylgVarC = yxfVar.c();
                    ylgVarC.getClass();
                    if (ylgVarC == ylg.OUT_VARIANCE) {
                        yxfVar = new yxf(kx1.a(type).b, ylgVarC);
                    } else if (zB) {
                        yxfVar = new yxf(kx1.a(type).a, ylgVarC);
                    } else {
                        TypeSubstitutor typeSubstitutorE = e(new jx1());
                        if (!typeSubstitutorE.a.e()) {
                            try {
                                yxfVar = typeSubstitutorE.k(yxfVar, null, 0);
                            } catch (SubstitutionException unused2) {
                                yxfVar = null;
                            }
                        }
                    }
                }
            }
        }
        if (yxfVar == null) {
            return null;
        }
        return yxfVar.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wxf k(defpackage.wxf r17, defpackage.rxf r18, int r19) throws kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.SubstitutionException {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.k(wxf, rxf, int):wxf");
    }
}
