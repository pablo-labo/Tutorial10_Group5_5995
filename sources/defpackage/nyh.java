package defpackage;

import defpackage.a5i;

/* JADX INFO: loaded from: classes2.dex */
public final class nyh extends a5i<nyh, a> implements a9i {
    private static volatile t9i<nyh> zzml;
    private static final nyh zzne;
    private int zzmg;
    private String zzmt = "";
    private int zznc;
    private long zznd;

    public static final class a extends a5i.b<nyh, a> {
    }

    static {
        nyh nyhVar = new nyh();
        zzne = nyhVar;
        a5i.b(nyh.class, nyhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, t9i<nyh>] */
    @Override // defpackage.a5i
    public final Object g(int i) {
        Object obj;
        switch (hyh.a[i - 1]) {
            case 1:
                return new nyh();
            case 2:
                return new a(zzne);
            case 3:
                return new vai(zzne, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0005\u0001\u0003\b\u0002", new Object[]{"zzmg", "zznc", "zznd", "zzmt"});
            case 4:
                return zzne;
            case 5:
                t9i<nyh> t9iVar = zzml;
                if (t9iVar != null) {
                    return t9iVar;
                }
                synchronized (nyh.class) {
                    try {
                        t9i<nyh> t9iVar2 = zzml;
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
