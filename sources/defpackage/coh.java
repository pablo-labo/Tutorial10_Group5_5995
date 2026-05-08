package defpackage;

import defpackage.dzh;

/* JADX INFO: loaded from: classes2.dex */
public final class coh extends dzh<coh, a> implements p3i {
    private static final coh zzh;
    private static volatile e5i<coh> zzi;
    private int zzc;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public static final class a extends dzh.a<coh, a> {
        public a() {
            super(coh.zzh);
        }

        public final String n() {
            return ((coh) this.b).r();
        }
    }

    static {
        coh cohVar = new coh();
        zzh = cohVar;
        dzh.o(coh.class, cohVar);
    }

    public static void s(coh cohVar, String str) {
        cohVar.getClass();
        str.getClass();
        cohVar.zzc |= 1;
        cohVar.zzd = str;
    }

    @Override // defpackage.dzh
    public final Object j(int i) {
        e5i cVar;
        switch (fph.a[i - 1]) {
            case 1:
                return new coh();
            case 2:
                return new a();
            case 3:
                return new q5i(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                e5i<coh> e5iVar = zzi;
                if (e5iVar != null) {
                    return e5iVar;
                }
                synchronized (coh.class) {
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

    public final String r() {
        return this.zzd;
    }

    public final boolean t() {
        return this.zze;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzc & 8) != 0;
    }

    public final int w() {
        return this.zzg;
    }
}
