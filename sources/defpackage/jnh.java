package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class jnh extends dzh<jnh, a> implements p3i {
    private static final jnh zzj;
    private static volatile e5i<jnh> zzk;
    private int zzc;
    private int zzd;
    private String zze = "";
    private hnh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public static final class a extends dzh.a<jnh, a> {
        public a() {
            super(jnh.zzj);
        }
    }

    static {
        jnh jnhVar = new jnh();
        zzj = jnhVar;
        dzh.o(jnh.class, jnhVar);
    }

    public static a A() {
        return zzj.p();
    }

    public static void r(jnh jnhVar, String str) {
        jnhVar.getClass();
        jnhVar.zzc |= 2;
        jnhVar.zze = str;
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (pnh.a[i - 1]) {
            case 1:
                return new jnh();
            case 2:
                return new a();
            case 3:
                return new q5i(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                e5i<jnh> e5iVar = zzk;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (jnh.class) {
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

    public final boolean s() {
        return (this.zzc & 1) != 0;
    }

    public final int t() {
        return this.zzd;
    }

    public final String u() {
        return this.zze;
    }

    public final hnh v() {
        hnh hnhVar = this.zzf;
        return hnhVar == null ? hnh.A() : hnhVar;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zzc & 32) != 0;
    }

    public final boolean z() {
        return this.zzi;
    }
}
