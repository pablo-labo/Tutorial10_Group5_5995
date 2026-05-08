package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y7i extends oyh implements i2i {
    private static final y7i zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        y7i y7iVar = new y7i();
        zzb = y7iVar;
        oyh.j(y7i.class, y7iVar);
    }

    public static /* synthetic */ void m(y7i y7iVar, String str) {
        y7iVar.zzd |= 8;
        y7iVar.zzh = str;
    }

    public static /* synthetic */ void n(y7i y7iVar, String str) {
        str.getClass();
        y7iVar.zzd |= 2;
        y7iVar.zzf = str;
    }

    public static /* synthetic */ void o(y7i y7iVar, s7i s7iVar) {
        y7iVar.zzg = s7iVar.zza();
        y7iVar.zzd |= 4;
    }

    public static /* synthetic */ void p(y7i y7iVar, int i) {
        y7iVar.zzd |= 1;
        y7iVar.zze = i;
    }

    public static o7i q() {
        return (o7i) ((vxh) zzb.e(5));
    }

    @Override // defpackage.oyh
    public final Object e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new e3i(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", pi3.d, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new y7i();
        }
        if (i2 == 4) {
            return new o7i(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
