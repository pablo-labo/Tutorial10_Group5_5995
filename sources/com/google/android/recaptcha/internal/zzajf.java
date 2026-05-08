package com.google.android.recaptcha.internal;

import android.util.Base64;
import defpackage.bg;
import defpackage.o6;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajf {
    protected static final Charset zza = StandardCharsets.UTF_16;
    public static final /* synthetic */ int zzd = 0;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zze = {511133343, 1277647508, 107287496, 338123662};
    private byte[] zzf;
    private byte[] zzg;
    private int zzh;

    public zzajf(byte[] bArr, byte[] bArr2) {
        int[] iArr;
        if (bArr.length != 32) {
            o6.h();
            throw null;
        }
        if (bArr2.length != 12) {
            o6.h();
            throw null;
        }
        this.zzf = bArr;
        this.zzh = 1;
        this.zzg = bArr2;
        this.zzb = new int[16];
        for (int i = 0; i < 4; i++) {
            this.zzb[i] = zza(this.zze[i], 2131181306);
        }
        int i2 = 4;
        while (true) {
            iArr = this.zzb;
            if (i2 >= 12) {
                break;
            }
            iArr[i2] = zzg(this.zzf, (i2 - 4) * 4);
            i2++;
        }
        iArr[12] = this.zzh;
        for (int i3 = 13; i3 < 16; i3++) {
            this.zzb[i3] = zzg(this.zzg, (i3 - 13) * 4);
        }
        int[] iArr2 = new int[16];
        this.zzc = iArr2;
        int[] iArr3 = this.zzb;
        int length = iArr3.length;
        System.arraycopy(iArr3, 0, iArr2, 0, 16);
    }

    public static int zza(int i, int i2) {
        if (i % 2 != 0) {
            return (i | i2) - (i & i2);
        }
        return ((~i) & i2) | ((~i2) & i);
    }

    public static byte[] zze(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrZzd = new zzajf(bArr2, bArr3).zzd(bArr);
        int length = bArrZzd.length;
        byte[] bArr4 = new byte[length + 12];
        System.arraycopy(bArr3, 0, bArr4, 0, 12);
        System.arraycopy(bArrZzd, 0, bArr4, 12, length);
        return bArr4;
    }

    public static String zzf(String str, byte[] bArr, zzajg zzajgVar) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr2 = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr2, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr3, 0, length);
        return new String(new zzajf(bArr, bArr2).zzd(bArr3), zza);
    }

    private static final int zzg(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        zzc(i, i2, i4, 16);
        zzc(i3, i4, i2, 12);
        zzc(i, i2, i4, 8);
        zzc(i3, i4, i2, 7);
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        int[] iArr = this.zzb;
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int iZza = zza(iArr[i3], i5);
        iArr[i3] = iZza;
        iArr[i3] = (iZza << i4) | (iZza >>> (32 - i4));
    }

    public final byte[] zzd(byte[] bArr) {
        if (this.zzh != 1) {
            bg.h();
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = 0;
        while (length > 0) {
            int[] iArr = this.zzc;
            int[] iArr2 = this.zzb;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr2, 0, 16);
            this.zzb[12] = this.zzh;
            for (int i2 = 0; i2 < 10; i2++) {
                zzb(0, 4, 8, 12);
                zzb(1, 5, 9, 13);
                zzb(2, 6, 10, 14);
                zzb(3, 7, 11, 15);
                zzb(0, 5, 10, 15);
                zzb(1, 6, 11, 12);
                zzb(2, 7, 8, 13);
                zzb(3, 4, 9, 14);
            }
            byte[] bArr3 = new byte[64];
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = this.zzb[i3];
                int i5 = i3 * 4;
                bArr3[i5] = (byte) (i4 & 255);
                bArr3[i5 + 1] = (byte) ((i4 >> 8) & 255);
                bArr3[i5 + 2] = (byte) ((i4 >> 16) & 255);
                bArr3[i5 + 3] = (byte) ((i4 >> 24) & 255);
            }
            for (int i6 = 0; i6 < Math.min(64, length); i6++) {
                int i7 = i + i6;
                bArr2[i7] = (byte) zza(bArr3[i6], bArr[i7]);
            }
            this.zzh++;
            length -= 64;
            i += 64;
        }
        return bArr2;
    }

    public zzajf() {
    }
}
