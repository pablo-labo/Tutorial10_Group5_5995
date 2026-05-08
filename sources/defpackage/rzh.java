package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rzh implements Map.Entry {
    public final Map.Entry a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzh) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof f2i)) {
            l5.q("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            return null;
        }
        zzh zzhVar = (zzh) this.a.getValue();
        f2i f2iVar = zzhVar.a;
        zzhVar.b = null;
        zzhVar.a = (f2i) obj;
        return f2iVar;
    }
}
