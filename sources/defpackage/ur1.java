package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.rfd;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ur1 implements Iterable<Byte> {
    public static final oz8 a = new oz8(new byte[0]);

    public interface a extends Iterator<Byte> {
    }

    public static ur1 a(Iterator<ur1> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).b(a(it, i - i2));
    }

    public static b j() {
        return new b();
    }

    public final ur1 b(ur1 ur1Var) {
        int size = size();
        int size2 = ur1Var.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            l5.q(uz.d(53, size, size2, "ByteString would be too long: ", "+"));
            return null;
        }
        int[] iArr = rfd.W;
        rfd rfdVar = this instanceof rfd ? (rfd) this : null;
        if (ur1Var.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return ur1Var;
        }
        int size3 = ur1Var.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = ur1Var.size();
            byte[] bArr = new byte[size4 + size5];
            c(0, 0, size4, bArr);
            ur1Var.c(0, size4, size5, bArr);
            return new oz8(bArr);
        }
        if (rfdVar != null) {
            ur1 ur1Var2 = rfdVar.d;
            if (ur1Var.size() + ur1Var2.size() < 128) {
                int size6 = ur1Var2.size();
                int size7 = ur1Var.size();
                byte[] bArr2 = new byte[size6 + size7];
                ur1Var2.c(0, 0, size6, bArr2);
                ur1Var.c(0, size6, size7, bArr2);
                return new rfd(rfdVar.c, new oz8(bArr2));
            }
        }
        if (rfdVar != null) {
            ur1 ur1Var3 = rfdVar.d;
            ur1 ur1Var4 = rfdVar.c;
            if (ur1Var4.e() > ur1Var3.e() && rfdVar.f > ur1Var.e()) {
                return new rfd(ur1Var4, new rfd(ur1Var3, ur1Var));
            }
        }
        if (size3 >= rfd.W[Math.max(e(), ur1Var.e()) + 1]) {
            return new rfd(this, ur1Var);
        }
        rfd.a aVar = new rfd.a();
        aVar.a(this);
        aVar.a(ur1Var);
        Stack<ur1> stack = aVar.a;
        ur1 ur1VarPop = stack.pop();
        while (!stack.isEmpty()) {
            ur1VarPop = new rfd(stack.pop(), ur1VarPop);
        }
        return ur1VarPop;
    }

    public final void c(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            bg.i("Source offset < 0: ", 30, i);
            return;
        }
        if (i2 < 0) {
            bg.i("Target offset < 0: ", 30, i2);
            return;
        }
        if (i3 < 0) {
            bg.i("Length < 0: ", 23, i3);
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            bg.i("Source end offset < 0: ", 34, i4);
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            bg.i("Target end offset < 0: ", 34, i5);
        } else if (i3 > 0) {
            d(i, i2, i3, bArr);
        }
    }

    public abstract void d(int i, int i2, int i3, byte[] bArr);

    public abstract int e();

    public abstract boolean f();

    public abstract boolean g();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract a iterator();

    public abstract int k(int i, int i2, int i3);

    public abstract int l(int i, int i2, int i3);

    public abstract int m();

    public abstract String n();

    public final String o() {
        try {
            return n();
        } catch (UnsupportedEncodingException e) {
            l6.p("UTF-8 not supported?", e);
            return null;
        }
    }

    public abstract void q(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public static final class b extends OutputStream {
        public static final byte[] f = new byte[0];
        public int c;
        public int e;
        public final int a = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        public final ArrayList<ur1> b = new ArrayList<>();
        public byte[] d = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];

        public final void a(int i) {
            this.b.add(new oz8(this.d));
            int length = this.c + this.d.length;
            this.c = length;
            this.d = new byte[Math.max(this.a, Math.max(i, length >>> 1))];
            this.e = 0;
        }

        public final void h() {
            int i = this.e;
            byte[] bArr = this.d;
            int length = bArr.length;
            ArrayList<ur1> arrayList = this.b;
            if (i >= length) {
                arrayList.add(new oz8(this.d));
                this.d = f;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                arrayList.add(new oz8(bArr2));
            }
            this.c += this.e;
            this.e = 0;
        }

        public final synchronized ur1 p() {
            ArrayList<ur1> arrayList;
            h();
            arrayList = this.b;
            if (arrayList == null) {
                ArrayList<ur1> arrayList2 = new ArrayList<>();
                Iterator<ur1> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? ur1.a : ur1.a(arrayList.iterator(), arrayList.size());
        }

        public final String toString() {
            int i;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i = this.c + this.e;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i3 = this.e;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.e += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    a(i4);
                    System.arraycopy(bArr, i + length2, this.d, 0, i4);
                    this.e = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i) {
            try {
                if (this.e == this.d.length) {
                    a(1);
                }
                byte[] bArr = this.d;
                int i2 = this.e;
                this.e = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
