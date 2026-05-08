package defpackage;

import defpackage.a5i;

/* JADX INFO: loaded from: classes2.dex */
public final class dfi extends a5i<dfi, a> implements a9i {
    private static volatile t9i<dfi> zzml;
    private static final dfi zzzp;
    private String zzzo = "";

    public static final class a extends a5i.b<dfi, a> {
    }

    static {
        dfi dfiVar = new dfi();
        zzzp = dfiVar;
        a5i.b(dfi.class, dfiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, t9i<dfi>] */
    @Override // defpackage.a5i
    public final Object g(int i) {
        Object obj;
        switch (ifi.a[i - 1]) {
            case 1:
                return new dfi();
            case 2:
                return new a(zzzp);
            case 3:
                return new vai(zzzp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzzo"});
            case 4:
                return zzzp;
            case 5:
                t9i<dfi> t9iVar = zzml;
                if (t9iVar != null) {
                    return t9iVar;
                }
                synchronized (dfi.class) {
                    try {
                        t9i<dfi> t9iVar2 = zzml;
                        obj = t9iVar2;
                        if (t9iVar2 == null) {
                            ?? aVar = new a5i.a();
                            zzml = aVar;
                            obj = aVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return obj;
            case 6:
                return (byte) 1;
            default:
                b0.l();
            case 7:
                return null;
        }
    }
}
