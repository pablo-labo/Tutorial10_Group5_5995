package defpackage;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.infra.eventlogger.model.DeviceProperties;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.EventProperties;
import com.infra.eventlogger.model.JsmaDynamicProperty;
import com.infra.eventlogger.model.avro.NullableString;
import defpackage.iz5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class ez5 implements eke {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Map<String, String> n;

    public static final class a extends mj8 implements Function1<y3b, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(y3b y3bVar) {
            y3b y3bVar2 = y3bVar;
            y3bVar2.getClass();
            String str = ez5.this.d;
            if (str != null) {
                y3bVar2.b("session_id", str);
            }
            y3bVar2.a(ez5.this.c, "event_count");
            y3bVar2.a(ez5.this.f, "first_install_time");
            y3bVar2.a(ez5.this.e, "last_install_time");
            y3bVar2.b("first_install_version", ez5.this.g);
            String str2 = ez5.this.i;
            if (str2 == null) {
                str2 = "";
            }
            y3bVar2.b("installer_package", str2);
            y3bVar2.b("system_user_agent", ez5.this.j);
            String str3 = ez5.this.k;
            if (str3 == null) {
                str3 = "";
            }
            y3bVar2.b("install_referrer", str3);
            y3bVar2.b("app_store", ez5.this.l);
            String str4 = ez5.this.m;
            y3bVar2.b("entity_data", str4 != null ? str4 : "");
            Map<String, String> map = ez5.this.n;
            map.getClass();
            y3bVar2.a.add(new gve("extra_properties", map));
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<iz5, j6g> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(iz5 iz5Var) {
            iz5 iz5Var2 = iz5Var;
            iz5Var2.getClass();
            ez5 ez5Var = ez5.this;
            iz5Var2.c = ez5Var.b;
            iz5Var2.d = Long.valueOf(ez5Var.c);
            iz5Var2.e = Long.valueOf(ez5Var.e);
            iz5Var2.f = Long.valueOf(ez5Var.f);
            iz5Var2.g = ez5Var.g;
            iz5Var2.h = ez5Var.h;
            iz5Var2.j = ez5Var.i;
            iz5Var2.k = ez5Var.j;
            iz5Var2.l = ez5Var.k;
            iz5Var2.i = ez5Var.l;
            iz5Var2.m = ez5Var.m;
            Map<String, String> map = ez5Var.n;
            map.getClass();
            iz5Var2.n = map;
            return j6g.a;
        }
    }

    public ez5(String str, String str2, long j, String str3, long j2, long j3, String str4, String str5, String str6, String str7, String str8, LinkedHashMap linkedHashMap, int i) {
        str3 = (i & 8) != 0 ? null : str3;
        String str9 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str5;
        Map<String, String> map = (i & 8192) != 0 ? bs4.a : linkedHashMap;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = j2;
        this.f = j3;
        this.g = str4;
        this.h = str9;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = "play";
        this.m = null;
        this.n = map;
    }

    @Override // defpackage.eke
    public final e5g a(gz4 gz4Var) {
        gz4Var.getClass();
        return gz4Var.a(this.a, new a());
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
        iz5.a aVar = iz5.Companion;
        Context context = r87Var.a;
        aVar.getClass();
        context.getClass();
        hz5 hz5Var = new hz5(hz4Var, context);
        iz5 iz5Var = new iz5();
        hz5Var.invoke(iz5Var);
        bVar.invoke(iz5Var);
        DeviceProperties deviceProperties = iz5Var.a;
        if (deviceProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        EventProperties eventProperties = iz5Var.b;
        if (eventProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        String str = iz5Var.c;
        if (str == null) {
            r6.g("Required value was null.");
            return;
        }
        Long l = iz5Var.d;
        if (l == null) {
            r6.g("Required value was null.");
            return;
        }
        long jLongValue = l.longValue();
        Long l2 = iz5Var.e;
        if (l2 == null) {
            r6.g("Required value was null.");
            return;
        }
        long jLongValue2 = l2.longValue();
        Long l3 = iz5Var.f;
        if (l3 == null) {
            r6.g("Required value was null.");
            return;
        }
        long jLongValue3 = l3.longValue();
        String str2 = iz5Var.g;
        if (str2 == null) {
            r6.g("Required value was null.");
            return;
        }
        String str3 = iz5Var.h;
        NullableString nullableString = str3 == null ? null : new NullableString(str3);
        String str4 = iz5Var.i;
        NullableString nullableString2 = str4 == null ? null : new NullableString(str4);
        String str5 = iz5Var.j;
        NullableString nullableString3 = str5 == null ? null : new NullableString(str5);
        String str6 = iz5Var.k;
        NullableString nullableString4 = str6 == null ? null : new NullableString(str6);
        String str7 = iz5Var.l;
        NullableString nullableString5 = str7 == null ? null : new NullableString(str7);
        String str8 = iz5Var.m;
        NullableString nullableString6 = str8 != null ? new NullableString(str8) : null;
        Map<String, String> map = iz5Var.n;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(map.size()));
        for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new JsmaDynamicProperty(new NullableString((String) entry.getValue())));
        }
        r87Var.a(new EventPayload.GenericLifecycleEvent(new EventPayload.GenericLifecycleEvent.GenericLifecycleEventData(deviceProperties, eventProperties, str, jLongValue, jLongValue2, jLongValue3, str2, nullableString, nullableString2, nullableString3, nullableString4, nullableString5, nullableString6, linkedHashMap)));
    }
}
