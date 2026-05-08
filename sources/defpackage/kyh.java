package defpackage;

import defpackage.a5i;

/* JADX INFO: loaded from: classes2.dex */
public final class kyh extends a5i<kyh, a> implements a9i {
    private static volatile t9i<kyh> zzml;
    private static final kyh zzms;
    private int zzmg;
    private int zzmp;
    private boolean zzmq;
    private long zzmr;

    public static final class a extends a5i.b<kyh, a> {
    }

    static {
        kyh kyhVar = new kyh();
        zzms = kyhVar;
        a5i.b(kyh.class, kyhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, t9i<kyh>] */
    @Override // defpackage.a5i
    public final Object g(int i) {
        Object obj;
        switch (hyh.a[i - 1]) {
            case 1:
                return new kyh();
            case 2:
                return new a(zzms);
            case 3:
                return new vai(zzms, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0007\u0001\u0003\u0005\u0002", new Object[]{"zzmg", "zzmp", "zzmq", "zzmr"});
            case 4:
                return zzms;
            case 5:
                t9i<kyh> t9iVar = zzml;
                if (t9iVar != null) {
                    return t9iVar;
                }
                synchronized (kyh.class) {
                    try {
                        t9i<kyh> t9iVar2 = zzml;
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
