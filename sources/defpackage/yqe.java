package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class yqe {
    public static final a62 a(String str) {
        mq5 mq5Var = xqe.a;
        return new a62(xqe.a, n8a.h(str));
    }

    public static final a62 b(String str) {
        mq5 mq5Var = xqe.a;
        return new a62(xqe.c, n8a.h(str));
    }

    public static final LinkedHashMap c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iV = kc9.V(t92.r0(setEntrySet, 10));
        if (iV < 16) {
            iV = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iV);
        for (Map.Entry entry : setEntrySet) {
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap2.put(pair.d(), pair.e());
        }
        return linkedHashMap2;
    }

    public static final a62 d(n8a n8aVar) {
        mq5 mq5Var = xqe.a;
        a62 a62Var = xqe.m;
        return new a62(a62Var.a, n8a.h(n8aVar.e().concat(a62Var.f().e())));
    }

    public static final a62 e(String str) {
        mq5 mq5Var = xqe.a;
        return new a62(xqe.b, n8a.h(str));
    }

    public static final a62 f(a62 a62Var) {
        mq5 mq5Var = xqe.a;
        return new a62(xqe.a, n8a.h("U".concat(a62Var.f().e())));
    }
}
