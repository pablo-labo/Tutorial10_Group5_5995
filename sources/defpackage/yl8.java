package defpackage;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yl8 {
    public final Layout a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean[] d;
    public char[] e;

    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + w40.c(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.a);
            sb.append(", end=");
            sb.append(this.b);
            sb.append(", isRtl=");
            return m6.i(sb, this.c, ')');
        }
    }

    public yl8(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iR = zve.R(this.a.getText(), '\n', length, false, 4);
            length = iR < 0 ? this.a.getText().length() : iR + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r14) {
        /*
            r13 = this;
            boolean[] r0 = r13.d
            boolean r1 = r0[r14]
            java.util.ArrayList r2 = r13.c
            if (r1 == 0) goto Lf
            java.lang.Object r13 = r2.get(r14)
            java.text.Bidi r13 = (java.text.Bidi) r13
            return r13
        Lf:
            java.util.ArrayList r1 = r13.b
            r3 = 0
            if (r14 != 0) goto L16
            r4 = r3
            goto L22
        L16:
            int r4 = r14 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L22:
            java.lang.Object r1 = r1.get(r14)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r10 = r1 - r4
            char[] r5 = r13.e
            if (r5 == 0) goto L38
            int r6 = r5.length
            if (r6 >= r10) goto L36
            goto L38
        L36:
            r6 = r5
            goto L3b
        L38:
            char[] r5 = new char[r10]
            goto L36
        L3b:
            android.text.Layout r5 = r13.a
            java.lang.CharSequence r7 = r5.getText()
            android.text.TextUtils.getChars(r7, r4, r1, r6, r3)
            boolean r1 = java.text.Bidi.requiresBidi(r6, r3, r10)
            r4 = 0
            r12 = 1
            if (r1 == 0) goto L6c
            int r1 = r13.e(r14)
            int r1 = r5.getLineForOffset(r1)
            int r1 = r5.getParagraphDirection(r1)
            r5 = -1
            if (r1 != r5) goto L5d
            r11 = r12
            goto L5e
        L5d:
            r11 = r3
        L5e:
            java.text.Bidi r5 = new java.text.Bidi
            r8 = 0
            r9 = 0
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r1 = r5.getRunCount()
            if (r1 != r12) goto L6d
        L6c:
            r5 = r4
        L6d:
            r2.set(r14, r5)
            r0[r14] = r12
            if (r5 == 0) goto L7b
            char[] r14 = r13.e
            if (r6 != r14) goto L7a
            r6 = r4
            goto L7b
        L7a:
            r6 = r14
        L7b:
            r13.e = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl8.a(int):java.text.Bidi");
    }

    public final float b(int i, boolean z) {
        Layout layout = this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public final float c(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        if (!z2) {
            return b(i, z);
        }
        Layout layout = this.a;
        int iM = w74.m(layout, i, z2);
        int lineStart = layout.getLineStart(iM);
        int lineEnd = layout.getLineEnd(iM);
        if (i != lineStart && i != lineEnd) {
            return b(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return b(i, z);
        }
        int iD = d(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(e(iD))) == -1;
        int iF = f(lineEnd, lineStart);
        int iE = e(iD);
        int i4 = lineStart - iE;
        int i5 = iF - iE;
        Bidi bidiA = a(iD);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iM) : layout.getLineRight(iM);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            aVarArr[i6] = new a(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (aVarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == aVarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iM) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(aVarArr[i3 - 1].a) : layout.getPrimaryHorizontal(aVarArr[i3 + 1].a) : layout.getLineRight(iM);
        }
        int iF2 = i > iF ? f(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (aVarArr[i9].b == iF2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == aVarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iM) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(aVarArr[i2 - 1].b) : layout.getPrimaryHorizontal(aVarArr[i2 + 1].b) : layout.getLineRight(iM);
    }

    public final int d(int i, boolean z) {
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.b;
        int iN = u63.n(arrayList, numValueOf);
        int i2 = iN < 0 ? -(iN + 1) : iN + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int e(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final int f(int i, int i2) {
        while (i > i2) {
            char cCharAt = this.a.getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((wl7.c(cCharAt, 8192) < 0 || wl7.c(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }
}
