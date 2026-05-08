package defpackage;

import defpackage.dzh;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lxh {
    public static volatile lxh b;
    public static volatile lxh c;
    public static final lxh d = new lxh(0);
    public final Map<a, dzh.d<?, ?>> a;

    public static final class a {
        public final Object a;
        public final int b;

        public a(int i, l3i l3iVar) {
            this.a = l3iVar;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public lxh() {
        this.a = new HashMap();
    }

    public static lxh a() {
        lxh lxhVar;
        lxh lxhVar2 = b;
        if (lxhVar2 != null) {
            return lxhVar2;
        }
        synchronized (lxh.class) {
            try {
                lxhVar = b;
                if (lxhVar == null) {
                    lxhVar = d;
                    b = lxhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lxhVar;
    }

    public lxh(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
