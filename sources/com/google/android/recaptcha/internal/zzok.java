package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzok {
    Object[] zza;
    int zzb;
    zzoj zzc;

    public zzok(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }

    public final zzok zza(Object obj, Object obj2) {
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzoe.zzc(length, i2));
        }
        zznj.zzb(obj, obj2);
        Object[] objArr2 = this.zza;
        int i3 = this.zzb;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.zzb = i3 + 1;
        return this;
    }

    public final zzol zzb() {
        zzoj zzojVar = this.zzc;
        if (zzojVar != null) {
            throw zzojVar.zza();
        }
        zzpj zzpjVarZzf = zzpj.zzf(this.zzb, this.zza, this);
        zzoj zzojVar2 = this.zzc;
        if (zzojVar2 == null) {
            return zzpjVarZzf;
        }
        throw zzojVar2.zza();
    }

    public zzok() {
        this(4);
    }
}
