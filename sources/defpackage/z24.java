package defpackage;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.DebugServerException;
import com.indeed.android.jobsearch.R;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import com.oney.WebRTCModule.e;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z24 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z24(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                DebugServerException debugServerException = (DebugServerException) this.b;
                ((i34) this.c).I(debugServerException, debugServerException.getMessage());
                return;
            case 1:
                ((hy4) ((Map.Entry) this.b).getKey()).a((px4) this.c);
                return;
            case 2:
                e.a aVar = (e.a) this.b;
                Activity activity = (Activity) this.c;
                int i = bk9.a;
                if (zvg.a().a) {
                    if (activity == null) {
                        Log.d("ak9", " Cannot create notification channel: no current context");
                    } else {
                        NotificationManager notificationManager = (NotificationManager) activity.getSystemService("notification");
                        if (notificationManager.getNotificationChannel("OngoingConferenceChannel") == null) {
                            NotificationChannel notificationChannel = new NotificationChannel("OngoingConferenceChannel", activity.getString(R.string.ongoing_notification_channel_name), 3);
                            notificationChannel.enableLights(false);
                            notificationChannel.enableVibration(false);
                            notificationChannel.setShowBadge(false);
                            notificationManager.createNotificationChannel(notificationChannel);
                        }
                    }
                    try {
                        if (activity.startForegroundService(new Intent(activity, (Class<?>) bk9.class)) == null) {
                            Log.w("bk9", "Media projection service not started");
                        } else {
                            Log.i("bk9", "Media projection service started");
                        }
                    } catch (RuntimeException e) {
                        Log.w("bk9", "Media projection service not started", e);
                    }
                }
                e eVar = e.this;
                ReactApplicationContext reactApplicationContext = eVar.b;
                Activity currentActivity = reactApplicationContext.getCurrentActivity();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) currentActivity.getApplication().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                VideoTrack videoTrackB = eVar.b(new iqd(reactApplicationContext.getCurrentActivity(), displayMetrics.widthPixels, displayMetrics.heightPixels, eVar.f));
                if (videoTrackB == null) {
                    eVar.e.reject(new RuntimeException("ScreenTrack is null."));
                } else {
                    eVar.a(new MediaStreamTrack[]{videoTrackB}, new r20(eVar, 4));
                }
                eVar.f = null;
                eVar.e = null;
                return;
            case 3:
                RNJSTNavigator.openProfileResumeDataImportModal$lambda$22((RNJSTNavigator) this.b, (Promise) this.c);
                return;
            case 4:
                Callable callable = (Callable) this.b;
                final hzh hzhVar = (hzh) this.c;
                ku2 ku2Var = new ku2() { // from class: kaf
                    @Override // defpackage.ku2
                    public final Object a(maf mafVar) {
                        mafVar.getClass();
                        boolean zE = mafVar.e();
                        hzh hzhVar2 = hzhVar;
                        if (zE) {
                            hzhVar2.t();
                        } else if (mafVar.f()) {
                            hzhVar2.u(mafVar.c());
                        } else {
                            hzhVar2.v(mafVar.d());
                        }
                        return j6g.a;
                    }
                };
                try {
                    maf mafVar = (maf) callable.call();
                    synchronized (mafVar.a) {
                        try {
                            synchronized (mafVar.a) {
                                z = mafVar.b;
                            }
                            if (z) {
                                ku2Var.a(mafVar);
                            } else {
                                mafVar.f.add(ku2Var);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (CancellationException unused) {
                    hzhVar.t();
                    return;
                } catch (Exception e2) {
                    hzhVar.u(e2);
                    return;
                }
            default:
                PeerConnection peerConnection = (PeerConnection) this.b;
                Promise promise = (Promise) this.c;
                WritableMap writableMapCreateMap = Arguments.createMap();
                SessionDescription remoteDescription = peerConnection.getRemoteDescription();
                writableMapCreateMap.putString("type", remoteDescription.type.canonicalForm());
                writableMapCreateMap.putString("sdp", remoteDescription.description);
                promise.resolve(writableMapCreateMap);
                return;
        }
    }
}
