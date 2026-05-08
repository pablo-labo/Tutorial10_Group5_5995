package defpackage;

import android.net.Uri;
import androidx.compose.runtime.r;

/* JADX INFO: loaded from: classes2.dex */
public final class p9d extends brg {
    public final f7b b;
    public final qq2 c;
    public final g4a d = r.f(new n9d(null, null, null, 119));
    public final g4a e = r.f(new o9d());
    public final g4a f = r.f(new th7(0));

    public p9d(f7b f7bVar, qq2 qq2Var) {
        this.b = f7bVar;
        this.c = qq2Var;
    }

    public final n9d g() {
        return (n9d) ((gme) this.d).getValue();
    }

    public final void h(Uri uri, String str) {
        n9d n9dVarA;
        uri.getClass();
        str.getClass();
        n9d n9dVar = new n9d(uri, str, null, 116);
        g4a g4aVar = this.d;
        ((gme) g4aVar).setValue(n9dVar);
        Uri uri2 = g().a;
        if (uri2 == null) {
            n9dVarA = n9d.a(g(), null, "", 111);
        } else {
            try {
                n9dVarA = n9d.a(g(), null, this.c.d(uri2), 111);
            } catch (Exception unused) {
                n9dVarA = n9d.a(this.g(), null, null, 63);
            }
        }
        ((gme) g4aVar).setValue(n9dVarA);
    }

    public final void i(long j) {
        System.out.println((Object) l5.m("setPdfContainerSize(", th7.c(j), ")"));
        g4a g4aVar = this.f;
        if (th7.b(j, ((th7) ((gme) g4aVar).getValue()).a)) {
            return;
        }
        ((gme) g4aVar).setValue(new th7(j));
        k();
    }

    public final void j(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        ((gme) this.d).setValue(new n9d(uri, str, null, 116));
        k();
    }

    public final void k() {
        n9d n9dVarA;
        Uri uri = g().a;
        g4a g4aVar = this.f;
        if (th7.b(((th7) ((gme) g4aVar).getValue()).a, 0L) || uri == null) {
            n9dVarA = n9d.a(g(), zr4.a, null, 119);
        } else {
            try {
                n9dVarA = n9d.a(g(), this.b.a((int) (((th7) ((gme) g4aVar).getValue()).a >> 32), uri), null, 119);
            } catch (Exception unused) {
                n9dVarA = n9d.a(g(), null, null, 63);
            }
        }
        ((gme) this.d).setValue(n9dVarA);
    }
}
