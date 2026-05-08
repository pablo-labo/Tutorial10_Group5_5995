package defpackage;

import defpackage.c7e;
import defpackage.ce9;
import defpackage.e69;
import defpackage.xd9;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;
import xpb.a;

/* JADX INFO: loaded from: classes3.dex */
public final class mk6 extends de9 {
    public final xpb e;
    public final pxc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk6(gd9 gd9Var, xpb xpbVar, pxc pxcVar, e69.a aVar) {
        super(gd9Var, xpbVar.new a());
        gd9Var.getClass();
        this.e = xpbVar;
        this.f = pxcVar;
        xpbVar.b.addAll(u63.Z(new c7e.a(new oh7(aVar.c, aVar.c(), 1), zd9.d)));
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
        String str = aVar.d;
        gd9Var.getClass();
        int i = aVar.b;
        ce9.c cVar = ce9.c.e;
        if (i != -1) {
            return cVar;
        }
        int i2 = aVar.a;
        String str2 = i2 > 0 ? e69.this.b.get(i2 - 1) : null;
        ce9.c cVar2 = ce9.c.f;
        if (str2 == null) {
            return cVar2;
        }
        gd9 gd9Var2 = this.a;
        if (!hd9.c(gd9Var2.h(aVar), gd9Var2)) {
            return cVar2;
        }
        pxc pxcVar = this.f;
        if (pxcVar == null) {
            if (i != -1) {
                throw new MarkdownParsingException("");
            }
            xd9.a aVar2 = new xd9.a(gd9Var2);
            e69.a aVarD = aVar;
            int i3 = 1;
            while (((Boolean) aVar2.invoke(aVarD)).booleanValue() && (aVarD = aVarD.d()) != null && (i3 = i3 + 1) <= 4) {
            }
            if (i3 >= 2) {
                return cVar2;
            }
        }
        if (pxcVar != null && pxcVar.a(str2, 0) != null) {
            return cVar2;
        }
        if (str.length() > 0) {
            List listZ = u63.Z(new c7e.a(new oh7(hd9.d(gd9Var2, str) + aVar.c + 1, aVar.c(), 1), zd9.d));
            xpb xpbVar = this.e;
            xpbVar.getClass();
            xpbVar.b.addAll(listZ);
        }
        return cVar;
    }

    @Override // defpackage.de9
    public final en6 i() {
        return pg8.Y;
    }
}
