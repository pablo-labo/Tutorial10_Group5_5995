package androidx.media3.session.legacy;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.a;
import androidx.media3.session.legacy.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.a4b;
import defpackage.b0;
import defpackage.gng;
import defpackage.gu8;
import defpackage.ht0;
import defpackage.l5;
import defpackage.px0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {
    public final MediaControllerImplApi21 a;
    public final Set<a> b = Collections.synchronizedSet(new HashSet());

    public static class MediaControllerImplApi21 {
        public final MediaController a;
        public final Object b = new Object();
        public final ArrayList c = new ArrayList();
        public final HashMap<a, a> d = new HashMap<>();
        public final MediaSessionCompat.Token e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public final WeakReference<MediaControllerImplApi21> a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.a = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.b) {
                    MediaSessionCompat.Token token = mediaControllerImplApi21.e;
                    androidx.media3.session.legacy.b bVarC = b.a.c(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
                    synchronized (token.a) {
                        token.c = bVarC;
                    }
                    MediaSessionCompat.Token token2 = mediaControllerImplApi21.e;
                    gng gngVarA = a4b.a(bundle);
                    synchronized (token2.a) {
                        token2.d = gngVarA;
                    }
                    mediaControllerImplApi21.a();
                }
            }
        }

        public static class a extends a.c {
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.e = token;
            MediaController mediaController = new MediaController(context, token.b);
            this.a = mediaController;
            if (token.a() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        public final void a() {
            androidx.media3.session.legacy.b bVarA = this.e.a();
            if (bVarA == null) {
                return;
            }
            ArrayList<a> arrayList = this.c;
            for (a aVar : arrayList) {
                a aVar2 = new a(aVar);
                this.d.put(aVar, aVar2);
                aVar.c = aVar2;
                try {
                    bVarA.i1(aVar2);
                    aVar.m(13, null, null);
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            arrayList.clear();
        }

        public final void b(a aVar) {
            MediaController mediaController = this.a;
            a.C0061a c0061a = aVar.a;
            c0061a.getClass();
            mediaController.unregisterCallback(c0061a);
            synchronized (this.b) {
                androidx.media3.session.legacy.b bVarA = this.e.a();
                if (bVarA != null) {
                    try {
                        a aVarRemove = this.d.remove(aVar);
                        if (aVarRemove != null) {
                            aVar.c = null;
                            bVarA.L0(aVarRemove);
                        }
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.c.remove(aVar);
                }
            }
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {
        public final C0061a a = new C0061a(this);
        public b b;
        public MediaControllerImplApi21.a c;

        /* JADX INFO: renamed from: androidx.media3.session.legacy.MediaControllerCompat$a$a, reason: collision with other inner class name */
        public static class C0061a extends MediaController.Callback {
            public final WeakReference<a> a;

            public C0061a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = this.a.get();
                if (aVar == null || playbackInfo == null) {
                    return;
                }
                int playbackType = playbackInfo.getPlaybackType();
                AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
                px0.b bVar = new px0.b();
                bVar.a = audioAttributes;
                aVar.a(new c(playbackType, new px0(bVar), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }

            @Override // android.media.session.MediaController.Callback
            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.c(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
                a aVar = this.a.get();
                if (aVar != null) {
                    ht0<String, Integer> ht0Var = MediaMetadataCompat.c;
                    if (mediaMetadata != null) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaMetadata.writeToParcel(parcelObtain, 0);
                        parcelObtain.setDataPosition(0);
                        mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        mediaMetadataCompatCreateFromParcel.b = mediaMetadata;
                    } else {
                        mediaMetadataCompatCreateFromParcel = null;
                    }
                    aVar.d(mediaMetadataCompatCreateFromParcel);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.a.get();
                if (aVar == null || aVar.c != null) {
                    return;
                }
                aVar.e(PlaybackStateCompat.a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.f(MediaSessionCompat.QueueItem.a(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.g(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionDestroyed() {
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.i();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = this.a.get();
                if (aVar != null) {
                    aVar.j(str, bundle);
                }
            }
        }

        public class b extends Handler {
            public boolean a;

            public b(Looper looper) {
                super(looper);
                this.a = false;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (this.a) {
                    int i = message.what;
                    a aVar = a.this;
                    switch (i) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.a(data);
                            aVar.j((String) message.obj, data);
                            break;
                        case 2:
                            aVar.e((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            aVar.d((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            aVar.a((c) message.obj);
                            break;
                        case 5:
                            aVar.f((List) message.obj);
                            break;
                        case 6:
                            aVar.g((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.a(bundle);
                            aVar.c(bundle);
                            break;
                        case 8:
                            aVar.i();
                            break;
                        case DatadogLogGenerator.CRASH /* 9 */:
                            aVar.h(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            aVar.b(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            aVar.l(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            aVar.k();
                            break;
                    }
                }
            }
        }

        public static class c extends a.AbstractBinderC0063a {
            public final WeakReference<a> b;

            public c(a aVar) {
                attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
                this.b = new WeakReference<>(aVar);
            }

            @Override // androidx.media3.session.legacy.a
            public final void Q(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.b.get();
                if (aVar != null) {
                    aVar.m(2, playbackStateCompat, null);
                }
            }

            @Override // androidx.media3.session.legacy.a
            public final void R(int i) {
                a aVar = this.b.get();
                if (aVar != null) {
                    aVar.m(12, Integer.valueOf(i), null);
                }
            }

            @Override // androidx.media3.session.legacy.a
            public final void m(int i) {
                a aVar = this.b.get();
                if (aVar != null) {
                    aVar.m(9, Integer.valueOf(i), null);
                }
            }
        }

        public void a(c cVar) {
        }

        public void b(boolean z) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            m(8, null, null);
        }

        public void c(Bundle bundle) {
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void e(PlaybackStateCompat playbackStateCompat) {
        }

        public void f(List<MediaSessionCompat.QueueItem> list) {
        }

        public void g(CharSequence charSequence) {
        }

        public void h(int i) {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k() {
        }

        public void l(int i) {
        }

        public final void m(int i, Object obj, Bundle bundle) {
            b bVar = this.b;
            if (bVar != null) {
                Message messageObtainMessage = bVar.obtainMessage(i, obj);
                if (bundle != null) {
                    messageObtainMessage.setData(bundle);
                }
                messageObtainMessage.sendToTarget();
            }
        }

        public final void n(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.b = bVar;
                bVar.a = true;
            } else {
                b bVar2 = this.b;
                if (bVar2 != null) {
                    bVar2.a = false;
                    bVar2.removeCallbacksAndMessages(null);
                    this.b = null;
                }
            }
        }
    }

    public static class b extends MediaControllerImplApi21 {
    }

    public static final class c {
        public final int a;
        public final px0 b;
        public final int c;
        public final int d;
        public final int e;

        public c(int i, px0 px0Var, int i2, int i3, int i4) {
            this.a = i;
            this.b = px0Var;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static abstract class d {
    }

    public static class e extends d {
        public final MediaController.TransportControls a;

        public e(MediaController.TransportControls transportControls) {
            this.a = transportControls;
        }

        public final void a(String str, Bundle bundle) {
            if (str != null && ((str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
                l5.q(l5.m("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
            } else {
                this.a.sendCustomAction(str, bundle);
            }
        }

        public void b(float f) {
            if (f == 0.0f) {
                l5.q("speed must not be zero");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
            a("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
        }
    }

    public static class f extends e {
    }

    public static class g extends f {
    }

    public static class h extends g {
        @Override // androidx.media3.session.legacy.MediaControllerCompat.e
        public final void b(float f) {
            if (f != 0.0f) {
                this.a.setPlaybackSpeed(f);
            } else {
                l5.q("speed must not be zero");
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new b(context, token);
        } else {
            this.a = new MediaControllerImplApi21(context, token);
        }
    }

    public final void a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        MediaControllerImplApi21 mediaControllerImplApi21 = this.a;
        if ((mediaControllerImplApi21.a.getFlags() & 4) == 0) {
            b0.u("This session doesn't support queue management operations");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", gu8.a(mediaDescriptionCompat, android.support.v4.media.MediaDescriptionCompat.CREATOR));
        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
        mediaControllerImplApi21.a.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
    }

    public final c b() {
        MediaController.PlaybackInfo playbackInfo = this.a.a.getPlaybackInfo();
        if (playbackInfo == null) {
            return null;
        }
        int playbackType = playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        px0.b bVar = new px0.b();
        bVar.a = audioAttributes;
        return new c(playbackType, new px0(bVar), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
    }

    public final PlaybackStateCompat c() {
        MediaControllerImplApi21 mediaControllerImplApi21 = this.a;
        androidx.media3.session.legacy.b bVarA = mediaControllerImplApi21.e.a();
        if (bVarA != null) {
            try {
                return bVarA.b();
            } catch (RemoteException | SecurityException e2) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e2);
            }
        }
        PlaybackState playbackState = mediaControllerImplApi21.a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.a(playbackState);
        }
        return null;
    }

    public final g d() {
        MediaController.TransportControls transportControls = this.a.a.getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new h(transportControls) : new g(transportControls);
    }

    public final void e(MediaDescriptionCompat mediaDescriptionCompat) {
        MediaControllerImplApi21 mediaControllerImplApi21 = this.a;
        if ((mediaControllerImplApi21.a.getFlags() & 4) == 0) {
            b0.u("This session doesn't support queue management operations");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", gu8.a(mediaDescriptionCompat, android.support.v4.media.MediaDescriptionCompat.CREATOR));
        mediaControllerImplApi21.a.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
    }
}
