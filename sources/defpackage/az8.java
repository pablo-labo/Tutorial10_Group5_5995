package defpackage;

import defpackage.ce9;
import defpackage.e69;
import defpackage.xpb;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class az8 extends de9 {
    public final char e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az8(gd9 gd9Var, xpb.a aVar, char c) {
        super(gd9Var, aVar);
        gd9Var.getClass();
        this.e = c;
    }

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
        e69.a aVarB;
        gd9Var.getClass();
        if (aVar.b != -1) {
            throw new MarkdownParsingException("");
        }
        gd9 gd9Var2 = this.a;
        int iA = xd9.a(aVar, gd9Var2);
        ce9.c cVar = ce9.c.f;
        if (iA >= 3 || (aVarB = xd9.b(aVar, iA)) == null) {
            return cVar;
        }
        gd9 gd9VarA = hd9.a(aVarB, gd9Var2);
        if (gd9Var2.c().length != 0) {
            tc2 tc2Var = (tc2) gd9VarA;
            return (!tc2Var.f(gd9Var2) || tc2Var.d(gd9Var2.c().length + (-1))) ? cVar : ce9.c.d;
        }
        l5.q("List constraints should contain at least one item");
        return null;
    }

    @Override // defpackage.de9
    public final en6 i() {
        char c = this.e;
        return (c == '-' || c == '*' || c == '+') ? pg8.c : pg8.d;
    }
}
