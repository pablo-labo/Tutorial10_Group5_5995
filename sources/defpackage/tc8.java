package defpackage;

import defpackage.ad3;
import defpackage.rc8;
import io.jsonwebtoken.JwtParser;

/* JADX INFO: loaded from: classes3.dex */
public final class tc8 extends ad3.b<t52, rc8.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ luc<rc8.a> b;

    public tc8(String str, luc<rc8.a> lucVar) {
        this.a = str;
        this.b = lucVar;
    }

    @Override // ad3.d
    public final Object a() {
        rc8.a aVar = this.b.element;
        return aVar == null ? rc8.a.d : aVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, rc8$a] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, rc8$a] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, rc8$a] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, rc8$a] */
    @Override // ad3.d
    public final boolean c(Object obj) {
        t52 t52Var = (t52) obj;
        t52Var.getClass();
        String str = iw7.a;
        a62 a62VarG = iw7.g(b04.g(t52Var).a);
        String strE = g7.e(JwtParser.SEPARATOR_CHAR, a62VarG != null ? xc8.e(a62VarG) : ojh.j(t52Var, jh2.Z), this.a);
        boolean zContains = wc8.b.contains(strE);
        luc<rc8.a> lucVar = this.b;
        if (zContains) {
            lucVar.element = rc8.a.a;
        } else if (wc8.d.contains(strE)) {
            lucVar.element = rc8.a.b;
        } else if (wc8.c.contains(strE)) {
            lucVar.element = rc8.a.c;
        } else if (wc8.a.contains(strE)) {
            lucVar.element = rc8.a.e;
        }
        return lucVar.element == null;
    }
}
