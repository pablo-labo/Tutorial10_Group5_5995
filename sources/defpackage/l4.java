package defpackage;

import defpackage.m4;
import defpackage.s62;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ l4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ofe ofeVar;
        kwf kwfVarG0;
        List<rxf> parameters;
        List<wxf> listK0;
        int i = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m4.a aVar = (m4.a) obj;
                aVar.getClass();
                zi8 zi8Var = aVar.a;
                dfe dfeVar = (dfe) ((m4) obj2);
                if (dfeVar.e && zi8Var != null) {
                    zi8Var.getClass();
                    if (zi8Var instanceof ui8) {
                        z = zi8Var instanceof cjc;
                    } else {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(zi8Var);
                        sb.append(", ");
                        h5.k(ia.m(fwc.a, zi8Var.getClass(), sb));
                    }
                    if (z) {
                        return null;
                    }
                }
                if (zi8Var == null || (kwfVarG0 = (ofeVar = ofe.a).g0(zi8Var)) == null) {
                    return null;
                }
                if (kwfVarG0 instanceof kwf) {
                    parameters = kwfVarG0.getParameters();
                    parameters.getClass();
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(kwfVarG0);
                    sb2.append(", ");
                    h5.k(ia.m(fwc.a, kwfVarG0.getClass(), sb2));
                    parameters = null;
                }
                List<rxf> list = parameters;
                zi8Var.getClass();
                if (zi8Var instanceof ui8) {
                    listK0 = ((ui8) zi8Var).K0();
                } else {
                    StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb3.append(zi8Var);
                    sb3.append(", ");
                    h5.k(ia.m(fwc.a, zi8Var.getClass(), sb3));
                    listK0 = null;
                }
                List<wxf> list2 = listK0;
                Iterator<T> it = list.iterator();
                Iterator<T> it2 = list2.iterator();
                ArrayList arrayList = new ArrayList(Math.min(t92.r0(list, 10), t92.r0(list2, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    txf txfVar = (txf) it.next();
                    p7g p7gVarO = s62.a.o(ofeVar, (dwf) it2.next());
                    sw7 sw7Var = aVar.b;
                    arrayList.add(p7gVarO == null ? new m4.a(null, sw7Var, txfVar) : new m4.a(p7gVarO, dfeVar.e().b(sw7Var, p7gVarO.getAnnotations()), txfVar));
                }
                return arrayList;
            case 1:
                ((ArrayList) obj2).get(((Number) obj).intValue());
                return null;
            case 2:
                n8a n8aVar = (n8a) obj;
                n8aVar.getClass();
                return ((gp8) obj2).N(n8aVar);
            case 3:
                gqf gqfVar = (gqf) obj2;
                pw7 pw7Var = (pw7) obj;
                pw7Var.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) gqfVar.d;
                cj3 cj3Var = (cj3) gqfVar.c;
                Integer num = (Integer) linkedHashMap.get(pw7Var);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                mp8 mp8Var = (mp8) gqfVar.b;
                mp8Var.getClass();
                return new wp8(boa.n(new mp8(mp8Var.a, gqfVar, mp8Var.c), cj3Var.getAnnotations()), pw7Var, gqfVar.a + iIntValue, cj3Var);
            case 4:
                mq5 mq5Var = (mq5) obj;
                mq5Var.getClass();
                return new es4(((cla) obj2).b, mq5Var);
            default:
                mq5 mq5Var2 = (mq5) obj2;
                mq5 mq5Var3 = (mq5) obj;
                mq5Var3.getClass();
                if (!mq5Var3.a.c() && mq5Var3.b().equals(mq5Var2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
