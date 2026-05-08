package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class inh extends dzh<inh, b> implements p3i {
    private static final inh zzi;
    private static volatile e5i<inh> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    public enum a implements jzh {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);

        private final int zzg;

        a(int i) {
            this.zzg = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }
    }

    public static final class b extends dzh.a<inh, b> {
    }

    static {
        inh inhVar = new inh();
        zzi = inhVar;
        dzh.o(inh.class, inhVar);
    }

    public static inh B() {
        return zzi;
    }

    public final String A() {
        return this.zzh;
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (pnh.a[i - 1]) {
            case 1:
                return new inh();
            case 2:
                return new b(zzi);
            case 3:
                return new q5i(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", tnh.a, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                e5i<inh> e5iVar = zzj;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (inh.class) {
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

    public final boolean r() {
        return (this.zzc & 1) != 0;
    }

    public final a s() {
        a aVarA = a.a(this.zzd);
        return aVarA == null ? a.UNKNOWN_COMPARISON_TYPE : aVarA;
    }

    public final boolean t() {
        return (this.zzc & 2) != 0;
    }

    public final boolean u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzc & 4) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzc & 8) != 0;
    }

    public final String y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzc & 16) != 0;
    }
}
