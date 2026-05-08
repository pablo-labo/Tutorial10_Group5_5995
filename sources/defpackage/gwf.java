package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class gwf extends fx0<ewf<?>, ewf<?>> {
    public static final a b = new a(1);
    public static final gwf c = new gwf(zr4.a);

    public static final class a extends a6 {
        public static gwf e(List list) {
            return list.isEmpty() ? gwf.c : new gwf(list);
        }

        public final int f(ConcurrentHashMap concurrentHashMap, String str, vm6 vm6Var) {
            int iIntValue;
            concurrentHashMap.getClass();
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = vm6Var.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }
    }

    public gwf() {
        throw null;
    }

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
    public gwf(List<? extends ewf<?>> list) {
        sr4 sr4Var = sr4.a;
        sr4Var.getClass();
        this.a = sr4Var;
        for (ewf<?> ewfVar : list) {
            yd8<? extends T> yd8VarB = ewfVar.b();
            yd8VarB.getClass();
            String strP = yd8VarB.p();
            strP.getClass();
            a aVar = b;
            int iF = aVar.f((ConcurrentHashMap) aVar.a, strP, new vm6(aVar, 2));
            int iA = this.a.a();
            if (iA != 0) {
                if (iA == 1) {
                    it0<T> it0Var = this.a;
                    try {
                        it0Var.getClass();
                        asa asaVar = (asa) it0Var;
                        int i = asaVar.b;
                        if (i == iF) {
                            this.a = new asa(ewfVar, iF);
                        } else {
                            jt0 jt0Var = new jt0();
                            jt0Var.a = new Object[20];
                            jt0Var.b = 0;
                            jt0Var.b(i, asaVar.a);
                            this.a = jt0Var;
                        }
                    } catch (ClassCastException e) {
                        ja.m(fx0.b(it0Var, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.a.b(iF, ewfVar);
            } else {
                it0<T> it0Var2 = this.a;
                if (!(it0Var2 instanceof sr4)) {
                    r6.g(fx0.b(it0Var2, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.a = new asa(ewfVar, iF);
            }
        }
    }
}
