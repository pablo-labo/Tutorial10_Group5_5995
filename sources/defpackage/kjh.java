package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kjh {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            ja.k("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            ja.k(l5.m("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
