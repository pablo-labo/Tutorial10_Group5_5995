package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zk8 {
    public static final gse a;
    public static final rqc b;

    static {
        gse gseVarE = hh2.e(new yk8(0));
        a = gseVarE;
        b = wg2.j(gseVarE);
    }

    public static void a(int i) {
        gse gseVar;
        Object value;
        Integer numValueOf;
        do {
            gseVar = a;
            value = gseVar.getValue();
            numValueOf = Integer.valueOf(i);
            ((yk8) value).getClass();
        } while (!gseVar.h(value, new yk8(numValueOf, true)));
    }
}
