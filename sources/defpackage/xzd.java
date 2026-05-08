package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.kv8;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationFragment$observeMessageReceived$1", f = "SelectedConversationFragment.kt", l = {150}, m = "invokeSuspend")
public final class xzd extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ yzd this$0;

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationFragment$observeMessageReceived$1$1", f = "SelectedConversationFragment.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;
        final /* synthetic */ yzd this$0;

        /* JADX INFO: renamed from: xzd$a$a, reason: collision with other inner class name */
        public static final class C0478a<T> implements wi5 {
            public final /* synthetic */ yzd a;

            public C0478a(yzd yzdVar) {
                this.a = yzdVar;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                ConversationRecord conversationRecord;
                Object objJ;
                yzd yzdVar = this.a;
                boolean z = yzdVar.a;
                Lazy lazy = yzdVar.d;
                return ((!z || ((tid) yzdVar.b.getValue()).a()) && (conversationRecord = ((x1e) ((y1e) lazy.getValue()).d0.getValue()).a) != null && (objJ = ((y1e) lazy.getValue()).j(conversationRecord.getId(), true, lu2Var)) == g13.a) ? objJ : j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yzd yzdVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = yzdVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            nde ndeVarE = ((w1g) cr8.p(w1g.class)).e();
            C0478a c0478a = new C0478a(this.this$0);
            this.label = 1;
            ndeVarE.e(c0478a, this);
            return g13.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzd(yzd yzdVar, lu2<? super xzd> lu2Var) {
        super(2, lu2Var);
        this.this$0 = yzdVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new xzd(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((xzd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zv8 viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            a aVar = new a(this.this$0, null);
            this.label = 1;
            Object objB = c2d.b(viewLifecycleOwner, kv8.b.d, aVar, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
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
