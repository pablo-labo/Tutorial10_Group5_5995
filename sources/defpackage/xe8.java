package defpackage;

import defpackage.ad8;
import defpackage.gd8;
import defpackage.glg;
import defpackage.hi8;
import defpackage.qv1;
import defpackage.ue0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xe8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xe8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Object objQ;
        qv1<Constructor<?>> qv1VarE;
        qv1<Constructor<?>> bVar;
        int i = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                ye8 ye8Var = (ye8) obj;
                a62 a62Var = rhd.a;
                kv5 kv5VarF = ye8Var.z();
                te8 te8Var = ye8Var.V;
                ad8 ad8VarC = rhd.c(kv5VarF);
                boolean z2 = ad8VarC instanceof ad8.d;
                ue0.a aVar = ue0.a.b;
                if (z2) {
                    if (ye8Var.B()) {
                        Class<?> clsJ = te8Var.j();
                        List<mf8> parameters = ye8Var.getParameters();
                        ArrayList arrayList = new ArrayList(t92.r0(parameters, 10));
                        Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((mf8) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        return new ue0(clsJ, arrayList, aVar);
                    }
                    String str = ((ad8.d) ad8VarC).a.b;
                    te8Var.getClass();
                    str.getClass();
                    objQ = te8.D(te8Var.j(), te8Var.B(str, false).a);
                } else if (ad8VarC instanceof ad8.e) {
                    kv5 kv5VarF2 = ye8Var.z();
                    aj3 aj3VarD = kv5VarF2.d();
                    aj3VarD.getClass();
                    if (fe7.c(aj3VarD) && (kv5VarF2 instanceof uq2) && ((uq2) kv5VarF2).c0()) {
                        kv5 kv5VarF3 = ye8Var.z();
                        String str2 = ((ad8.e) ad8VarC).a.b;
                        List<rlg> listI = ye8Var.z().i();
                        listI.getClass();
                        return new glg.b(kv5VarF3, te8Var, str2, listI);
                    }
                    gd8.b bVar2 = ((ad8.e) ad8VarC).a;
                    objQ = te8Var.q(bVar2.a, bVar2.b);
                } else if (ad8VarC instanceof ad8.c) {
                    objQ = ((ad8.c) ad8VarC).a;
                    objQ.getClass();
                } else {
                    if (!(ad8VarC instanceof ad8.b)) {
                        if (!(ad8VarC instanceof ad8.a)) {
                            l.g();
                            return null;
                        }
                        List<Method> list = ((ad8.a) ad8VarC).a;
                        Class<?> clsJ2 = te8Var.j();
                        List<Method> list2 = list;
                        ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new ue0(clsJ2, arrayList2, aVar, ue0.b.a, list);
                    }
                    objQ = ((ad8.b) ad8VarC).a;
                    objQ.getClass();
                }
                if (objQ instanceof Constructor) {
                    qv1VarE = ye8Var.D((Constructor) objQ, ye8Var.z(), false);
                } else {
                    if (!(objQ instanceof Method)) {
                        throw new qi8("Could not compute caller for function: " + ye8Var.z() + " (member = " + objQ + ')');
                    }
                    Method method = (Method) objQ;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        bVar = ye8Var.C() ? new qv1.g.a(wuf.a(ye8Var.X, ye8Var.z()), method) : new qv1.g.e(6, method, z);
                    } else if (ye8Var.z().getAnnotations().p(akg.a) != null) {
                        int i2 = 4;
                        bVar = ye8Var.C() ? new qv1.g.b(i2, method, z) : new qv1.g.f(i2, method, true);
                    } else {
                        qv1VarE = ye8Var.E(method, false);
                    }
                    qv1VarE = bVar;
                }
                return wuf.b(ye8Var.z(), qv1VarE, false);
            case 1:
                Type typeL = ((cg8) obj).l();
                typeL.getClass();
                return wuc.c(typeL);
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) zte.c(((hp8) obj).X, hp8.b0[0])).entrySet()) {
                    String str3 = (String) entry.getKey();
                    oi8 oi8Var = (oi8) entry.getValue();
                    xc8 xc8VarC = xc8.c(str3);
                    hi8 hi8VarA = oi8Var.a();
                    int iOrdinal = hi8VarA.a.ordinal();
                    if (iOrdinal == 2) {
                        map.put(xc8VarC, xc8VarC);
                    } else if (iOrdinal == 5) {
                        String str4 = hi8VarA.f;
                        if (hi8VarA.a != hi8.a.MULTIFILE_CLASS_PART) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            map.put(xc8VarC, xc8.c(str4));
                        }
                    }
                }
                return map;
        }
    }
}
