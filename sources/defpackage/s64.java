package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.persistence.EventLoggerDatabase;
import defpackage.rf3;
import defpackage.v03;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class s64 extends Handler {
    public static final a Companion = new a();
    public long a;
    public int b;
    public final d2f c;
    public final d2f d;
    public final d2f e;
    public final d2f f;

    public static final class a {
    }

    public static final class b extends mj8 implements gu5<z4a> {
        public static final b a = new b(0);

        @Override // defpackage.gu5
        public final z4a invoke() {
            return pnb.i();
        }
    }

    public static final class c extends mj8 implements gu5<e13> {
        public static final c a = new c(0);

        @Override // defpackage.gu5
        public final e13 invoke() {
            eq3 eq3Var = a74.a;
            no3 no3Var = no3.c;
            qy7 qy7VarF = u63.f();
            no3Var.getClass();
            return f13.a(v03.a.C0438a.c(no3Var, qy7VarF));
        }
    }

    @uh3(c = "com.infra.eventlogger.handler.DispatchHandler$handleMessage$1", f = "DispatchHandler.kt", l = {150}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public d(lu2<? super d> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return s64.this.new d(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            s64 s64Var;
            z4a z4aVar;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                z4a z4aVar2 = (z4a) s64.this.f.getValue();
                s64Var = s64.this;
                this.L$0 = z4aVar2;
                this.L$1 = s64Var;
                this.label = 1;
                Object objH = z4aVar2.h(this);
                g13 g13Var = g13.a;
                if (objH == g13Var) {
                    return g13Var;
                }
                z4aVar = z4aVar2;
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s64Var = (s64) this.L$1;
                z4aVar = (z4a) this.L$0;
                r7d.b(obj);
            }
            try {
                s64.a(s64Var);
                j6g j6gVar = j6g.a;
                z4aVar.p(null);
                return j6g.a;
            } catch (Throwable th) {
                z4aVar.p(null);
                throw th;
            }
        }
    }

    public static final class e extends mj8 implements gu5<w9c> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // defpackage.gu5
        public final w9c invoke() {
            rf3.a aVar = rf3.Companion;
            Context context = this.$context;
            aVar.getClass();
            context.getClass();
            rf3 rf3Var = rf3.c;
            if (rf3Var == null) {
                synchronized (aVar) {
                    rf3Var = rf3.c;
                    if (rf3Var == null) {
                        rf3Var = new rf3(context);
                        rf3.c = rf3Var;
                    }
                }
            }
            return ((EventLoggerDatabase) rf3Var.b.getValue()).y();
        }
    }

    public static final class f extends mj8 implements gu5<afe> {
        final /* synthetic */ ew4 $env;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ew4 ew4Var) {
            super(0);
            this.$env = ew4Var;
        }

        @Override // defpackage.gu5
        public final afe invoke() {
            return new afe(this.$env);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s64(Context context, ew4 ew4Var, Looper looper) {
        super(looper);
        context.getClass();
        ew4Var.getClass();
        this.a = 10000L;
        this.c = new d2f(new f(ew4Var));
        this.d = new d2f(new e(context));
        this.e = boa.D(c.a);
        this.f = boa.D(b.a);
    }

    public static final void a(s64 s64Var) {
        s64Var.getClass();
        d2f d2fVar = s64Var.c;
        Log.d("DispatchHandler", "Flushing queue message");
        try {
            Log.d("DispatchHandler", "Pruned " + s64Var.b().a() + " old events");
            ArrayList arrayListE = s64Var.b().e();
            while (!arrayListE.isEmpty()) {
                Log.d("DispatchHandler", "Flushing " + arrayListE.size() + " elements");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayListE) {
                    if (((v9c) obj).d != null) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                List list = (List) pair.a();
                List list2 = (List) pair.b();
                afe afeVar = (afe) d2fVar.getValue();
                List<v9c> list3 = list2;
                ArrayList arrayList3 = new ArrayList(t92.r0(list3, 10));
                for (v9c v9cVar : list3) {
                    EventPayload eventPayload = v9cVar.c;
                    JsonObject jsonObjectF = eventPayload == null ? null : la8.f(k05.a.e(EventPayload.Companion.serializer(), eventPayload));
                    if (jsonObjectF == null) {
                        jsonObjectF = v9cVar.e;
                    }
                    arrayList3.add(jsonObjectF);
                }
                if (!afeVar.c(arrayList3)) {
                    throw new IllegalStateException("Check failed.");
                }
                afe afeVar2 = (afe) d2fVar.getValue();
                List list4 = list;
                ArrayList arrayList4 = new ArrayList(t92.r0(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((v9c) it.next()).d);
                }
                if (!afeVar2.b(arrayList4)) {
                    throw new IllegalStateException("Check failed.");
                }
                Log.d("DispatchHandler", "API Success, removing " + arrayListE.size() + " elements from queued events");
                s64Var.b().b(arrayListE);
                arrayListE = s64Var.b().e();
            }
            int i = s64Var.b;
            if (i <= 0) {
                s64Var.a = 10000L;
                return;
            }
            int i2 = i - 1;
            s64Var.b = i2;
            s64Var.a = ((long) (1 << i2)) * 60000;
        } catch (Exception e2) {
            s64Var.a = Math.min(((long) (1 << s64Var.b)) * 60000, 600000L);
            int i3 = s64Var.b;
            if (i3 < 4) {
                s64Var.b = i3 + 1;
            }
            Log.w("DispatchHandler", "Failed to process event for message", e2);
        }
    }

    public final w9c b() {
        return (w9c) this.d.getValue();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                u63.Y((e13) this.e.getValue(), null, null, new d(null), 3);
                return;
            }
            Log.e("DispatchHandler", "Unknown dispatcher message: " + i);
            return;
        }
        try {
            Object obj = message.obj;
            if (obj instanceof cpe) {
                w9c w9cVarB = b();
                Object obj2 = message.obj;
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.apache.avro.specific.SpecificRecord");
                }
                w9cVarB.f((cpe) obj2);
            } else if (obj instanceof EventPayload) {
                w9c w9cVarB2 = b();
                Object obj3 = message.obj;
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.infra.eventlogger.model.EventPayload");
                }
                w9cVarB2.c((EventPayload) obj3);
            } else if (obj instanceof JsonObject) {
                w9c w9cVarB3 = b();
                Object obj4 = message.obj;
                if (obj4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
                }
                w9cVarB3.d((JsonObject) obj4);
            }
            Log.d("DispatchHandler", "enqueueFlush called");
            if (hasMessages(1)) {
                return;
            }
            Log.d("DispatchHandler", "enqueueFlush no messages, enqueuing");
            sendMessageDelayed(Message.obtain(this, 1), this.a);
        } catch (Exception e2) {
            Log.w("DispatchHandler", "Failed to enqueue event for message: " + message, e2);
        }
    }
}
