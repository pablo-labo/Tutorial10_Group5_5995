package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.session.j;
import androidx.media3.session.l;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.b;
import androidx.media3.session.v;
import defpackage.dq2;
import defpackage.gu8;
import defpackage.ht0;
import defpackage.ka2;
import defpackage.ky0;
import defpackage.l5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {
    public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    public final e a;

    @SuppressLint({"RestrictedApi"})
    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i, Bundle bundle) {
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.c(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            throw null;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.c(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) gu8.a(parcelable, MediaItem.CREATOR));
            }
            throw null;
        }
    }

    public static class a extends Handler {
        public final WeakReference<f> a;
        public WeakReference<Messenger> b;

        public a(c cVar) {
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference == null) {
                return;
            }
            Messenger messenger = weakReference.get();
            f fVar = this.a.get();
            if (messenger == null || fVar == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            try {
                if (message.what != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                    return;
                }
                Bundle bundle = data.getBundle("data_options");
                MediaSessionCompat.a(bundle);
                MediaSessionCompat.a(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                Parcelable.Creator<MediaItem> creator = MediaItem.CREATOR;
                if (parcelableArrayList != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        arrayList.add(gu8.a((Parcelable) parcelableArrayList.get(i), creator));
                    }
                }
                fVar.a(messenger, string, bundle);
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            }
        }
    }

    public static class b {
        public final a a = new a();
        public c b;

        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnected() {
                b bVar = b.this;
                c cVar = bVar.b;
                if (cVar != null) {
                    a aVar = cVar.d;
                    MediaBrowser mediaBrowser = cVar.b;
                    try {
                        Bundle extras = mediaBrowser.getExtras();
                        if (extras != null) {
                            extras.getInt("extra_service_version", 0);
                            IBinder binder = extras.getBinder("extra_messenger");
                            if (binder != null) {
                                g gVar = new g(binder, cVar.c);
                                cVar.f = gVar;
                                Messenger messenger = new Messenger(aVar);
                                cVar.g = messenger;
                                aVar.getClass();
                                aVar.b = new WeakReference<>(messenger);
                                try {
                                    Context context = cVar.a;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data_package_name", context.getPackageName());
                                    bundle.putInt("data_calling_pid", Process.myPid());
                                    bundle.putBundle("data_root_hints", gVar.b);
                                    Message messageObtain = Message.obtain();
                                    messageObtain.what = 6;
                                    messageObtain.arg1 = 1;
                                    messageObtain.setData(bundle);
                                    messageObtain.replyTo = messenger;
                                    gVar.a.send(messageObtain);
                                } catch (RemoteException unused) {
                                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            }
                            androidx.media3.session.legacy.b bVarC = b.a.c(extras.getBinder("extra_session_binder"));
                            if (bVarC != null) {
                                cVar.h = new MediaSessionCompat.Token(mediaBrowser.getSessionToken(), bVarC, null);
                            }
                        }
                    } catch (IllegalStateException e) {
                        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
                    }
                }
                l lVar = l.this;
                MediaBrowserCompat mediaBrowserCompat = lVar.j;
                if (mediaBrowserCompat != null) {
                    e eVar = mediaBrowserCompat.a;
                    if (eVar.h == null) {
                        eVar.h = new MediaSessionCompat.Token(eVar.b.getSessionToken(), null, null);
                    }
                    MediaSessionCompat.Token token = eVar.h;
                    j jVar = lVar.b;
                    int i = 3;
                    jVar.U0(new ky0(i, lVar, token));
                    jVar.e.postDelayed(new dq2(lVar, i), 500L);
                }
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionFailed() {
                l.this.b.T0();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionSuspended() {
                b bVar = b.this;
                c cVar = bVar.b;
                if (cVar != null) {
                    cVar.f = null;
                    cVar.g = null;
                    cVar.h = null;
                    a aVar = cVar.d;
                    aVar.getClass();
                    aVar.b = new WeakReference<>(null);
                }
                l.this.b.T0();
            }
        }
    }

    public static class c implements f {
        public final Context a;
        public final MediaBrowser b;
        public final Bundle c;
        public final a d = new a(this);
        public final ht0<String, h> e = new ht0<>();
        public g f;
        public Messenger g;
        public MediaSessionCompat.Token h;

        public c(Context context, ComponentName componentName, l.a aVar, Bundle bundle) {
            this.a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            aVar.b = this;
            b.a aVar2 = aVar.a;
            aVar2.getClass();
            this.b = new MediaBrowser(context, componentName, aVar2, bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.f
        public final void a(Messenger messenger, String str, Bundle bundle) {
            if (this.g != messenger) {
                return;
            }
            h hVar = str == null ? null : this.e.get(str);
            if (hVar == null) {
                if (MediaBrowserCompat.b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            ArrayList arrayList = hVar.b;
            for (int i = 0; i < arrayList.size(); i++) {
                if (ka2.h((Bundle) arrayList.get(i), bundle)) {
                    return;
                }
            }
        }
    }

    public static class d extends c {
    }

    public static class e extends d {
    }

    public interface f {
        void a(Messenger messenger, String str, Bundle bundle);
    }

    public static class g {
        public final Messenger a;
        public final Bundle b;

        public g(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.b = bundle;
        }
    }

    public static class h {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    public static abstract class i {

        public class a extends MediaBrowser.SubscriptionCallback {
            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                MediaItem.a(list);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(String str) {
            }
        }

        public class b extends a {
            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                MediaItem.a(list);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
            }
        }

        public i() {
            new Binder();
            new b();
        }
    }

    public MediaBrowserCompat(v vVar, ComponentName componentName, l.a aVar, Bundle bundle) {
        this.a = new e(vVar, componentName, aVar, bundle);
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        public final int a;
        public final MediaDescriptionCompat b;

        public class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (TextUtils.isEmpty(mediaDescriptionCompat.a)) {
                l5.q("description must have a non-empty media id");
                throw null;
            }
            this.a = i;
            this.b = mediaDescriptionCompat;
        }

        public static void a(List list) {
            MediaItem mediaItem;
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) it.next();
                if (mediaItem2 == null) {
                    mediaItem = null;
                } else {
                    mediaItem = new MediaItem(MediaDescriptionCompat.a(mediaItem2.getDescription()), mediaItem2.getFlags());
                }
                if (mediaItem != null) {
                    arrayList.add(mediaItem);
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            this.b.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
