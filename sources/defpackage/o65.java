package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class o65 {
    public static final LinkedHashMap a;
    public static final Map<mq5, mq5> b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(xqe.w, a("java.util.ArrayList", "java.util.LinkedList"));
        b(xqe.x, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(xqe.y, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        mq5 mq5Var = new mq5("java.util.function.Function");
        b(new a62(mq5Var.b(), mq5Var.a.f()), a("java.util.function.UnaryOperator"));
        mq5 mq5Var2 = new mq5("java.util.function.BiFunction");
        b(new a62(mq5Var2.b(), mq5Var2.a.f()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((a62) entry.getKey()).a(), ((a62) entry.getValue()).a()));
        }
        b = lc9.f0(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            mq5 mq5Var = new mq5(str);
            arrayList.add(new a62(mq5Var.b(), mq5Var.a.f()));
        }
        return arrayList;
    }

    public static void b(a62 a62Var, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, a62Var);
        }
    }
}
