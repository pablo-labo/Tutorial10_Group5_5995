package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ynh extends anh implements Serializable {
    final anh zza;

    public ynh(anh anhVar) {
        this.zza = anhVar;
    }

    @Override // defpackage.anh
    public final anh a() {
        return this.zza;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ynh) {
            return this.zza.equals(((ynh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
