package defpackage;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import com.indeed.android.messaging.data.conversations.InterviewLinkParams;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onInterviewButtonClicked$1", f = "SelectedConversationViewModel.kt", l = {485}, m = "invokeSuspend")
public final class h2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ InterviewLinkParams $data;
    final /* synthetic */ FragmentManager $fragmentManager;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2e(y1e y1eVar, InterviewLinkParams interviewLinkParams, FragmentManager fragmentManager, lu2<? super h2e> lu2Var) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
        this.$data = interviewLinkParams;
        this.$fragmentManager = fragmentManager;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new h2e(this.this$0, this.$data, this.$fragmentManager, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((h2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            ConversationsRemoteDataSource conversationsRemoteDataSource = this.this$0.V;
            InterviewLinkParams interviewLinkParams = this.$data;
            this.label = 1;
            obj = conversationsRemoteDataSource.getInterviewUrl(interviewLinkParams, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            ArrayList arrayList = lz2.a;
            Log.d("SelectedConversationViewModel", "schedule interview url: ".concat(str), null);
            ((v1g) cr8.p(v1g.class)).b(this.$fragmentManager, str);
        }
        return j6g.a;
    }
}
