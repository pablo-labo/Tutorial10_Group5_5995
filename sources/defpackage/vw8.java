package defpackage;

import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class vw8 implements tw8 {
    public static final ww8 e = ww8.a(xw8.f, new LineApiError("access token is null"));
    public final String a;
    public final ax8 b;
    public final h8f c;
    public final p5 d;

    @FunctionalInterface
    public interface a<T> {
        ww8<T> c(qi7 qi7Var);
    }

    public vw8(String str, ax8 ax8Var, h8f h8fVar, p5 p5Var) {
        this.a = str;
        this.b = ax8Var;
        this.c = h8fVar;
        this.d = p5Var;
    }

    @Override // defpackage.tw8
    public final ww8<Boolean> a() {
        return c(new l35(this, 3));
    }

    @Override // defpackage.tw8
    public final ww8<OpenChatRoomInfo> b(hua huaVar) {
        return c(new uw8(this, huaVar));
    }

    public final <T> ww8<T> c(a<T> aVar) {
        try {
            qi7 qi7VarC = this.d.c();
            return qi7VarC == null ? e : aVar.c(qi7VarC);
        } catch (Exception e2) {
            return ww8.a(xw8.f, new LineApiError(b0.h(e2, new StringBuilder("get access token fail:"))));
        }
    }
}
