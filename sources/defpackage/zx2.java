package defpackage;

import android.util.Log;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.components.ConversationListKt$ConversationListItem$4$1", f = "ConversationList.kt", l = {}, m = "invokeSuspend")
public final class zx2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ConversationRecord $conversation;
    final /* synthetic */ e13 $coroutineScope;
    final /* synthetic */ v1f $dismissState;
    final /* synthetic */ g4a<Boolean> $isRemoved$delegate;
    final /* synthetic */ wu5<ConversationRecord, p12, gu5<j6g>, j6g> $onUpdateConversationFolder;
    int label;

    @uh3(c = "com.indeed.android.messaging.ui.inbox.components.ConversationListKt$ConversationListItem$4$1$1$1", f = "ConversationList.kt", l = {284}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ v1f $dismissState;
        final /* synthetic */ g4a<Boolean> $isRemoved$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1f v1fVar, g4a<Boolean> g4aVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$dismissState = v1fVar;
            this.$isRemoved$delegate = g4aVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$dismissState, this.$isRemoved$delegate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                this.$isRemoved$delegate.setValue(Boolean.FALSE);
                v1f v1fVar = this.$dismissState;
                this.label = 1;
                Object objA = v1fVar.a(this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zx2(wu5<? super ConversationRecord, ? super p12, ? super gu5<j6g>, j6g> wu5Var, ConversationRecord conversationRecord, g4a<Boolean> g4aVar, e13 e13Var, v1f v1fVar, lu2<? super zx2> lu2Var) {
        super(2, lu2Var);
        this.$onUpdateConversationFolder = wu5Var;
        this.$conversation = conversationRecord;
        this.$isRemoved$delegate = g4aVar;
        this.$coroutineScope = e13Var;
        this.$dismissState = v1fVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new zx2(this.$onUpdateConversationFolder, this.$conversation, this.$isRemoved$delegate, this.$coroutineScope, this.$dismissState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((zx2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (this.$isRemoved$delegate.getValue().booleanValue()) {
            ArrayList arrayList = lz2.a;
            Log.d("ConversationListItem", "reset", null);
            this.$onUpdateConversationFolder.q(this.$conversation, p12.a, new eu(this.$coroutineScope, this.$dismissState, this.$isRemoved$delegate));
        }
        return j6g.a;
    }
}
