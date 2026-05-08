package com.google.android.recaptcha.internal;

import defpackage.b0;
import defpackage.l5;
import defpackage.m6;
import defpackage.z3;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaip {
    private static final zzaip zza = new zzaip(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzaip(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzaip zzc() {
        return zza;
    }

    public static zzaip zze(zzaip zzaipVar, zzaip zzaipVar2) {
        int i = zzaipVar.zzb + zzaipVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzaipVar.zzc, i);
        System.arraycopy(zzaipVar2.zzc, 0, iArrCopyOf, zzaipVar.zzb, zzaipVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzaipVar.zzd, i);
        System.arraycopy(zzaipVar2.zzd, 0, objArrCopyOf, zzaipVar.zzb, zzaipVar2.zzb);
        return new zzaip(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzaip zzf() {
        return new zzaip(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaip)) {
            return false;
        }
        zzaip zzaipVar = (zzaip) obj;
        int i = this.zzb;
        if (i == zzaipVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzaipVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzaipVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzx;
        int iZzy;
        int iZzx2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzx3 = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.zzd[i2]).getClass();
                    iZzx2 = zzaeo.zzx(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    zzaef zzaefVar = (zzaef) this.zzd[i2];
                    int iZzx4 = zzaeo.zzx(i6);
                    int iZzd = zzaefVar.zzd();
                    iZzx3 = zzaeo.zzx(iZzd) + iZzd + iZzx4 + iZzx3;
                } else if (i5 == 3) {
                    int iZzx5 = zzaeo.zzx(i4 << 3);
                    iZzx = iZzx5 + iZzx5;
                    iZzy = ((zzaip) this.zzd[i2]).zza();
                } else {
                    if (i5 != 5) {
                        z3.q(new zzagp("Protocol message tag had invalid wire type."));
                        return 0;
                    }
                    ((Integer) this.zzd[i2]).getClass();
                    iZzx2 = zzaeo.zzx(i4 << 3) + 4;
                }
                iZzx3 = iZzx2 + iZzx3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.zzd[i2]).longValue();
                iZzx = zzaeo.zzx(i7);
                iZzy = zzaeo.zzy(jLongValue);
            }
            iZzx3 = iZzy + iZzx + iZzx3;
        }
        this.zze = iZzx3;
        return iZzx3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzaef zzaefVar = (zzaef) this.zzd[i2];
            int iZzx = zzaeo.zzx(8);
            int iZzx2 = zzaeo.zzx(i3) + zzaeo.zzx(16);
            int iZzx3 = zzaeo.zzx(24);
            int iZzd = zzaefVar.zzd();
            iA += iZzx + iZzx + iZzx2 + m6.a(iZzd, iZzd, iZzx3);
        }
        this.zze = iA;
        return iA;
    }

    public final zzaip zzd(zzaip zzaipVar) {
        if (zzaipVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzaipVar.zzb;
        zzm(i);
        System.arraycopy(zzaipVar.zzc, 0, this.zzc, this.zzb, zzaipVar.zzb);
        System.arraycopy(zzaipVar.zzd, 0, this.zzd, this.zzb, zzaipVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        b0.l();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzahn.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzajb zzajbVar) {
        for (int i = 0; i < this.zzb; i++) {
            zzajbVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzajb zzajbVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzajbVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzajbVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzajbVar.zzd(i4, (zzaef) obj);
                } else if (i3 == 3) {
                    zzajbVar.zzF(i4);
                    ((zzaip) obj).zzl(zzajbVar);
                    zzajbVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        l5.r(new zzagp("Protocol message tag had invalid wire type."));
                        return;
                    }
                    zzajbVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzaip() {
        this(0, new int[8], new Object[8], true);
    }
}
