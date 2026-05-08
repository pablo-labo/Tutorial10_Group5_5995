package defpackage;

import com.facebook.react.bridge.UiThreadUtil;
import defpackage.i34;

/* JADX INFO: loaded from: classes2.dex */
public final class s24 extends ula {
    public final /* synthetic */ i34.b a;

    public s24(i34.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.ula, defpackage.d4d
    public final void a() {
        UiThreadUtil.runOnUiThread(new ly1(i34.this, 3));
    }
}
