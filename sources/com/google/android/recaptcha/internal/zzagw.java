package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public class zzagw {
    protected volatile zzahl zza;
    private volatile zzaef zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzagw)) {
            return false;
        }
        zzagw zzagwVar = (zzagw) obj;
        zzahl zzahlVar = this.zza;
        zzahl zzahlVar2 = zzagwVar.zza;
        if (zzahlVar == null && zzahlVar2 == null) {
            return zzb().equals(zzagwVar.zzb());
        }
        if (zzahlVar != null && zzahlVar2 != null) {
            return zzahlVar.equals(zzahlVar2);
        }
        if (zzahlVar != null) {
            zzagwVar.zzd(zzahlVar.zzak());
            return zzahlVar.equals(zzagwVar.zza);
        }
        zzd(zzahlVar2.zzak());
        return this.zza.equals(zzahlVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzaed) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzA();
        }
        return 0;
    }

    public final zzaef zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzaef.zzb;
                } else {
                    this.zzb = this.zza.zzw();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzahl zzc(zzahl zzahlVar) {
        zzahl zzahlVar2 = this.zza;
        this.zzb = null;
        this.zza = zzahlVar;
        return zzahlVar2;
    }

    public final void zzd(zzahl zzahlVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzahlVar;
                this.zzb = zzaef.zzb;
            } catch (zzagq unused) {
                this.zzc = true;
                this.zza = zzahlVar;
                this.zzb = zzaef.zzb;
            }
        }
    }
}
