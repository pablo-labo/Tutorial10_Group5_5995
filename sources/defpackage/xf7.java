package defpackage;

import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public final class xf7 {
    public static OkHttpClient a;

    public static final class a implements Callback {
        public final /* synthetic */ InspectorNetworkRequestListener a;

        public a(InspectorNetworkRequestListener inspectorNetworkRequestListener) {
            this.a = inspectorNetworkRequestListener;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            if (call.getE0()) {
                return;
            }
            this.a.onError(iOException.getMessage());
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            InputStream inputStreamA;
            byte[] bArr;
            Headers headers = response.f;
            HashMap map = new HashMap();
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            comparator.getClass();
            TreeSet treeSet = new TreeSet(comparator);
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                treeSet.add(headers.b(i));
            }
            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
            setUnmodifiableSet.getClass();
            for (String str : setUnmodifiableSet) {
                map.put(str, headers.a(str));
            }
            int i2 = response.d;
            InspectorNetworkRequestListener inspectorNetworkRequestListener = this.a;
            inspectorNetworkRequestListener.onHeaders(i2, map);
            try {
                ResponseBody responseBody = response.V;
                if (responseBody != null) {
                    try {
                        inputStreamA = responseBody.a();
                        bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    } finally {
                    }
                    while (true) {
                        try {
                            int i3 = inputStreamA.read(bArr);
                            if (i3 == -1) {
                                break;
                            } else {
                                inspectorNetworkRequestListener.onData(new String(bArr, 0, i3, a32.b));
                            }
                        } finally {
                        }
                    }
                    j6g j6gVar = j6g.a;
                    inputStreamA.close();
                }
                inspectorNetworkRequestListener.onCompletion();
                j6g j6gVar2 = j6g.a;
                c0h.q(responseBody, null);
            } catch (IOException e) {
                inspectorNetworkRequestListener.onError(e.getMessage());
            }
        }
    }

    public static final void a(String str, InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        str.getClass();
        inspectorNetworkRequestListener.getClass();
        if (a == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.c(10L, timeUnit);
            builder.A = Util.b(10L, timeUnit);
            builder.e(0L, TimeUnit.MINUTES);
            a = new OkHttpClient(builder);
        }
        try {
            Request.Builder builder2 = new Request.Builder();
            builder2.g(str);
            Request requestB = builder2.b();
            OkHttpClient okHttpClient = a;
            if (okHttpClient != null) {
                new RealCall(okHttpClient, requestB, false).R0(new a(inspectorNetworkRequestListener));
            } else {
                wl7.g("client");
                throw null;
            }
        } catch (IllegalArgumentException unused) {
            inspectorNetworkRequestListener.onError("Not a valid URL: ".concat(str));
        }
    }
}
