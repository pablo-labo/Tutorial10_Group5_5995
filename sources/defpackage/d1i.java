package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d1i implements y1i {
    public final y1i[] a;

    public d1i(y1i... y1iVarArr) {
        this.a = y1iVarArr;
    }

    @Override // defpackage.y1i
    public final v1i zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            y1i y1iVar = this.a[i];
            if (y1iVar.zzc(cls)) {
                return y1iVar.zzb(cls);
            }
        }
        b0.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.y1i
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
