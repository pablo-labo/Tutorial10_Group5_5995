package defpackage;

import android.util.Log;
import com.facebook.soloader.a;
import defpackage.gwf;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class hwf implements ntc {
    public static kg5 a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        return new kg5(0.0f, f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public static final defpackage.gwf c(defpackage.gwf r5, defpackage.lf0 r6) {
        /*
            r5.getClass()
            lf0 r0 = defpackage.pf0.a(r5)
            if (r0 != r6) goto La
            return r5
        La:
            oma r0 = defpackage.pf0.b
            qf8<java.lang.Object>[] r1 = defpackage.pf0.a
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = r0.a(r1, r5)
            of0 r0 = (defpackage.of0) r0
            if (r0 == 0) goto L5d
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L20
            goto L4e
        L20:
            it0<T> r1 = r5.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r1.next()
            r4 = r3
            ewf r4 = (defpackage.ewf) r4
            boolean r4 = defpackage.wl7.b(r4, r0)
            if (r4 != 0) goto L2b
            r2.add(r3)
            goto L2b
        L42:
            int r0 = r2.size()
            it0<T> r1 = r5.a
            int r1 = r1.a()
            if (r0 != r1) goto L50
        L4e:
            r0 = r5
            goto L59
        L50:
            gwf$a r0 = defpackage.gwf.b
            r0.getClass()
            gwf r0 = gwf.a.e(r2)
        L59:
            if (r0 != 0) goto L5c
            goto L5d
        L5c:
            r5 = r0
        L5d:
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L6e
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L6e
            goto L99
        L6e:
            of0 r0 = new of0
            r0.<init>(r6)
            gwf$a r6 = defpackage.gwf.b
            yd8 r1 = r0.b()
            r6.getClass()
            java.lang.String r1 = r1.p()
            r1.getClass()
            java.io.Serializable r2 = r6.a
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            vm6 r3 = new vm6
            r4 = 2
            r3.<init>(r6, r4)
            int r6 = r6.f(r2, r1, r3)
            it0<T> r1 = r5.a
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L9a
        L99:
            return r5
        L9a:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Laa
            gwf r5 = new gwf
            java.util.List r6 = defpackage.u63.Z(r0)
            r5.<init>(r6)
            return r5
        Laa:
            java.util.List r5 = defpackage.z92.z1(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.ArrayList r5 = defpackage.z92.g1(r0, r5)
            gwf r5 = gwf.a.e(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwf.c(gwf, lf0):gwf");
    }

    public static final gwf d(lf0 lf0Var) {
        lf0Var.getClass();
        if (lf0Var.isEmpty()) {
            gwf.b.getClass();
            return gwf.c;
        }
        gwf.a aVar = gwf.b;
        List listZ = u63.Z(new of0(lf0Var));
        aVar.getClass();
        return gwf.a.e(listZ);
    }

    public static final String e(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        byte[] bytes = str.getBytes(a32.b);
        bytes.getClass();
        for (byte b : bytes) {
            int i = b & 255;
            if ((97 > i || i >= 123) && ((65 > i || i >= 91) && !((48 <= i && i < 58) || i == 45 || i == 46 || i == 95 || i == 126))) {
                ypd.s(16);
                String string = Integer.toString(i, 16);
                string.getClass();
                String upperCase = string.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                if (upperCase.length() == 1) {
                    upperCase = "0".concat(upperCase);
                }
                sb.append("%".concat(upperCase));
            } else {
                sb.append((char) i);
            }
        }
        return sb.toString();
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
    public static final Object f(pu2 pu2Var) {
        Object obj;
        v03 context = pu2Var.getContext();
        u63.u(context);
        lu2 lu2VarV = ewa.v(pu2Var);
        v64 v64Var = lu2VarV instanceof v64 ? (v64) lu2VarV : null;
        g13 g13Var = g13.a;
        if (v64Var == null) {
            obj = j6g.a;
        } else {
            y03 y03Var = v64Var.d;
            if (mh2.z(y03Var, context)) {
                v64Var.f = j6g.a;
                v64Var.c = 1;
                y03Var.w1(context, v64Var);
            } else {
                z5h z5hVar = new z5h();
                v03 v03VarD1 = context.d1(z5hVar);
                j6g j6gVar = j6g.a;
                v64Var.f = j6gVar;
                v64Var.c = 1;
                y03Var.w1(v03VarD1, v64Var);
                if (z5hVar.b) {
                    d05 d05VarA = ukf.a();
                    zs0<x64<?>> zs0Var = d05VarA.e;
                    if (!(zs0Var != null ? zs0Var.isEmpty() : true)) {
                        if (d05VarA.c >= 4294967296L) {
                            v64Var.f = j6gVar;
                            v64Var.c = 1;
                            d05VarA.L1(v64Var);
                        } else {
                            d05VarA.O1(true);
                            try {
                                v64Var.run();
                                do {
                                } while (d05VarA.S1());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = j6g.a;
                }
            }
            obj = g13Var;
        }
        return obj == g13Var ? obj : j6g.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ntc
    public boolean b(UnsatisfiedLinkError unsatisfiedLinkError, ene[] eneVarArr) {
        for (a aVar : eneVarArr) {
            if (aVar instanceof rv0) {
                Log.e("SoLoader", "Waiting on SoSource ".concat(aVar.c()));
                aVar.a();
            }
        }
        return true;
    }
}
