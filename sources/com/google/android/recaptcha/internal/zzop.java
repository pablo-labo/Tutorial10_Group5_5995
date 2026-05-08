package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzop extends zzod {
    Object[] zzd;
    private int zze;

    public zzop(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzoq.zzg(i)];
    }

    @Override // com.google.android.recaptcha.internal.zzod, com.google.android.recaptcha.internal.zzoe
    public final /* bridge */ /* synthetic */ zzoe zzb(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzg = zzoq.zzg(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzg <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzoc.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iZza = i + 1;
                }
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzoq zzd() {
        zzoq zzoqVarZzn;
        int i = this.zzb;
        if (i == 0) {
            return zzpk.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzpm(obj);
        }
        if (this.zzd == null || zzoq.zzg(i) != this.zzd.length) {
            zzoqVarZzn = zzoq.zzn(this.zzb, this.zza);
            this.zzb = zzoqVarZzn.size();
        } else {
            int i2 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzoq.zzo(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            zzoqVarZzn = new zzpk(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzoqVarZzn;
    }

    public zzop() {
        super(4);
    }
}
