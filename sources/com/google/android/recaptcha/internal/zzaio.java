package com.google.android.recaptcha.internal;

import defpackage.ia;
import defpackage.l;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzaio {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i2);

    public abstract void zze(Object obj, int i, long j);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzaef zzaefVar);

    public abstract void zzh(Object obj, int i, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzahy zzahyVar, int i) throws zzagq {
        int iZzd = zzahyVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzh(obj, i2, zzahyVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zze(obj, i2, zzahyVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zzg(obj, i2, zzahyVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                ia.p("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i3 == 5) {
                zzd(obj, i2, zzahyVar.zzf());
                return true;
            }
            l.k();
            return false;
        }
        Object objZzb = zzb();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            ia.p("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (zzahyVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzahyVar, i5)) {
        }
        if ((i4 | 4) == zzahyVar.zzd()) {
            zzf(obj, i2, zzc(objZzb));
            return true;
        }
        ia.p("Protocol message end-group tag did not match expected tag.");
        return false;
    }
}
