package com.google.android.recaptcha.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.b0;
import defpackage.g7;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzqg {
    private static final zzqg zza = new zzqd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzqg zzb = new zzqd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        new zzqf("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzqf("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        int i = zzqc.zza;
        zzqb zzqbVar = new zzqb("base16()", "0123456789ABCDEF".toCharArray());
        new zzqf(zzqbVar, null);
        char[] cArr = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        zzmz.zzc(zzqbVar.zzf.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            cArr[i2] = zzqbVar.zza(i2 >>> 4);
            cArr[i2 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER] = zzqbVar.zza(i2 & 15);
        }
    }

    public static zzqg zzg() {
        return zza;
    }

    public static zzqg zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2);

    public abstract int zzc(int i);

    public abstract int zzd(int i);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i, int i2) {
        zzmz.zzf(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            g7.l(e);
            return null;
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence charSequenceZze = zze(charSequence);
            int iZzc = zzc(charSequenceZze.length());
            byte[] bArr = new byte[iZzc];
            int iZza = zza(bArr, charSequenceZze);
            if (iZza == iZzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzqe e) {
            b0.s(e);
            return null;
        }
    }
}
