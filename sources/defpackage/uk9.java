package defpackage;

import android.util.SparseBooleanArray;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.u;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.oney.WebRTCModule.WebRTCModule;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ uk9(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                List<ij9> list = (List) obj2;
                r.d dVar = (r.d) obj;
                s sVar = ((u) obj3).c.g;
                if (i2 == -1) {
                    sVar.t.B0(list);
                } else {
                    sVar.t.q0(i2, list);
                }
                new SparseBooleanArray().append(20, true);
                sVar.s(dVar);
                break;
            default:
                ((WebRTCModule) obj3).lambda$peerConnectionCreateOffer$25(i2, (Promise) obj2, (ReadableMap) obj);
                break;
        }
    }
}
