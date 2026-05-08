package com.indeed.android.messaging.data.conversations;

import defpackage.c1f;
import defpackage.j6g;
import defpackage.kh0;
import defpackage.lh0;
import defpackage.lu2;
import defpackage.o75;
import defpackage.r6;
import defpackage.r7d;
import defpackage.uh3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkh0;", "Lo75$d;", "<anonymous>", "()Lkh0;"}, k = 3, mv = {2, 2, 0})
@uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchConversationWithMessages$res$1", f = "ConversationsRemoteDataSource.kt", l = {}, m = "invokeSuspend")
public final class ConversationsRemoteDataSource$fetchConversationWithMessages$res$1 extends c1f implements Function1<lu2<? super kh0<o75.d>>, Object> {
    final /* synthetic */ String $conversationId;
    final /* synthetic */ String $startCursor;
    int label;
    final /* synthetic */ ConversationsRemoteDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsRemoteDataSource$fetchConversationWithMessages$res$1(ConversationsRemoteDataSource conversationsRemoteDataSource, String str, String str2, lu2<? super ConversationsRemoteDataSource$fetchConversationWithMessages$res$1> lu2Var) {
        super(1, lu2Var);
        this.this$0 = conversationsRemoteDataSource;
        this.$conversationId = str;
        this.$startCursor = str2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new ConversationsRemoteDataSource$fetchConversationWithMessages$res$1(this.this$0, this.$conversationId, this.$startCursor, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super kh0<o75.d>> lu2Var) {
        return ((ConversationsRemoteDataSource$fetchConversationWithMessages$res$1) create(lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        lh0 lh0Var = this.this$0.oneGraphApolloClient;
        o75 o75VarBuildFetchConversationMessagesQuery$messaging_release = this.this$0.buildFetchConversationMessagesQuery$messaging_release(this.$conversationId, this.$startCursor);
        lh0Var.getClass();
        o75VarBuildFetchConversationMessagesQuery$messaging_release.getClass();
        return new kh0(lh0Var, o75VarBuildFetchConversationMessagesQuery$messaging_release);
    }
}
