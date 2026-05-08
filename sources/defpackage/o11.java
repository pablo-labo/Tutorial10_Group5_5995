package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;

/* JADX INFO: loaded from: classes2.dex */
public final class o11 implements kna<l9e> {
    public static final o11 a = new o11();
    public static final x85 b = x85.a(RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY);
    public static final x85 c = x85.a("firstSessionId");
    public static final x85 d = x85.a("sessionIndex");
    public static final x85 e = x85.a("eventTimestampUs");
    public static final x85 f = x85.a("dataCollectionStatus");
    public static final x85 g = x85.a("firebaseInstallationId");
    public static final x85 h = x85.a("firebaseAuthenticationToken");

    @Override // defpackage.ys4
    public final void a(Object obj, lna lnaVar) {
        l9e l9eVar = (l9e) obj;
        lna lnaVar2 = lnaVar;
        lnaVar2.b(b, l9eVar.a);
        lnaVar2.b(c, l9eVar.b);
        lnaVar2.g(d, l9eVar.c);
        lnaVar2.i(e, l9eVar.d);
        lnaVar2.b(f, l9eVar.e);
        lnaVar2.b(g, l9eVar.f);
        lnaVar2.b(h, l9eVar.g);
    }
}
