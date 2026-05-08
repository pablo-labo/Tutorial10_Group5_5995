package defpackage;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class cbe {
    public static final Object c = new Object();
    public static cbe d;
    public static int e;
    public Object a;
    public Object b;

    public static cbe b() {
        synchronized (c) {
            try {
                cbe cbeVar = d;
                if (cbeVar == null) {
                    return new cbe();
                }
                d = (cbe) cbeVar.b;
                cbeVar.b = null;
                e--;
                return cbeVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String a(int i, byte[] bArr) {
        byte[] bArr2 = (byte[]) this.b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, bArr2.length, i);
            i += bArr2.length;
            bArr = bArr3;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        byte[] bArr4 = null;
        boolean z = false;
        int i2 = 0;
        CharBuffer charBufferDecode = null;
        while (!z && i2 < 4) {
            try {
                charBufferDecode = ((CharsetDecoder) this.a).decode(byteBufferWrap);
                z = true;
            } catch (CharacterCodingException unused) {
                i2++;
                byteBufferWrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (z && i2 > 0) {
            bArr4 = new byte[i2];
            System.arraycopy(bArr, i - i2, bArr4, 0, i2);
        }
        this.b = bArr4;
        if (!z) {
            s55.n("ReactNative", "failed to decode string from byte array");
            return "";
        }
        if (charBufferDecode == null) {
            return "";
        }
        char[] cArrArray = charBufferDecode.array();
        cArrArray.getClass();
        return new String(cArrArray, 0, charBufferDecode.length());
    }

    public void c() {
        synchronized (c) {
            try {
                int i = e;
                if (i < 5) {
                    e = i + 1;
                    cbe cbeVar = d;
                    if (cbeVar != null) {
                        this.b = cbeVar;
                    }
                    d = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(q0a q0aVar) {
        z3a z3aVar = (z3a) this.a;
        V vD = ((z3a) this.b).d(q0aVar);
        if (vD != 0) {
            int i = 13;
            if (!(vD instanceof p3a)) {
                v1a.d(z3aVar, (o0a) vD, new or(q0aVar, i));
                return;
            }
            ona onaVar = (ona) vD;
            Object[] objArr = onaVar.a;
            int i2 = onaVar.b;
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[i3];
                obj.getClass();
                v1a.d(z3aVar, (o0a) obj, new or(q0aVar, i));
            }
        }
    }
}
