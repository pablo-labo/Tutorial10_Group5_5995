package defpackage;

import defpackage.dzh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pph extends dzh<pph, a> implements p3i {
    private static final pph zzg;
    private static volatile e5i<pph> zzh;
    private wzh zzc;
    private wzh zzd;
    private e0i<iph> zze;
    private e0i<qph> zzf;

    public static final class a extends dzh.a<pph, a> {
        public a() {
            super(pph.zzg);
        }
    }

    static {
        pph pphVar = new pph();
        zzg = pphVar;
        dzh.o(pph.class, pphVar);
    }

    public pph() {
        b2i b2iVar = b2i.d;
        this.zzc = b2iVar;
        this.zzd = b2iVar;
        h5i<Object> h5iVar = h5i.d;
        this.zze = h5iVar;
        this.zzf = h5iVar;
    }

    public static void A(pph pphVar) {
        pphVar.getClass();
        pphVar.zzd = b2i.d;
    }

    public static void C(pph pphVar, ArrayList arrayList) {
        e0i<iph> e0iVar = pphVar.zze;
        if (!e0iVar.zza()) {
            pphVar.zze = dzh.m(e0iVar);
        }
        zth.a(arrayList, pphVar.zze);
    }

    public static void E(pph pphVar, List list) {
        e0i<qph> e0iVar = pphVar.zzf;
        if (!e0iVar.zza()) {
            pphVar.zzf = dzh.m(e0iVar);
        }
        zth.a(list, pphVar.zzf);
    }

    public static a J() {
        return zzg.p();
    }

    public static pph K() {
        return zzg;
    }

    public static void t(pph pphVar, int i) {
        e0i<iph> e0iVar = pphVar.zze;
        if (!e0iVar.zza()) {
            pphVar.zze = dzh.m(e0iVar);
        }
        pphVar.zze.remove(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(pph pphVar, Iterable iterable) {
        wzh wzhVar = pphVar.zzc;
        if (!((wuh) wzhVar).a) {
            pphVar.zzc = dzh.n(wzhVar);
        }
        zth.a(iterable, pphVar.zzc);
    }

    public static void v(pph pphVar) {
        pphVar.getClass();
        pphVar.zzc = b2i.d;
    }

    public static void y(pph pphVar, int i) {
        e0i<qph> e0iVar = pphVar.zzf;
        if (!e0iVar.zza()) {
            pphVar.zzf = dzh.m(e0iVar);
        }
        pphVar.zzf.remove(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(pph pphVar, List list) {
        wzh wzhVar = pphVar.zzd;
        if (!((wuh) wzhVar).a) {
            pphVar.zzd = dzh.n(wzhVar);
        }
        zth.a(list, pphVar.zzd);
    }

    public final List<Long> B() {
        return this.zzd;
    }

    public final int D() {
        return this.zzd.size();
    }

    public final e0i F() {
        return this.zze;
    }

    public final int G() {
        return this.zze.size();
    }

    public final e0i H() {
        return this.zzf;
    }

    public final int I() {
        return this.zzf.size();
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (tph.a[i - 1]) {
            case 1:
                return new pph();
            case 2:
                return new a();
            case 3:
                return new q5i(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", iph.class, "zzf", qph.class});
            case 4:
                return zzg;
            case 5:
                e5i<pph> e5iVar = zzh;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (pph.class) {
                    try {
                        cVar = zzh;
                        if (cVar == null) {
                            cVar = new dzh.c();
                            zzh = cVar;
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

    public final List<Long> r() {
        return this.zzc;
    }

    public final iph s(int i) {
        return this.zze.get(i);
    }

    public final int w() {
        return this.zzc.size();
    }

    public final qph x(int i) {
        return this.zzf.get(i);
    }
}
