package defpackage;

import android.content.Context;
import com.infra.eventlogger.model.DeviceProperties;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.EventProperties;
import defpackage.bm0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class xl0 implements eke {
    public final HashMap a;

    public static final class a extends mj8 implements Function1<y3b, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(y3b y3bVar) {
            y3b y3bVar2 = y3bVar;
            y3bVar2.getClass();
            xl0.this.getClass();
            y3bVar2.b("name", "JSMAppMetric.startupStages");
            HashMap map = xl0.this.a;
            ArrayList arrayList = y3bVar2.a;
            arrayList.add(new g59(map));
            xl0.this.getClass();
            arrayList.add(new gve("extraInfo", bs4.a));
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<bm0, j6g> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(bm0 bm0Var) {
            bm0 bm0Var2 = bm0Var;
            bm0Var2.getClass();
            xl0 xl0Var = xl0.this;
            xl0Var.getClass();
            bm0Var2.c = "JSMAppMetric.startupStages";
            bm0Var2.d = xl0Var.a;
            bm0Var2.e = bs4.a;
            return j6g.a;
        }
    }

    public xl0(HashMap map) {
        this.a = map;
    }

    @Override // defpackage.eke
    public final e5g a(gz4 gz4Var) {
        gz4Var.getClass();
        return gz4Var.a("jsma_native_app_metrics", new a());
    }

    @Override // defpackage.eke
    public final void b(r87 r87Var) {
        r87Var.getClass();
        b bVar = new b();
        hz4 hz4Var = r87Var.c;
        if (hz4Var == null) {
            r6.g("Required value was null.");
            return;
        }
        bm0.a aVar = bm0.Companion;
        Context context = r87Var.a;
        aVar.getClass();
        context.getClass();
        am0 am0Var = new am0(hz4Var, context);
        bm0 bm0Var = new bm0();
        am0Var.invoke(bm0Var);
        bVar.invoke(bm0Var);
        DeviceProperties deviceProperties = bm0Var.a;
        if (deviceProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        EventProperties eventProperties = bm0Var.b;
        if (eventProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        String str = bm0Var.c;
        if (str == null) {
            r6.g("Required value was null.");
            return;
        }
        HashMap map = bm0Var.d;
        if (map == null) {
            r6.g("Required value was null.");
            return;
        }
        bs4 bs4Var = bm0Var.e;
        if (bs4Var != null) {
            r87Var.a(new EventPayload.AppMetricsEvent(new EventPayload.AppMetricsEvent.AppMetricsEventData(deviceProperties, eventProperties, str, map, bs4Var)));
        } else {
            r6.g("Required value was null.");
        }
    }
}
