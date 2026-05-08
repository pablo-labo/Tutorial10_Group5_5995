package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yk0 extends ka6 {
    @Override // defpackage.ka6
    public final js9 W(os9 os9Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            f4b f4bVar = new f4b(byteBuffer.array(), byteBuffer.limit());
            f4bVar.o(12);
            int iD = (f4bVar.d() + f4bVar.g(12)) - 4;
            f4bVar.o(44);
            f4bVar.p(f4bVar.g(12));
            f4bVar.o(16);
            ArrayList arrayList = new ArrayList();
            while (f4bVar.d() < iD) {
                f4bVar.o(48);
                int iG = f4bVar.g(8);
                f4bVar.o(4);
                int iD2 = f4bVar.d() + f4bVar.g(12);
                String str = null;
                String str2 = null;
                while (f4bVar.d() < iD2) {
                    int iG2 = f4bVar.g(8);
                    int iG3 = f4bVar.g(8);
                    int iD3 = f4bVar.d() + iG3;
                    if (iG2 == 2) {
                        int iG4 = f4bVar.g(16);
                        f4bVar.o(8);
                        if (iG4 == 3) {
                            while (f4bVar.d() < iD3) {
                                int iG5 = f4bVar.g(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iG5];
                                f4bVar.j(iG5, bArr);
                                str = new String(bArr, charset);
                                int iG6 = f4bVar.g(8);
                                for (int i = 0; i < iG6; i++) {
                                    f4bVar.p(f4bVar.g(8));
                                }
                            }
                        }
                    } else if (iG2 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iG3];
                        f4bVar.j(iG3, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    f4bVar.m(iD3 * 8);
                }
                f4bVar.m(iD2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new xk0(iG, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new js9(arrayList);
            }
        }
        return null;
    }
}
