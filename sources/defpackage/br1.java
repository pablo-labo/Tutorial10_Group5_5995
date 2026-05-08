package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class br1 {
    public static final a e = new a();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList(64);
    public int c = 0;
    public final int d = 4096;

    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public final synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = (byte[]) this.b.get(i2);
            if (bArr.length >= i) {
                this.c -= bArr.length;
                this.b.remove(i2);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.b, bArr, e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.b.add(iBinarySearch, bArr);
                this.c += bArr.length;
                synchronized (this) {
                    while (this.c > this.d) {
                        byte[] bArr2 = (byte[]) this.a.remove(0);
                        this.b.remove(bArr2);
                        this.c -= bArr2.length;
                    }
                }
            }
        }
    }
}
