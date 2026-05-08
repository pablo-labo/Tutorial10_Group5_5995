package defpackage;

import defpackage.dp1;
import defpackage.f5c;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class jp1 extends o14 implements ip1 {

    public static final class a {
        public static jp1 a(mq5 mq5Var, j29 j29Var, xx9 xx9Var, InputStream inputStream) throws IOException {
            f5c f5cVar;
            rp9 rp9Var;
            mq5Var.getClass();
            xx9Var.getClass();
            try {
                dp1 dp1Var = dp1.f;
                dp1 dp1VarA = dp1.a.a(inputStream);
                dp1 dp1Var2 = dp1.f;
                int i = dp1VarA.c;
                dp1Var2.getClass();
                int i2 = dp1Var2.c;
                int i3 = dp1VarA.b;
                int i4 = dp1Var2.b;
                if (i3 == 0) {
                    if (i4 == 0 && i == i2) {
                        s45 s45Var = new s45();
                        kp1.a(s45Var);
                        f5c.a aVar = f5c.b;
                        aVar.getClass();
                        e92 e92Var = new e92(inputStream);
                        rp9Var = (rp9) aVar.a(e92Var, s45Var);
                        try {
                            e92Var.a(0);
                            p3.b(rp9Var);
                            f5cVar = (f5c) rp9Var;
                        } catch (InvalidProtocolBufferException e) {
                            e.b(rp9Var);
                            throw e;
                        }
                    }
                    f5cVar = null;
                } else if (i3 != i4 || i > i2) {
                    f5cVar = null;
                } else {
                    s45 s45Var2 = new s45();
                    kp1.a(s45Var2);
                    f5c.a aVar2 = f5c.b;
                    aVar2.getClass();
                    e92 e92Var2 = new e92(inputStream);
                    rp9Var = (rp9) aVar2.a(e92Var2, s45Var2);
                    e92Var2.a(0);
                    p3.b(rp9Var);
                    f5cVar = (f5c) rp9Var;
                }
                Pair pair = new Pair(f5cVar, dp1VarA);
                inputStream.close();
                f5c f5cVar2 = (f5c) pair.a();
                dp1 dp1Var3 = (dp1) pair.b();
                if (f5cVar2 != null) {
                    return new jp1(mq5Var, j29Var, xx9Var, f5cVar2, dp1Var3);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + dp1Var2 + ", actual " + dp1Var3 + ". Please update Kotlin");
            } finally {
            }
        }
    }

    @Override // defpackage.mya, defpackage.bj3
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.e);
        sb.append(" from ");
        int i = b04.a;
        xx9 xx9VarD = yz3.d(this);
        xx9VarD.getClass();
        sb.append(xx9VarD);
        return sb.toString();
    }
}
