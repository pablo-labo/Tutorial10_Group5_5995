package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class zzod extends zzoe {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzod(int i) {
        zznj.zza(i, "initialCapacity");
        this.zza = new Object[i];
        this.zzb = 0;
    }

    public final zzod zza(Object obj) {
        int length = this.zza.length;
        int iZzc = zzoe.zzc(length, this.zzb + 1);
        if (iZzc > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, iZzc);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzoe
    public /* bridge */ /* synthetic */ zzoe zzb(Object obj) {
        throw null;
    }
}
