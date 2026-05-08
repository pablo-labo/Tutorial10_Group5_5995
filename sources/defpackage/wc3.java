package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class wc3 extends w {
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;

    public wc3(byte[] bArr) {
        if (bArr == null) {
            ja.k("data cannot be null");
            throw null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.a = bArr2;
    }

    @Override // defpackage.w
    public final boolean b(w wVar) {
        byte[] bArr;
        if (wVar instanceof wc3) {
            wc3 wc3Var = (wc3) wVar;
            byte[] bArr2 = null;
            byte[] bArr3 = this.a;
            if (bArr3 == null) {
                bArr = null;
            } else {
                bArr = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
            }
            byte[] bArr4 = wc3Var.a;
            if (bArr4 != null) {
                bArr2 = new byte[bArr4.length];
                System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
            }
            if (st0.a(bArr, bArr2)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.w
    public final void c(v vVar) throws IOException {
        byte[] bArr;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            bArr = null;
        } else {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        int length = bArr.length;
        int i = length + 1;
        byte[] bArr4 = new byte[i];
        bArr4[0] = 0;
        System.arraycopy(bArr, 0, bArr4, 1, length);
        vVar.g(3);
        vVar.h(i);
        ((ByteArrayOutputStream) vVar.a).write(bArr4);
    }

    @Override // defpackage.w
    public final int d() {
        byte[] bArr = this.a;
        return oue.a(bArr.length + 1) + 1 + bArr.length + 1;
    }

    @Override // defpackage.w
    public final w e() {
        return new wc3(this.a);
    }

    @Override // defpackage.w, defpackage.t
    public final int hashCode() {
        byte[] bArr;
        byte[] bArr2 = this.a;
        if (bArr2 == null) {
            bArr = null;
        } else {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new v(byteArrayOutputStream).l(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                int i2 = (byteArray[i] >>> 4) & 15;
                char[] cArr = b;
                stringBuffer.append(cArr[i2]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }
}
