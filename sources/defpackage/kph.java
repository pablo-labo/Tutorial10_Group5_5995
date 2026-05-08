package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class kph extends dzh<kph, a> implements p3i {
    private static final kph zzf;
    private static volatile e5i<kph> zzg;
    private int zzc;
    private String zzd = "";
    private long zze;

    public static final class a extends dzh.a<kph, a> {
    }

    static {
        kph kphVar = new kph();
        zzf = kphVar;
        dzh.o(kph.class, kphVar);
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new kph();
            case 2:
                return new a(zzf);
            case 3:
                return new q5i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                e5i<kph> e5iVar = zzg;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (kph.class) {
                    try {
                        cVar = zzg;
                        if (cVar == null) {
                            cVar = new dzh.c();
                            zzg = cVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            default:
                b0.l();
            case 7:
                return null;
        }
    }
}
