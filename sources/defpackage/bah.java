package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import defpackage.g91;
import defpackage.vf0;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bah implements g91.c {
    public final vf0.f a;
    public final vg0 b;
    public b c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ qa6 f;

    public bah(qa6 qa6Var, vf0.f fVar, vg0 vg0Var) {
        this.f = qa6Var;
        this.a = fVar;
        this.b = vg0Var;
    }

    @Override // g91.c
    public final void a(ConnectionResult connectionResult) {
        this.f.c0.post(new aah(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        y9h y9hVar = (y9h) this.f.Y.get(this.b);
        if (y9hVar != null) {
            y9hVar.q(connectionResult);
        }
    }
}
