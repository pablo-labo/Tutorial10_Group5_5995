package defpackage;

import android.os.Looper;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class mpa extends pa1 {
    public final /* synthetic */ Call a;
    public final /* synthetic */ lpa b;

    public mpa(Call call, lpa lpaVar) {
        this.a = call;
        this.b = lpaVar;
    }

    @Override // defpackage.qpb
    public final void b() {
        boolean zB = wl7.b(Looper.myLooper(), Looper.getMainLooper());
        Call call = this.a;
        if (zB) {
            this.b.e.execute(new rx0(call, 5));
        } else {
            call.cancel();
        }
    }
}
