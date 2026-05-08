package com.google.android.recaptcha.internal;

import defpackage.b0;

/* JADX INFO: loaded from: classes2.dex */
final class zzahc implements zzahj {
    private final zzahj[] zza;

    public zzahc(zzahj... zzahjVarArr) {
        this.zza = zzahjVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzahj
    public final zzahi zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzahj zzahjVar = this.zza[i];
            if (zzahjVar.zzc(cls)) {
                return zzahjVar.zzb(cls);
            }
        }
        b0.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzahj
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
