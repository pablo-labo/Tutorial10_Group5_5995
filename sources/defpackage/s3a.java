package defpackage;

import defpackage.rjb;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s3a extends rjb {
    public final LinkedHashMap a;
    public final AtomicBoolean b;

    public static final class a extends mj8 implements Function1<Map.Entry<rjb.a<?>, Object>, CharSequence> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<rjb.a<?>, Object> entry) {
            Map.Entry<rjb.a<?>, Object> entry2 = entry;
            entry2.getClass();
            return "  " + entry2.getKey().a + " = " + entry2.getValue();
        }
    }

    public /* synthetic */ s3a(int i, boolean z) {
        this(new LinkedHashMap(), (i & 2) != 0 ? true : z);
    }

    @Override // defpackage.rjb
    public final Map<rjb.a<?>, Object> a() {
        Map<rjb.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.a);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    @Override // defpackage.rjb
    public final <T> T b(rjb.a<T> aVar) {
        aVar.getClass();
        return (T) this.a.get(aVar);
    }

    public final void c(rjb.a<?> aVar, Object obj) {
        aVar.getClass();
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            r6.g("Do mutate preferences once returned to DataStore.");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                r6.g("Do mutate preferences once returned to DataStore.");
                return;
            } else {
                linkedHashMap.remove(aVar);
                return;
            }
        }
        if (!(obj instanceof Set)) {
            linkedHashMap.put(aVar, obj);
            return;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(z92.E1((Iterable) obj));
        setUnmodifiableSet.getClass();
        linkedHashMap.put(aVar, setUnmodifiableSet);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s3a)) {
            return false;
        }
        return wl7.b(this.a, ((s3a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return z92.W0(this.a.entrySet(), ",\n", "{\n", "\n}", a.a, 24);
    }

    public s3a() {
        this(3, false);
    }

    public s3a(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new AtomicBoolean(z);
    }
}
