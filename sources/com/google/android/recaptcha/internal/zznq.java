package com.google.android.recaptcha.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zznq extends zzng {
    final /* synthetic */ zznt zza;
    private final Object zzb;
    private int zzc;

    public zznq(zznt zzntVar, int i) {
        Objects.requireNonNull(zzntVar);
        this.zza = zzntVar;
        this.zzb = zznt.zzg(zzntVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zznt zzntVar = this.zza;
            if (i < zzntVar.size() && Objects.equals(this.zzb, zznt.zzg(zzntVar, this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzv(this.zzb);
    }

    @Override // com.google.android.recaptcha.internal.zzng, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzng, java.util.Map.Entry
    public final Object getValue() {
        zznt zzntVar = this.zza;
        Map mapZzl = zzntVar.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zznt.zzj(zzntVar, i);
    }

    @Override // com.google.android.recaptcha.internal.zzng, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zznt zzntVar = this.zza;
        Map mapZzl = zzntVar.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzntVar.put(this.zzb, obj);
            return null;
        }
        Object objZzj = zznt.zzj(zzntVar, i);
        zznt.zzn(zzntVar, this.zzc, obj);
        return objZzj;
    }
}
