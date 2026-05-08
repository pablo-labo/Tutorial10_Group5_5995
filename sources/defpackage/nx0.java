package defpackage;

import defpackage.e69;
import defpackage.fe9;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nx0 implements ee9<fe9.a> {
    public static oh7 c(e69.a aVar) {
        int i = aVar.b;
        if (i == -1) {
            return null;
        }
        String strSubstring = aVar.d.substring(i);
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i2 < strSubstring.length() && strSubstring.charAt(i2) == ' ') {
                i2++;
            }
        }
        if (i2 >= strSubstring.length() || strSubstring.charAt(i2) != '#') {
            return null;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < 6; i5++) {
            if (i4 < strSubstring.length() && strSubstring.charAt(i4) == '#') {
                i4++;
            }
        }
        if (i4 >= strSubstring.length() || u63.a0(' ', '\t').contains(Character.valueOf(strSubstring.charAt(i4)))) {
            return new oh7(i2, i4 - 1, 1);
        }
        return null;
    }

    @Override // defpackage.ee9
    public final List<ce9> a(e69.a aVar, xpb xpbVar, fe9.a aVar2) {
        aVar2.getClass();
        oh7 oh7VarC = c(aVar);
        if (oh7VarC == null) {
            return zr4.a;
        }
        gd9 gd9Var = aVar2.a;
        int i = oh7VarC.b;
        String strSubstring = aVar.d.substring(aVar.b);
        int i2 = aVar.c;
        int length = strSubstring.length() - 1;
        while (length > i && ypd.E(strSubstring.charAt(length))) {
            length--;
        }
        while (length > i && strSubstring.charAt(length) == '#' && strSubstring.charAt(length - 1) != '\\') {
            length--;
        }
        int i3 = length + 1;
        return u63.Z(new mx0(gd9Var, xpbVar, oh7VarC, (i3 < strSubstring.length() && ypd.E(strSubstring.charAt(length)) && strSubstring.charAt(i3) == '#') ? i2 + length + 1 : i2 + strSubstring.length(), aVar.c()));
    }

    @Override // defpackage.ee9
    public final boolean b(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        return c(aVar) != null;
    }
}
