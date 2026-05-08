package defpackage;

import defpackage.e69;
import defpackage.fe9;
import java.util.List;
import xpb.a;

/* JADX INFO: loaded from: classes3.dex */
public final class wj6 implements ee9<fe9.a> {

    public static final class a {
        public static boolean a(CharSequence charSequence, int i) {
            charSequence.getClass();
            int length = charSequence.length();
            Character chValueOf = null;
            int i2 = 0;
            int i3 = 1;
            while (true) {
                if (i < length) {
                    char cCharAt = charSequence.charAt(i);
                    if (chValueOf == null) {
                        if (cCharAt == '*' || cCharAt == '-' || cCharAt == '_') {
                            chValueOf = Character.valueOf(cCharAt);
                        } else {
                            if (i2 >= 3 || cCharAt != ' ') {
                                break;
                            }
                            i2++;
                        }
                        i++;
                    } else {
                        if (cCharAt != chValueOf.charValue()) {
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            }
                        } else {
                            i3++;
                        }
                        i++;
                    }
                } else if (i3 >= 3) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // defpackage.ee9
    public final List<ce9> a(e69.a aVar, xpb xpbVar, fe9.a aVar2) {
        aVar2.getClass();
        gd9 gd9Var = aVar2.a;
        gd9Var.getClass();
        int i = aVar.b;
        String str = aVar.d;
        return i == hd9.d(gd9Var, str) ? a.a(str, i) : false ? u63.Z(new vj6(gd9Var, xpbVar.new a())) : zr4.a;
    }

    @Override // defpackage.ee9
    public final boolean b(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        int i = aVar.b;
        String str = aVar.d;
        if (i == hd9.d(gd9Var, str)) {
            return a.a(str, i);
        }
        return false;
    }
}
