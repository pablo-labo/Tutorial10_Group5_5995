package com.google.android.recaptcha.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zznk extends zzno {
    final /* synthetic */ zznt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznk(zznt zzntVar) {
        super(zzntVar, null);
        Objects.requireNonNull(zzntVar);
        this.zza = zzntVar;
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final Object zza(int i) {
        return zznt.zzg(this.zza, i);
    }
}
