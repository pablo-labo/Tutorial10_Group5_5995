package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class soe {
    public static final LinkedHashSet a;
    public static final a62 b;

    static {
        List<mq5> listA0 = u63.a0(kc8.a, kc8.h, kc8.i, kc8.c, kc8.d, kc8.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (mq5 mq5Var : listA0) {
            mq5Var.getClass();
            linkedHashSet.add(new a62(mq5Var.b(), mq5Var.a.f()));
        }
        a = linkedHashSet;
        mq5 mq5Var2 = kc8.g;
        mq5Var2.getClass();
        b = new a62(mq5Var2.b(), mq5Var2.a.f());
    }
}
