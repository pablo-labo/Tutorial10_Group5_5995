package defpackage;

import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class tm3 implements k24 {
    public final vlc a;
    public TextView b;
    public PopupWindow c;

    public tm3(vlc vlcVar) {
        this.a = vlcVar;
    }

    @Override // defpackage.k24
    public final void c() {
        UiThreadUtil.runOnUiThread(new sm3(this, 0));
    }

    @Override // defpackage.k24
    public final void d(String str) {
        str.getClass();
        UiThreadUtil.runOnUiThread(new yi0(3, this, str));
    }
}
