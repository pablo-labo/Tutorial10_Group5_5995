package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m11 implements kna<vnb> {
    public static final m11 a = new m11();
    public static final x85 b = x85.a("processName");
    public static final x85 c = x85.a("pid");
    public static final x85 d = x85.a("importance");
    public static final x85 e = x85.a("defaultProcess");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        vnb vnbVar = (vnb) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, vnbVar.a);
        lnaVar2.g(c, vnbVar.b);
        lnaVar2.g(d, vnbVar.c);
        lnaVar2.f(e, vnbVar.d);
    }
}
