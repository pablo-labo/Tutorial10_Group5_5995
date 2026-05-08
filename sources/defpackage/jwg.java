package defpackage;

import defpackage.l5h;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jwg implements l5h.b {
    public final /* synthetic */ iwg a;

    public jwg(iwg iwgVar) {
        this.a = iwgVar;
    }

    @Override // l5h.b
    public final void a(String str) {
        this.a.f.f(new rua(str));
    }

    @Override // l5h.b
    public final void b(Exception exc) {
        this.a.f.f(new ufa(exc));
    }

    @Override // l5h.b
    public final void c(String str, Map<String, ? extends Object> map) {
        this.a.f.f(new sua(str, map));
    }

    @Override // l5h.b
    public final void d(String str, Map<String, ? extends Object> map) {
        this.a.f.f(new vua(str, map));
    }

    @Override // l5h.b
    public final void e(Map<String, ? extends Object> map) {
        this.a.f.f(new nw5(map));
    }
}
