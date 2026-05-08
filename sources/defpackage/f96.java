package defpackage;

import defpackage.e69;
import defpackage.e96;
import defpackage.fe9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f96 implements ee9<fe9.a> {

    public static final class a {
        public static int a(CharSequence charSequence, int i) {
            while (i < charSequence.length() && (charSequence.charAt(i) == ' ' || charSequence.charAt(i) == '\t')) {
                i++;
            }
            return i;
        }
    }

    @Override // defpackage.ee9
    public final List<ce9> a(e69.a aVar, xpb xpbVar, fe9.a aVar2) {
        int i;
        aVar2.getClass();
        gd9 gd9Var = aVar2.a;
        if (wl7.b(aVar2.b, gd9Var)) {
            String strSubstring = aVar.d.substring(aVar.b);
            if (zve.M(strSubstring, '|')) {
                ArrayList arrayListA = e96.a.a(strSubstring);
                ArrayList arrayList = new ArrayList(t92.r0(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    CharSequence charSequenceB = null;
                    boolean z = true;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            u63.o0();
                            throw null;
                        }
                        String str = (String) next;
                        if ((i3 <= 0 || i3 >= arrayListA.size() - 1) && zve.U(str)) {
                            z = false;
                        }
                        arrayList.add(Boolean.valueOf(z));
                        i3 = i4;
                    } else {
                        if (arrayList.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it2 = arrayList.iterator();
                            i = 0;
                            while (it2.hasNext()) {
                                if (((Boolean) it2.next()).booleanValue() && (i = i + 1) < 0) {
                                    u63.n0();
                                    throw null;
                                }
                            }
                        }
                        if (i != 0) {
                            int i5 = aVar.a + 1;
                            List<String> list = e69.this.b;
                            String str2 = i5 < list.size() ? list.get(i5) : null;
                            if (str2 != null) {
                                tc2 tc2VarH = gd9Var.h(aVar.d());
                                if (hd9.c(tc2VarH, gd9Var)) {
                                    charSequenceB = hd9.b(tc2VarH, str2);
                                }
                            }
                            if (charSequenceB != null) {
                                int iA = a.a(charSequenceB, 0);
                                if (iA < charSequenceB.length() && charSequenceB.charAt(iA) == '|') {
                                    iA++;
                                }
                                int i6 = 0;
                                while (iA < charSequenceB.length()) {
                                    int iA2 = a.a(charSequenceB, iA);
                                    if (iA2 < charSequenceB.length() && charSequenceB.charAt(iA2) == ':') {
                                        iA2 = a.a(charSequenceB, iA2 + 1);
                                    }
                                    int i7 = 0;
                                    while (iA2 < charSequenceB.length() && charSequenceB.charAt(iA2) == '-') {
                                        iA2++;
                                        i7++;
                                    }
                                    if (i7 < 1) {
                                        break;
                                    }
                                    i6++;
                                    iA = a.a(charSequenceB, iA2);
                                    if (iA < charSequenceB.length() && charSequenceB.charAt(iA) == ':') {
                                        iA = a.a(charSequenceB, iA + 1);
                                    }
                                    if (iA >= charSequenceB.length() || charSequenceB.charAt(iA) != '|') {
                                        break;
                                    }
                                    iA = a.a(charSequenceB, iA + 1);
                                }
                                if (iA == charSequenceB.length()) {
                                    i2 = i6;
                                }
                                if (i2 == i) {
                                    return u63.Z(new e96(aVar, gd9Var, xpbVar, i));
                                }
                            }
                        }
                    }
                }
            }
        }
        return zr4.a;
    }

    @Override // defpackage.ee9
    public final boolean b(e69.a aVar, gd9 gd9Var) {
        aVar.getClass();
        gd9Var.getClass();
        return false;
    }
}
