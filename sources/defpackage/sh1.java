package defpackage;

import defpackage.ce9;
import defpackage.e69;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class sh1 extends de9 {
    @Override // defpackage.ce9
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ce9
    public final boolean f(e69.a aVar) {
        return aVar.b == -1;
    }

    @Override // defpackage.de9
    public final int g(e69.a aVar) {
        Integer numB = aVar.b();
        if (numB != null) {
            return numB.intValue();
        }
        return -1;
    }

    @Override // defpackage.de9
    public final ce9.c h(e69.a aVar, gd9 gd9Var) {
        gd9Var.getClass();
        if (aVar.b != -1) {
            throw new MarkdownParsingException("");
        }
        gd9 gd9Var2 = this.a;
        return !hd9.c(hd9.a(aVar, gd9Var2), gd9Var2) ? ce9.c.f : ce9.c.d;
    }

    @Override // defpackage.de9
    public final en6 i() {
        return pg8.f;
    }
}
