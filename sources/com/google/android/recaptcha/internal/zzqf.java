package com.google.android.recaptcha.internal;

import defpackage.l5;
import defpackage.p6;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzqf extends zzqg {
    public static final /* synthetic */ int zzc = 0;
    final zzqb zza;
    final Character zzb;

    public zzqf(zzqb zzqbVar, Character ch) {
        this.zza = zzqbVar;
        if (ch == null || !zzqbVar.zzd('=')) {
            this.zzb = ch;
        } else {
            l5.q(zznc.zza("Padding character %s was already in alphabet", ch));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzqf) {
            zzqf zzqfVar = (zzqf) obj;
            if (this.zza.equals(zzqfVar.zza) && Objects.equals(this.zzb, zzqfVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ Objects.hashCode(this.zzb);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzqb zzqbVar = this.zza;
        sb.append(zzqbVar);
        if (8 % zzqbVar.zzb != 0) {
            Character ch = this.zzb;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzqg
    public int zza(byte[] bArr, CharSequence charSequence) throws zzqe {
        int i;
        CharSequence charSequenceZze = zze(charSequence);
        int length = charSequenceZze.length();
        zzqb zzqbVar = this.zza;
        if (!zzqbVar.zzc(length)) {
            throw new zzqe(p6.c(charSequenceZze.length(), "Invalid input length "));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceZze.length()) {
            long jZzb = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zzqbVar.zzc;
                if (i4 >= i) {
                    break;
                }
                jZzb <<= zzqbVar.zzb;
                if (i2 + i4 < charSequenceZze.length()) {
                    jZzb |= (long) zzqbVar.zzb(charSequenceZze.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzqbVar.zzd;
            int i7 = i5 * zzqbVar.zzb;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((jZzb >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    @Override // com.google.android.recaptcha.internal.zzqg
    public void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzmz.zzf(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zza.zzd;
            zzf(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqg
    public final int zzc(int i) {
        return (int) (((((long) this.zza.zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzqg
    public final int zzd(int i) {
        zzqb zzqbVar = this.zza;
        return zzqbVar.zzc * zzqi.zza(i, zzqbVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzqg
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzmz.zzf(i, i + i2, bArr.length);
        zzqb zzqbVar = this.zza;
        int i3 = zzqbVar.zzd;
        int i4 = 0;
        zzmz.zzc(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzqbVar.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzqbVar.zza(zzqbVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        if (this.zzb != null) {
            while (i4 < i3 * 8) {
                appendable.append('=');
                i4 += i7;
            }
        }
    }

    public zzqf(String str, String str2, Character ch) {
        this(new zzqb(str, str2.toCharArray()), ch);
    }
}
