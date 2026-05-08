package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public class zzagc extends zzaga implements zzahm {
    public zzagc(zzagd zzagdVar) {
        super(zzagdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzaga, com.google.android.recaptcha.internal.zzahk
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzagd zzr() {
        boolean zZzac = ((zzagd) this.zza).zzac();
        zzagg zzaggVar = this.zza;
        if (!zZzac) {
            return (zzagd) zzaggVar;
        }
        ((zzagd) zzaggVar).zza.zzg();
        return (zzagd) super.zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzaga
    public final void zzu() {
        super.zzu();
        if (((zzagd) this.zza).zza != zzafw.zzd()) {
            zzagd zzagdVar = (zzagd) this.zza;
            zzagdVar.zza = zzagdVar.zza.clone();
        }
    }
}
