package defpackage;

import defpackage.a5i;

/* JADX INFO: loaded from: classes2.dex */
public final class lyh extends a5i<lyh, a> implements a9i {
    private static volatile t9i<lyh> zzml;
    private static final lyh zzmv;
    private int zzmg;
    private String zzmt = "";
    private s5i<jyh> zzmu = yai.c;

    public static final class a extends a5i.b<lyh, a> {
    }

    static {
        lyh lyhVar = new lyh();
        zzmv = lyhVar;
        a5i.b(lyh.class, lyhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, t9i<lyh>] */
    @Override // defpackage.a5i
    public final Object g(int i) {
        Object obj;
        switch (hyh.a[i - 1]) {
            case 1:
                return new lyh();
            case 2:
                return new a(zzmv);
            case 3:
                return new vai(zzmv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b", new Object[]{"zzmg", "zzmt", "zzmu", jyh.class});
            case 4:
                return zzmv;
            case 5:
                t9i<lyh> t9iVar = zzml;
                if (t9iVar != null) {
                    return t9iVar;
                }
                synchronized (lyh.class) {
                    try {
                        t9i<lyh> t9iVar2 = zzml;
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

    public final String i() {
        return this.zzmt;
    }

    public final s5i j() {
        return this.zzmu;
    }
}
