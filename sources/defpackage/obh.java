package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.iz8;

/* JADX INFO: loaded from: classes2.dex */
public final class obh extends sah {
    public final iz8.a c;

    public obh(iz8.a aVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.c = aVar;
    }

    @Override // defpackage.vbh
    public final /* bridge */ /* synthetic */ void d(j9h j9hVar, boolean z) {
    }

    @Override // defpackage.eah
    public final boolean f(y9h y9hVar) {
        if (((nah) y9hVar.f.get(this.c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.eah
    public final Feature[] g(y9h y9hVar) {
        if (((nah) y9hVar.f.get(this.c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // defpackage.sah
    public final void h(y9h y9hVar) {
        if (((nah) y9hVar.f.remove(this.c)) != null) {
            throw null;
        }
        this.b.trySetResult(Boolean.FALSE);
    }
}
