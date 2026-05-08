package defpackage;

import defpackage.ere;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class bd2 {
    public static final LinkedHashSet a;

    static {
        Set<bnb> set = bnb.a;
        ArrayList arrayList = new ArrayList(t92.r0(set, 10));
        for (bnb bnbVar : set) {
            bnbVar.getClass();
            arrayList.add(ere.l.a(bnbVar.m()));
        }
        ArrayList<mq5> arrayListG1 = z92.g1(ere.a.j.g(), z92.g1(ere.a.h.g(), z92.g1(ere.a.f.g(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (mq5 mq5Var : arrayListG1) {
            mq5Var.getClass();
            linkedHashSet.add(new a62(mq5Var.b(), mq5Var.a.f()));
        }
        a = linkedHashSet;
    }
}
