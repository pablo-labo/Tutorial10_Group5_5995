package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class hnh extends dzh<hnh, a> implements p3i {
    private static final hnh zzh;
    private static volatile e5i<hnh> zzi;
    private int zzc;
    private knh zzd;
    private inh zze;
    private boolean zzf;
    private String zzg = "";

    public static final class a extends dzh.a<hnh, a> {
        public a() {
            super(hnh.zzh);
        }
    }

    static {
        hnh hnhVar = new hnh();
        zzh = hnhVar;
        dzh.o(hnh.class, hnhVar);
    }

    public static hnh A() {
        return zzh;
    }

    public static void r(hnh hnhVar, String str) {
        hnhVar.getClass();
        hnhVar.zzc |= 8;
        hnhVar.zzg = str;
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (pnh.a[i - 1]) {
            case 1:
                return new hnh();
            case 2:
                return new a();
            case 3:
                return new q5i(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                e5i<hnh> e5iVar = zzi;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (hnh.class) {
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

    public final boolean s() {
        return (this.zzc & 1) != 0;
    }

    public final knh t() {
        knh knhVar = this.zzd;
        return knhVar == null ? knh.z() : knhVar;
    }

    public final boolean u() {
        return (this.zzc & 2) != 0;
    }

    public final inh v() {
        inh inhVar = this.zze;
        return inhVar == null ? inh.B() : inhVar;
    }

    public final boolean w() {
        return (this.zzc & 4) != 0;
    }

    public final boolean x() {
        return this.zzf;
    }

    public final boolean y() {
        return (this.zzc & 8) != 0;
    }

    public final String z() {
        return this.zzg;
    }
}
