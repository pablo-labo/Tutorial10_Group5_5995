package androidx.media3.session;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.media3.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p.a {
    public final v a;
    public int b = 0;

    public d(v vVar) {
        this.a = vVar;
    }

    public final Intent a(r rVar, int i) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(rVar.a.b);
        v vVar = this.a;
        intent.setComponent(new ComponentName(vVar, vVar.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        return intent;
    }
}
