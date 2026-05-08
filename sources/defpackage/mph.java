package defpackage;

import defpackage.dzh;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mph extends dzh<mph, a> implements p3i {
    private static final mph zzd;
    private static volatile e5i<mph> zze;
    private e0i<nph> zzc = h5i.d;

    public static final class a extends dzh.a<mph, a> {
        public a() {
            super(mph.zzd);
        }
    }

    static {
        mph mphVar = new mph();
        zzd = mphVar;
        dzh.o(mph.class, mphVar);
    }

    public static void t(mph mphVar, nph nphVar) {
        mphVar.getClass();
        e0i<nph> e0iVar = mphVar.zzc;
        if (!e0iVar.zza()) {
            mphVar.zzc = dzh.m(e0iVar);
        }
        mphVar.zzc.add(nphVar);
    }

    public static a u() {
        return zzd.p();
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new mph();
            case 2:
                return new a();
            case 3:
                return new q5i(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", nph.class});
            case 4:
                return zzd;
            case 5:
                e5i<mph> e5iVar = zze;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (mph.class) {
                    try {
                        cVar = zze;
                        if (cVar == null) {
                            cVar = new dzh.c();
                            zze = cVar;
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

    public final List<nph> r() {
        return this.zzc;
    }

    public final nph s() {
        return this.zzc.get(0);
    }
}
