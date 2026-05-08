package com.google.android.recaptcha.internal;

import defpackage.r6;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaie implements Iterator {
    final /* synthetic */ zzaih zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzaie(zzaih zzaihVar, zzaig zzaigVar) {
        Objects.requireNonNull(zzaihVar);
        this.zza = zzaihVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzaih zzaihVar = this.zza;
        if (i >= zzaihVar.zzb) {
            return !zzaihVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzaih zzaihVar = this.zza;
        return i < zzaihVar.zzb ? (zzaid) zzaihVar.zza[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            r6.g("remove() was called before next()");
            return;
        }
        this.zzc = false;
        zzaih zzaihVar = this.zza;
        zzaihVar.zzo();
        int i = this.zzb;
        if (i >= zzaihVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzaihVar.zzm(i);
        }
    }
}
