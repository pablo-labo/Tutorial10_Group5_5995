package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mp2 implements Function1 {
    public final /* synthetic */ op2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ mp2(op2 op2Var, String str, int i) {
        this.a = op2Var;
        this.b = str;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y3b y3bVar = (y3b) obj;
        y3bVar.getClass();
        y3bVar.b("web_chrome_client_name", this.a.a);
        y3bVar.b("webview_url", this.b);
        y3bVar.a(this.c, "count");
        return j6g.a;
    }
}
