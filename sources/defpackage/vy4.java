package defpackage;

import androidx.compose.runtime.r;
import com.indeed.android.messaging.data.events.EventRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.components.EventListKt$EventList$5$1", f = "EventList.kt", l = {123}, m = "invokeSuspend")
public final class vy4 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ e13 $coroutineScope;
    final /* synthetic */ at8<EventRecord> $lazyMessages;
    final /* synthetic */ ss8 $listState;
    Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ EventRecord a;
        public final /* synthetic */ e13 b;
        public final /* synthetic */ ss8 c;

        public a(EventRecord eventRecord, e13 e13Var, ss8 ss8Var) {
            this.a = eventRecord;
            this.b = e13Var;
            this.c = ss8Var;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            int iIntValue = ((Number) obj).intValue();
            if (this.a.getSenderRole() == gy2.d && iIntValue <= 1) {
                u63.Y(this.b, null, null, new uy4(this.c, null), 3);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy4(at8<EventRecord> at8Var, ss8 ss8Var, e13 e13Var, lu2<? super vy4> lu2Var) {
        super(2, lu2Var);
        this.$lazyMessages = at8Var;
        this.$listState = ss8Var;
        this.$coroutineScope = e13Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new vy4(this.$lazyMessages, this.$listState, this.$coroutineScope, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((vy4) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            EventRecord eventRecord = (EventRecord) z92.R0(0, this.$lazyMessages.b());
            if (eventRecord == null) {
                return j6g.a;
            }
            kjd kjdVarH = r.h(new k30(this.$listState, 10));
            a aVar = new a(eventRecord, this.$coroutineScope, this.$listState);
            this.L$0 = null;
            this.label = 1;
            Object objE = kjdVarH.e(aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
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
