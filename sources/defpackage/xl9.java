package defpackage;

import android.os.RemoteException;
import androidx.media3.session.r;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl9 implements wq2, id0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xl9(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.id0
    public void a(double d, double d2) {
        NativeAnimatedModule nativeAnimatedModule = (NativeAnimatedModule) this.b;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", this.a);
        readableMapBuilder.put("value", d);
        readableMapBuilder.put("offset", d2);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wq2
    public void accept(Object obj) {
        wu8<?> wu8VarB;
        r.d dVar = (r.d) this.b;
        int i = this.a;
        try {
            wu8VarB = (wu8) ((hz8) obj).get();
            ka2.o(wu8VarB, "LibraryResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            zkd.U("MediaSessionStub", "Library operation failed", e);
            wu8VarB = wu8.b(-1);
        } catch (CancellationException e2) {
            zkd.U("MediaSessionStub", "Library operation cancelled", e2);
            wu8VarB = wu8.b(1);
        } catch (ExecutionException e3) {
            e = e3;
            zkd.U("MediaSessionStub", "Library operation failed", e);
            wu8VarB = wu8.b(-1);
        }
        try {
            r.c cVar = dVar.e;
            ka2.r(cVar);
            cVar.b(i, wu8VarB);
        } catch (RemoteException e4) {
            zkd.U("MediaSessionStub", "Failed to send result to browser " + dVar, e4);
        }
    }
}
