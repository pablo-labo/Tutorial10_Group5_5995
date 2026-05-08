package defpackage;

import android.content.Context;
import com.infra.eventlogger.model.DeviceProperties;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.EventProperties;
import com.infra.eventlogger.model.avro.NullableLong;
import com.infra.eventlogger.model.avro.NullableString;
import defpackage.qja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class mja implements eke {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;

    public interface a {
        void a(String str, String str2);

        void b(Long l);
    }

    public static final class b extends mj8 implements Function1<y3b, j6g> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(y3b y3bVar) {
            mja mjaVar;
            y3b y3bVar2 = y3bVar;
            y3bVar2.getClass();
            y3bVar2.b("message", mja.this.b);
            y3bVar2.b("stackTrace", mja.this.c);
            mja.this.getClass();
            y3bVar2.b("breadcrumbs", "");
            y3bVar2.a(mja.this.d, "errCode");
            y3bVar2.b("errDomain", mja.this.e);
            int size = mja.this.f.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                mjaVar = mja.this;
                if (i2 >= size) {
                    break;
                }
                int i3 = i2 + 1;
                String str = (String) mjaVar.g.get(i2);
                if (str != null) {
                    y3bVar2.b((String) mja.this.f.get(i2), str);
                }
                i2 = i3;
            }
            int size2 = mjaVar.h.size();
            while (i < size2) {
                int i4 = i + 1;
                Long l = (Long) mja.this.i.get(i);
                if (l != null) {
                    y3bVar2.a(l.longValue(), (String) mja.this.h.get(i));
                }
                i = i4;
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<qja, j6g> {
        final /* synthetic */ mja this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mja mjaVar) {
            super(1);
            this.this$0 = mjaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(qja qjaVar) {
            qja qjaVar2 = qjaVar;
            qjaVar2.getClass();
            qjaVar2.c = web.C(mja.this.b);
            qjaVar2.d = web.C(mja.this.c);
            mja.this.getClass();
            qjaVar2.e = web.C("");
            qjaVar2.f = Long.valueOf(mja.this.d);
            qjaVar2.g = web.C(mja.this.e);
            mja mjaVar = this.this$0;
            qjaVar2.h = mjaVar.f;
            ArrayList<String> arrayList = mjaVar.g;
            ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
            for (String str : arrayList) {
                arrayList2.add(str == null ? null : web.C(str));
            }
            qjaVar2.i = arrayList2;
            mja mjaVar2 = this.this$0;
            qjaVar2.j = mjaVar2.h;
            qjaVar2.k = mjaVar2.i;
            return j6g.a;
        }
    }

    public mja(String str, String str2, String str3, long j, String str4, Function1 function1) {
        str2.getClass();
        function1.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        function1.invoke(new lja(this));
    }

    @Override // defpackage.eke
    public final e5g a(gz4 gz4Var) {
        gz4Var.getClass();
        return gz4Var.a(this.a, new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // defpackage.eke
    public final void b(r87 r87Var) {
        ?? arrayList;
        ArrayList arrayList2;
        r87Var.getClass();
        c cVar = new c(this);
        hz4 hz4Var = r87Var.c;
        if (hz4Var == null) {
            r6.g("Required value was null.");
            return;
        }
        qja.a aVar = qja.Companion;
        Context context = r87Var.a;
        aVar.getClass();
        context.getClass();
        pja pjaVar = new pja(hz4Var, context);
        qja qjaVar = new qja();
        pjaVar.invoke(qjaVar);
        cVar.invoke(qjaVar);
        DeviceProperties deviceProperties = qjaVar.a;
        if (deviceProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        EventProperties eventProperties = qjaVar.b;
        if (eventProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        String str = qjaVar.c;
        if (str == null) {
            r6.g("Required value was null.");
            return;
        }
        String str2 = qjaVar.d;
        if (str2 == null) {
            r6.g("Required value was null.");
            return;
        }
        String str3 = qjaVar.e;
        if (str3 == null) {
            r6.g("Required value was null.");
            return;
        }
        Long l = qjaVar.f;
        if (l == null) {
            r6.g("Required value was null.");
            return;
        }
        long jLongValue = l.longValue();
        String str4 = qjaVar.g;
        if (str4 == null) {
            r6.g("Required value was null.");
            return;
        }
        ArrayList arrayList3 = qjaVar.h;
        zr4 zr4Var = zr4.a;
        List list = arrayList3 == null ? zr4Var : arrayList3;
        ArrayList<String> arrayList4 = qjaVar.i;
        if (arrayList4 == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(t92.r0(arrayList4, 10));
            for (String str5 : arrayList4) {
                arrayList.add(str5 == null ? null : new NullableString(str5));
            }
        }
        if (arrayList == 0) {
            arrayList = zr4Var;
        }
        List list2 = qjaVar.j;
        if (list2 == null) {
            list2 = zr4Var;
        }
        ArrayList arrayList5 = qjaVar.k;
        if (arrayList5 == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList6 = new ArrayList(t92.r0(arrayList5, 10));
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                Long l2 = (Long) it.next();
                List list3 = list2;
                Iterator it2 = it;
                arrayList6.add(l2 == null ? null : new NullableLong(l2.longValue()));
                list2 = list3;
                it = it2;
            }
            arrayList2 = arrayList6;
        }
        r87Var.a(new EventPayload.NonFatalErrorEvent(new EventPayload.NonFatalErrorEvent.NonFatalErrorEventData(deviceProperties, eventProperties, str, str2, str3, jLongValue, str4, list, arrayList, list2, arrayList2 == null ? zr4Var : arrayList2)));
    }
}
