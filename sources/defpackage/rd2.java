package defpackage;

import defpackage.g15;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class rd2 {
    public static final /* synthetic */ int a = 0;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i((String) ((Pair) t).d(), (String) ((Pair) t2).d());
        }
    }

    static {
        zr4 zr4Var = zr4.a;
        new sna("__Schema", zr4Var, zr4Var);
        new sna("__Type", zr4Var, zr4Var);
        new sna("__Field", zr4Var, zr4Var);
        new sna("__InputValue", zr4Var, zr4Var);
        new sna("__EnumValue", zr4Var, zr4Var);
        new sna("__Directive", zr4Var, zr4Var);
    }

    public static final ud2 a(ka6 ka6Var) {
        ka6Var.getClass();
        return new ud2(ka6Var);
    }

    public static final Object b(Object obj, g15.b bVar) {
        Object objB;
        Pair pair;
        Map<String, Object> map = bVar.a;
        if (obj == null) {
            return null;
        }
        if (obj instanceof wd2) {
            r6.g("must be checked by the caller");
            return null;
        }
        if (obj instanceof Map) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object value = entry.getValue();
                if (value instanceof wd2) {
                    String str = ((wd2) value).a;
                    pair = map.containsKey(str) ? new Pair(entry.getKey(), map.get(str)) : null;
                } else {
                    pair = new Pair(entry.getKey(), b(value, bVar));
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return lc9.f0(z92.p1(z92.z1(arrayList), new a()));
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList2 = new ArrayList(t92.r0(iterable, 10));
        for (Object obj2 : iterable) {
            if (obj2 instanceof wd2) {
                String str2 = ((wd2) obj2).a;
                objB = map.containsKey(str2) ? map.get(str2) : null;
            } else {
                objB = b(obj2, bVar);
            }
            arrayList2.add(objB);
        }
        return arrayList2;
    }
}
