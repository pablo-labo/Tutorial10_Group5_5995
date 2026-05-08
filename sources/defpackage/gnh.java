package defpackage;

import defpackage.dzh;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gnh extends dzh<gnh, a> implements p3i {
    private static final gnh zzl;
    private static volatile e5i<gnh> zzm;
    private int zzc;
    private int zzd;
    private String zze = "";
    private e0i<hnh> zzf = h5i.d;
    private boolean zzg;
    private inh zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends dzh.a<gnh, a> {
        public a() {
            super(gnh.zzl);
        }
    }

    static {
        gnh gnhVar = new gnh();
        zzl = gnhVar;
        dzh.o(gnh.class, gnhVar);
    }

    public static a F() {
        return zzl.p();
    }

    public static void s(gnh gnhVar, int i, hnh hnhVar) {
        gnhVar.getClass();
        e0i<hnh> e0iVar = gnhVar.zzf;
        if (!e0iVar.zza()) {
            gnhVar.zzf = dzh.m(e0iVar);
        }
        gnhVar.zzf.set(i, hnhVar);
    }

    public static void t(gnh gnhVar, String str) {
        gnhVar.getClass();
        gnhVar.zzc |= 2;
        gnhVar.zze = str;
    }

    public final inh A() {
        inh inhVar = this.zzh;
        return inhVar == null ? inh.B() : inhVar;
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return this.zzj;
    }

    public final boolean D() {
        return (this.zzc & 64) != 0;
    }

    public final boolean E() {
        return this.zzk;
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (pnh.a[i - 1]) {
            case 1:
                return new gnh();
            case 2:
                return new a();
            case 3:
                return new q5i(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", hnh.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                e5i<gnh> e5iVar = zzm;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (gnh.class) {
                    try {
                        cVar = zzm;
                        if (cVar == null) {
                            cVar = new dzh.c();
                            zzm = cVar;
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

    public final hnh r(int i) {
        return this.zzf.get(i);
    }

    public final boolean u() {
        return (this.zzc & 1) != 0;
    }

    public final int v() {
        return this.zzd;
    }

    public final String w() {
        return this.zze;
    }

    public final List<hnh> x() {
        return this.zzf;
    }

    public final int y() {
        return this.zzf.size();
    }

    public final boolean z() {
        return (this.zzc & 8) != 0;
    }
}
