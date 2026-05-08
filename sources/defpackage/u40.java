package defpackage;

import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import defpackage.e75;
import defpackage.lz8;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u40 implements lz8.a, e75.e, jg2, p55 {
    public final /* synthetic */ int a;

    public static String c(long j, String str, String str2) {
        return str + j + str2;
    }

    public static StringBuilder f(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static List g(String str, mb3 mb3Var, zr4 zr4Var, zr4 zr4Var2, zr4 zr4Var3) {
        return u63.Z(new pd2(str, mb3Var, zr4Var, zr4Var2, zr4Var3));
    }

    public static /* synthetic */ void i(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static void k(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return FirebaseSessionsRegistrar.m29getComponents$lambda4(l7dVar);
    }

    @Override // defpackage.p55
    public m55[] h() {
        return new m55[]{new fug()};
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 2:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return ka6Var.P0(obj instanceof ByteBuffer ? (ByteBuffer) obj : null);
    }

    public /* synthetic */ u40(int i) {
        this.a = i;
    }
}
