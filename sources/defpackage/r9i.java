package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r9i extends oyh implements i2i {
    private static final r9i zzb;
    private int zzd;
    private int zze;

    static {
        r9i r9iVar = new r9i();
        zzb = r9iVar;
        oyh.j(r9i.class, r9iVar);
    }

    @Override // defpackage.oyh
    public final Object e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new e3i(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", boa.h0});
        }
        if (i2 == 3) {
            return new r9i();
        }
        if (i2 == 4) {
            return new h9i(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
