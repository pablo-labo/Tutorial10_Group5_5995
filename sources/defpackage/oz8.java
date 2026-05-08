package defpackage;

import defpackage.ur1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class oz8 extends ur1 {
    public final byte[] b;
    public int c = 0;

    public class a implements ur1.a {
        public int a = 0;
        public final int b;

        public a() {
            this.b = oz8.this.b.length;
        }

        public final byte a() {
            try {
                byte[] bArr = oz8.this.b;
                int i = this.a;
                this.a = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                s6.j(e.getMessage());
                return (byte) 0;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a < this.b;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public oz8(byte[] bArr) {
        this.b = bArr;
    }

    @Override // defpackage.ur1
    public void d(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.b, i, bArr, i2, i3);
    }

    @Override // defpackage.ur1
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ur1) || size() != ((ur1) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof oz8) {
            return r((oz8) obj, 0, size());
        }
        if (obj instanceof rfd) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        l5.q(l6.i(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
        return false;
    }

    @Override // defpackage.ur1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ur1
    public final boolean g() {
        byte[] bArr = this.b;
        return msb.i(0, bArr, bArr.length) == 0;
    }

    public final int hashCode() {
        int iK = this.c;
        if (iK == 0) {
            int size = size();
            iK = k(size, 0, size);
            if (iK == 0) {
                iK = 1;
            }
            this.c = iK;
        }
        return iK;
    }

    @Override // defpackage.ur1
    /* JADX INFO: renamed from: i */
    public ur1.a iterator() {
        return new a();
    }

    @Override // defpackage.ur1, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new a();
    }

    @Override // defpackage.ur1
    public final int k(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.b[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r6[r7] > (-65)) goto L59;
     */
    @Override // defpackage.ur1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(int r7, int r8, int r9) {
        /*
            r6 = this;
            int r9 = r9 + r8
            byte[] r6 = r6.b
            if (r7 == 0) goto L95
            if (r8 < r9) goto L8
            return r7
        L8:
            byte r0 = (byte) r7
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1f
            r7 = -62
            if (r0 < r7) goto L94
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r3) goto L1c
            goto L94
        L1c:
            r8 = r7
            goto L95
        L1f:
            r4 = -16
            if (r0 >= r4) goto L4c
            int r7 = r7 >> 8
            int r7 = ~r7
            byte r7 = (byte) r7
            if (r7 != 0) goto L37
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r7 < r9) goto L34
            int r6 = defpackage.msb.f(r0, r8)
            return r6
        L34:
            r5 = r8
            r8 = r7
            r7 = r5
        L37:
            if (r7 > r3) goto L94
            r4 = -96
            if (r0 != r1) goto L3f
            if (r7 < r4) goto L94
        L3f:
            r1 = -19
            if (r0 != r1) goto L45
            if (r7 >= r4) goto L94
        L45:
            int r7 = r8 + 1
            r8 = r6[r8]
            if (r8 <= r3) goto L1c
            goto L94
        L4c:
            int r1 = r7 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5f
            int r7 = r8 + 1
            r1 = r6[r8]
            if (r7 < r9) goto L5d
            int r6 = defpackage.msb.f(r0, r1)
            return r6
        L5d:
            r8 = 0
            goto L65
        L5f:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r5 = r8
            r8 = r7
            r7 = r5
        L65:
            if (r8 != 0) goto L81
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r8 < r9) goto L7e
            r6 = -12
            if (r0 > r6) goto L7d
            if (r1 > r3) goto L7d
            if (r7 <= r3) goto L76
            goto L7d
        L76:
            int r6 = r1 << 8
            r6 = r6 ^ r0
            int r7 = r7 << 16
            r6 = r6 ^ r7
            return r6
        L7d:
            return r2
        L7e:
            r5 = r8
            r8 = r7
            r7 = r5
        L81:
            if (r1 > r3) goto L94
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L94
            if (r8 > r3) goto L94
            int r8 = r7 + 1
            r7 = r6[r7]
            if (r7 <= r3) goto L95
        L94:
            return r2
        L95:
            int r6 = defpackage.msb.i(r8, r6, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz8.l(int, int, int):int");
    }

    @Override // defpackage.ur1
    public final int m() {
        return this.c;
    }

    @Override // defpackage.ur1
    public final String n() {
        byte[] bArr = this.b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // defpackage.ur1
    public final void q(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.b, i, i2);
    }

    public final boolean r(oz8 oz8Var, int i, int i2) {
        byte[] bArr = oz8Var.b;
        int length = bArr.length;
        byte[] bArr2 = this.b;
        if (i2 > length) {
            m6.k(i2, bArr2.length);
            return false;
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length2 = bArr.length;
        StringBuilder sb = new StringBuilder(59);
        sb.append("Ran off end of other: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(length2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.ur1
    public int size() {
        return this.b.length;
    }
}
