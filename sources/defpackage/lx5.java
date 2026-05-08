package defpackage;

import android.content.Context;
import com.infra.eventlogger.model.DeviceProperties;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.EventProperties;
import com.infra.eventlogger.model.avro.NullableLong;
import com.infra.eventlogger.model.avro.NullableString;
import defpackage.px5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class lx5 implements eke {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final List<String> e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;

    public static final class a implements b {
        public a() {
        }

        @Override // lx5.b
        public final void a(String str, String str2) {
            str.getClass();
            lx5 lx5Var = lx5.this;
            lx5Var.f.add(str);
            lx5Var.g.add(str2);
        }

        @Override // lx5.b
        public final void b(String str, Long l) {
            str.getClass();
            lx5 lx5Var = lx5.this;
            lx5Var.h.add(str);
            lx5Var.i.add(l);
        }

        @Override // lx5.b
        public final void c(String str, Boolean bool) {
            Long lValueOf;
            str.getClass();
            if (bool == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(bool.booleanValue() ? 1L : 0L);
            }
            b(str, lValueOf);
        }
    }

    public interface b {
        void a(String str, String str2);

        void b(String str, Long l);

        void c(String str, Boolean bool);
    }

    public static final class c extends mj8 implements Function1<y3b, j6g> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(y3b y3bVar) {
            lx5 lx5Var;
            lx5 lx5Var2;
            y3b y3bVar2 = y3bVar;
            y3bVar2.getClass();
            int size = lx5.this.f.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                lx5Var = lx5.this;
                if (i2 >= size) {
                    break;
                }
                int i3 = i2 + 1;
                String str = (String) lx5Var.g.get(i2);
                if (str != null) {
                    y3bVar2.b((String) lx5.this.f.get(i2), str);
                }
                i2 = i3;
            }
            int size2 = lx5Var.h.size();
            while (true) {
                lx5Var2 = lx5.this;
                if (i >= size2) {
                    break;
                }
                int i4 = i + 1;
                Long l = (Long) lx5Var2.i.get(i);
                if (l != null) {
                    y3bVar2.a(l.longValue(), (String) lx5.this.h.get(i));
                }
                i = i4;
            }
            if (!lx5Var2.e.isEmpty()) {
                y3bVar2.b("tags", z92.W0(lx5.this.e, ",", null, null, null, 62));
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function1<px5, j6g> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(px5 px5Var) {
            px5 px5Var2 = px5Var;
            px5Var2.getClass();
            lx5 lx5Var = lx5.this;
            px5Var2.d = lx5Var.b;
            px5Var2.c = lx5Var.c;
            px5Var2.e = lx5Var.e;
            px5Var2.f = Integer.valueOf(lx5Var.d);
            lx5 lx5Var2 = lx5.this;
            px5Var2.g = lx5Var2.f;
            ArrayList<String> arrayList = lx5Var2.g;
            ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
            for (String str : arrayList) {
                arrayList2.add(str == null ? null : web.C(str));
            }
            px5Var2.h = arrayList2;
            lx5 lx5Var3 = lx5.this;
            px5Var2.i = lx5Var3.h;
            px5Var2.j = lx5Var3.i;
            return j6g.a;
        }
    }

    public lx5(String str, String str2, String str3, int i, List<String> list, Function1<? super b, j6g> function1) {
        list.getClass();
        function1.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = list;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        function1.invoke(new a());
    }

    @Override // defpackage.eke
    public final e5g a(gz4 gz4Var) {
        gz4Var.getClass();
        return gz4Var.a(this.a, new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    @Override // defpackage.eke
    public final void b(r87 r87Var) {
        ?? arrayList;
        ArrayList arrayList2;
        r87Var.getClass();
        d dVar = new d();
        hz4 hz4Var = r87Var.c;
        if (hz4Var == null) {
            r6.g("Required value was null.");
            return;
        }
        px5.a aVar = px5.Companion;
        Context context = r87Var.a;
        aVar.getClass();
        context.getClass();
        ox5 ox5Var = new ox5(hz4Var, context);
        px5 px5Var = new px5();
        ox5Var.invoke(px5Var);
        dVar.invoke(px5Var);
        DeviceProperties deviceProperties = px5Var.a;
        if (deviceProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        EventProperties eventProperties = px5Var.b;
        if (eventProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        String str = px5Var.c;
        if (str == null) {
            r6.g("Required value was null.");
            return;
        }
        String str2 = px5Var.d;
        if (str2 == null) {
            r6.g("Required value was null.");
            return;
        }
        List<String> list = px5Var.e;
        List list2 = zr4.a;
        List list3 = list == null ? list2 : list;
        Integer num = px5Var.f;
        if (num == null) {
            r6.g("Required value was null.");
            return;
        }
        int iIntValue = num.intValue();
        ArrayList arrayList3 = px5Var.g;
        List list4 = arrayList3 == null ? list2 : arrayList3;
        ArrayList<String> arrayList4 = px5Var.h;
        if (arrayList4 == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(t92.r0(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 == null ? null : new NullableString(str3));
            }
        }
        if (arrayList == 0) {
            arrayList = list2;
        }
        ArrayList arrayList5 = px5Var.i;
        List list5 = arrayList5 == null ? list2 : arrayList5;
        ArrayList<Long> arrayList6 = px5Var.j;
        if (arrayList6 == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList7 = new ArrayList(t92.r0(arrayList6, 10));
            for (Long l : arrayList6) {
                DeviceProperties deviceProperties2 = deviceProperties;
                arrayList7.add(l == null ? null : new NullableLong(l.longValue()));
                deviceProperties = deviceProperties2;
            }
            arrayList2 = arrayList7;
        }
        DeviceProperties deviceProperties3 = deviceProperties;
        if (arrayList2 != null) {
            list2 = arrayList2;
        }
        r87Var.a(new EventPayload.GenericEvent(new EventPayload.GenericEvent.GenericEventData(deviceProperties3, eventProperties, str, str2, list3, iIntValue, list4, arrayList, list5, list2)));
    }
}
