package defpackage;

import defpackage.c7e;
import defpackage.ce9;
import defpackage.e69;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;
import xpb.a;

/* JADX INFO: loaded from: classes3.dex */
public final class v82 extends de9 {
    public final xpb e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v82(e69.a aVar, gd9 gd9Var, xpb xpbVar) {
        super(gd9Var, xpbVar.new a());
        gd9Var.getClass();
        this.e = xpbVar;
        xpbVar.b.addAll(u63.Z(new c7e.a(new oh7(aVar.c, aVar.c(), 1), zd9.b)));
        this.f = -1;
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
        gd9Var.getClass();
        int i2 = aVar.c;
        int i3 = this.f;
        ce9.c cVar = ce9.c.e;
        if (i2 < i3 || (i = aVar.b) != -1) {
            return cVar;
        }
        if (i != -1) {
            throw new MarkdownParsingException("");
        }
        gd9 gd9Var2 = this.a;
        gd9Var2.getClass();
        e69.a aVarD = aVar;
        loop0: do {
            gd9 gd9VarA = hd9.a(aVarD, gd9Var2);
            if (!hd9.e(gd9VarA, gd9Var2) || !hd9.c(gd9VarA, gd9Var2)) {
                break;
            }
            CharSequence charSequenceB = hd9.b(gd9VarA, aVarD.d);
            charSequenceB.getClass();
            for (int i4 = 0; i4 < charSequenceB.length(); i4++) {
                char cCharAt = charSequenceB.charAt(i4);
                if (cCharAt != ' ' && cCharAt != '\t') {
                    break loop0;
                }
            }
            aVarD = aVarD.d();
        } while (aVarD != null);
        aVarD = null;
        ce9.c cVar2 = ce9.c.f;
        if (aVarD == null) {
            return cVar2;
        }
        gd9 gd9VarA2 = hd9.a(aVarD, gd9Var2);
        e69.a aVarE = aVarD.e(hd9.d(gd9VarA2, aVarD.d) + 1);
        if (aVarE != null) {
            Integer numA = aVarE.a();
            e69.a aVarE2 = aVarE.e(numA != null ? numA.intValue() : 0);
            if (aVarE2 != null) {
                String str = aVarE2.d;
                int iD = hd9.d(gd9VarA2, str);
                int i5 = aVarE2.b;
                if (i5 < iD + 4) {
                    if (iD <= i5) {
                        while (str.charAt(iD) != '\t') {
                            if (iD != i5) {
                                iD++;
                            }
                        }
                    }
                }
                int iD2 = hd9.d(hd9.a(aVar, gd9Var2), aVar.d) + i2 + 1;
                oh7 oh7Var = new oh7(iD2, aVar.c(), 1);
                if (oh7Var.b - iD2 > 0) {
                    List listZ = u63.Z(new c7e.a(oh7Var, zd9.b));
                    xpb xpbVar = this.e;
                    xpbVar.getClass();
                    xpbVar.b.addAll(listZ);
                }
                this.f = aVar.c();
                return cVar;
            }
        }
        return cVar2;
    }

    @Override // defpackage.de9
    public final en6 i() {
        return pg8.W;
    }
}
