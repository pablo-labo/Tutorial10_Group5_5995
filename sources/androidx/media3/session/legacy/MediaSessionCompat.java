package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.b;
import androidx.media3.session.legacy.h;
import androidx.versionedparcelable.ParcelImpl;
import defpackage.dk9;
import defpackage.gng;
import defpackage.gu8;
import defpackage.l5;
import defpackage.r6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat {
    public final e a;
    public final MediaControllerCompat b;

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public ResultReceiver a;

        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                ResultReceiverWrapper resultReceiverWrapper = new ResultReceiverWrapper();
                resultReceiverWrapper.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return resultReceiverWrapper;
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        public final Object a = new Object();
        public final MediaSession.Token b;
        public androidx.media3.session.legacy.b c;
        public gng d;

        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new Token(token, null, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(MediaSession.Token token, androidx.media3.session.legacy.b bVar, gng gngVar) {
            this.b = token;
            this.c = bVar;
            this.d = gngVar;
        }

        public final androidx.media3.session.legacy.b a() {
            androidx.media3.session.legacy.b bVar;
            synchronized (this.a) {
                bVar = this.c;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Token) {
                return this.b.equals(((Token) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    public class a extends b {
    }

    public static abstract class b {
        public boolean c;
        public a e;
        public final Object a = new Object();
        public final C0062b b = new C0062b();
        public WeakReference<c> d = new WeakReference<>(null);

        public class a extends Handler {
            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.a) {
                        cVar = b.this.d.get();
                        bVar = b.this;
                        aVar = bVar.e;
                    }
                    if (cVar == null || bVar != cVar.c() || aVar == null) {
                        return;
                    }
                    cVar.a((h.b) message.obj);
                    b.this.a(cVar, aVar);
                    cVar.a(null);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media3.session.legacy.MediaSessionCompat$b$b, reason: collision with other inner class name */
        public class C0062b extends MediaSession.Callback {
            public C0062b() {
            }

            public static void b(d dVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                MediaSession mediaSession = dVar.a;
                String str = null;
                try {
                    str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
                } catch (Exception e) {
                    Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                }
                if (TextUtils.isEmpty(str)) {
                    str = "android.media.session.MediaController";
                }
                dVar.a(new h.b(str, -1, -1));
            }

            public final d a() {
                d dVar;
                synchronized (b.this.a) {
                    dVar = (d) b.this.d.get();
                }
                if (dVar == null || b.this != dVar.c()) {
                    return null;
                }
                return dVar;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                gng gngVar;
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(dVarA);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        if (resultReceiver != null) {
                            Bundle bundle2 = new Bundle();
                            Token token = dVarA.c;
                            androidx.media3.session.legacy.b bVarA = token.a();
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", bVarA == null ? null : bVarA.asBinder());
                            synchronized (token.a) {
                                gngVar = token.d;
                            }
                            if (gngVar != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putParcelable("a", new ParcelImpl(gngVar));
                                bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                            }
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        if (bundle != null) {
                            b.this.b((MediaDescriptionCompat) gu8.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), MediaDescriptionCompat.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        if (bundle != null) {
                            b.this.c((MediaDescriptionCompat) gu8.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), MediaDescriptionCompat.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        if (bundle != null) {
                            b.this.q((MediaDescriptionCompat) gu8.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), MediaDescriptionCompat.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        List<QueueItem> list = dVarA.h;
                        if (list != null && bundle != null) {
                            int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            QueueItem queueItem = (i < 0 || i >= list.size()) ? null : list.get(i);
                            if (queueItem != null) {
                                b.this.q(queueItem.a);
                            }
                        }
                    } else {
                        b.this.d(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCustomAction(String str, Bundle bundle) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(dVarA);
                try {
                    boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
                    b bVar = b.this;
                    if (zEquals) {
                        if (bundle != null) {
                            Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle2);
                            bVar.l(uri, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        bVar.m();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        if (bundle != null) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle3);
                            bVar.n(string, bundle3);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        if (bundle != null) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle4);
                            bVar.o(string2, bundle4);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        if (bundle != null) {
                            Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle5);
                            bVar.p(uri2, bundle5);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        if (bundle != null) {
                            bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        if (bundle != null) {
                            bVar.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        if (bundle != null) {
                            bVar.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        if (bundle != null) {
                            RatingCompat ratingCompat = (RatingCompat) gu8.a(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), RatingCompat.CREATOR);
                            MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            bVar.v(ratingCompat);
                        }
                    } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bVar.e(str, bundle);
                    } else if (bundle != null) {
                        bVar.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onFastForward() {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.f();
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final boolean onMediaButtonEvent(Intent intent) {
                d dVarA = a();
                if (dVarA == null) {
                    return false;
                }
                b(dVarA);
                boolean zG = b.this.g(intent);
                dVarA.a(null);
                return zG || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPause() {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.h();
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlay() {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.i();
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromMediaId(String str, Bundle bundle) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(dVarA);
                b.this.j(str, bundle);
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromSearch(String str, Bundle bundle) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(dVarA);
                b.this.k(str, bundle);
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromUri(Uri uri, Bundle bundle) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(dVarA);
                b.this.l(uri, bundle);
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepare() {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.m();
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromMediaId(String str, Bundle bundle) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(dVarA);
                b.this.n(str, bundle);
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromSearch(String str, Bundle bundle) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(dVarA);
                b.this.o(str, bundle);
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromUri(Uri uri, Bundle bundle) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(dVarA);
                b.this.p(uri, bundle);
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onRewind() {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.r();
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSeekTo(long j) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.s(j);
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetPlaybackSpeed(float f) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.t(f);
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetRating(Rating rating) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.u(RatingCompat.a(rating));
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToNext() {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.y();
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToPrevious() {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.z();
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToQueueItem(long j) {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.A(j);
                dVarA.a(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onStop() {
                d dVarA = a();
                if (dVarA == null) {
                    return;
                }
                b(dVarA);
                b.this.B();
                dVarA.a(null);
            }
        }

        public void A(long j) {
        }

        public void B() {
        }

        public final void a(c cVar, Handler handler) {
            if (this.c) {
                this.c = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackStateCompatB = cVar.b();
                long j = playbackStateCompatB == null ? 0L : playbackStateCompatB.e;
                boolean z = playbackStateCompatB != null && playbackStateCompatB.a == 3;
                boolean z2 = (516 & j) != 0;
                boolean z3 = (j & 514) != 0;
                if (z && z3) {
                    h();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT < 27) {
                synchronized (this.a) {
                    cVar = this.d.get();
                    aVar = this.e;
                }
                if (cVar != null && aVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                    h.b bVarD = cVar.d();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79 && keyCode != 85) {
                        a(cVar, aVar);
                        return false;
                    }
                    if (keyEvent.getRepeatCount() != 0) {
                        a(cVar, aVar);
                        return true;
                    }
                    if (!this.c) {
                        this.c = true;
                        aVar.sendMessageDelayed(aVar.obtainMessage(1, bVarD), ViewConfiguration.getDoubleTapTimeout());
                        return true;
                    }
                    aVar.removeMessages(1);
                    this.c = false;
                    PlaybackStateCompat playbackStateCompatB = cVar.b();
                    if (((playbackStateCompatB == null ? 0L : playbackStateCompatB.e) & 32) != 0) {
                        y();
                    }
                    return true;
                }
            }
            return false;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j) {
        }

        public void t(float f) {
        }

        public void u(RatingCompat ratingCompat) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(int i) {
        }

        public void x(int i) {
        }

        public void y() {
        }

        public void z() {
        }
    }

    public interface c {
        void a(h.b bVar);

        PlaybackStateCompat b();

        b c();

        h.b d();
    }

    public static class d implements c {
        public final MediaSession a;
        public final a b;
        public final Token c;
        public final Bundle e;
        public PlaybackStateCompat g;
        public List<QueueItem> h;
        public MediaMetadataCompat i;
        public int j;
        public int k;
        public b l;
        public h.b m;
        public final Object d = new Object();
        public final RemoteCallbackList<androidx.media3.session.legacy.a> f = new RemoteCallbackList<>();

        public static class a extends b.a {
            public final WeakReference<d> b;

            public a(e eVar) {
                attachInterface(this, "android.support.v4.media.session.IMediaSession");
                this.b = new WeakReference<>(eVar);
            }

            @Override // androidx.media3.session.legacy.b
            public final void L0(androidx.media3.session.legacy.a aVar) {
                d dVar = this.b.get();
                if (dVar == null || aVar == null) {
                    return;
                }
                dVar.f.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (dVar.d) {
                }
            }

            @Override // androidx.media3.session.legacy.b
            public final int M() {
                d dVar = this.b.get();
                if (dVar != null) {
                    return dVar.k;
                }
                return -1;
            }

            @Override // androidx.media3.session.legacy.b
            public final boolean O() {
                this.b.get();
                return false;
            }

            @Override // androidx.media3.session.legacy.b
            public final PlaybackStateCompat b() {
                d dVar = this.b.get();
                if (dVar == null) {
                    return null;
                }
                PlaybackStateCompat playbackStateCompat = dVar.g;
                MediaMetadataCompat mediaMetadataCompat = dVar.i;
                if (playbackStateCompat != null) {
                    float f = playbackStateCompat.d;
                    long j = playbackStateCompat.W;
                    int i = playbackStateCompat.a;
                    long j2 = playbackStateCompat.b;
                    long jA = -1;
                    if (j2 != -1 && ((i == 3 || i == 4 || i == 5) && j > 0)) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j3 = ((long) (f * (jElapsedRealtime - j))) + j2;
                        if (mediaMetadataCompat != null && mediaMetadataCompat.a.containsKey("android.media.metadata.DURATION")) {
                            jA = mediaMetadataCompat.a("android.media.metadata.DURATION");
                        }
                        long j4 = (jA < 0 || j3 <= jA) ? j3 < 0 ? 0L : j3 : jA;
                        ArrayList arrayList = new ArrayList();
                        long j5 = playbackStateCompat.c;
                        long j6 = playbackStateCompat.e;
                        int i2 = playbackStateCompat.f;
                        CharSequence charSequence = playbackStateCompat.V;
                        List<PlaybackStateCompat.CustomAction> list = playbackStateCompat.X;
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        return new PlaybackStateCompat(playbackStateCompat.a, j4, j5, playbackStateCompat.d, j6, i2, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.Y, playbackStateCompat.Z);
                    }
                }
                return playbackStateCompat;
            }

            @Override // androidx.media3.session.legacy.b
            public final int i() {
                d dVar = this.b.get();
                if (dVar != null) {
                    return dVar.j;
                }
                return -1;
            }

            @Override // androidx.media3.session.legacy.b
            public final void i1(androidx.media3.session.legacy.a aVar) {
                d dVar = this.b.get();
                if (dVar == null || aVar == null) {
                    return;
                }
                dVar.f.register(aVar, new h.b("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (dVar.d) {
                }
            }
        }

        public d(Context context, String str, Bundle bundle) {
            MediaSession mediaSessionE = e(context, str, bundle);
            this.a = mediaSessionE;
            a aVar = new a((e) this);
            this.b = aVar;
            this.c = new Token(mediaSessionE.getSessionToken(), aVar, null);
            this.e = bundle;
            mediaSessionE.setFlags(3);
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.c
        public void a(h.b bVar) {
            synchronized (this.d) {
                this.m = bVar;
            }
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.c
        public final PlaybackStateCompat b() {
            return this.g;
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.c
        public final b c() {
            b bVar;
            synchronized (this.d) {
                bVar = this.l;
            }
            return bVar;
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.c
        public h.b d() {
            h.b bVar;
            synchronized (this.d) {
                bVar = this.m;
            }
            return bVar;
        }

        public MediaSession e(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        public final void f(PendingIntent pendingIntent) {
            this.a.setMediaButtonReceiver(pendingIntent);
        }
    }

    public static class e extends d {
    }

    public static class f extends e {
        @Override // androidx.media3.session.legacy.MediaSessionCompat.d, androidx.media3.session.legacy.MediaSessionCompat.c
        public final void a(h.b bVar) {
        }

        @Override // androidx.media3.session.legacy.MediaSessionCompat.d, androidx.media3.session.legacy.MediaSessionCompat.c
        public final h.b d() {
            return new h.b(this.a.getCurrentControllerInfo());
        }
    }

    public static class g extends f {
        @Override // androidx.media3.session.legacy.MediaSessionCompat.d
        public final MediaSession e(Context context, String str, Bundle bundle) {
            return dk9.a(context, str, bundle);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            l5.q("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i = androidx.media3.session.legacy.g.a;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                if (listQueryBroadcastReceivers.size() > 1) {
                    Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = null;
            }
            if (componentName == null) {
                Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.a = new g(context, str, bundle);
        } else if (i2 >= 28) {
            this.a = new f(context, str, bundle);
        } else {
            this.a = new e(context, str, bundle);
        }
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        a aVar = new a();
        e eVar = this.a;
        synchronized (eVar.d) {
            eVar.l = aVar;
            eVar.a.setCallback(aVar.b, handler);
            synchronized (aVar.a) {
                try {
                    aVar.d = new WeakReference<>(eVar);
                    b.a aVar2 = aVar.e;
                    if (aVar2 != null) {
                        aVar2.removeCallbacksAndMessages(null);
                    }
                    aVar.e = new b.a(handler.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a.f(pendingIntent);
        this.b = new MediaControllerCompat(context, this.a.c);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = MediaSessionCompat.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static Bundle c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public final void b(PlaybackStateCompat playbackStateCompat) {
        RemoteCallbackList<androidx.media3.session.legacy.a> remoteCallbackList;
        e eVar = this.a;
        eVar.g = playbackStateCompat;
        synchronized (eVar.d) {
            int iBeginBroadcast = eVar.f.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = eVar.f;
                if (iBeginBroadcast < 0) {
                    break;
                }
                try {
                    ((androidx.media3.session.legacy.a) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).Q(playbackStateCompat);
                } catch (RemoteException | SecurityException e2) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e2);
                }
                iBeginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = eVar.a;
        if (playbackStateCompat.a0 == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.W);
            builder.setBufferedPosition(playbackStateCompat.c);
            builder.setActions(playbackStateCompat.e);
            builder.setErrorMessage(playbackStateCompat.V);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.X) {
                PlaybackState.CustomAction customActionBuild = customAction.e;
                if (customActionBuild == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(customAction.a, customAction.b, customAction.c);
                    builder2.setExtras(customAction.d);
                    customActionBuild = builder2.build();
                }
                if (customActionBuild != null) {
                    builder.addCustomAction(customActionBuild);
                }
            }
            builder.setActiveQueueItemId(playbackStateCompat.Y);
            builder.setExtras(playbackStateCompat.Z);
            playbackStateCompat.a0 = builder.build();
        }
        mediaSession.setPlaybackState(playbackStateCompat.a0);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public final MediaDescriptionCompat a;
        public final long b;
        public MediaSession.QueueItem c;

        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (j == -1) {
                l5.q("Id cannot be QueueItem.UNKNOWN_ID");
                throw null;
            }
            this.a = mediaDescriptionCompat;
            this.b = j;
            this.c = queueItem;
        }

        public static ArrayList a(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
                arrayList.add(new QueueItem(queueItem, MediaDescriptionCompat.a(queueItem.getDescription()), queueItem.getQueueId()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
            sb.append(this.a);
            sb.append(", Id=");
            return r6.d(this.b, " }", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
            parcel.writeLong(this.b);
        }

        public QueueItem(Parcel parcel) {
            this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.b = parcel.readLong();
        }
    }
}
