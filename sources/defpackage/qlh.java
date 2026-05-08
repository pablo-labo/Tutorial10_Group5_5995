package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qlh extends rlh {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = ((ylh) this).zza.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rlh
    public final boolean g() {
        return false;
    }

    @Override // defpackage.rlh, java.util.Collection, java.util.Set
    public final int hashCode() {
        return ath.a(((ylh) this).zza.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((ylh) this).zza.size();
    }
}
