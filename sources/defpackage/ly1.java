package defpackage;

import com.datadog.android.core.internal.persistence.ConsentAwareStorage;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.WritableMap;
import com.oney.WebRTCModule.b;
import com.oney.WebRTCModule.c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ly1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ly1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CatalystInstanceImpl) obj).lambda$initialize$3();
                return;
            case 1:
                ConsentAwareStorage.dropAll$lambda$11((ConsentAwareStorage) obj);
                return;
            case 2:
                b bVar = ((c) obj).a;
                b.EnumC0189b enumC0189b = bVar.d;
                if (enumC0189b == b.EnumC0189b.b || enumC0189b == b.EnumC0189b.c) {
                    bVar.b();
                    bVar.a();
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("hasFocus", true);
                    bVar.c.emit("EventAudioFocusChange", writableMapCreateMap);
                    return;
                }
                return;
            case 3:
                ((i34) obj).A();
                return;
            default:
                ctc ctcVar = (ctc) obj;
                synchronized (ctcVar) {
                    if (!ctcVar.e) {
                        ctcVar.g();
                    }
                    break;
                }
                return;
        }
    }
}
