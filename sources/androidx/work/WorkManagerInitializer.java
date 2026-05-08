package androidx.work;

import android.content.Context;
import androidx.work.a;
import defpackage.nd7;
import defpackage.v2h;
import defpackage.w2h;
import defpackage.z39;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements nd7<v2h> {
    public static final String a = z39.f("WrkMgrInitializer");

    @Override // defpackage.nd7
    public final v2h create(Context context) {
        z39.d().a(a, "Initializing WorkManager with default configuration.");
        w2h.b(context, new a(new a.C0077a()));
        return w2h.a(context);
    }

    @Override // defpackage.nd7
    public final List<Class<? extends nd7<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
