package defpackage;

import com.indeed.android.tare.management.JSTCacheValue;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kp7 implements xh8 {
    public final Map<String, JSTCacheValue> a = Collections.synchronizedMap(new a());

    public static final class a<K, V> extends LinkedHashMap<K, V> {
        private final int capacity;

        public a() {
            super(100, 0.75f, true);
            this.capacity = 100;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
            boolean z = super.size() > this.capacity;
            if (z) {
                ArrayList arrayList = lz2.a;
                lz2.d("JSTCacheImpl", "Cache size exceeded. Removing least-recently accessed entry.", false, null);
            }
            return z;
        }
    }

    public final JSTCacheValue a(String str) {
        str.getClass();
        return this.a.get(str);
    }

    public final void b(String str, JSTCacheValue jSTCacheValue) {
        str.getClass();
        Map<String, JSTCacheValue> map = this.a;
        map.getClass();
        map.put(str, jSTCacheValue);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
