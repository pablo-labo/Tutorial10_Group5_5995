package defpackage;

import defpackage.dzh;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fnh extends dzh<fnh, a> implements p3i {
    private static final fnh zzi;
    private static volatile e5i<fnh> zzj;
    private int zzc;
    private int zzd;
    private e0i<jnh> zze;
    private e0i<gnh> zzf;
    private boolean zzg;
    private boolean zzh;

    public static final class a extends dzh.a<fnh, a> {
        public a() {
            super(fnh.zzi);
        }
    }

    static {
        fnh fnhVar = new fnh();
        zzi = fnhVar;
        dzh.o(fnh.class, fnhVar);
    }

    public fnh() {
        h5i<Object> h5iVar = h5i.d;
        this.zze = h5iVar;
        this.zzf = h5iVar;
    }

    public static void s(fnh fnhVar, int i, gnh gnhVar) {
        fnhVar.getClass();
        e0i<gnh> e0iVar = fnhVar.zzf;
        if (!e0iVar.zza()) {
            fnhVar.zzf = dzh.m(e0iVar);
        }
        fnhVar.zzf.set(i, gnhVar);
    }

    public static void t(fnh fnhVar, int i, jnh jnhVar) {
        fnhVar.getClass();
        e0i<jnh> e0iVar = fnhVar.zze;
        if (!e0iVar.zza()) {
            fnhVar.zze = dzh.m(e0iVar);
        }
        fnhVar.zze.set(i, jnhVar);
    }

    public final int A() {
        return this.zzf.size();
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (pnh.a[i - 1]) {
            case 1:
                return new fnh();
            case 2:
                return new a();
            case 3:
                return new q5i(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", jnh.class, "zzf", gnh.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                e5i<fnh> e5iVar = zzj;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (fnh.class) {
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

    public final jnh r(int i) {
        return this.zze.get(i);
    }

    public final boolean u() {
        return (this.zzc & 1) != 0;
    }

    public final int v() {
        return this.zzd;
    }

    public final gnh w(int i) {
        return this.zzf.get(i);
    }

    public final List<jnh> x() {
        return this.zze;
    }

    public final int y() {
        return this.zze.size();
    }

    public final e0i z() {
        return this.zzf;
    }
}
