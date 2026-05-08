package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class bm7 extends ka6 {

    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        public a(int i, int i2, int[] iArr) {
            this.array = iArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return bm7.N1(((Integer) obj).intValue(), this.start, this.array, this.end) != -1;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != aVar.array[aVar.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            pnb.s(i, size());
            return Integer.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + this.array[i2];
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int iN1 = bm7.N1(((Integer) obj).intValue(), this.start, this.array, this.end);
            if (iN1 >= 0) {
                return iN1 - this.start;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.array;
                int iIntValue = ((Integer) obj).intValue();
                int i = this.start;
                int i2 = this.end - 1;
                while (true) {
                    if (i2 < i) {
                        i2 = -1;
                        break;
                    }
                    if (iArr[i2] == iIntValue) {
                        break;
                    }
                    i2--;
                }
                if (i2 >= 0) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            Integer num = (Integer) obj;
            pnb.s(i, size());
            int[] iArr = this.array;
            int i2 = this.start + i;
            int i3 = iArr[i2];
            num.getClass();
            iArr[i2] = num.intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i, int i2) {
            pnb.v(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.array;
            int i3 = this.start;
            return new a(i + i3, i3 + i2, iArr);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.array[i]);
            }
        }
    }

    public static List<Integer> J1(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(0, iArr.length, iArr);
    }

    public static int K1(long j) {
        int i = (int) j;
        pnb.q(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int L1(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        l5.q(hh1.H("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
        return 0;
    }

    public static int M1(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int N1(int i, int i2, int[] iArr, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int O1(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] P1(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            a aVar = (a) collection;
            return Arrays.copyOfRange(aVar.array, aVar.start, aVar.end);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer Q1(java.lang.String r13) {
        /*
            r13.getClass()
            boolean r0 = r13.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r13 = r1
            goto L7e
        Ld:
            r0 = 0
            char r2 = r13.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r2 = r13.length()
            if (r0 != r2) goto L1e
            goto La
        L1e:
            int r2 = r0 + 1
            char r3 = r13.charAt(r0)
            r4 = -1
            r5 = 128(0x80, float:1.794E-43)
            if (r3 >= r5) goto L2e
            byte[] r6 = u59.a.a
            r3 = r6[r3]
            goto L31
        L2e:
            byte[] r3 = u59.a.a
            r3 = r4
        L31:
            if (r3 < 0) goto La
            r6 = 10
            if (r3 < r6) goto L38
            goto La
        L38:
            int r3 = -r3
            long r7 = (long) r3
        L3a:
            int r3 = r13.length()
            r9 = -9223372036854775808
            if (r2 >= r3) goto L6d
            int r3 = r2 + 1
            char r2 = r13.charAt(r2)
            if (r2 >= r5) goto L4f
            byte[] r11 = u59.a.a
            r2 = r11[r2]
            goto L52
        L4f:
            byte[] r2 = u59.a.a
            r2 = r4
        L52:
            if (r2 < 0) goto La
            if (r2 >= r6) goto La
            r11 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L60
            goto La
        L60:
            r11 = 10
            long r7 = r7 * r11
            long r11 = (long) r2
            long r9 = r9 + r11
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L6a
            goto La
        L6a:
            long r7 = r7 - r11
            r2 = r3
            goto L3a
        L6d:
            if (r0 == 0) goto L74
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            goto L7e
        L74:
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L79
            goto La
        L79:
            long r2 = -r7
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
        L7e:
            if (r13 == 0) goto L97
            long r2 = r13.longValue()
            int r0 = r13.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8e
            goto L97
        L8e:
            int r13 = r13.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            return r13
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm7.Q1(java.lang.String):java.lang.Integer");
    }
}
