package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e2i extends p1i {
    @Override // defpackage.p1i
    public final void a(Object obj, long j, Object obj2) {
        e0i e0iVarZza = (e0i) r8i.l(obj, j);
        e0i e0iVar = (e0i) r8i.l(obj2, j);
        int size = e0iVarZza.size();
        int size2 = e0iVar.size();
        if (size > 0 && size2 > 0) {
            if (!e0iVarZza.zza()) {
                e0iVarZza = e0iVarZza.zza(size2 + size);
            }
            e0iVarZza.addAll(e0iVar);
        }
        if (size > 0) {
            e0iVar = e0iVarZza;
        }
        r8i.d(obj, j, e0iVar);
    }

    @Override // defpackage.p1i
    public final void b(Object obj, long j) {
        ((e0i) r8i.l(obj, j)).zzb();
    }
}
