package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n11 implements kna<e9e> {
    public static final n11 a = new n11();
    public static final x85 b = x85.a("eventType");
    public static final x85 c = x85.a("sessionData");
    public static final x85 d = x85.a("applicationInfo");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        e9e e9eVar = (e9e) obj;
        lna lnaVar2 = lnaVar;
        e9eVar.getClass();
        lnaVar2.b(b, v05.SESSION_START);
        lnaVar2.b(c, e9eVar.a);
        lnaVar2.b(d, e9eVar.b);
    }
}
