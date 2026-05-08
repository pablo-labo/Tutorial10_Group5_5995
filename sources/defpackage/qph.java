package defpackage;

import defpackage.dzh;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qph extends dzh<qph, a> implements p3i {
    private static final qph zzf;
    private static volatile e5i<qph> zzg;
    private int zzc;
    private int zzd;
    private wzh zze = b2i.d;

    public static final class a extends dzh.a<qph, a> {
        public a() {
            super(qph.zzf);
        }
    }

    static {
        qph qphVar = new qph();
        zzf = qphVar;
        dzh.o(qph.class, qphVar);
    }

    public static void s(qph qphVar, int i) {
        qphVar.zzc |= 1;
        qphVar.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(qph qphVar, List list) {
        wzh wzhVar = qphVar.zze;
        if (!((wuh) wzhVar).a) {
            qphVar.zze = dzh.n(wzhVar);
        }
        zth.a(list, qphVar.zze);
    }

    public static a y() {
        return zzf.p();
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new qph();
            case 2:
                return new a();
            case 3:
                return new q5i(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                e5i<qph> e5iVar = zzg;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (qph.class) {
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

    public final long r(int i) {
        b2i b2iVar = (b2i) this.zze;
        b2iVar.c(i);
        return b2iVar.b[i];
    }

    public final boolean u() {
        return (this.zzc & 1) != 0;
    }

    public final int v() {
        return this.zzd;
    }

    public final List<Long> w() {
        return this.zze;
    }

    public final int x() {
        return this.zze.size();
    }
}
