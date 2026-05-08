package defpackage;

import android.app.Notification;
import android.os.Bundle;
import androidx.media3.session.r;

/* JADX INFO: loaded from: classes.dex */
public final class vm9 extends rla {
    public final r b;
    public int[] c;

    public vm9(r rVar) {
        this.b = rVar;
    }

    @Override // defpackage.rla
    public final void a(sla slaVar) {
        Notification.Builder builder = slaVar.b;
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        r rVar = this.b;
        Notification.MediaStyle mediaSession = mediaStyle.setMediaSession(rVar.a.f());
        int[] iArr = this.c;
        if (iArr != null) {
            mediaSession.setShowActionsInCompactView(iArr);
        }
        builder.setStyle(mediaSession);
        Bundle bundle = new Bundle();
        bundle.putBundle("androidx.media3.session", rVar.a.j.a());
        builder.addExtras(bundle);
    }
}
