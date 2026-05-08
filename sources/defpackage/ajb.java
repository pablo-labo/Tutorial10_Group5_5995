package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ajb {
    public final ixf a;
    public final List<ixf> b;
    public final String c;
    public final ajb d;

    public ajb(ixf ixfVar, List<ixf> list, String str) {
        list.getClass();
        this.a = ixfVar;
        this.b = list;
        this.c = str;
        ajb ajbVar = null;
        if (str != null) {
            ixf ixfVarA = ixfVar != null ? ixfVar.a() : null;
            List<ixf> list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            for (ixf ixfVar2 : list2) {
                arrayList.add(ixfVar2 != null ? ixfVar2.a() : null);
            }
            ajbVar = new ajb(ixfVarA, arrayList, null);
        }
        this.d = ajbVar;
    }

    public ajb() {
        this(null, zr4.a, null);
    }
}
