package defpackage;

import defpackage.ewc;
import defpackage.hi8;
import defpackage.in9;
import defpackage.ke8;
import defpackage.lf8;
import defpackage.te8;
import defpackage.vz1;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ce8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ce8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.gu5
    public final Object invoke() {
        ?? Z;
        int i = this.a;
        List listAsList = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ke8.a aVar = (ke8.a) obj;
                ewc.a aVar2 = aVar.l;
                qf8<Object>[] qf8VarArr = ke8.a.q;
                qf8<Object> qf8Var = qf8VarArr[10];
                Object objInvoke = aVar2.invoke();
                objInvoke.getClass();
                ewc.a aVar3 = aVar.n;
                qf8<Object> qf8Var2 = qf8VarArr[12];
                Object objInvoke2 = aVar3.invoke();
                objInvoke2.getClass();
                return z92.h1((Collection) objInvoke, (Collection) objInvoke2);
            case 1:
                lf8.a aVar4 = (lf8.a) obj;
                ewc.a aVar5 = aVar4.c;
                qf8<Object> qf8Var3 = lf8.a.g[0];
                awc awcVar = (awc) aVar5.invoke();
                if (awcVar == null) {
                    return in9.b.b;
                }
                ewc.a aVar6 = aVar4.a;
                qf8<Object> qf8Var4 = te8.a.b[0];
                Object objInvoke3 = aVar6.invoke();
                objInvoke3.getClass();
                uya uyaVar = ((phd) objInvoke3).b;
                f14 f14Var = uyaVar.a;
                ConcurrentHashMap<a62, in9> concurrentHashMap = uyaVar.c;
                Class<?> cls = awcVar.a;
                a62 a62VarA = wuc.a(cls);
                in9 in9Var = concurrentHashMap.get(a62VarA);
                if (in9Var == null) {
                    mq5 mq5Var = wuc.a(cls).a;
                    hi8 hi8Var = awcVar.b;
                    hi8.a aVar7 = hi8Var.a;
                    hi8.a aVar8 = hi8.a.MULTIFILE_CLASS;
                    if (aVar7 == aVar8) {
                        String[] strArr = hi8Var.c;
                        if (aVar7 != aVar8) {
                            strArr = null;
                        }
                        if (strArr != null) {
                            listAsList = Arrays.asList(strArr);
                            listAsList.getClass();
                        }
                        if (listAsList == null) {
                            listAsList = zr4.a;
                        }
                        Z = new ArrayList();
                        Iterator it = listAsList.iterator();
                        while (it.hasNext()) {
                            mq5 mq5Var2 = new mq5(xc8.c((String) it.next()).a.replace('/', JwtParser.SEPARATOR_CHAR));
                            a62 a62Var = new a62(mq5Var2.b(), mq5Var2.a.f());
                            bwc bwcVar = uyaVar.b;
                            f14Var.c().c.getClass();
                            oi8 oi8VarA = gi8.a(bwcVar, a62Var, us9.g);
                            if (oi8VarA != null) {
                                Z.add(oi8VarA);
                            }
                        }
                    } else {
                        Z = u63.Z(awcVar);
                    }
                    es4 es4Var = new es4(f14Var.c().b, mq5Var);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((Iterable) Z).iterator();
                    while (it2.hasNext()) {
                        p14 p14VarA = f14Var.a(es4Var, (oi8) it2.next());
                        if (p14VarA != null) {
                            arrayList.add(p14VarA);
                        }
                    }
                    in9 in9VarA = vz1.a.a("package " + mq5Var + " (" + awcVar + ')', z92.z1(arrayList));
                    in9 in9VarPutIfAbsent = concurrentHashMap.putIfAbsent(a62VarA, in9VarA);
                    in9Var = in9VarPutIfAbsent == null ? in9VarA : in9VarPutIfAbsent;
                }
                in9Var.getClass();
                return in9Var;
            case 2:
                yx9 yx9Var = (yx9) obj;
                ze4 ze4Var = yx9Var.V;
                if (ze4Var == null) {
                    String str = yx9Var.getName().a;
                    str.getClass();
                    ja.p("Dependencies of module ", str, " were not set before querying module content");
                    return null;
                }
                List list = (List) ze4Var.b;
                yx9Var.K0();
                list.contains(yx9Var);
                List list2 = list;
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    ((yx9) it3.next()).getClass();
                }
                ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    nya nyaVar = ((yx9) it4.next()).W;
                    nyaVar.getClass();
                    arrayList2.add(nyaVar);
                }
                return new zl2(arrayList2, "CompositeProvider@ModuleDescriptor for " + yx9Var.getName());
            default:
                v04 v04Var = ((kte) obj).b;
                return u63.a0(jz3.f(v04Var), jz3.g(v04Var));
        }
    }
}
