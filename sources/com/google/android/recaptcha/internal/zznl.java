package com.google.android.recaptcha.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zznl extends zzno {
    final /* synthetic */ zznt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznl(zznt zzntVar) {
        super(zzntVar, null);
        Objects.requireNonNull(zzntVar);
        this.zza = zzntVar;
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zznq(this.zza, i);
    }
}
