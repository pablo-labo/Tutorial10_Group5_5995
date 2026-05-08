package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class eoh extends dzh<eoh, a> implements p3i {
    private static final eoh zzf;
    private static volatile e5i<eoh> zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    public static final class a extends dzh.a<eoh, a> {
    }

    static {
        eoh eohVar = new eoh();
        zzf = eohVar;
        dzh.o(eoh.class, eohVar);
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (fph.a[i - 1]) {
            case 1:
                return new eoh();
            case 2:
                return new a(zzf);
            case 3:
                return new q5i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                e5i<eoh> e5iVar = zzg;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (eoh.class) {
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

    public final String r() {
        return this.zzd;
    }

    public final String s() {
        return this.zze;
    }
}
