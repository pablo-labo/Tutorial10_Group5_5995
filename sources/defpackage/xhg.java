package defpackage;

import defpackage.fx9;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class xhg implements fx9<URL, InputStream> {
    public final fx9<p96, InputStream> a;

    public static class a implements gx9<URL, InputStream> {
        @Override // defpackage.gx9
        public final fx9<URL, InputStream> c(n1a n1aVar) {
            return new xhg(n1aVar.a(p96.class, InputStream.class));
        }
    }

    public xhg(fx9<p96, InputStream> fx9Var) {
        this.a = fx9Var;
    }

    @Override // defpackage.fx9
    public final fx9.a<InputStream> a(URL url, int i, int i2, ova ovaVar) {
        return this.a.a(new p96(url), i, i2, ovaVar);
    }

    @Override // defpackage.fx9
    public final /* bridge */ /* synthetic */ boolean b(URL url) {
        return true;
    }
}
