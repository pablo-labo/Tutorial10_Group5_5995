package defpackage;

import defpackage.ce9;
import defpackage.e69;
import defpackage.fe9;
import defpackage.xd9;
import defpackage.xpb;
import kotlin.jvm.functions.Function2;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class k3b extends de9 {
    public final Function2<e69.a, gd9, Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3b(gd9 gd9Var, xpb.a aVar, fe9.b bVar) {
        super(gd9Var, aVar);
        gd9Var.getClass();
        bVar.getClass();
        this.e = bVar;
    }

    @Override // defpackage.ce9
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ce9
    public final boolean f(e69.a aVar) {
        return true;
    }

    @Override // defpackage.de9
    public final int g(e69.a aVar) {
        return aVar.c();
    }

    @Override // defpackage.de9
    public final ce9.c h(e69.a aVar, gd9 gd9Var) {
        e69.a aVarE;
        gd9Var.getClass();
        int i = aVar.b;
        ce9.c cVar = ce9.c.e;
        if (i != -1) {
            return cVar;
        }
        if (i != -1) {
            throw new MarkdownParsingException("");
        }
        gd9 gd9Var2 = this.a;
        gd9Var2.getClass();
        if (i != -1) {
            throw new MarkdownParsingException("");
        }
        xd9.a aVar2 = new xd9.a(gd9Var2);
        e69.a aVarD = aVar;
        int i2 = 1;
        while (((Boolean) aVar2.invoke(aVarD)).booleanValue() && (aVarD = aVarD.d()) != null && (i2 = i2 + 1) <= 4) {
        }
        ce9.c cVar2 = ce9.c.f;
        if (i2 >= 2) {
            return cVar2;
        }
        gd9 gd9VarA = hd9.a(aVar, gd9Var2);
        return (!hd9.e(gd9VarA, gd9Var2) || (aVarE = aVar.e(hd9.d(gd9VarA, aVar.d) + 1)) == null || this.e.invoke(aVarE, gd9VarA).booleanValue()) ? cVar2 : cVar;
    }

    @Override // defpackage.de9
    public final en6 i() {
        return pg8.Z;
    }
}
