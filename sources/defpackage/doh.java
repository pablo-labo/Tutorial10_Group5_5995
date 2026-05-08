package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class doh extends dzh<doh, a> implements p3i {
    private static final doh zzl;
    private static volatile e5i<doh> zzm;
    private int zzc;
    private long zzd;
    private String zze = "";
    private int zzf;
    private e0i<eoh> zzg;
    private e0i<coh> zzh;
    private e0i<fnh> zzi;
    private String zzj;
    private boolean zzk;

    public static final class a extends dzh.a<doh, a> {
        public a() {
            super(doh.zzl);
        }
    }

    static {
        doh dohVar = new doh();
        zzl = dohVar;
        dzh.o(doh.class, dohVar);
    }

    public doh() {
        h5i<Object> h5iVar = h5i.d;
        this.zzg = h5iVar;
        this.zzh = h5iVar;
        this.zzi = h5iVar;
        this.zzj = "";
    }

    public static a C() {
        return zzl.p();
    }

    public static doh D() {
        return zzl;
    }

    public static void s(doh dohVar) {
        dohVar.getClass();
        dohVar.zzi = h5i.d;
    }

    public static void t(doh dohVar, int i, coh cohVar) {
        dohVar.getClass();
        e0i<coh> e0iVar = dohVar.zzh;
        if (!e0iVar.zza()) {
            dohVar.zzh = dzh.m(e0iVar);
        }
        dohVar.zzh.set(i, cohVar);
    }

    public final e0i A() {
        return this.zzi;
    }

    public final boolean B() {
        return this.zzk;
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (fph.a[i - 1]) {
            case 1:
                return new doh();
            case 2:
                return new a();
            case 3:
                return new q5i(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", eoh.class, "zzh", coh.class, "zzi", fnh.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                e5i<doh> e5iVar = zzm;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (doh.class) {
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

    public final coh r(int i) {
        return this.zzh.get(i);
    }

    public final boolean u() {
        return (this.zzc & 1) != 0;
    }

    public final long v() {
        return this.zzd;
    }

    public final boolean w() {
        return (this.zzc & 2) != 0;
    }

    public final String x() {
        return this.zze;
    }

    public final e0i y() {
        return this.zzg;
    }

    public final int z() {
        return this.zzh.size();
    }
}
