package defpackage;

import androidx.media3.session.r;
import androidx.media3.session.t;
import com.facebook.react.animated.NativeAnimatedModule;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk9 implements t.g, h0g {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sk9(Object obj, long j) {
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.h0g
    public void b(haa haaVar) {
        NativeAnimatedModule.willDispatchViewUpdates$lambda$4((NativeAnimatedModule) this.b, this.a, haaVar);
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.b).g.t.j0(this.a);
    }
}
