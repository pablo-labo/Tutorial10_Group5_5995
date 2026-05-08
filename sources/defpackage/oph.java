package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class oph extends dzh<oph, b> implements p3i {
    private static final oph zzf;
    private static volatile e5i<oph> zzg;
    private int zzc;
    private int zzd = 1;
    private e0i<kph> zze = h5i.d;

    public enum a implements jzh {
        RADS(1),
        PROVISIONING(2);

        private final int zzd;

        a(int i) {
            this.zzd = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
        }
    }

    public static final class b extends dzh.a<oph, b> {
    }

    static {
        oph ophVar = new oph();
        zzf = ophVar;
        dzh.o(oph.class, ophVar);
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new oph();
            case 2:
                return new b(zzf);
            case 3:
                return new q5i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", wph.a, "zze", kph.class});
            case 4:
                return zzf;
            case 5:
                e5i<oph> e5iVar = zzg;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (oph.class) {
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
}
