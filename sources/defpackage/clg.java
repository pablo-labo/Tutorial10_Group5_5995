package defpackage;

import defpackage.roa;

/* JADX INFO: loaded from: classes.dex */
public final class clg {
    public static final blg a = new blg(roa.a.a, 0, 0);

    public static final vrf a(ftg ftgVar, le0 le0Var) {
        vrf vrfVarA = ftgVar.a(le0Var);
        int length = le0Var.b.length();
        le0 le0Var2 = vrfVarA.a;
        roa roaVar = vrfVarA.b;
        int length2 = le0Var2.b.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(roaVar.c(i), length2, i);
        }
        b(roaVar.c(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(roaVar.a(i2), length, i2);
        }
        c(roaVar.a(length2), length, length2);
        return new vrf(le0Var2, new blg(roaVar, le0Var.b.length(), le0Var2.b.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbF = uz.f("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, " -> ", i, " is not in range of transformed text [0, ");
        sbF.append(i2);
        sbF.append(']');
        de7.c(sbF.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbF = uz.f("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, " -> ", i, " is not in range of original text [0, ");
        sbF.append(i2);
        sbF.append(']');
        de7.c(sbF.toString());
    }
}
