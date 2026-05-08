package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.util.encoders.EncoderException;

/* JADX INFO: loaded from: classes3.dex */
public final class xc3 extends w {
    public byte[] a;

    public xc3(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
        } else {
            ja.k("string cannot be null");
            throw null;
        }
    }

    @Override // defpackage.w
    public final boolean b(w wVar) {
        if (wVar instanceof xc3) {
            return st0.a(this.a, ((xc3) wVar).a);
        }
        return false;
    }

    @Override // defpackage.w
    public final void c(v vVar) throws IOException {
        byte[] bArr = this.a;
        vVar.g(4);
        vVar.h(bArr.length);
        ((ByteArrayOutputStream) vVar.a).write(bArr);
    }

    @Override // defpackage.w
    public final int d() {
        byte[] bArr = this.a;
        return oue.a(bArr.length) + 1 + bArr.length;
    }

    @Override // defpackage.w
    public final w e() {
        return new xc3(this.a);
    }

    @Override // defpackage.w, defpackage.t
    public final int hashCode() {
        byte[] bArr = this.a;
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
        StringBuilder sb = new StringBuilder("#");
        byte[] bArr = this.a;
        by3 by3Var = sh6.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr2 = (byte[]) sh6.a.a;
            for (byte b : bArr) {
                byteArrayOutputStream.write(bArr2[(b & 255) >>> 4]);
                byteArrayOutputStream.write(bArr2[b & 15]);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i = qve.a;
            int length = byteArray.length;
            char[] cArr = new char[length];
            for (int i2 = 0; i2 != length; i2++) {
                cArr[i2] = (char) (byteArray[i2] & 255);
            }
            sb.append(new String(cArr));
            return sb.toString();
        } catch (Exception e) {
            throw new EncoderException(e, b0.h(e, new StringBuilder("exception encoding Hex string: ")));
        }
    }
}
