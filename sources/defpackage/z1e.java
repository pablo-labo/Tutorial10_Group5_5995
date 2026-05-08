package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import com.indeed.android.messaging.data.conversations.InitiateResponse;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$initiateConversation$1", f = "SelectedConversationViewModel.kt", l = {511}, m = "invokeSuspend")
public final class z1e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<String, j6g> $onNavigateToConversation;
    final /* synthetic */ gu5<j6g> $onNavigateToInbox;
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z1e(y1e y1eVar, String str, Function1<? super String, j6g> function1, gu5<j6g> gu5Var, lu2<? super z1e> lu2Var) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
        this.$token = str;
        this.$onNavigateToConversation = function1;
        this.$onNavigateToInbox = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new z1e(this.this$0, this.$token, this.$onNavigateToConversation, this.$onNavigateToInbox, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((z1e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objInitiateConversation;
        Object value2;
        Object value3;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                gse gseVar = this.this$0.c0;
                do {
                    value = gseVar.getValue();
                } while (!gseVar.h(value, x1e.a((x1e) value, null, null, false, false, true, null, false, false, false, null, null, null, null, false, false, null, false, false, 0, null, null, null, null, false, null, 67108847)));
                ConversationsRepository conversationsRepository = this.this$0.b;
                String str = this.$token;
                this.label = 1;
                objInitiateConversation = conversationsRepository.initiateConversation(str, this);
                g13 g13Var = g13.a;
                if (objInitiateConversation == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                objInitiateConversation = obj;
            }
            InitiateResponse initiateResponse = (InitiateResponse) objInitiateConversation;
            if (initiateResponse.getExists()) {
                this.$onNavigateToConversation.invoke(initiateResponse.getConversationId());
            } else {
                gse gseVar2 = this.this$0.W;
                do {
                    value2 = gseVar2.getValue();
                } while (!gseVar2.h(value2, initiateResponse.getConversationId()));
                gse gseVar3 = this.this$0.c0;
                do {
                    value3 = gseVar3.getValue();
                } while (!gseVar3.h(value3, x1e.a((x1e) value3, null, null, false, false, false, null, false, false, false, null, null, initiateResponse.getInitiateScope(), null, false, false, null, false, false, 0, null, null, null, null, false, null, 67106791)));
                lr9 lr9Var = this.this$0.f;
                String conversationSid = initiateResponse.getConversationSid();
                lr9Var.getClass();
                conversationSid.getClass();
                lr9Var.g(new nr9(lr9Var, conversationSid, null));
            }
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.b("SelectedConversationViewModel", "Failed to initiate conversation", false, e);
            this.$onNavigateToInbox.invoke();
        }
        return j6g.a;
    }
}
