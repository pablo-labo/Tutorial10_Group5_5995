package com.google.android.recaptcha.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.k20;
import defpackage.l5;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class zzael extends zzaeo {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzael(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            l5.q(k20.l("Array range is invalid. Buffer.length=", length, i2, ", offset=0, length="));
            throw null;
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzb(byte b) throws zzaem {
        int i;
        int i2 = this.zze;
        try {
            i = i2 + 1;
        } catch (IndexOutOfBoundsException e) {
            e = e;
        }
        try {
            this.zzc[i2] = b;
            this.zze = i;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i2 = i;
            throw new zzaem(i2, this.zzd, 1, e);
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzaem(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzd(int i, boolean z) throws zzaem {
        zzs(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zze(int i, zzaef zzaefVar) throws zzaem {
        zzs((i << 3) | 2);
        zzs(zzaefVar.zzd());
        zzaefVar.zzj(this);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzf(int i, int i2) throws zzaem {
        zzs((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzg(int i) throws zzaem {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzaem(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzh(int i, long j) throws zzaem {
        zzs((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzi(long j) throws zzaem {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzaem(i, this.zzd, 8, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzj(int i, int i2) throws zzaem {
        zzs(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzk(int i) throws zzaem {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzl(byte[] bArr, int i, int i2) {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzm(int i, zzahl zzahlVar) throws zzaem {
        zzs(11);
        zzr(2, i);
        zzs(26);
        zzs(zzahlVar.zzA());
        zzahlVar.zzaa(this);
        zzs(12);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzn(int i, zzaef zzaefVar) throws zzaem {
        zzs(11);
        zzr(2, i);
        zze(3, zzaefVar);
        zzs(12);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzo(int i, String str) throws zzaem {
        zzs((i << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) throws zzaem {
        int i = this.zze;
        try {
            int iZzx = zzaeo.zzx(str.length() * 3);
            int iZzx2 = zzaeo.zzx(str.length());
            if (iZzx2 != iZzx) {
                zzs(zzaiy.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzaiy.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + iZzx2;
            this.zze = i3;
            int iZzb = zzaiy.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzs((iZzb - i) - iZzx2);
            this.zze = iZzb;
        } catch (zzaix e) {
            this.zze = i;
            zzA(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzaem(e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzq(int i, int i2) throws zzaem {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzr(int i, int i2) throws zzaem {
        zzs(i << 3);
        zzs(i2);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzs(int i) throws zzaem {
        int i2;
        int i3 = this.zze;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.zzc;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.zze = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzaem(i2, this.zzd, 1, e);
                }
            }
            throw new zzaem(i2, this.zzd, 1, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzt(int i, long j) throws zzaem {
        zzs(i << 3);
        zzu(j);
    }

    @Override // com.google.android.recaptcha.internal.zzaeo
    public final void zzu(long j) throws zzaem {
        byte[] bArr;
        int i;
        byte[] bArr2;
        int i2 = this.zze;
        if (!zzaeo.zzd || this.zzd - i2 < 10) {
            while (true) {
                long j2 = j & (-128);
                bArr = this.zzc;
                if (j2 == 0) {
                    break;
                }
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzaem(i, this.zzd, 1, e);
                }
                throw new zzaem(i, this.zzd, 1, e);
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while (true) {
                long j3 = j & (-128);
                bArr2 = this.zzc;
                if (j3 == 0) {
                    break;
                }
                zzaiv.zzn(bArr2, i2, (byte) (((int) j) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzaiv.zzn(bArr2, i2, (byte) j);
        }
        this.zze = i;
    }
}
