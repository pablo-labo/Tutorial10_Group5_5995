package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wo7 {
    public static final b a = new b();
    public static final a b = new a();

    public static class a {
    }

    public static class b {
    }

    public static Object a(Object obj, String str) {
        HashMap map = (HashMap) obj;
        if (!map.containsKey(str)) {
            return a;
        }
        Object obj2 = map.get(str);
        return obj2 == null ? b : obj2;
    }
}
