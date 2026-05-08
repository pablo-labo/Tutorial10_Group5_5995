package androidx.media3.session.legacy;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.util.Log;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.h;
import defpackage.l5;
import defpackage.o6;
import defpackage.r6;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Service {
    public f a;
    public b b;

    public static final class a {
        public final String a;
        public final Bundle b;

        public a(String str, Bundle bundle) {
            if (str == null) {
                l5.q("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
                throw null;
            }
            this.a = str;
            this.b = bundle;
        }
    }

    public class b implements IBinder.DeathRecipient {
        public final h.b a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public b(String str, int i, int i2, k kVar) {
            new HashMap();
            this.a = new h.b(str, i, i2);
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            new a();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.session.legacy.c$c, reason: collision with other inner class name */
    public interface InterfaceC0066c {
        h.b a();
    }

    public class d implements InterfaceC0066c {
        public final ArrayList a = new ArrayList();
        public f.a b;
        public Messenger c;

        public class a extends MediaBrowserService {
            public final /* synthetic */ f a;

            public a(f fVar, Context context) {
                this.a = fVar;
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundle2;
                a aVar;
                MediaSessionCompat.a(bundle);
                f fVar = this.a;
                c cVar = c.this;
                Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
                int i2 = -1;
                if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
                    bundle2 = null;
                } else {
                    bundle3.remove("extra_client_version");
                    fVar.c = new Messenger((Handler) null);
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("extra_service_version", 2);
                    bundle4.putBinder("extra_messenger", fVar.c.getBinder());
                    fVar.a.add(bundle4);
                    i2 = bundle3.getInt("extra_calling_pid", -1);
                    bundle3.remove("extra_calling_pid");
                    bundle2 = bundle4;
                }
                cVar.b = cVar.new b(str, i2, i, null);
                a aVarB = cVar.b(str, i, bundle3);
                cVar.b = null;
                if (aVarB == null) {
                    aVar = null;
                } else {
                    if (fVar.c != null) {
                        throw null;
                    }
                    Bundle bundle5 = aVarB.b;
                    if (bundle2 == null) {
                        bundle2 = bundle5;
                    } else if (bundle5 != null) {
                        bundle2.putAll(bundle5);
                    }
                    aVar = new a(aVarB.a, bundle2);
                }
                if (aVar == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(aVar.a, aVar.b);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                androidx.media3.session.legacy.d dVar = new androidx.media3.session.legacy.d(str, new i(result));
                c cVar = c.this;
                cVar.b = null;
                cVar.c(str, dVar);
                cVar.b = null;
            }
        }

        public d() {
        }

        @Override // androidx.media3.session.legacy.c.InterfaceC0066c
        public h.b a() {
            b bVar = c.this.b;
            if (bVar != null) {
                return bVar.a;
            }
            r6.g("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
    }

    public class e extends d {

        public class a extends d.a {
            public final /* synthetic */ f b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, Context context) {
                super(fVar, context);
                this.b = fVar;
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                androidx.media3.session.legacy.e eVar = new androidx.media3.session.legacy.e(str, new i(result));
                c cVar = c.this;
                cVar.b = null;
                cVar.e(str, eVar);
                cVar.b = null;
            }
        }

        public e() {
            super();
        }
    }

    public class f extends e {

        public class a extends e.a {
            public a(Context context) {
                super(f.this, context);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                f fVar = f.this;
                c cVar = c.this;
                androidx.media3.session.legacy.f fVar2 = new androidx.media3.session.legacy.f(fVar, str, new i(result), bundle);
                cVar.b = null;
                cVar.d(str, fVar2, bundle);
                cVar.b = null;
                cVar.b = null;
            }
        }

        public f() {
            super();
        }
    }

    public class g extends f {
        public g() {
            super();
        }

        @Override // androidx.media3.session.legacy.c.d, androidx.media3.session.legacy.c.InterfaceC0066c
        public final h.b a() {
            b bVar = c.this.b;
            if (bVar != null) {
                return bVar.a;
            }
            r6.g("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }
    }

    public static class h<T> {
        public final Object a;
        public boolean b;

        public h(Object obj) {
            this.a = obj;
        }

        public void a() {
            throw null;
        }

        public void b(T t) {
            throw null;
        }

        public final void c(T t) {
            if (this.b) {
                o6.k(this.a, "sendResult() called when either sendResult() or sendError() had already been called for: ");
            } else {
                this.b = true;
                b(t);
            }
        }
    }

    public static class i<T> {
        public final MediaBrowserService.Result a;

        public i(MediaBrowserService.Result result) {
            this.a = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(T t) {
            boolean z = t instanceof List;
            MediaBrowserService.Result result = this.a;
            if (!z) {
                if (!(t instanceof Parcel)) {
                    result.sendResult(null);
                    return;
                }
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            List<Parcel> list = (List) t;
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
            result.sendResult(arrayList);
        }
    }

    public interface j {
        IBinder asBinder();
    }

    public static class k implements j {
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public static List a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        if (bundle != null) {
            int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
            int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
            if (i2 != -1 || i3 != -1) {
                int i4 = i3 * i2;
                int size = i4 + i3;
                if (i2 < 0 || i3 < 1 || i4 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i4, size);
            }
        }
        return list;
    }

    public abstract a b(String str, int i2, Bundle bundle);

    public abstract void c(String str, h<List<MediaBrowserCompat.MediaItem>> hVar);

    public abstract void d(String str, h<List<MediaBrowserCompat.MediaItem>> hVar, Bundle bundle);

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract void e(String str, h<MediaBrowserCompat.MediaItem> hVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        f fVar = this.a;
        fVar.getClass();
        f.a aVar = fVar.b;
        aVar.getClass();
        return aVar.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new g();
        } else {
            this.a = new f();
        }
        f fVar = this.a;
        fVar.getClass();
        f.a aVar = fVar.new a(c.this);
        fVar.b = aVar;
        aVar.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        throw null;
    }
}
