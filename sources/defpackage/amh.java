package defpackage;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class amh {
    public final Intent a;
    public final TaskCompletionSource<Void> b = new TaskCompletionSource<>();

    public amh(Intent intent) {
        this.a = intent;
    }
}
