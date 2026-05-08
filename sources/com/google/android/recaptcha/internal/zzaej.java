package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.ia;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaej {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    Object zzd;

    private zzaej() {
    }

    public static int zzF(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzG(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzaej zzH(byte[] bArr, int i, int i2, boolean z) {
        zzaeg zzaegVar = new zzaeg(bArr, 0, i2, z, null);
        try {
            zzaegVar.zze(i2);
            return zzaegVar;
        } catch (zzagq e) {
            b0.s(e);
            return null;
        }
    }

    public abstract void zzA(int i);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i);

    public final void zzI() throws zzagq {
        if (this.zza + this.zzb < this.zzc) {
            return;
        }
        ia.p("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void zzJ() {
        if (this.zzb == 0) {
            zzz(0);
        }
    }

    public final void zzK() throws zzagq {
        int iZzm;
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                return;
            }
            zzI();
            this.zzb++;
            this.zzb--;
        } while (zzE(iZzm));
    }

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzaef zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i);

    public /* synthetic */ zzaej(zzaei zzaeiVar) {
    }
}
