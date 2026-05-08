package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class rph extends dzh<rph, a> implements p3i {
    private static final rph zzj;
    private static volatile e5i<rph> zzk;
    private int zzc;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    public static final class a extends dzh.a<rph, a> {
        public a() {
            super(rph.zzj);
        }

        public final void n(String str) {
            if (this.c) {
                k();
                this.c = false;
            }
            rph.t((rph) this.b, str);
        }

        public final void o(long j) {
            if (this.c) {
                k();
                this.c = false;
            }
            rph.s((rph) this.b, j);
        }

        public final void p(long j) {
            if (this.c) {
                k();
                this.c = false;
            }
            rph.y((rph) this.b, j);
        }
    }

    static {
        rph rphVar = new rph();
        zzj = rphVar;
        dzh.o(rph.class, rphVar);
    }

    public static void B(rph rphVar) {
        rphVar.zzc &= -33;
        rphVar.zzi = 0.0d;
    }

    public static a I() {
        return zzj.p();
    }

    public static void r(rph rphVar, double d) {
        rphVar.zzc |= 32;
        rphVar.zzi = d;
    }

    public static void s(rph rphVar, long j) {
        rphVar.zzc |= 1;
        rphVar.zzd = j;
    }

    public static void t(rph rphVar, String str) {
        rphVar.getClass();
        str.getClass();
        rphVar.zzc |= 2;
        rphVar.zze = str;
    }

    public static void v(rph rphVar) {
        rphVar.zzc &= -5;
        rphVar.zzf = zzj.zzf;
    }

    public static void x(rph rphVar) {
        rphVar.zzc &= -9;
        rphVar.zzg = 0L;
    }

    public static void y(rph rphVar, long j) {
        rphVar.zzc |= 8;
        rphVar.zzg = j;
    }

    public static void z(rph rphVar, String str) {
        rphVar.getClass();
        str.getClass();
        rphVar.zzc |= 4;
        rphVar.zzf = str;
    }

    public final String A() {
        return this.zze;
    }

    public final boolean C() {
        return (this.zzc & 4) != 0;
    }

    public final String D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zzc & 8) != 0;
    }

    public final long F() {
        return this.zzg;
    }

    public final boolean G() {
        return (this.zzc & 32) != 0;
    }

    public final double H() {
        return this.zzi;
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new rph();
            case 2:
                return new a();
            case 3:
                return new q5i(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                e5i<rph> e5iVar = zzk;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (rph.class) {
                    try {
                        cVar = zzk;
                        if (cVar == null) {
                            cVar = new dzh.c();
                            zzk = cVar;
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

    public final long w() {
        return this.zzd;
    }
}
