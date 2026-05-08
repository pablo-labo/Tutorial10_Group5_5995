package defpackage;

import defpackage.e69;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public class tc2 implements gd9 {
    public static final tc2 e = new tc2(new int[0], new char[0], new boolean[0], 0);
    public final int[] a;
    public final char[] b;
    public final boolean[] c;
    public final int d;

    public static final class a {
        public static final tc2 a(tc2 tc2Var, int i, char c, boolean z, int i2) {
            tc2 tc2Var2 = tc2.e;
            int[] iArr = tc2Var.a;
            int length = iArr.length;
            int i3 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i3);
            char[] cArrCopyOf = Arrays.copyOf(tc2Var.b, i3);
            boolean[] zArrCopyOf = Arrays.copyOf(tc2Var.c, i3);
            iArrCopyOf[length] = tc2Var.g() + i;
            cArrCopyOf[length] = c;
            zArrCopyOf[length] = z;
            return tc2Var.i(iArrCopyOf, cArrCopyOf, zArrCopyOf, i2);
        }
    }

    public static final class b {
        public final int a;
        public final char b;
        public final int c;

        public b(char c, int i, int i2) {
            this.a = i;
            this.b = c;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((Character.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ListMarkerInfo(markerLength=");
            sb.append(this.a);
            sb.append(", markerType=");
            sb.append(this.b);
            sb.append(", markerIndent=");
            return k6.h(sb, this.c, ')');
        }
    }

    public static final class c extends mj8 implements Function1<tc2, tc2> {
        final /* synthetic */ Function1<Integer, Integer> $getBlockQuoteIndent;
        final /* synthetic */ juc $indexPrev;
        final /* synthetic */ String $line;
        final /* synthetic */ int $prevN;
        final /* synthetic */ tc2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(juc jucVar, int i, String str, tc2 tc2Var, d dVar) {
            super(1);
            this.$indexPrev = jucVar;
            this.$prevN = i;
            this.$line = str;
            this.this$0 = tc2Var;
            this.$getBlockQuoteIndent = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final tc2 invoke(tc2 tc2Var) {
            Integer numInvoke;
            tc2 tc2VarA = tc2Var;
            tc2VarA.getClass();
            if (this.$indexPrev.element < this.$prevN) {
                juc jucVar = new juc();
                jucVar.element = hd9.d(tc2VarA, this.$line);
                uc2 uc2Var = new uc2(new juc(), jucVar, this.$line, new juc());
                if (this.this$0.b[this.$indexPrev.element] == '>') {
                    numInvoke = this.$getBlockQuoteIndent.invoke(Integer.valueOf(jucVar.element));
                    if (numInvoke != null) {
                        jucVar.element = numInvoke.intValue() + jucVar.element;
                        this.$indexPrev.element++;
                    }
                } else {
                    numInvoke = null;
                }
                int i = this.$indexPrev.element;
                while (true) {
                    int i2 = this.$indexPrev.element;
                    if (i2 >= this.$prevN) {
                        break;
                    }
                    tc2 tc2Var2 = this.this$0;
                    if (tc2Var2.b[i2] == '>') {
                        break;
                    }
                    int[] iArr = tc2Var2.a;
                    if (!((Boolean) uc2Var.invoke(Integer.valueOf(iArr[i2] - (i2 == 0 ? 0 : iArr[i2 - 1])))).booleanValue()) {
                        break;
                    }
                    this.$indexPrev.element++;
                }
                if (numInvoke != null) {
                    boolean zBooleanValue = ((Boolean) uc2Var.invoke(1)).booleanValue();
                    tc2 tc2Var3 = tc2.e;
                    tc2VarA = a.a(tc2VarA, numInvoke.intValue() + (zBooleanValue ? 1 : 0), '>', true, jucVar.element);
                }
                int i3 = this.$indexPrev.element;
                while (i < i3) {
                    tc2 tc2Var4 = this.this$0;
                    int[] iArr2 = tc2Var4.a;
                    int i4 = iArr2[i] - (i == 0 ? 0 : iArr2[i - 1]);
                    tc2 tc2Var5 = tc2.e;
                    tc2VarA = a.a(tc2VarA, i4, tc2Var4.b[i], false, jucVar.element);
                    i++;
                }
                return tc2VarA;
            }
            return tc2VarA;
        }
    }

    public static final class d extends mj8 implements Function1<Integer, Integer> {
        final /* synthetic */ String $line;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.$line = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            int iIntValue = num.intValue();
            int i = 0;
            while (i < 3 && iIntValue < this.$line.length() && this.$line.charAt(iIntValue) == ' ') {
                i++;
                iIntValue++;
            }
            if (iIntValue >= this.$line.length() || this.$line.charAt(iIntValue) != '>') {
                return null;
            }
            return Integer.valueOf(i + 1);
        }
    }

    public tc2(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        this.a = iArr;
        this.b = cArr;
        this.c = zArr;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    @Override // defpackage.gd9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.tc2 a(e69.a r18) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc2.a(e69$a):tc2");
    }

    @Override // defpackage.gd9
    public final boolean[] b() {
        return this.c;
    }

    @Override // defpackage.gd9
    public final char[] c() {
        return this.b;
    }

    @Override // defpackage.gd9
    public final boolean d(int i) {
        Iterable iterableH = nic.H(0, i);
        if (!(iterableH instanceof Collection) || !((Collection) iterableH).isEmpty()) {
            Iterator<Integer> it = iterableH.iterator();
            while (((nh7) it).c) {
                int iNextInt = ((fh7) it).nextInt();
                if (this.b[iNextInt] != '>' && this.c[iNextInt]) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.gd9
    public final int e() {
        return this.d;
    }

    @Override // defpackage.gd9
    public final boolean f(gd9 gd9Var) {
        gd9Var.getClass();
        if (gd9Var instanceof tc2) {
            int length = this.a.length;
            tc2 tc2Var = (tc2) gd9Var;
            int length2 = tc2Var.a.length;
            if (length >= length2) {
                Iterable iterableH = nic.H(0, length2);
                if ((iterableH instanceof Collection) && ((Collection) iterableH).isEmpty()) {
                    return true;
                }
                Iterator<Integer> it = iterableH.iterator();
                while (((nh7) it).c) {
                    int iNextInt = ((fh7) it).nextInt();
                    if (this.b[iNextInt] != tc2Var.b[iNextInt]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gd9
    public final int g() {
        int[] iArr = this.a;
        Integer numValueOf = iArr.length == 0 ? null : Integer.valueOf(iArr[iArr.length - 1]);
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.gd9
    public final tc2 h(e69.a aVar) {
        if (aVar == null) {
            return k();
        }
        if (aVar.b != -1) {
            throw new MarkdownParsingException("given " + aVar);
        }
        String str = aVar.d;
        c cVar = new c(new juc(), this.a.length, str, this, new d(str));
        tc2 tc2VarK = k();
        while (true) {
            tc2 tc2Var = (tc2) cVar.invoke(tc2VarK);
            if (tc2Var.equals(tc2VarK)) {
                return tc2VarK;
            }
            tc2VarK = tc2Var;
        }
    }

    public tc2 i(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        return new tc2(iArr, cArr, zArr, i);
    }

    public b j(e69.a aVar) {
        char cCharAt;
        int i = aVar.b;
        char cCharAt2 = e69.this.a.charAt(aVar.c);
        if (cCharAt2 == '*' || cCharAt2 == '-' || cCharAt2 == '+') {
            return new b(cCharAt2, 1, 1);
        }
        String str = aVar.d;
        int i2 = i;
        while (i2 < str.length() && '0' <= (cCharAt = str.charAt(i2)) && cCharAt < ':') {
            i2++;
        }
        if (i2 <= i || i2 - i > 9 || i2 >= str.length()) {
            return null;
        }
        if (str.charAt(i2) != '.' && str.charAt(i2) != ')') {
            return null;
        }
        int i3 = (i2 + 1) - i;
        return new b(str.charAt(i2), i3, i3);
    }

    public tc2 k() {
        return e;
    }

    public final String toString() {
        return "MdConstraints: " + new String(this.b) + '(' + g() + ')';
    }
}
