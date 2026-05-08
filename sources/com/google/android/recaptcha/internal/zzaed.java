package com.google.android.recaptcha.internal;

import defpackage.k20;
import defpackage.l5;
import defpackage.l6;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
class zzaed extends zzaec {
    protected final byte[] zza;

    public zzaed(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaef) || zzd() != ((zzaef) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzaed)) {
            return obj.equals(this);
        }
        zzaed zzaedVar = (zzaed) obj;
        int iZzl = zzl();
        int iZzl2 = zzaedVar.zzl();
        if (iZzl != 0 && iZzl2 != 0 && iZzl != iZzl2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzaedVar.zzd()) {
            l6.l(iZzd, zzd());
            return false;
        }
        if (iZzd > zzaedVar.zzd()) {
            l5.q(k20.l("Ran off end of other: 0, ", iZzd, zzaedVar.zzd(), ", "));
            return false;
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzaedVar.zza;
        zzaedVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public final int zzf(int i, int i2, int i3) {
        return zzago.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public final zzaef zzg(int i, int i2) {
        int iZzk = zzaef.zzk(0, i2, zzd());
        return iZzk == 0 ? zzaef.zzb : new zzaea(this.zza, 0, iZzk);
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public final zzaej zzh() {
        return zzaej.zzH(this.zza, 0, zzd(), true);
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public final String zzi(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.recaptcha.internal.zzaef
    public final void zzj(zzadx zzadxVar) {
        ((zzael) zzadxVar).zzc(this.zza, 0, zzd());
    }
}
