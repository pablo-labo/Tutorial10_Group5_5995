package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class abi extends oyh implements i2i {
    private static final abi zzb;
    private int zzd;
    private azh zze = b3i.e;
    private String zzf = "";
    private boolean zzg;

    static {
        abi abiVar = new abi();
        zzb = abiVar;
        oyh.j(abi.class, abiVar);
    }

    @Override // defpackage.oyh
    public final Object e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new e3i(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", tai.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new abi();
        }
        if (i2 == 4) {
            return new iai(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
