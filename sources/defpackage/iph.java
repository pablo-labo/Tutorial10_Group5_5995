package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class iph extends dzh<iph, a> implements p3i {
    private static final iph zzf;
    private static volatile e5i<iph> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    public static final class a extends dzh.a<iph, a> {
        public a() {
            super(iph.zzf);
        }
    }

    static {
        iph iphVar = new iph();
        zzf = iphVar;
        dzh.o(iph.class, iphVar);
    }

    public static void r(iph iphVar, int i) {
        iphVar.zzc |= 1;
        iphVar.zzd = i;
    }

    public static void s(iph iphVar, long j) {
        iphVar.zzc |= 2;
        iphVar.zze = j;
    }

    public static a x() {
        return zzf.p();
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new iph();
            case 2:
                return new a();
            case 3:
                return new q5i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                e5i<iph> e5iVar = zzg;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (iph.class) {
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

    public final boolean t() {
        return (this.zzc & 1) != 0;
    }

    public final int u() {
        return this.zzd;
    }

    public final boolean v() {
        return (this.zzc & 2) != 0;
    }

    public final long w() {
        return this.zze;
    }
}
