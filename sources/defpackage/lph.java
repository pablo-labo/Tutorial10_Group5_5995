package defpackage;

import defpackage.dzh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lph extends dzh<lph, a> implements p3i {
    private static final lph zzj;
    private static volatile e5i<lph> zzk;
    private int zzc;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private e0i<lph> zzi = h5i.d;

    public static final class a extends dzh.a<lph, a> {
        public a() {
            super(lph.zzj);
        }

        public final void n(double d) {
            if (this.c) {
                k();
                this.c = false;
            }
            lph.r((lph) this.b, d);
        }

        public final void o(long j) {
            if (this.c) {
                k();
                this.c = false;
            }
            lph.s((lph) this.b, j);
        }

        public final void p(String str) {
            if (this.c) {
                k();
                this.c = false;
            }
            lph.t((lph) this.b, str);
        }

        public final void q(String str) {
            if (this.c) {
                k();
                this.c = false;
            }
            lph.A((lph) this.b, str);
        }
    }

    static {
        lph lphVar = new lph();
        zzj = lphVar;
        dzh.o(lph.class, lphVar);
    }

    public static void A(lph lphVar, String str) {
        lphVar.getClass();
        str.getClass();
        lphVar.zzc |= 2;
        lphVar.zze = str;
    }

    public static void B(lph lphVar) {
        lphVar.zzc &= -17;
        lphVar.zzh = 0.0d;
    }

    public static void E(lph lphVar) {
        lphVar.getClass();
        lphVar.zzi = h5i.d;
    }

    public static a N() {
        return zzj.p();
    }

    public static void r(lph lphVar, double d) {
        lphVar.zzc |= 16;
        lphVar.zzh = d;
    }

    public static void s(lph lphVar, long j) {
        lphVar.zzc |= 4;
        lphVar.zzf = j;
    }

    public static void t(lph lphVar, String str) {
        lphVar.getClass();
        str.getClass();
        lphVar.zzc |= 1;
        lphVar.zzd = str;
    }

    public static void u(lph lphVar, ArrayList arrayList) {
        e0i<lph> e0iVar = lphVar.zzi;
        if (!e0iVar.zza()) {
            lphVar.zzi = dzh.m(e0iVar);
        }
        zth.a(arrayList, lphVar.zzi);
    }

    public static void v(lph lphVar, lph lphVar2) {
        lphVar.getClass();
        e0i<lph> e0iVar = lphVar.zzi;
        if (!e0iVar.zza()) {
            lphVar.zzi = dzh.m(e0iVar);
        }
        lphVar.zzi.add(lphVar2);
    }

    public static void x(lph lphVar) {
        lphVar.zzc &= -3;
        lphVar.zze = zzj.zze;
    }

    public static void z(lph lphVar) {
        lphVar.zzc &= -5;
        lphVar.zzf = 0L;
    }

    public final boolean C() {
        return (this.zzc & 2) != 0;
    }

    public final String D() {
        return this.zze;
    }

    public final boolean F() {
        return (this.zzc & 4) != 0;
    }

    public final long G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzc & 8) != 0;
    }

    public final float I() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zzc & 16) != 0;
    }

    public final double K() {
        return this.zzh;
    }

    public final e0i L() {
        return this.zzi;
    }

    public final int M() {
        return this.zzi.size();
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new lph();
            case 2:
                return new a();
            case 3:
                return new q5i(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", lph.class});
            case 4:
                return zzj;
            case 5:
                e5i<lph> e5iVar = zzk;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (lph.class) {
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

    public final boolean w() {
        return (this.zzc & 1) != 0;
    }

    public final String y() {
        return this.zzd;
    }
}
