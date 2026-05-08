package defpackage;

import android.app.Activity;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class n87 implements Callback {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ n87(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public boolean a(zvf zvfVar) {
        if (wl7.b((zvf) this.b, zvfVar)) {
            return true;
        }
        n87 n87Var = (n87) this.a;
        return n87Var != null ? n87Var.a(zvfVar) : false;
    }

    @Override // okhttp3.Callback
    public void h(Call call, IOException iOException) {
        ArrayList arrayList = lz2.a;
        lz2.a("IndeedDownloadListener", "Exception: " + iOException + " when connecting to: ", (String) this.a);
    }

    @Override // okhttp3.Callback
    public void p(Call call, Response response) {
        if (response.d != 200) {
            return;
        }
        Activity activity = (Activity) this.b;
        activity.runOnUiThread(new m87((o87) this.c, activity, (String) this.a, response, (Function1) this.d));
    }
}
