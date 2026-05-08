package defpackage;

import defpackage.e69;
import defpackage.tc2;

/* JADX INFO: loaded from: classes3.dex */
public final class dw5 extends tc2 {
    public static final dw5 g = new dw5(new int[0], new char[0], new boolean[0], 0, false);
    public final boolean f;

    public dw5(int[] iArr, char[] cArr, boolean[] zArr, int i, boolean z) {
        super(iArr, cArr, zArr, i);
        this.f = z;
    }

    @Override // defpackage.tc2
    public final tc2 i(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        char c = cArr[cArr.length - 1];
        char c2 = c < 128 ? c : (char) (c - 'd');
        cArr[cArr.length - 1] = c2;
        return new dw5(iArr, cArr, zArr, i, c != c2);
    }

    @Override // defpackage.tc2
    public final tc2.b j(e69.a aVar) {
        int i = aVar.b;
        tc2.b bVarJ = super.j(aVar);
        if (bVarJ == null) {
            return null;
        }
        int i2 = bVarJ.a;
        String str = aVar.d;
        int i3 = i + i2;
        while (i3 < str.length() && (str.charAt(i3) == ' ' || str.charAt(i3) == '\t')) {
            i3++;
        }
        int i4 = i3 + 3;
        if (i4 <= str.length() && str.charAt(i3) == '[' && str.charAt(i3 + 2) == ']') {
            int i5 = i3 + 1;
            if (str.charAt(i5) == 'x' || str.charAt(i5) == 'X' || str.charAt(i5) == ' ') {
                return new tc2.b((char) (bVarJ.b + 'd'), i4 - i, i2);
            }
        }
        return bVarJ;
    }

    @Override // defpackage.tc2
    public final tc2 k() {
        return g;
    }
}
