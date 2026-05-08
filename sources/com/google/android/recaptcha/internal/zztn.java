package com.google.android.recaptcha.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zztn {
    private static final zztn zza = (zztn) zzux.zza(new zzuw() { // from class: com.google.android.recaptcha.internal.zztl
        @Override // com.google.android.recaptcha.internal.zzuw
        public final Object zza() {
            zztn zztnVar = new zztn();
            zztnVar.zze(new zzsj(zzst.class, zzum.class, new zzsk() { // from class: com.google.android.recaptcha.internal.zztm
                @Override // com.google.android.recaptcha.internal.zzsk
                public final zzuq zza(zzqp zzqpVar, zzra zzraVar) {
                    return ((zzst) zzqpVar).zzc(zzraVar);
                }
            }));
            return zztnVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzuv(new zzur(), null));

    public static zztn zzb() {
        return zza;
    }

    public final zzqp zza(zzuq zzuqVar, zzra zzraVar) {
        return ((zzuv) this.zzb.get()).zza(zzuqVar, zzraVar);
    }

    public final zzuq zzc(zzqp zzqpVar, Class cls, zzra zzraVar) {
        return ((zzuv) this.zzb.get()).zzb(zzqpVar, cls, zzraVar);
    }

    public final synchronized void zzd(zzsi zzsiVar) {
        AtomicReference atomicReference = this.zzb;
        zzur zzurVar = new zzur((zzuv) atomicReference.get());
        zzurVar.zza(zzsiVar);
        atomicReference.set(new zzuv(zzurVar, null));
    }

    public final synchronized void zze(zzsm zzsmVar) {
        AtomicReference atomicReference = this.zzb;
        zzur zzurVar = new zzur((zzuv) atomicReference.get());
        zzurVar.zzb(zzsmVar);
        atomicReference.set(new zzuv(zzurVar, null));
    }

    public final synchronized void zzf(zzts zztsVar) {
        AtomicReference atomicReference = this.zzb;
        zzur zzurVar = new zzur((zzuv) atomicReference.get());
        zzurVar.zzc(zztsVar);
        atomicReference.set(new zzuv(zzurVar, null));
    }

    public final synchronized void zzg(zztw zztwVar) {
        AtomicReference atomicReference = this.zzb;
        zzur zzurVar = new zzur((zzuv) atomicReference.get());
        zzurVar.zzd(zztwVar);
        atomicReference.set(new zzuv(zzurVar, null));
    }

    public final boolean zzh(zzuq zzuqVar) {
        return ((zzuv) this.zzb.get()).zzg(zzuqVar);
    }
}
