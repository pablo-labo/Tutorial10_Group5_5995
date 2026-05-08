package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o6i extends oyh implements i2i {
    private static final o6i zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private y7i zzh;
    private int zzi;

    static {
        o6i o6iVar = new o6i();
        zzb = o6iVar;
        oyh.j(o6i.class, o6iVar);
    }

    public static /* synthetic */ void m(o6i o6iVar) {
        o6iVar.zzi = l8i.BROADCAST_ACTION_UNSPECIFIED.zza();
        o6iVar.zzd |= 4;
    }

    public static /* synthetic */ void n(o6i o6iVar, y7i y7iVar) {
        o6iVar.zzh = y7iVar;
        o6iVar.zzd |= 2;
    }

    public static /* synthetic */ void o(o6i o6iVar, int i) {
        o6iVar.zzg = i - 1;
        o6iVar.zzd |= 1;
    }

    public static j6i p() {
        return (j6i) ((vxh) zzb.e(5));
    }

    @Override // defpackage.oyh
    public final Object e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new e3i(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", h4.d0, "zzh", r9i.class, "zzi", jh2.d0, lci.class, abi.class});
        }
        if (i2 == 3) {
            return new o6i();
        }
        if (i2 == 4) {
            return new j6i(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
