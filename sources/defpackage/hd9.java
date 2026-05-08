package defpackage;

import defpackage.e69;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class hd9 {
    public static final gd9 a(e69.a aVar, gd9 gd9Var) {
        gd9Var.getClass();
        if (aVar.b != -1) {
            throw new MarkdownParsingException("");
        }
        tc2 tc2VarH = gd9Var.h(aVar);
        String str = aVar.d;
        while (true) {
            tc2 tc2VarA = tc2VarH.a(aVar.e(d(tc2VarH, str) + 1));
            if (tc2VarA == null) {
                return tc2VarH;
            }
            tc2VarH = tc2VarA;
        }
    }

    public static final CharSequence b(gd9 gd9Var, CharSequence charSequence) {
        gd9Var.getClass();
        charSequence.getClass();
        return charSequence.length() < gd9Var.e() ? "" : charSequence.subSequence(gd9Var.e(), charSequence.length());
    }

    public static final boolean c(gd9 gd9Var, gd9 gd9Var2) {
        gd9Var.getClass();
        gd9Var2.getClass();
        return gd9Var.f(gd9Var2) && !gd9Var.d(gd9Var2.c().length);
    }

    public static final int d(gd9 gd9Var, CharSequence charSequence) {
        gd9Var.getClass();
        charSequence.getClass();
        return Math.min(gd9Var.e(), charSequence.length());
    }

    public static final boolean e(gd9 gd9Var, gd9 gd9Var2) {
        gd9Var2.getClass();
        return gd9Var2.f(gd9Var) && !gd9Var.d(gd9Var.c().length);
    }
}
