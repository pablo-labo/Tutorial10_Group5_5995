package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class n14 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n14(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Set setKeySet = ((o14) obj).X.d.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setKeySet) {
                    a62 a62Var = (a62) obj2;
                    if (!a62Var.g() && !y52.c.contains(a62Var)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((a62) it.next()).f());
                }
                return arrayList2;
            case 1:
                return ((qp8) obj).i(lz3.p, null);
            default:
                byf byfVarG = ((TypeSubstitutor) obj).g();
                byfVarG.getClass();
                return TypeSubstitutor.e(byfVarG);
        }
    }
}
