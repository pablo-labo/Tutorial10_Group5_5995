package defpackage;

import android.util.Log;
import com.indeed.android.messaging.utils.MandatoryReconnectionException;
import defpackage.uid;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Response;
import okhttp3.internal.sse.RealEventSource;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;

/* JADX INFO: loaded from: classes2.dex */
public final class rid extends EventSourceListener {
    public final /* synthetic */ tid a;
    public final /* synthetic */ ma b;
    public final /* synthetic */ ji c;
    public final /* synthetic */ oa d;

    public rid(tid tidVar, ma maVar, ji jiVar, oa oaVar) {
        this.a = tidVar;
        this.b = maVar;
        this.c = jiVar;
        this.d = oaVar;
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void a(RealEventSource realEventSource) throws IOException {
        ArrayList arrayList = lz2.a;
        Log.d("SSEClient", "Closed", null);
        this.d.invoke();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // okhttp3.sse.EventSourceListener
    public final void b(RealEventSource realEventSource, String str, String str2) {
        Object bVar;
        ArrayList arrayList = lz2.a;
        Object obj = null;
        Log.d("SSEClient", "Received type: " + str, null);
        if (str != null) {
            int iHashCode = str.hashCode();
            tid tidVar = this.a;
            switch (iHashCode) {
                case -2092785361:
                    if (str.equals("realtime-connection-config")) {
                        Log.d("SSEClient", "config: ".concat(str2), null);
                        try {
                            cad cadVar = ((xn2) tidVar.h.c(xn2.Companion.serializer(), str2)).a;
                            if (cadVar == null) {
                                cadVar = tidVar.f;
                            }
                            cadVar.getClass();
                            tidVar.f = cadVar;
                            return;
                        } catch (Exception e) {
                            ArrayList arrayList2 = lz2.a;
                            lz2.c("SSEClient", bg.e(e, "Failed parsing connection config: "), false, null, 12);
                            return;
                        }
                    }
                    break;
                case -671649684:
                    if (str.equals("job-seeker-message-updates")) {
                        ra8 ra8Var = tidVar.h;
                        Log.d("SSEClient", "Received message: ".concat(str2), null);
                        try {
                            yx4 yx4Var = (yx4) ra8Var.c(yx4.Companion.serializer(), str2);
                            String str3 = yx4Var.c;
                            Log.d("SSEClient", "data payload: " + str3, null);
                            String str4 = yx4Var.b;
                            int iHashCode2 = str4.hashCode();
                            if (iHashCode2 != -1996365784) {
                                if (iHashCode2 != 394855489) {
                                    if (iHashCode2 == 2114604933 && str4.equals("global--refresh-online-statuses")) {
                                        swc swcVar = (swc) ra8Var.c(swc.Companion.serializer(), str3);
                                        bVar = new uid.c(swcVar.c, swcVar.b, swcVar.e, swcVar.d);
                                        obj = bVar;
                                    }
                                } else if (str4.equals("mm--read-receipt")) {
                                    bVar = new uid.d(((iqc) ra8Var.c(iqc.Companion.serializer(), str3)).a);
                                    obj = bVar;
                                }
                            } else if (str4.equals("NEW_MESSAGE")) {
                                bVar = new uid.b(((rha) ra8Var.c(rha.Companion.serializer(), str3)).b);
                                obj = bVar;
                            }
                        } catch (Exception unused) {
                            ArrayList arrayList3 = lz2.a;
                            lz2.c("SSEClient", "Failed parsing message: ".concat(str2), false, null, 12);
                        }
                        if (obj != null) {
                            this.b.invoke(obj);
                            return;
                        }
                        return;
                    }
                    break;
                case -540127056:
                    if (str.equals("mandatory-reconnection-trigger")) {
                        Log.d("SSEClient", "reconnect: ".concat(str2), null);
                        try {
                            tidVar.e = ((dtc) tidVar.h.c(dtc.Companion.serializer(), str2)).a;
                            this.c.invoke(new MandatoryReconnectionException());
                            return;
                        } catch (Exception e2) {
                            ArrayList arrayList4 = lz2.a;
                            lz2.c("SSEClient", bg.e(e2, "Failed parsing reconnection trigger event: "), false, null, 12);
                            return;
                        }
                    }
                    break;
                case 200896764:
                    if (str.equals("heartbeat")) {
                        Log.d("SSEClient", "heartbeat: ".concat(str2), null);
                        tidVar.d = System.currentTimeMillis();
                        return;
                    }
                    break;
            }
        }
        lz2.d("SSEClient", t40.l("Received unknown message: ", str, ", ", str2), false, null);
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void c(RealEventSource realEventSource, Exception exc) {
        ArrayList arrayList = lz2.a;
        Log.d("SSEClient", "Error: " + exc, null);
        if (exc == null) {
            exc = new Exception("Unknown error");
        }
        this.c.invoke(exc);
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void d(RealEventSource realEventSource, Response response) {
        tid tidVar = this.a;
        tidVar.g = 0;
        EventSource eventSource = tidVar.c;
        if (eventSource != null) {
            eventSource.cancel();
        }
        tidVar.c = null;
    }
}
