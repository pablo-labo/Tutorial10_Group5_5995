package defpackage;

import defpackage.sxc;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rxc extends LinkedHashMap<Object, Object> {
    final /* synthetic */ sxc.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxc(sxc.a aVar, int i) {
        super(i, 0.75f, true);
        this.this$0 = aVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
        return size() > this.this$0.b;
    }
}
