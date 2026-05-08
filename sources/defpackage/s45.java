package defpackage;

import defpackage.rw5;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class s45 {
    public static final /* synthetic */ int b = 0;
    public final Map<a, rw5.e<?, ?>> a;

    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i) {
            this.a = obj;
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

    static {
        new s45(0);
    }

    public s45() {
        this.a = new HashMap();
    }

    public final void a(rw5.e<?, ?> eVar) {
        this.a.put(new a(eVar.a, eVar.d.a), eVar);
    }

    public s45(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
