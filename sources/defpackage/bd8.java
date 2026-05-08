package defpackage;

import kotlin.jvm.functions.Function1;
import okhttp3.Call;

/* JADX INFO: loaded from: classes.dex */
public final class bd8 implements Function1<Throwable, j6g> {
    public final /* synthetic */ Call a;

    public bd8(Call call) {
        this.a = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(Throwable th) {
        this.a.cancel();
        return j6g.a;
    }
}
