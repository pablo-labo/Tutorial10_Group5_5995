package defpackage;

import android.util.Log;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ip7 implements JSTBroadcast {
    public final eu2 a;
    public final nde b;
    public final ConcurrentHashMap<yd8<?>, ConcurrentHashMap<String, ex7>> c;

    @uh3(c = "com.indeed.android.jobsearch.tare.broadcast.JSTBroadcastImpl$dispatch$1", f = "JSTBroadcastImpl.kt", l = {35}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ JSTBroadcastEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSTBroadcastEvent jSTBroadcastEvent, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$event = jSTBroadcastEvent;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return ip7.this.new a(this.$event, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                nde ndeVar = ip7.this.b;
                JSTBroadcastEvent jSTBroadcastEvent = this.$event;
                this.label = 1;
                Object objA = ndeVar.a(jSTBroadcastEvent, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.tare.broadcast.JSTBroadcastImpl$subscribe$1", f = "JSTBroadcastImpl.kt", l = {48}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Function1<T, j6g> $callback;
        final /* synthetic */ Function1<T, Boolean> $eventMatcher;
        final /* synthetic */ yd8<T> $eventType;
        int label;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ yd8<T> a;
            public final /* synthetic */ Function1<T, Boolean> b;
            public final /* synthetic */ Function1<T, j6g> c;

            /* JADX WARN: Multi-variable type inference failed */
            public a(yd8<T> yd8Var, Function1<? super T, Boolean> function1, Function1<? super T, j6g> function12) {
                this.a = yd8Var;
                this.b = function1;
                this.c = function12;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                Function1<T, Boolean> function1;
                JSTBroadcastEvent jSTBroadcastEvent = (JSTBroadcastEvent) obj;
                if (fwc.a.b(jSTBroadcastEvent.getClass()).equals(this.a) && ((function1 = this.b) == null || function1.invoke(jSTBroadcastEvent).booleanValue())) {
                    ArrayList arrayList = lz2.a;
                    Log.d("JSTBroadcastImpl", "Calling callback for event " + jSTBroadcastEvent, null);
                    this.c.invoke(jSTBroadcastEvent);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(yd8<T> yd8Var, Function1<? super T, Boolean> function1, Function1<? super T, j6g> function12, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$eventType = yd8Var;
            this.$eventMatcher = function1;
            this.$callback = function12;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return ip7.this.new b(this.$eventType, this.$eventMatcher, this.$callback, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
            ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    throw s6.e(obj);
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            nde ndeVar = ip7.this.b;
            a aVar = new a(this.$eventType, this.$eventMatcher, this.$callback);
            this.label = 1;
            ndeVar.getClass();
            nde.o(ndeVar, aVar, this);
            return g13.a;
        }
    }

    public ip7() {
        eq3 eq3Var = a74.a;
        this.a = f13.a(no3.c);
        this.b = wg2.d(0, 0, null, 7);
        iwc iwcVar = fwc.a;
        ArrayList arrayListG1 = z92.g1(iwcVar.b(JSTBroadcastEvent.class), iwcVar.b(JSTBroadcastEvent.class).h());
        int iV = kc9.V(t92.r0(arrayListG1, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iV < 16 ? 16 : iV);
        for (Object obj : arrayListG1) {
            linkedHashMap.put(obj, new ConcurrentHashMap());
        }
        this.c = new ConcurrentHashMap<>(linkedHashMap);
    }

    @Override // com.indeed.android.tare.broadcast.JSTBroadcast
    public final void dispatch(JSTBroadcastEvent jSTBroadcastEvent) {
        jSTBroadcastEvent.getClass();
        ArrayList arrayList = lz2.a;
        Log.d("JSTBroadcastImpl", "Dispatching event " + jSTBroadcastEvent, null);
        u63.Y(this.a, null, null, new a(jSTBroadcastEvent, null), 3);
    }

    @Override // com.indeed.android.tare.broadcast.JSTBroadcast
    public final <T extends JSTBroadcastEvent> String subscribe(yd8<T> yd8Var, Function1<? super T, Boolean> function1, Function1<? super T, j6g> function12) {
        yd8Var.getClass();
        function12.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        ConcurrentHashMap<String, ex7> concurrentHashMap = this.c.get(yd8Var);
        concurrentHashMap.getClass();
        concurrentHashMap.put(string, u63.Y(this.a, null, null, new b(yd8Var, function1, function12, null), 3));
        return string;
    }

    @Override // com.indeed.android.tare.broadcast.JSTBroadcast
    public final void unsubscribe(String str) {
        str.getClass();
        Collection<ConcurrentHashMap<String, ex7>> collectionValues = this.c.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) it.next();
            ex7 ex7Var = (ex7) concurrentHashMap.get(str);
            if (ex7Var != null) {
                ex7Var.h(null);
                concurrentHashMap.remove(str);
            }
        }
    }
}
