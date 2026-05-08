package defpackage;

import androidx.compose.runtime.r;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class p24 implements Callback, OnCompleteListener {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public p24(xj1 xj1Var) {
        this.a = 3;
        xj1Var.getClass();
        this.c = xj1Var;
        zs0 zs0Var = new zs0();
        this.b = zs0Var;
        zs0Var.remove(xj1Var);
        zs0Var.addFirst(xj1Var);
        if (zs0Var.last() != xj1Var) {
            zs0Var.addLast(xj1Var);
        }
    }

    public ag9 a() {
        return (ag9) ((gme) ((g4a) this.b)).getValue();
    }

    @Override // okhttp3.Callback
    public void h(Call call, IOException iOException) {
        ReactContext reactContext = (ReactContext) this.c;
        String str = (String) this.b;
        if (str == null) {
            str = "openDebugger error";
        }
        msb.k(reactContext, str);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        qji qjiVar = (qji) this.c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        synchronized (qjiVar.f) {
            qjiVar.e.remove(taskCompletionSource);
        }
    }

    @Override // okhttp3.Callback
    public void p(Call call, Response response) {
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("GetFriendsResponse{friends=");
                sb.append((ArrayList) this.c);
                sb.append(", nextPageRequestToken='");
                return l6.i(sb, (String) this.b, "'}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p24(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public p24(pm8 pm8Var, ag9 ag9Var) {
        this.a = 2;
        this.c = pm8Var;
        this.b = r.f(ag9Var);
    }
}
