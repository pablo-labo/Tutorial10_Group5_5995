package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends g0<Object, Object> {
    @Override // androidx.datastore.preferences.protobuf.g0
    public final void h() {
        if (!this.d) {
            for (int i = 0; i < this.b.size(); i++) {
                ((l.a) d(i).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = f().iterator();
            while (it.hasNext()) {
                ((l.a) it.next().getKey()).getClass();
            }
        }
        super.h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return i((l.a) obj, obj2);
    }
}
