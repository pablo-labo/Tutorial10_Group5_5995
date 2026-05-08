package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzae;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class p4i {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final long f;
    public final zzae g;
    public final boolean h;
    public final Long i;

    @VisibleForTesting
    public p4i(Context context, zzae zzaeVar, Long l) {
        this.h = true;
        fib.i(context);
        Context applicationContext = context.getApplicationContext();
        fib.i(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (zzaeVar != null) {
            this.g = zzaeVar;
            this.b = zzaeVar.f;
            this.c = zzaeVar.e;
            this.d = zzaeVar.d;
            this.h = zzaeVar.c;
            this.f = zzaeVar.b;
            Bundle bundle = zzaeVar.V;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
