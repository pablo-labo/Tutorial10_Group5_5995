package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.a;
import defpackage.ln6;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {
    public int a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final b c = new b();
    public final a d = new a();

    public static final class a extends a.AbstractBinderC0076a {
        public a() {
            attachInterface(this, androidx.room.a.j);
        }
    }

    public static final class b extends RemoteCallbackList<ln6> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object obj) {
            ((ln6) iInterface).getClass();
            obj.getClass();
            MultiInstanceInvalidationService.this.b.remove((Integer) obj);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.d;
    }
}
