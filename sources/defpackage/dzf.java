package defpackage;

import androidx.emoji2.text.h;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class dzf {
    public static final ThreadLocal<ps9> d = new ThreadLocal<>();
    public final int a;
    public final h b;
    public volatile int c = 0;

    public dzf(h hVar, int i) {
        this.b = hVar;
        this.a = i;
    }

    public final int a(int i) {
        ps9 ps9VarB = b();
        int iA = ps9VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = ps9VarB.b;
        int i2 = iA + ps9VarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final ps9 b() {
        ThreadLocal<ps9> threadLocal = d;
        ps9 ps9Var = threadLocal.get();
        if (ps9Var == null) {
            ps9Var = new ps9();
            threadLocal.set(ps9Var);
        }
        qs9 qs9Var = this.b.a;
        int iA = qs9Var.a(6);
        if (iA != 0) {
            int i = iA + qs9Var.a;
            int i2 = (this.a * 4) + qs9Var.b.getInt(i) + i + 4;
            int i3 = qs9Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = qs9Var.b;
            ps9Var.b = byteBuffer;
            if (byteBuffer != null) {
                ps9Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ps9Var.c = i4;
                ps9Var.d = ps9Var.b.getShort(i4);
                return ps9Var;
            }
            ps9Var.a = 0;
            ps9Var.c = 0;
            ps9Var.d = 0;
        }
        return ps9Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ps9 ps9VarB = b();
        int iA = ps9VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ps9VarB.b.getInt(iA + ps9VarB.a) : 0));
        sb.append(", codepoints:");
        ps9 ps9VarB2 = b();
        int iA2 = ps9VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + ps9VarB2.a;
            i = ps9VarB2.b.getInt(ps9VarB2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
