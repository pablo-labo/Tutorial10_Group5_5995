package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eo3 implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ eo3(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hc8 hc8Var = (hc8) obj;
        hc8Var.getClass();
        hc8Var.u0("extensions");
        hc8Var.j();
        if (this.a) {
            hc8Var.u0("persistedQuery");
            hc8Var.j();
            hc8Var.u0("version").F(1);
            hc8Var.u0("sha256Hash").T0(this.c);
            hc8Var.t();
        }
        if (this.b) {
            hc8Var.u0("clientLibrary");
            hc8Var.j();
            hc8Var.u0("name").T0("apollo-kotlin");
            hc8Var.u0("version").T0("4.4.2");
            hc8Var.t();
        }
        hc8Var.t();
        return j6g.a;
    }
}
