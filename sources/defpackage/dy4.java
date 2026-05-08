package defpackage;

import android.util.Log;
import android.view.MotionEvent;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.cpf;
import expo.modules.video.VideoView;

/* JADX INFO: loaded from: classes3.dex */
public final class dy4 {
    public static final void a(EventDispatcher eventDispatcher, VideoView videoView, MotionEvent motionEvent, dpf dpfVar) {
        eventDispatcher.getClass();
        dpfVar.getClass();
        if (motionEvent == null) {
            return;
        }
        try {
            pgb<cpf> pgbVar = cpf.f;
            int iH = dmc.h(videoView);
            int id = videoView.getId();
            int actionMasked = motionEvent.getActionMasked();
            eventDispatcher.a(cpf.a.a(iH, id, actionMasked != 0 ? actionMasked != 1 ? actionMasked != 2 ? epf.CANCEL : epf.MOVE : epf.END : epf.START, motionEvent, motionEvent.getEventTime(), motionEvent.getX(), motionEvent.getY(), dpfVar));
        } catch (RuntimeException e) {
            Log.e("EventDispatcherUtils", "Error dispatching touch event", e);
        }
    }
}
