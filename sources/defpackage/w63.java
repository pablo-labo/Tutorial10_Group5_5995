package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface w63 {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, c06 c06Var, CancellationSignal cancellationSignal, Executor executor, t63<d06, GetCredentialException> t63Var);
}
