package defpackage;

import android.os.VibratorManager;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import defpackage.e75;
import defpackage.lz8;
import defpackage.sp7;
import defpackage.u79;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ConcurrentModificationException;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q6 implements n8, ru5, lz8.a, e75.b, u79.b, wq2 {
    public final /* synthetic */ int a;

    public static int b(float f, float f2, float f3) {
        return Math.round((f / f2) * f3);
    }

    public static /* bridge */ /* synthetic */ VibratorManager e(Object obj) {
        return (VibratorManager) obj;
    }

    public static c f(int i, gu5 gu5Var, b bVar, String str) {
        str.getClass();
        gu5Var.getClass();
        return bVar.h(i);
    }

    public static StringBuilder g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ void h() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void i(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2) throws IOException {
        throw new IOException(str + obj + obj2);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static void m(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void n(String str, List list, Function1 function1, int i, tp7 tp7Var) {
        tp7Var.b(new sp7.f(i, str, list, function1));
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).stop();
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                return ((m55) obj).f().getClass().getSimpleName();
            default:
                return (tpf) obj;
        }
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        int i = ec1.s0;
        ((ActivityResult) obj).getClass();
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 5:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        ByteBuffer byteBufferP0 = ka6Var.P0(null);
        return new String(byteBufferP0.array(), byteBufferP0.position(), byteBufferP0.remaining(), StandardCharsets.UTF_8);
    }

    public /* synthetic */ q6(int i) {
        this.a = i;
    }

    public /* synthetic */ q6(e75 e75Var) {
        this.a = 7;
    }
}
