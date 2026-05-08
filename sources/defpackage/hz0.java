package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hz0 implements kna<sfa> {
    public static final hz0 a = new hz0();
    public static final x85 b = x85.a("networkType");
    public static final x85 c = x85.a("mobileSubtype");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        sfa sfaVar = (sfa) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, sfaVar.b());
        lnaVar2.b(c, sfaVar.a());
    }
}
