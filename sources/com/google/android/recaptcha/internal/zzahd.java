package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzahd implements zzaia {
    private static final zzahj zza = new zzahb();
    private final zzahj zzb;

    public zzahd() {
        zzafz zzafzVarZza = zzafz.zza();
        int i = zzadt.zza;
        zzahc zzahcVar = new zzahc(zzafzVarZza, zza);
        byte[] bArr = zzago.zzb;
        this.zzb = zzahcVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaia
    public final zzahz zza(Class cls) {
        int i = zzaib.zza;
        if (!zzagg.class.isAssignableFrom(cls)) {
            int i2 = zzadt.zza;
        }
        zzahi zzahiVarZzb = this.zzb.zzb(cls);
        if (zzahiVarZzb.zzb()) {
            int i3 = zzadt.zza;
            return zzahp.zzc(zzaib.zzn(), zzafu.zza(), zzahiVarZzb.zza());
        }
        int i4 = zzadt.zza;
        return zzaho.zzm(cls, zzahiVarZzb, zzahs.zza(), zzagz.zza(), zzaib.zzn(), zzahiVarZzb.zzc() + (-1) != 1 ? zzafu.zza() : null, zzahh.zza());
    }
}
