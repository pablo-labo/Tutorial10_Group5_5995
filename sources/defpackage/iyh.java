package defpackage;

import defpackage.a5i;

/* JADX INFO: loaded from: classes2.dex */
public final class iyh extends a5i<iyh, a> implements a9i {
    private static final iyh zzmk;
    private static volatile t9i<iyh> zzml;
    private int zzmg;
    private s5i<lyh> zzmh;
    private long zzmi;
    private s5i<h0i> zzmj;

    public static final class a extends a5i.b<iyh, a> {
    }

    static {
        iyh iyhVar = new iyh();
        zzmk = iyhVar;
        a5i.b(iyh.class, iyhVar);
    }

    public iyh() {
        yai<Object> yaiVar = yai.c;
        this.zzmh = yaiVar;
        this.zzmj = yaiVar;
    }

    public static iyh l() {
        return zzmk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, t9i<iyh>] */
    @Override // defpackage.a5i
    public final Object g(int i) {
        Object obj;
        switch (hyh.a[i - 1]) {
            case 1:
                return new iyh();
            case 2:
                return new a(zzmk);
            case 3:
                return new vai(zzmk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u0005\u0000\u0003\u001c", new Object[]{"zzmg", "zzmh", lyh.class, "zzmi", "zzmj"});
            case 4:
                return zzmk;
            case 5:
                t9i<iyh> t9iVar = zzml;
                if (t9iVar != null) {
                    return t9iVar;
                }
                synchronized (iyh.class) {
                    try {
                        t9i<iyh> t9iVar2 = zzml;
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

    public final long i() {
        return this.zzmi;
    }

    public final s5i j() {
        return this.zzmh;
    }

    public final s5i k() {
        return this.zzmj;
    }
}
