package defpackage;

import defpackage.rd8;

/* JADX INFO: loaded from: classes3.dex */
public final class sd8 {
    public static rd8 a(String str) {
        md8 md8Var;
        char cCharAt = str.charAt(0);
        md8[] md8VarArrValues = md8.values();
        int length = md8VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                md8Var = null;
                break;
            }
            md8Var = md8VarArrValues[i];
            if (md8Var.e().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (md8Var != null) {
            return new rd8.c(md8Var);
        }
        if (cCharAt == 'V') {
            return new rd8.c(null);
        }
        if (cCharAt == '[') {
            return new rd8.a(a(str.substring(1)));
        }
        if (cCharAt == 'L') {
            zve.O(str, ';');
        }
        return new rd8.b(akb.j(1, 1, str));
    }

    public static String b(rd8 rd8Var) {
        String strE;
        rd8Var.getClass();
        if (rd8Var instanceof rd8.a) {
            return "[".concat(b(((rd8.a) rd8Var).i));
        }
        if (rd8Var instanceof rd8.c) {
            md8 md8Var = ((rd8.c) rd8Var).i;
            return (md8Var == null || (strE = md8Var.e()) == null) ? "V" : strE;
        }
        if (rd8Var instanceof rd8.b) {
            return w40.f(new StringBuilder("L"), ((rd8.b) rd8Var).i, ';');
        }
        l.g();
        return null;
    }
}
