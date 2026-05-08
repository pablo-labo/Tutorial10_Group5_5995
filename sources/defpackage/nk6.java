package defpackage;

import defpackage.e69;
import defpackage.fe9;
import defpackage.ke9;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class nk6 implements ee9<fe9.a> {
    public static final List<Pair<pxc, pxc>> a;
    public static final pxc b;

    public static final class a extends mj8 implements Function1<Pair<? extends pxc, ? extends pxc>, CharSequence> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Pair<? extends pxc, ? extends pxc> pair) {
            Pair<? extends pxc, ? extends pxc> pair2 = pair;
            pair2.getClass();
            return "(" + pair2.d().b() + ')';
        }
    }

    static {
        txc txcVar = txc.IGNORE_CASE;
        List<Pair<pxc, pxc>> listA0 = u63.a0(new Pair(new pxc("<(?:script|pre|style)(?: |>|$)", txcVar), new pxc("</(?:script|style|pre)>", txcVar)), new Pair(new pxc("<!--"), new pxc("-->")), new Pair(new pxc("<\\?"), new pxc("\\?>")), new Pair(new pxc("<![A-Z]"), new pxc(">")), new Pair(new pxc("<!\\[CDATA\\["), new pxc("\\]\\]>")), new Pair(new pxc("</?(?:" + wve.I("address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul", ", ", "|") + ")(?: |/?>|$)", txcVar), null), new Pair(new pxc("(?:<[a-zA-Z][a-zA-Z0-9-]*(?:\\s+[A-Za-z:_][A-Za-z0-9_.:-]*(?:\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[a-zA-Z][a-zA-Z0-9-]*\\s*>)(?: |$)"), null));
        a = listA0;
        b = new pxc(w40.f(new StringBuilder("^("), z92.W0(listA0, "|", null, null, a.a, 30), ')'));
    }

    public static int c(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        int i = aVar.b;
        String str = aVar.d;
        if (i != hd9.d(gd9Var, str)) {
            return -1;
        }
        String strSubstring = str.substring(i);
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i2 < strSubstring.length() && strSubstring.charAt(i2) == ' ') {
                i2++;
            }
        }
        if (i2 >= strSubstring.length() || strSubstring.charAt(i2) != '<') {
            return -1;
        }
        ke9 ke9VarA = b.a(strSubstring.subSequence(i2, strSubstring.length()).toString(), 0);
        if (ke9VarA == null) {
            return -1;
        }
        ke9.b bVar = ke9VarA.c;
        int iA = bVar.a();
        List<Pair<pxc, pxc>> list = a;
        if (iA != list.size() + 2) {
            throw new MarkdownParsingException("There are some excess capturing groups probably!");
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (bVar.b(i4 + 2) != null) {
                return i4;
            }
        }
        throw new MarkdownParsingException("Match found but all groups are empty!");
    }

    @Override // defpackage.ee9
    public final List<ce9> a(e69.a aVar, xpb xpbVar, fe9.a aVar2) {
        aVar2.getClass();
        gd9 gd9Var = aVar2.a;
        int iC = c(aVar, gd9Var);
        return iC != -1 ? u63.Z(new mk6(gd9Var, xpbVar, a.get(iC).e(), aVar)) : zr4.a;
    }

    @Override // defpackage.ee9
    public final boolean b(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        int iC = c(aVar, gd9Var);
        return iC >= 0 && iC < 6;
    }
}
