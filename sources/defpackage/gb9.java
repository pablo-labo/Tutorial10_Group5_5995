package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@sy3
public final class gb9 {

    public static final class a<K, V> {
        public final HashMap a = new HashMap();
        public boolean b = true;

        public final void a(String str, Serializable serializable) {
            if (this.b) {
                this.a.put(str, serializable);
            } else {
                r6.g("Underlying map has already been built");
            }
        }
    }

    public static final HashMap a(String str, Serializable serializable) {
        return lc9.Z(new Pair(str, serializable));
    }

    public static final HashMap b(String str, Serializable serializable, String str2, Serializable serializable2, String str3, Serializable serializable3) {
        return lc9.Z(new Pair(str, serializable), new Pair(str2, serializable2), new Pair(str3, serializable3));
    }

    public static final HashMap c(String str, String str2) {
        return lc9.Z(new Pair("bubbled", str), new Pair("captured", str2));
    }
}
