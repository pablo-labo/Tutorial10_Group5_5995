package defpackage;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.p;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class tr1 implements Iterable<Byte>, Serializable {
    public static final e a = new e(p.b);
    public static final c b;
    private int hash = 0;

    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            sr1 sr1Var = (sr1) this;
            int i = sr1Var.a;
            if (i < sr1Var.b) {
                sr1Var.a = i + 1;
                return Byte.valueOf(sr1Var.c.c(i));
            }
            k20.p();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b implements c {
        @Override // tr1.c
        public final byte[] a(int i, byte[] bArr, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public interface c {
        byte[] a(int i, byte[] bArr, int i2);
    }

    public static abstract class d extends tr1 {
        @Override // defpackage.tr1, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new sr1(this);
        }
    }

    public static class e extends d {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public e(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // defpackage.tr1
        public byte a(int i) {
            return this.bytes[i];
        }

        @Override // defpackage.tr1
        public byte c(int i) {
            return this.bytes[i];
        }

        @Override // defpackage.tr1
        public final boolean d() {
            int iJ = j();
            return Utf8.a.c(iJ, this.bytes, size() + iJ) == 0;
        }

        @Override // defpackage.tr1
        public final int e(int i, int i2) {
            byte[] bArr = this.bytes;
            int iJ = j();
            Charset charset = p.a;
            for (int i3 = iJ; i3 < iJ + i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            return i;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof tr1) && size() == ((tr1) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return obj.equals(this);
                }
                e eVar = (e) obj;
                int iF = f();
                int iF2 = eVar.f();
                if (iF == 0 || iF2 == 0 || iF == iF2) {
                    int size = size();
                    if (size > eVar.size()) {
                        l6.l(size, size());
                        return false;
                    }
                    if (size > eVar.size()) {
                        StringBuilder sbG = o6.g(size, "Ran off end of other: 0, ", ", ");
                        sbG.append(eVar.size());
                        throw new IllegalArgumentException(sbG.toString());
                    }
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = eVar.bytes;
                    int iJ = j() + size;
                    int iJ2 = j();
                    int iJ3 = eVar.j();
                    while (iJ2 < iJ) {
                        if (bArr[iJ2] == bArr2[iJ3]) {
                            iJ2++;
                            iJ3++;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.tr1
        public final String g(Charset charset) {
            return new String(this.bytes, j(), size(), charset);
        }

        @Override // defpackage.tr1
        public final void i(CodedOutputStream codedOutputStream) {
            codedOutputStream.y1(j(), this.bytes, size());
        }

        public int j() {
            return 0;
        }

        @Override // defpackage.tr1
        public int size() {
            return this.bytes.length;
        }
    }

    public static final class f implements c {
        @Override // tr1.c
        public final byte[] a(int i, byte[] bArr, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        b = f40.a() ? new f() : new b();
    }

    public static e b(int i, byte[] bArr, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) < 0) {
            if (i < 0) {
                l5.s(bg.d(i, "Beginning index: ", " < 0"));
            } else if (i3 < i) {
                l5.s(k20.l("Beginning index larger than ending index: ", i, i3, ", "));
            } else {
                l5.s(k20.l("End index: ", i3, length, " >= "));
            }
        }
        return new e(b.a(i, bArr, i2));
    }

    public abstract byte a(int i);

    public abstract byte c(int i);

    public abstract boolean d();

    public abstract int e(int i, int i2);

    public final int f() {
        return this.hash;
    }

    public abstract String g(Charset charset);

    public final int hashCode() {
        int iE = this.hash;
        if (iE == 0) {
            int size = size();
            iE = e(size, size);
            if (iE == 0) {
                iE = 1;
            }
            this.hash = iE;
        }
        return iE;
    }

    public abstract void i(CodedOutputStream codedOutputStream);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new sr1(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
