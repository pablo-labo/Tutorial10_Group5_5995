package defpackage;

import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class aza implements Callback, OnCompleteListener {
    public final Object a;

    public aza() {
        this.a = new SparseArray();
    }

    @Override // okhttp3.Callback
    public void h(Call call, IOException iOException) {
        s55.n("ReactNative", "The packager does not seem to be running as we got an IOException requesting its status: " + iOException.getMessage());
        ((zya) this.a).a(false);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((amh) this.a).b.trySetResult(null);
    }

    @Override // okhttp3.Callback
    public void p(Call call, Response response) throws IOException {
        zya zyaVar = (zya) this.a;
        if (!response.h()) {
            s55.f("ReactNative", "Got non-success http code from packager when requesting status: " + response.d);
            zyaVar.a(false);
            return;
        }
        ResponseBody responseBody = response.V;
        if (responseBody == null) {
            s55.f("ReactNative", "Got null body response from packager when requesting status");
            zyaVar.a(false);
            return;
        }
        String strV = responseBody.v();
        if ("packager-status:running".equals(strV)) {
            zyaVar.a(true);
        } else {
            s55.f("ReactNative", "Got unexpected response from packager when requesting status: ".concat(strV));
            zyaVar.a(false);
        }
    }

    public /* synthetic */ aza(Object obj) {
        this.a = obj;
    }
}
