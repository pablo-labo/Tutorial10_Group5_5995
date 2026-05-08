package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h05 extends ka6 {
    public static g05 J1(g4b g4bVar) {
        String strS = g4bVar.s();
        strS.getClass();
        String strS2 = g4bVar.s();
        strS2.getClass();
        return new g05(strS, strS2, g4bVar.r(), g4bVar.r(), Arrays.copyOfRange(g4bVar.a, g4bVar.b, g4bVar.c));
    }

    @Override // defpackage.ka6
    public final js9 W(os9 os9Var, ByteBuffer byteBuffer) {
        return new js9(J1(new g4b(byteBuffer.array(), byteBuffer.limit())));
    }
}
