package defpackage;

import defpackage.a5i;

/* JADX INFO: loaded from: classes2.dex */
public final class jyh extends a5i<jyh, a> implements a9i {
    private static volatile t9i<jyh> zzml;
    private static final jyh zzmo;
    private int zzmg;
    private String zzmm = "";
    private h0i zzmn = h0i.a;

    public static final class a extends a5i.b<jyh, a> {
    }

    static {
        jyh jyhVar = new jyh();
        zzmo = jyhVar;
        a5i.b(jyh.class, jyhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, t9i<jyh>] */
    @Override // defpackage.a5i
    public final Object g(int i) {
        Object obj;
        switch (hyh.a[i - 1]) {
            case 1:
                return new jyh();
            case 2:
                return new a(zzmo);
            case 3:
                return new vai(zzmo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001", new Object[]{"zzmg", "zzmm", "zzmn"});
            case 4:
                return zzmo;
            case 5:
                t9i<jyh> t9iVar = zzml;
                if (t9iVar != null) {
                    return t9iVar;
                }
                synchronized (jyh.class) {
                    try {
                        t9i<jyh> t9iVar2 = zzml;
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
        return this.zzmm;
    }

    public final h0i j() {
        return this.zzmn;
    }
}
