package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class knh extends dzh<knh, a> implements p3i {
    private static final knh zzh;
    private static volatile e5i<knh> zzi;
    private int zzc;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private e0i<String> zzg = h5i.d;

    public static final class a extends dzh.a<knh, a> {
    }

    public enum b implements jzh {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);

        private final int zzi;

        b(int i) {
            this.zzi = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
        }
    }

    static {
        knh knhVar = new knh();
        zzh = knhVar;
        dzh.o(knh.class, knhVar);
    }

    public static knh z() {
        return zzh;
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (pnh.a[i - 1]) {
            case 1:
                return new knh();
            case 2:
                return new a(zzh);
            case 3:
                return new q5i(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", ioh.a, "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                e5i<knh> e5iVar = zzi;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (knh.class) {
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

    public final boolean r() {
        return (this.zzc & 1) != 0;
    }

    public final b s() {
        b bVar;
        int i = this.zzd;
        b bVar2 = b.UNKNOWN_MATCH_TYPE;
        switch (i) {
            case 0:
                bVar = bVar2;
                break;
            case 1:
                bVar = b.REGEXP;
                break;
            case 2:
                bVar = b.BEGINS_WITH;
                break;
            case 3:
                bVar = b.ENDS_WITH;
                break;
            case 4:
                bVar = b.PARTIAL;
                break;
            case 5:
                bVar = b.EXACT;
                break;
            case 6:
                bVar = b.IN_LIST;
                break;
            default:
                bVar = null;
                break;
        }
        return bVar == null ? bVar2 : bVar;
    }

    public final boolean t() {
        return (this.zzc & 2) != 0;
    }

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzc & 4) != 0;
    }

    public final boolean w() {
        return this.zzf;
    }

    public final e0i x() {
        return this.zzg;
    }

    public final int y() {
        return this.zzg.size();
    }
}
