package com.google.android.recaptcha.internal;

import defpackage.k20;
import defpackage.q6;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzno implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zznt zze;

    public /* synthetic */ zzno(zznt zzntVar, zzns zznsVar) {
        Objects.requireNonNull(zzntVar);
        this.zze = zzntVar;
        this.zzb = zzntVar.zzf;
        this.zzc = zzntVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzf == this.zzb) {
            return;
        }
        q6.h();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            k20.p();
            return null;
        }
        int i = this.zzc;
        this.zzd = i;
        Object objZza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzmz.zzg(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zznt zzntVar = this.zze;
        zzntVar.remove(zznt.zzg(zzntVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}
