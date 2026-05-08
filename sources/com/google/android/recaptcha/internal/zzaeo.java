package com.google.android.recaptcha.internal;

import defpackage.r6;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaeo extends zzadx {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzaeo.class.getName());
    private static final boolean zzd = zzaiv.zzx();
    Object zza;

    public /* synthetic */ zzaeo(zzaen zzaenVar) {
    }

    public static int zzv(zzahl zzahlVar) {
        int iZzA = zzahlVar.zzA();
        return zzx(iZzA) + iZzA;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zzaiy.zzc(str);
        } catch (zzaix unused) {
            length = str.getBytes(zzago.zza).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzy(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void zzA(String str, zzaix zzaixVar) throws zzaem {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaixVar);
        byte[] bytes = str.getBytes(zzago.zza);
        try {
            int length = bytes.length;
            zzs(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzaem(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b);

    public abstract void zzd(int i, boolean z);

    public abstract void zze(int i, zzaef zzaefVar);

    public abstract void zzf(int i, int i2);

    public abstract void zzg(int i);

    public abstract void zzh(int i, long j);

    public abstract void zzi(long j);

    public abstract void zzj(int i, int i2);

    public abstract void zzk(int i);

    public abstract void zzl(byte[] bArr, int i, int i2);

    public abstract void zzm(int i, zzahl zzahlVar);

    public abstract void zzn(int i, zzaef zzaefVar);

    public abstract void zzo(int i, String str);

    public abstract void zzq(int i, int i2);

    public abstract void zzr(int i, int i2);

    public abstract void zzs(int i);

    public abstract void zzt(int i, long j);

    public abstract void zzu(long j);

    public final void zzz() {
        if (zza() == 0) {
            return;
        }
        r6.g("Did not write as much data as expected.");
    }

    private zzaeo() {
        throw null;
    }
}
