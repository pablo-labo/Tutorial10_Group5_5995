package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes2.dex */
public final class qdh extends uv0 {
    public final Semaphore i;
    public final Set j;

    public qdh(SignInHubActivity signInHubActivity, Set set) {
        super(signInHubActivity);
        this.i = new Semaphore(0);
        this.j = set;
    }
}
