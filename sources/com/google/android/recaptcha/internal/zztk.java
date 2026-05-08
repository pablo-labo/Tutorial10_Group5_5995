package com.google.android.recaptcha.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zztk {
    private static final zztk zza = new zztk();
    private final AtomicReference zzb;

    public zztk() {
        zzuj zzujVar = null;
        this.zzb = new AtomicReference(new zzuk(new zzuh(zzujVar), zzujVar));
    }

    public static zztk zza() {
        return zza;
    }

    public final Object zzb(zzqp zzqpVar, Class cls) {
        return ((zzuk) this.zzb.get()).zzb(zzqpVar, cls);
    }

    public final synchronized void zzc(zzuf zzufVar) {
        AtomicReference atomicReference = this.zzb;
        zzuj zzujVar = null;
        zzuh zzuhVar = new zzuh((zzuk) atomicReference.get(), zzujVar);
        zzuhVar.zza(zzufVar);
        atomicReference.set(new zzuk(zzuhVar, zzujVar));
    }

    public final synchronized void zzd(zzul zzulVar) {
        AtomicReference atomicReference = this.zzb;
        zzuj zzujVar = null;
        zzuh zzuhVar = new zzuh((zzuk) atomicReference.get(), zzujVar);
        zzuhVar.zzb(zzulVar);
        atomicReference.set(new zzuk(zzuhVar, zzujVar));
    }
}
