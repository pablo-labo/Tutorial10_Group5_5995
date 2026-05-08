package defpackage;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.j42;

/* JADX INFO: loaded from: classes2.dex */
public final class a50 implements j42 {
    public static final a50 a = new a50();

    public static final class a implements j42.a {
        public final Choreographer a;

        public a() {
            Choreographer choreographer = Choreographer.getInstance();
            choreographer.getClass();
            this.a = choreographer;
        }

        @Override // j42.a
        public final void a(ujc ujcVar) {
            ujcVar.getClass();
            this.a.removeFrameCallback(ujcVar);
        }

        @Override // j42.a
        public final void b(ujc ujcVar) {
            ujcVar.getClass();
            this.a.postFrameCallback(ujcVar);
        }
    }

    @Override // defpackage.j42
    public final a a() {
        UiThreadUtil.assertOnUiThread();
        return new a();
    }
}
