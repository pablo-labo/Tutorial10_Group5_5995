package com.google.android.recaptcha.internal;

import defpackage.bg;
import defpackage.k20;
import defpackage.l5;
import defpackage.l6;
import defpackage.w40;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaef implements Iterable, Serializable {
    public static final zzaef zzb = new zzaed(zzago.zzb);
    private int zza = 0;

    static {
        int i = zzadt.zza;
    }

    public static int zzk(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            l5.s(bg.d(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            l5.s(k20.l("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        l5.s(k20.l("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static zzaef zzm(byte[] bArr, int i, int i2) {
        zzk(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzaed(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzf = this.zza;
        if (iZzf == 0) {
            int iZzd = zzd();
            iZzf = zzf(iZzd, 0, iZzd);
            if (iZzf == 0) {
                iZzf = 1;
            }
            this.zza = iZzf;
        }
        return iZzf;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzady(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return l6.i(w40.h(zzd(), "<ByteString@", hexString, " size=", " contents=\""), zzd() <= 50 ? zzaij.zza(this) : zzaij.zza(zzg(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzaef zzg(int i, int i2);

    public abstract zzaej zzh();

    public abstract String zzi(Charset charset);

    public abstract void zzj(zzadx zzadxVar);

    public final int zzl() {
        return this.zza;
    }

    public final String zzn() {
        return zzd() == 0 ? "" : zzi(zzago.zza);
    }

    public final boolean zzo() {
        return zzd() == 0;
    }

    public final byte[] zzp() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzago.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
