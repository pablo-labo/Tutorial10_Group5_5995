package defpackage;

import androidx.media3.session.g;
import androidx.media3.session.k;
import com.facebook.react.runtime.ReactHostImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kh9 implements k.c, zya {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.zya
    public void a(boolean z) {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.a;
        hzh hzhVar = (hzh) this.b;
        AtomicInteger atomicInteger = ReactHostImpl.A;
        reactHostImpl.t("isMetroRunning()", "Async result = " + z);
        hzhVar.v(Boolean.valueOf(z));
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        gVar.j1(((k) this.a).c, i, ((dqf) this.b).c());
    }
}
