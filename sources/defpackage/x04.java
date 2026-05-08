package defpackage;

import defpackage.pc8;
import defpackage.v04;
import defpackage.z4d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x04 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                HashSet hashSet = new HashSet();
                v04 v04Var = v04.this;
                v04.b bVar = v04Var.c0;
                h04 h04Var = v04Var.a0;
                u4c u4cVar = v04Var.e;
                Iterator<ui8> it = bVar.b().iterator();
                while (it.hasNext()) {
                    for (aj3 aj3Var : z4d.a.a(it.next().n(), null, 3)) {
                        if ((aj3Var instanceof sfe) || (aj3Var instanceof d4c)) {
                            hashSet.add(((hv1) aj3Var).getName());
                        }
                    }
                }
                List<b5c> listR0 = u4cVar.r0();
                listR0.getClass();
                Iterator<T> it2 = listR0.iterator();
                while (it2.hasNext()) {
                    hashSet.add(q8a.b(h04Var.b, ((b5c) it2.next()).T()));
                }
                List<g5c> listD0 = u4cVar.D0();
                listD0.getClass();
                Iterator<T> it3 = listD0.iterator();
                while (it3.hasNext()) {
                    hashSet.add(q8a.b(h04Var.b, ((g5c) it3.next()).S()));
                }
                return bbe.o(hashSet, hashSet);
            case 1:
                pc8 pc8Var = (pc8) obj;
                r4 r4Var = pc8Var.f;
                if (r4Var == null) {
                    g7.l("JvmBuiltins instance has not been initialized properly");
                    return null;
                }
                pc8.a aVar = (pc8.a) r4Var.invoke();
                pc8Var.f = null;
                return aVar;
            case 2:
                return (hsc) obj;
            default:
                ((hp8) obj).V.getClass();
                zr4 zr4Var = zr4.a;
                ArrayList arrayList = new ArrayList(t92.r0(zr4Var, 10));
                Iterator<E> it4 = zr4Var.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((nv7) it4.next()).h());
                }
                return arrayList;
        }
    }
}
