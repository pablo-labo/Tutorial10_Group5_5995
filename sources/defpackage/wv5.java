package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public interface wv5 {
    Task<Location> a(int i, CancellationToken cancellationToken);

    Task<Location> b();
}
