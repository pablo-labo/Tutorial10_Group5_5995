package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.iid.zzam;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vih<T> {
    public final int a;
    public final TaskCompletionSource<T> b = new TaskCompletionSource<>();
    public final int c;
    public final Bundle d;

    public vih(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public final void b(zzam zzamVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzamVar);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 14);
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.b.setException(zzamVar);
    }

    public abstract boolean c();

    public final void d(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 16);
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.b.setResult(bundle);
    }

    public final String toString() {
        boolean zC = c();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(this.c);
        sb.append(" id=");
        sb.append(this.a);
        sb.append(" oneWay=");
        sb.append(zC);
        sb.append("}");
        return sb.toString();
    }
}
