package defpackage;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.indeed.android.jsmappservices.bridge.results.BridgeResult;
import com.indeed.android.jsmappservices.bridge.results.NativeResultObj;
import defpackage.nz0;
import defpackage.v03;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sz0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ sz0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Class<?> returnType;
        switch (this.a) {
            case 0:
                return new gt0(nz0.a.a, 0);
            case 1:
                return j6g.a;
            case 2:
                try {
                    String[] strArr = at5.b;
                    Method value = at5.d.getValue();
                    if (value != null && (returnType = value.getReturnType()) != null) {
                        Class cls = Integer.TYPE;
                        return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                    }
                } catch (Throwable unused) {
                }
                return null;
            case 3:
                eze ezeVarA = wea.a();
                eq3 eq3Var = a74.a;
                return f13.a(v03.a.C0438a.c(ezeVarA, no3.c));
            case 4:
                return new gt0(ni1.a, 0);
            case 5:
                return mt7.Companion.serializer();
            case 6:
                NativeResultObj.Companion companion = NativeResultObj.INSTANCE;
                return BridgeResult.Companion.serializer();
            case 7:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = ((OkHttpClient) epa.Z.getValue()).e();
                builderE.c.add(new bsa());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builderE.b(0L, timeUnit);
                builderE.z = Util.b(0L, timeUnit);
                builderE.A = Util.b(0L, timeUnit);
                return new OkHttpClient(builderE);
            default:
                eq3 eq3Var2 = a74.a;
                return no3.c;
        }
    }
}
