package defpackage;

import defpackage.c7e;
import defpackage.ce9;
import defpackage.e69;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;
import xpb.a;

/* JADX INFO: loaded from: classes3.dex */
public final class y82 extends de9 {
    public final xpb e;
    public final pxc f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y82(gd9 gd9Var, xpb xpbVar, String str) {
        super(gd9Var, xpbVar.new a());
        gd9Var.getClass();
        this.e = xpbVar;
        this.f = new pxc(l5.m("^ {0,3}", str, "+ *$"));
        this.g = -1;
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
        int i;
        String str = aVar.d;
        gd9Var.getClass();
        int i2 = aVar.c;
        int i3 = this.g;
        ce9.c cVar = ce9.c.e;
        if (i2 < i3 || (i = aVar.b) != -1) {
            return cVar;
        }
        if (i != -1) {
            throw new MarkdownParsingException("");
        }
        gd9 gd9Var2 = this.a;
        gd9 gd9VarA = hd9.a(aVar, gd9Var2);
        boolean zC = hd9.c(gd9VarA, gd9Var2);
        ce9.c cVar2 = ce9.c.f;
        if (!zC) {
            return cVar2;
        }
        int iC = aVar.c();
        this.g = iC;
        boolean zD = this.f.d(hd9.b(gd9VarA, str));
        xpb xpbVar = this.e;
        if (zD) {
            List listZ = u63.Z(new c7e.a(new oh7(i2 + 1, aVar.c(), 1), zd9.G));
            xpbVar.getClass();
            xpbVar.b.addAll(listZ);
            cVar2.getClass();
            this.c = iC;
            this.d = cVar2;
        } else {
            int iMin = Math.min(hd9.d(gd9Var2, str) + i2 + 1, iC);
            oh7 oh7Var = new oh7(iMin, iC, 1);
            if (iMin < oh7Var.b) {
                List listZ2 = u63.Z(new c7e.a(oh7Var, zd9.F));
                xpbVar.getClass();
                xpbVar.b.addAll(listZ2);
            }
        }
        return cVar;
    }

    @Override // defpackage.de9
    public final en6 i() {
        return pg8.V;
    }
}
