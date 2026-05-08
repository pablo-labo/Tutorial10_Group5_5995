package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jp2 {
    public static final a3a<ip2> a;

    static {
        abd abdVar = ya2.e;
        int i = abdVar.c;
        hp2 hp2Var = new hp2(abdVar, abdVar, 1);
        int i2 = abdVar.c;
        qpa qpaVar = ya2.x;
        int i3 = (qpaVar.c << 6) | i2;
        ip2 ip2Var = new ip2(abdVar, qpaVar, 0);
        int i4 = (i2 << 6) | qpaVar.c;
        ip2 ip2Var2 = new ip2(qpaVar, abdVar, 0);
        a3a a3aVar = kh7.a;
        a3a<ip2> a3aVar2 = new a3a<>();
        a3aVar2.h(i | (i << 6), hp2Var);
        a3aVar2.h(i3, ip2Var);
        a3aVar2.h(i4, ip2Var2);
        a = a3aVar2;
    }
}
