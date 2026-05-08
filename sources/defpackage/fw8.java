package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.kv8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lfw8;", "Landroid/app/Service;", "Lzv8;", "<init>", "()V", "lifecycle-service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class fw8 extends Service implements zv8 {
    public final k8e a = new k8e(this);

    @Override // defpackage.zv8
    public final kv8 getLifecycle() {
        return this.a.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        k8e k8eVar = this.a;
        k8eVar.getClass();
        k8eVar.a(kv8.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        k8e k8eVar = this.a;
        k8eVar.getClass();
        k8eVar.a(kv8.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        k8e k8eVar = this.a;
        k8eVar.getClass();
        k8eVar.a(kv8.a.ON_STOP);
        k8eVar.a(kv8.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @sy3
    public final void onStart(Intent intent, int i) {
        k8e k8eVar = this.a;
        k8eVar.getClass();
        k8eVar.a(kv8.a.ON_START);
        super.onStart(intent, i);
    }
}
