package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class hph extends dzh<hph, a> implements p3i {
    private static final hph zzh;
    private static volatile e5i<hph> zzi;
    private int zzc;
    private int zzd;
    private pph zze;
    private pph zzf;
    private boolean zzg;

    public static final class a extends dzh.a<hph, a> {
        public a() {
            super(hph.zzh);
        }
    }

    static {
        hph hphVar = new hph();
        zzh = hphVar;
        dzh.o(hph.class, hphVar);
    }

    public static a C() {
        return zzh.p();
    }

    public static void r(hph hphVar, int i) {
        hphVar.zzc |= 1;
        hphVar.zzd = i;
    }

    public static void s(hph hphVar, pph pphVar) {
        hphVar.getClass();
        hphVar.zze = pphVar;
        hphVar.zzc |= 2;
    }

    public static void t(hph hphVar, boolean z) {
        hphVar.zzc |= 8;
        hphVar.zzg = z;
    }

    public static void w(hph hphVar, pph pphVar) {
        hphVar.getClass();
        pphVar.getClass();
        hphVar.zzf = pphVar;
        hphVar.zzc |= 4;
    }

    public final boolean A() {
        return (this.zzc & 8) != 0;
    }

    public final boolean B() {
        return this.zzg;
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new hph();
            case 2:
                return new a();
            case 3:
                return new q5i(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                e5i<hph> e5iVar = zzi;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (hph.class) {
                    try {
                        cVar = zzi;
                        if (cVar == null) {
                            cVar = new dzh.c();
                            zzi = cVar;
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

    public final boolean u() {
        return (this.zzc & 1) != 0;
    }

    public final int v() {
        return this.zzd;
    }

    public final pph x() {
        pph pphVar = this.zze;
        return pphVar == null ? pph.K() : pphVar;
    }

    public final boolean y() {
        return (this.zzc & 4) != 0;
    }

    public final pph z() {
        pph pphVar = this.zzf;
        return pphVar == null ? pph.K() : pphVar;
    }
}
