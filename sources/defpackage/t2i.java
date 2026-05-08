package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t2i implements n3i {
    public n3i[] a;

    @Override // defpackage.n3i
    public final boolean zza(Class<?> cls) {
        for (n3i n3iVar : this.a) {
            if (n3iVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n3i
    public final g3i zzb(Class<?> cls) {
        for (n3i n3iVar : this.a) {
            if (n3iVar.zza(cls)) {
                return n3iVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
