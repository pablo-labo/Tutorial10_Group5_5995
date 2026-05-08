package com.google.android.recaptcha.internal;

import defpackage.k20;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzady extends zzadz {
    final /* synthetic */ zzaef zza;
    private int zzb;
    private final int zzc;

    public zzady(zzaef zzaefVar) {
        Objects.requireNonNull(zzaefVar);
        this.zza = zzaefVar;
        this.zzb = 0;
        this.zzc = zzaefVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzaeb
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        k20.p();
        return (byte) 0;
    }
}
