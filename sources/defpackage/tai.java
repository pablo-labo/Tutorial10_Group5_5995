package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tai extends oyh implements i2i {
    private static final tai zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        tai taiVar = new tai();
        zzb = taiVar;
        oyh.j(tai.class, taiVar);
    }

    @Override // defpackage.oyh
    public final Object e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new e3i(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", pg8.C0, "zzf"});
        }
        if (i2 == 3) {
            return new tai();
        }
        if (i2 == 4) {
            return new mai(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
