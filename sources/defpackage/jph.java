package defpackage;

import defpackage.dzh;
import defpackage.lph;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jph extends dzh<jph, a> implements p3i {
    private static final jph zzi;
    private static volatile e5i<jph> zzj;
    private int zzc;
    private e0i<lph> zzd = h5i.d;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    public static final class a extends dzh.a<jph, a> {
        public a() {
            super(jph.zzi);
        }

        public final void n(int i, lph lphVar) {
            if (this.c) {
                k();
                this.c = false;
            }
            jph.x((jph) this.b, i, lphVar);
        }

        public final void o(long j) {
            if (this.c) {
                k();
                this.c = false;
            }
            jph.t(j, (jph) this.b);
        }

        public final void p(lph.a aVar) {
            if (this.c) {
                k();
                this.c = false;
            }
            jph.z((jph) this.b, (lph) aVar.m());
        }

        public final void q(int i) {
            if (this.c) {
                k();
                this.c = false;
            }
            jph.w((jph) this.b, i);
        }

        public final String r() {
            return ((jph) this.b).C();
        }

        public final long t() {
            return ((jph) this.b).E();
        }

        public final long u() {
            return ((jph) this.b).G();
        }
    }

    static {
        jph jphVar = new jph();
        zzi = jphVar;
        dzh.o(jph.class, jphVar);
    }

    public static void B(long j, jph jphVar) {
        jphVar.zzc |= 4;
        jphVar.zzg = j;
    }

    public static a J() {
        return zzi.p();
    }

    public static void t(long j, jph jphVar) {
        jphVar.zzc |= 2;
        jphVar.zzf = j;
    }

    public static void u(String str, jph jphVar) {
        jphVar.getClass();
        str.getClass();
        jphVar.zzc |= 1;
        jphVar.zze = str;
    }

    public static void v(jph jphVar) {
        jphVar.getClass();
        jphVar.zzd = h5i.d;
    }

    public static void w(jph jphVar, int i) {
        jphVar.L();
        jphVar.zzd.remove(i);
    }

    public static void x(jph jphVar, int i, lph lphVar) {
        jphVar.getClass();
        jphVar.L();
        jphVar.zzd.set(i, lphVar);
    }

    public static void y(jph jphVar, Iterable iterable) {
        jphVar.L();
        zth.a(iterable, jphVar.zzd);
    }

    public static void z(jph jphVar, lph lphVar) {
        jphVar.getClass();
        jphVar.L();
        jphVar.zzd.add(lphVar);
    }

    public final int A() {
        return this.zzd.size();
    }

    public final String C() {
        return this.zze;
    }

    public final boolean D() {
        return (this.zzc & 2) != 0;
    }

    public final long E() {
        return this.zzf;
    }

    public final boolean F() {
        return (this.zzc & 4) != 0;
    }

    public final long G() {
        return this.zzg;
    }

    public final boolean H() {
        return (this.zzc & 8) != 0;
    }

    public final int I() {
        return this.zzh;
    }

    public final void L() {
        e0i<lph> e0iVar = this.zzd;
        if (e0iVar.zza()) {
            return;
        }
        this.zzd = dzh.m(e0iVar);
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new jph();
            case 2:
                return new a();
            case 3:
                return new q5i(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", lph.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                e5i<jph> e5iVar = zzj;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (jph.class) {
                    try {
                        cVar = zzj;
                        if (cVar == null) {
                            cVar = new dzh.c();
                            zzj = cVar;
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

    public final List<lph> r() {
        return this.zzd;
    }

    public final lph s(int i) {
        return this.zzd.get(i);
    }
}
