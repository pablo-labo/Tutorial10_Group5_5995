package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzait extends zzaiu {
    public zzait(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzaiu
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zzaiu
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zzaiu
    public final void zzc(Object obj, long j, boolean z) {
        if (zzaiv.zzb) {
            zzaiv.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzaiv.zzE(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaiu
    public final void zzd(Object obj, long j, byte b) {
        if (zzaiv.zzb) {
            zzaiv.zzD(obj, j, b);
        } else {
            zzaiv.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaiu
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzaiu
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.recaptcha.internal.zzaiu
    public final boolean zzg(Object obj, long j) {
        return zzaiv.zzb ? zzaiv.zzt(obj, j) : zzaiv.zzu(obj, j);
    }
}
