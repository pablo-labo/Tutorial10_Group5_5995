package com.google.android.recaptcha.internal;

import defpackage.lu2;
import java.util.UUID;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzir {
    private final zzia zza;
    private final zzet zzb;
    private final String zzc;
    private final String zzd = UUID.randomUUID().toString();
    private final int zze;

    public zzir(zzia zziaVar, zzet zzetVar, String str, int i) {
        this.zza = zziaVar;
        this.zzb = zzetVar;
        this.zzc = str;
        this.zze = i;
    }

    public final Object zza(Function2 function2, lu2 lu2Var) {
        return function2.invoke(new zziu(this.zza, this.zzb, this), lu2Var);
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zze;
    }
}
