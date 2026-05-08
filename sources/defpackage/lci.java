package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lci extends oyh implements i2i {
    private static final lci zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        lci lciVar = new lci();
        zzb = lciVar;
        oyh.j(lci.class, lciVar);
    }

    @Override // defpackage.oyh
    public final Object e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new e3i(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new lci();
        }
        if (i2 == 4) {
            return new hci(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
