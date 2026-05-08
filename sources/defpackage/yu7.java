package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class yu7 {
    public static final a a;
    public static final b b;
    public static final c c;
    public static final HashMap d;

    public static class a extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            if (aj3Var != null) {
                return yu7.c(fj3Var, aj3Var);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
        }
    }

    public static class b extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            if (aj3Var != null) {
                return yu7.b(jscVar, fj3Var, aj3Var);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
        }
    }

    public static class c extends ws3 {
        @Override // defpackage.e04
        public final boolean c(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
            if (aj3Var != null) {
                return yu7.b(jscVar, fj3Var, aj3Var);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    static {
        a aVar = new a(zw7.d);
        a = aVar;
        b bVar = new b(bx7.d);
        b = bVar;
        c cVar = new c(ax7.d);
        c = cVar;
        HashMap map = new HashMap();
        d = map;
        map.put(aVar.a, aVar);
        map.put(bVar.a, bVar);
        map.put(cVar.a, cVar);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(jsc jscVar, fj3 fj3Var, aj3 aj3Var) {
        fj3 fj3VarT;
        if (aj3Var == null) {
            a(1);
            throw null;
        }
        if (fj3Var instanceof hv1) {
            fj3VarT = yz3.t((hv1) fj3Var);
        } else {
            int i = yz3.a;
            fj3VarT = fj3Var;
        }
        if (c(fj3VarT, aj3Var)) {
            return true;
        }
        return d04.c.c(jscVar, fj3Var, aj3Var);
    }

    public static boolean c(fj3 fj3Var, aj3 aj3Var) {
        if (fj3Var == null) {
            a(2);
            throw null;
        }
        if (aj3Var == null) {
            a(3);
            throw null;
        }
        lya lyaVar = (lya) yz3.i(fj3Var, lya.class, false);
        lya lyaVar2 = (lya) yz3.i(aj3Var, lya.class, false);
        return (lyaVar2 == null || lyaVar == null || !lyaVar.h().equals(lyaVar2.h())) ? false : true;
    }
}
