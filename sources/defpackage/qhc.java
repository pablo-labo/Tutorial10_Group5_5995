package defpackage;

import com.indeed.android.jsmappservices.bridge.results.BridgeResult;
import com.indeed.android.jsmappservices.bridge.results.NativeResultObj;
import com.indeed.android.jsmappservices.bridge.results.NativeStringResultObj;
import java.util.ArrayList;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class qhc {
    public static final ra8 a;
    public static final a b = new a();
    public static final shc c;

    public static final class a implements sm1 {
        @Override // defpackage.sm1
        public final void a(BridgeResult bridgeResult) {
            String strB = qhc.a.b(NativeResultObj.INSTANCE.serializer(), new NativeResultObj(null, bridgeResult));
            ArrayList arrayList = lz2.a;
            lz2.d("JobSearchApplication.reactBridge", "Sent bridge result: ".concat(strB), false, null);
        }

        @Override // defpackage.sm1
        public final void b(String str) {
            str.getClass();
            String strB = qhc.a.b(NativeStringResultObj.INSTANCE.serializer(), new NativeStringResultObj(null, str));
            ArrayList arrayList = lz2.a;
            lz2.d("JobSearchApplication.reactBridge", "Sent bridge result: ".concat(strB), false, null);
        }

        @Override // defpackage.sm1
        public final void c() {
            String strB = qhc.a.b(NativeResultObj.INSTANCE.serializer(), new NativeResultObj(null, null));
            ArrayList arrayList = lz2.a;
            lz2.d("JobSearchApplication.reactBridge", "Sent bridge result: ".concat(strB), false, null);
        }
    }

    static {
        int i = 8;
        a = sa8.a(new lt(i));
        epa epaVar = epa.a;
        c = new shc((OkHttpClient) epa.h0.getValue(), new wd(i), new qh2(4), new phc(), new tb(10));
    }
}
