package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzog extends zznf {
    private final zzoi zza;

    public zzog(zzoi zzoiVar, int i) {
        super(zzoiVar.size(), i);
        this.zza = zzoiVar;
    }

    @Override // com.google.android.recaptcha.internal.zznf
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
