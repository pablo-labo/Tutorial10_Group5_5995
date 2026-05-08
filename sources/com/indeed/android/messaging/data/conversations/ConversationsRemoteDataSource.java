package com.indeed.android.messaging.data.conversations;

import defpackage.ag;
import defpackage.aib;
import defpackage.c1f;
import defpackage.c8g;
import defpackage.cr8;
import defpackage.dx2;
import defpackage.e8g;
import defpackage.fq7;
import defpackage.g13;
import defpackage.hmf;
import defpackage.hva;
import defpackage.ita;
import defpackage.j6e;
import defpackage.j6g;
import defpackage.ju;
import defpackage.kh0;
import defpackage.l;
import defpackage.lh0;
import defpackage.lr9;
import defpackage.lu2;
import defpackage.o75;
import defpackage.pu2;
import defpackage.pua;
import defpackage.r6;
import defpackage.r7d;
import defpackage.tc5;
import defpackage.u63;
import defpackage.uh3;
import defpackage.vc5;
import defpackage.vw2;
import defpackage.w47;
import defpackage.yf;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JV\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b \u0010!J&\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001a\u001a\u00020\u00142\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0086@¢\u0006\u0004\b(\u0010)J<\u00101\u001a\u0002002\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.H\u0086@¢\u0006\u0004\b1\u00102J \u00105\u001a\u0002042\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b5\u00106J&\u0010<\u001a\u00020;2\f\u00108\u001a\b\u0012\u0004\u0012\u0002070+2\u0006\u0010:\u001a\u000209H\u0086@¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010>\u001a\u000207H\u0086@¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u000bH\u0086@¢\u0006\u0004\bB\u0010CJ\u0018\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000bH\u0086@¢\u0006\u0004\bE\u0010FJ\u001a\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bI\u0010JJ.\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010K\u001a\u00020\u000b2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\bN\u0010OJ\"\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010P\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bR\u0010%J\u001a\u0010U\u001a\u0004\u0018\u00010\u00142\u0006\u0010T\u001a\u00020SH\u0086@¢\u0006\u0004\bU\u0010VR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u0002098\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;", "", "Llr9;", "messagingLogger", "Lita;", "onlineStatusService", "<init>", "(Llr9;Lita;)V", "Lpua$a;", "T", "Lkotlin/Function1;", "", "responseValidator", "Llu2;", "Lkh0;", "query", "executeApolloCall", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Llu2;)Ljava/lang/Object;", "Lw47;", "folder", "", "before", "Lvc5;", "buildFindConversationCall$messaging_release", "(Lw47;Ljava/lang/String;)Lvc5;", "buildFindConversationCall", "conversationId", "Lo75;", "buildFetchConversationMessagesQuery$messaging_release", "(Ljava/lang/String;Ljava/lang/String;)Lo75;", "buildFetchConversationMessagesQuery", "Lcom/indeed/android/messaging/data/conversations/ConversationsRes;", "fetchLatestConversations", "(Lw47;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "startCursor", "Lcom/indeed/android/messaging/data/conversations/model/ConversationWithMessages;", "fetchConversationWithMessages", "(Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Ljava/util/Date;", "readCursor", "markConversationRead", "(Ljava/lang/String;Ljava/util/Date;Llu2;)Ljava/lang/Object;", "message", "", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "attachments", "Laib;", "scope", "Ljk8;", "sendConversationMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Laib;Llu2;)Ljava/lang/Object;", "newFolder", "Lj6g;", "moveConversationToFolder", "(Ljava/lang/String;Lw47;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "validParticipantList", "", "listenDurationSeconds", "Ldyc$g;", "registerOnlineStatusListeners", "(Ljava/util/List;ILlu2;)Ljava/lang/Object;", "participant", "Lm26$g;", "getOnlineStatusForSingleEmployerAccount", "(Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;Llu2;)Ljava/lang/Object;", "getJSOnlineStatus", "(Llu2;)Ljava/lang/Object;", "enabled", "setJSOnlineStatus", "(ZLlu2;)Ljava/lang/Object;", "jobKey", "Lrx7;", "getJobData", "(Ljava/lang/String;Llu2;)Ljava/lang/Object;", "isNewGeneration", "draft", "Lj56$d;", "getSuggestedMessageList", "(Ljava/lang/String;ZLjava/lang/String;Llu2;)Ljava/lang/Object;", "eventId", "Ll06$e;", "getInboundEmailData", "Lcom/indeed/android/messaging/data/conversations/InterviewLinkParams;", "data", "getInterviewUrl", "(Lcom/indeed/android/messaging/data/conversations/InterviewLinkParams;Llu2;)Ljava/lang/Object;", "Llr9;", "Lita;", "Llh0;", "oneGraphApolloClient", "Llh0;", "pageLimit", "I", "Companion", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConversationsRemoteDataSource {
    public static final String ROOT_TRACKING_KEY_HEADER = "indeed-root-tracking-key";
    private final lr9 messagingLogger;
    private final lh0 oneGraphApolloClient;
    private final ita onlineStatusService;
    private final int pageLimit;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w47.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$executeApolloCall$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {168, 174}, m = "executeApolloCall")
    public static final class AnonymousClass1<T extends pua.a> extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lu2<? super AnonymousClass1> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.executeApolloCall(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchConversationWithMessages$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {231}, m = "fetchConversationWithMessages")
    public static final class C06311 extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06311(lu2<? super C06311> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.fetchConversationWithMessages(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchLatestConversations$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {213}, m = "fetchLatestConversations")
    public static final class C06321 extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06321(lu2<? super C06321> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.fetchLatestConversations(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getInboundEmailData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {460}, m = "getInboundEmailData")
    public static final class C06331 extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06331(lu2<? super C06331> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.getInboundEmailData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getInterviewUrl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {511}, m = "getInterviewUrl")
    public static final class C06341 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C06341(lu2<? super C06341> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.getInterviewUrl(null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getJobData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {410}, m = "getJobData")
    public static final class C06351 extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C06351(lu2<? super C06351> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.getJobData(null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getOnlineStatusForSingleEmployerAccount$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {367}, m = "getOnlineStatusForSingleEmployerAccount")
    public static final class C06361 extends pu2 {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06361(lu2<? super C06361> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.getOnlineStatusForSingleEmployerAccount(null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getSuggestedMessageList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {446}, m = "getSuggestedMessageList")
    public static final class C06371 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C06371(lu2<? super C06371> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.getSuggestedMessageList(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$markConversationRead$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {263}, m = "markConversationRead")
    public static final class C06381 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C06381(lu2<? super C06381> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.markConversationRead(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$markConversationRead$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkh0;", "Le8g$a;", "<anonymous>", "()Lkh0;"}, k = 3, mv = {2, 2, 0})
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$markConversationRead$2", f = "ConversationsRemoteDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends c1f implements Function1<lu2<? super kh0<e8g.a>>, Object> {
        final /* synthetic */ c8g $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c8g c8gVar, lu2<? super AnonymousClass2> lu2Var) {
            super(1, lu2Var);
            this.$input = c8gVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return ConversationsRemoteDataSource.this.new AnonymousClass2(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super kh0<e8g.a>> lu2Var) {
            return ((AnonymousClass2) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            lh0 lh0Var = ConversationsRemoteDataSource.this.oneGraphApolloClient;
            e8g e8gVar = new e8g(this.$input);
            lh0Var.getClass();
            return new kh0(lh0Var, e8gVar);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$moveConversationToFolder$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkh0;", "Lag$c;", "<anonymous>", "()Lkh0;"}, k = 3, mv = {2, 2, 0})
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$moveConversationToFolder$3", f = "ConversationsRemoteDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends c1f implements Function1<lu2<? super kh0<ag.c>>, Object> {
        final /* synthetic */ yf $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(yf yfVar, lu2<? super AnonymousClass3> lu2Var) {
            super(1, lu2Var);
            this.$input = yfVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return ConversationsRemoteDataSource.this.new AnonymousClass3(this.$input, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super kh0<ag.c>> lu2Var) {
            return ((AnonymousClass3) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            lh0 lh0Var = ConversationsRemoteDataSource.this.oneGraphApolloClient;
            ag agVar = new ag(this.$input);
            lh0Var.getClass();
            return new kh0(lh0Var, agVar);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$registerOnlineStatusListeners$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {346}, m = "registerOnlineStatusListeners")
    public static final class C06391 extends pu2 {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06391(lu2<? super C06391> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.registerOnlineStatusListeners(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$sendConversationMessage$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {309}, m = "sendConversationMessage")
    public static final class C06401 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C06401(lu2<? super C06401> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.sendConversationMessage(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$setJSOnlineStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource", f = "ConversationsRemoteDataSource.kt", l = {397}, m = "setJSOnlineStatus")
    public static final class C06411 extends pu2 {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C06411(lu2<? super C06411> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsRemoteDataSource.this.setJSOnlineStatus(false, this);
        }
    }

    public ConversationsRemoteDataSource(lr9 lr9Var, ita itaVar) {
        lr9Var.getClass();
        itaVar.getClass();
        this.messagingLogger = lr9Var;
        this.onlineStatusService = itaVar;
        this.oneGraphApolloClient = ((fq7) cr8.p(fq7.class)).a();
        this.pageLimit = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:13:0x0038, B:33:0x00a3, B:36:0x00ab, B:39:0x00b8, B:40:0x00bf, B:41:0x00c0, B:43:0x00c6, B:45:0x00dc, B:46:0x00e1), top: B:54:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T extends pua.a> java.lang.Object executeApolloCall(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r11, kotlin.jvm.functions.Function1<? super defpackage.lu2<? super defpackage.kh0<T>>, ? extends java.lang.Object> r12, defpackage.lu2<? super T> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.executeApolloCall(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, lu2):java.lang.Object");
    }

    public static /* synthetic */ Object executeApolloCall$default(ConversationsRemoteDataSource conversationsRemoteDataSource, Function1 function1, Function1 function12, lu2 lu2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return conversationsRemoteDataSource.executeApolloCall(function1, function12, lu2Var);
    }

    public static /* synthetic */ Object fetchConversationWithMessages$default(ConversationsRemoteDataSource conversationsRemoteDataSource, String str, String str2, lu2 lu2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return conversationsRemoteDataSource.fetchConversationWithMessages(str, str2, lu2Var);
    }

    public static /* synthetic */ Object fetchLatestConversations$default(ConversationsRemoteDataSource conversationsRemoteDataSource, w47 w47Var, String str, lu2 lu2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return conversationsRemoteDataSource.fetchLatestConversations(w47Var, str, lu2Var);
    }

    public static /* synthetic */ Object getSuggestedMessageList$default(ConversationsRemoteDataSource conversationsRemoteDataSource, String str, boolean z, String str2, lu2 lu2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return conversationsRemoteDataSource.getSuggestedMessageList(str, z, str2, lu2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean moveConversationToFolder$lambda$6(ag.c cVar) {
        cVar.getClass();
        ag.a aVar = cVar.a;
        return (aVar != null ? aVar.a : null) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object sendConversationMessage$default(ConversationsRemoteDataSource conversationsRemoteDataSource, String str, String str2, List list, aib aibVar, lu2 lu2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            list = Collections.EMPTY_LIST;
            list.getClass();
        }
        List list2 = list;
        if ((i & 8) != 0) {
            aibVar = null;
        }
        return conversationsRemoteDataSource.sendConversationMessage(str, str2, list2, aibVar, lu2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sendConversationMessage$lambda$5(j6e.a aVar) {
        aVar.getClass();
        j6e.c cVar = aVar.a;
        return (cVar != null ? cVar.b.c : null) != null;
    }

    public final o75 buildFetchConversationMessagesQuery$messaging_release(String conversationId, String before) {
        conversationId.getClass();
        dx2 dx2Var = new dx2(conversationId);
        int i = this.pageLimit;
        hva cVar = before == null ? hva.a.a : new hva.c(before);
        String str = this.messagingLogger.c;
        if (str == null) {
            str = "";
        }
        return new o75(dx2Var, i, i, cVar, new hmf(str), new hva.c(Boolean.TRUE));
    }

    public final vc5 buildFindConversationCall$messaging_release(w47 folder, String before) {
        vw2 vw2Var;
        folder.getClass();
        int iOrdinal = folder.ordinal();
        w47 w47Var = w47.ARCHIVE;
        w47 w47Var2 = w47.SPAM;
        if (iOrdinal == 0) {
            vw2Var = new vw2(null, new hva.c(u63.a0(w47Var.a(), w47Var2.a())), 55);
        } else if (iOrdinal == 1) {
            vw2Var = new vw2(new hva.c(u63.Z(w47Var.a())), null, 59);
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                l.g();
                return null;
            }
            vw2Var = new vw2(null, new hva.c(u63.a0(w47Var.a(), w47Var2.a())), 55);
        } else {
            vw2Var = new vw2(new hva.c(u63.Z(w47Var2.a())), null, 59);
        }
        tc5 tc5Var = new tc5(new hva.c(vw2Var), 2);
        int i = this.pageLimit;
        return new vc5(tc5Var, i, i, before == null ? hva.a.a : new hva.c(before), new hva.c(Boolean.TRUE));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchConversationWithMessages(java.lang.String r9, java.lang.String r10, defpackage.lu2<? super com.indeed.android.messaging.data.conversations.model.ConversationWithMessages> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06311
            if (r0 == 0) goto L14
            r0 = r11
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchConversationWithMessages$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchConversationWithMessages$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchConversationWithMessages$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r4.result
            int r0 = r4.label
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L36
            if (r0 != r1) goto L30
            java.lang.Object r8 = r4.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r4.L$0
            java.lang.String r8 = (java.lang.String) r8
            defpackage.r7d.b(r11)
            goto L51
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r7
        L36:
            defpackage.r7d.b(r11)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchConversationWithMessages$res$1 r3 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchConversationWithMessages$res$1
            r3.<init>(r8, r9, r10, r7)
            r4.L$0 = r7
            r4.L$1 = r7
            r4.label = r1
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r8
            java.lang.Object r11 = executeApolloCall$default(r1, r2, r3, r4, r5, r6)
            g13 r8 = defpackage.g13.a
            if (r11 != r8) goto L51
            return r8
        L51:
            o75$d r11 = (o75.d) r11
            o75$c r8 = r11.a
            if (r8 == 0) goto La0
            o75$f r9 = r8.b
            jv2 r8 = r8.d
            com.indeed.android.messaging.data.conversations.Mapper r10 = com.indeed.android.messaging.data.conversations.Mapper.INSTANCE
            com.indeed.android.messaging.data.conversations.ConversationRecord r10 = r10.mapToConversationRecord(r8)
            if (r9 == 0) goto L91
            java.util.ArrayList r11 = r9.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.t92.r0(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L74:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r11.next()
            o75$e r1 = (o75.e) r1
            com.indeed.android.messaging.data.events.Mapper r2 = com.indeed.android.messaging.data.events.Mapper.INSTANCE
            java.lang.String r3 = r8.a
            com.indeed.android.messaging.data.events.EventRecord r1 = r2.mapToEventRecord(r1, r3)
            r0.add(r1)
            goto L74
        L8c:
            java.util.List r8 = defpackage.z92.z1(r0)
            goto L96
        L91:
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            r8.getClass()
        L96:
            if (r9 == 0) goto L9a
            o75$j r7 = r9.b
        L9a:
            com.indeed.android.messaging.data.conversations.model.ConversationWithMessages r9 = new com.indeed.android.messaging.data.conversations.model.ConversationWithMessages
            r9.<init>(r10, r8, r7)
            return r9
        La0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.fetchConversationWithMessages(java.lang.String, java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchLatestConversations(defpackage.w47 r9, java.lang.String r10, defpackage.lu2<? super com.indeed.android.messaging.data.conversations.ConversationsRes> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06321
            if (r0 == 0) goto L14
            r0 = r11
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchLatestConversations$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchLatestConversations$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchLatestConversations$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r4.result
            int r0 = r4.label
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L36
            if (r0 != r1) goto L30
            java.lang.Object r8 = r4.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r4.L$0
            w47 r8 = (defpackage.w47) r8
            defpackage.r7d.b(r11)
            goto L51
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r7
        L36:
            defpackage.r7d.b(r11)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchLatestConversations$res$1 r3 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$fetchLatestConversations$res$1
            r3.<init>(r8, r9, r10, r7)
            r4.L$0 = r7
            r4.L$1 = r7
            r4.label = r1
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r8
            java.lang.Object r11 = executeApolloCall$default(r1, r2, r3, r4, r5, r6)
            g13 r8 = defpackage.g13.a
            if (r11 != r8) goto L51
            return r8
        L51:
            vc5$b r11 = (vc5.b) r11
            vc5$c r8 = r11.a
            if (r8 == 0) goto L80
            java.util.ArrayList r8 = r8.a
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = defpackage.t92.r0(r8, r10)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L68:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L85
            java.lang.Object r10 = r8.next()
            vc5$a r10 = (vc5.a) r10
            com.indeed.android.messaging.data.conversations.Mapper r0 = com.indeed.android.messaging.data.conversations.Mapper.INSTANCE
            jv2 r10 = r10.c
            com.indeed.android.messaging.data.conversations.ConversationRecord r10 = r0.mapToConversationRecord(r10)
            r9.add(r10)
            goto L68
        L80:
            java.util.List r9 = java.util.Collections.EMPTY_LIST
            r9.getClass()
        L85:
            vc5$c r8 = r11.a
            if (r8 == 0) goto L8b
            vc5$d r7 = r8.b
        L8b:
            com.indeed.android.messaging.data.conversations.ConversationsRes r8 = new com.indeed.android.messaging.data.conversations.ConversationsRes
            r8.<init>(r9, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.fetchLatestConversations(w47, java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getInboundEmailData(java.lang.String r10, java.lang.String r11, defpackage.lu2<? super l06.e> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06331
            if (r0 == 0) goto L14
            r0 = r12
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getInboundEmailData$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06331) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getInboundEmailData$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getInboundEmailData$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r4.result
            int r0 = r4.label
            r7 = 0
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L34
            java.lang.Object r9 = r4.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r4.L$0
            java.lang.String r9 = (java.lang.String) r9
            defpackage.r7d.b(r12)     // Catch: java.lang.Throwable -> L31
            goto L55
        L31:
            r0 = move-exception
            r9 = r0
            goto L6f
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r8
        L3a:
            defpackage.r7d.b(r12)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getInboundEmailData$response$1 r3 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getInboundEmailData$response$1     // Catch: java.lang.Throwable -> L31
            r3.<init>(r9, r10, r11, r8)     // Catch: java.lang.Throwable -> L31
            r4.L$0 = r8     // Catch: java.lang.Throwable -> L31
            r4.L$1 = r8     // Catch: java.lang.Throwable -> L31
            r4.label = r1     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r9
            java.lang.Object r12 = executeApolloCall$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L31
            g13 r9 = defpackage.g13.a
            if (r12 != r9) goto L55
            return r9
        L55:
            l06$b r12 = (l06.b) r12     // Catch: java.lang.Throwable -> L31
            l06$a r9 = r12.a     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L6e
            l06$d r9 = r9.b     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L6e
            java.util.ArrayList r9 = r9.a     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r9.get(r7)     // Catch: java.lang.Throwable -> L31
            l06$c r9 = (l06.c) r9     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L6e
            l06$f r9 = r9.a     // Catch: java.lang.Throwable -> L31
            l06$e r9 = r9.a     // Catch: java.lang.Throwable -> L31
            return r9
        L6e:
            return r8
        L6f:
            java.util.ArrayList r10 = defpackage.lz2.a
            java.lang.String r10 = "ConversationsRemoteDataSource"
            java.lang.String r11 = "Failed to get InbondEmail data"
            defpackage.lz2.b(r10, r11, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.getInboundEmailData(java.lang.String, java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getInterviewUrl(com.indeed.android.messaging.data.conversations.InterviewLinkParams r20, defpackage.lu2<? super java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.getInterviewUrl(com.indeed.android.messaging.data.conversations.InterviewLinkParams, lu2):java.lang.Object");
    }

    public final Object getJSOnlineStatus(lu2<? super Boolean> lu2Var) {
        return this.onlineStatusService.a(lu2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getJobData(java.lang.String r10, defpackage.lu2<? super defpackage.rx7> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06351
            if (r0 == 0) goto L14
            r0 = r11
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getJobData$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getJobData$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getJobData$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r4.result
            int r0 = r4.label
            r7 = 0
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L36
            if (r0 != r1) goto L30
            java.lang.Object r9 = r4.L$0
            java.lang.String r9 = (java.lang.String) r9
            defpackage.r7d.b(r11)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r0 = move-exception
            r9 = r0
            goto L63
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r8
        L36:
            defpackage.r7d.b(r11)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getJobData$response$1 r3 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getJobData$response$1     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r9, r10, r8)     // Catch: java.lang.Throwable -> L2d
            r4.L$0 = r8     // Catch: java.lang.Throwable -> L2d
            r4.label = r1     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r9
            java.lang.Object r11 = executeApolloCall$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            g13 r9 = defpackage.g13.a
            if (r11 != r9) goto L4f
            return r9
        L4f:
            z16$a r11 = (z16.a) r11     // Catch: java.lang.Throwable -> L2d
            z16$c r9 = r11.a     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r9 = r9.a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = defpackage.z92.R0(r7, r9)     // Catch: java.lang.Throwable -> L2d
            z16$d r9 = (z16.d) r9     // Catch: java.lang.Throwable -> L2d
            if (r9 == 0) goto L62
            z16$b r9 = r9.a     // Catch: java.lang.Throwable -> L2d
            rx7 r9 = r9.b     // Catch: java.lang.Throwable -> L2d
            return r9
        L62:
            return r8
        L63:
            java.util.ArrayList r10 = defpackage.lz2.a
            java.lang.String r10 = "ConversationsRemoteDataSource"
            java.lang.String r11 = "Failed to get job data"
            defpackage.lz2.b(r10, r11, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.getJobData(java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getOnlineStatusForSingleEmployerAccount(com.indeed.android.messaging.data.conversations.ConversationRecord.Participant r10, defpackage.lu2<? super m26.g> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06361
            if (r0 == 0) goto L14
            r0 = r11
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getOnlineStatusForSingleEmployerAccount$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getOnlineStatusForSingleEmployerAccount$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getOnlineStatusForSingleEmployerAccount$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r4.result
            int r0 = r4.label
            r7 = 0
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L34
            java.lang.Object r9 = r4.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r4.L$0
            com.indeed.android.messaging.data.conversations.ConversationRecord$Participant r9 = (com.indeed.android.messaging.data.conversations.ConversationRecord.Participant) r9
            defpackage.r7d.b(r11)     // Catch: java.lang.Throwable -> L31
            goto L5d
        L31:
            r0 = move-exception
            r9 = r0
            goto L62
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r8
        L3a:
            defpackage.r7d.b(r11)
            java.lang.String r11 = r10.getOnlineStatusId()
            if (r11 == 0) goto L6b
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getOnlineStatusForSingleEmployerAccount$2$response$1 r3 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getOnlineStatusForSingleEmployerAccount$2$response$1     // Catch: java.lang.Throwable -> L31
            r3.<init>(r9, r10, r8)     // Catch: java.lang.Throwable -> L31
            r4.L$0 = r8     // Catch: java.lang.Throwable -> L31
            r4.L$1 = r8     // Catch: java.lang.Throwable -> L31
            r4.I$0 = r7     // Catch: java.lang.Throwable -> L31
            r4.label = r1     // Catch: java.lang.Throwable -> L31
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r9
            java.lang.Object r11 = executeApolloCall$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L31
            g13 r9 = defpackage.g13.a
            if (r11 != r9) goto L5d
            return r9
        L5d:
            m26$b r11 = (m26.b) r11     // Catch: java.lang.Throwable -> L31
            m26$g r9 = r11.a     // Catch: java.lang.Throwable -> L31
            return r9
        L62:
            java.util.ArrayList r10 = defpackage.lz2.a
            java.lang.String r10 = "ConversationsRemoteDataSource"
            java.lang.String r11 = "Failed to fetch employer online status"
            defpackage.lz2.b(r10, r11, r7, r9)
        L6b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.getOnlineStatusForSingleEmployerAccount(com.indeed.android.messaging.data.conversations.ConversationRecord$Participant, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getSuggestedMessageList(java.lang.String r9, boolean r10, java.lang.String r11, defpackage.lu2<? super j56.d> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06371
            if (r0 == 0) goto L14
            r0 = r12
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getSuggestedMessageList$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getSuggestedMessageList$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getSuggestedMessageList$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r4.result
            int r0 = r4.label
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L43
            if (r0 != r1) goto L3d
            java.lang.Object r8 = r4.L$3
            sye r8 = (defpackage.sye) r8
            java.lang.Object r8 = r4.L$2
            qye r8 = (defpackage.qye) r8
            java.lang.Object r8 = r4.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r4.L$0
            java.lang.String r8 = (java.lang.String) r8
            defpackage.r7d.b(r12)     // Catch: java.lang.Throwable -> L39
            goto La9
        L39:
            r0 = move-exception
            r8 = r0
            goto Lb3
        L3d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r7
        L43:
            defpackage.r7d.b(r12)
            if (r10 != 0) goto L61
            if (r11 == 0) goto L61
            int r12 = r11.length()
            if (r12 != 0) goto L51
            goto L61
        L51:
            qye r12 = new qye
            wye r0 = new wye
            r0.<init>(r11)
            hva$c r11 = new hva$c
            r11.<init>(r0)
            r12.<init>(r7, r11, r1)
            goto L7c
        L61:
            if (r11 == 0) goto L69
            hva$c r12 = new hva$c
            r12.<init>(r11)
            goto L6b
        L69:
            hva$a r12 = hva.a.a
        L6b:
            tye r11 = new tye
            r11.<init>(r12)
            hva$c r12 = new hva$c
            r12.<init>(r11)
            qye r11 = new qye
            r0 = 2
            r11.<init>(r12, r7, r0)
            r12 = r11
        L7c:
            sye r11 = new sye
            pye r0 = new pye
            hva$c r2 = new hva$c
            r2.<init>(r9)
            r0.<init>(r2)
            r11.<init>(r0, r12)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getSuggestedMessageList$response$1 r3 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$getSuggestedMessageList$response$1     // Catch: java.lang.Throwable -> L39
            r3.<init>(r8, r11, r7)     // Catch: java.lang.Throwable -> L39
            r4.L$0 = r7     // Catch: java.lang.Throwable -> L39
            r4.L$1 = r7     // Catch: java.lang.Throwable -> L39
            r4.L$2 = r7     // Catch: java.lang.Throwable -> L39
            r4.L$3 = r7     // Catch: java.lang.Throwable -> L39
            r4.Z$0 = r10     // Catch: java.lang.Throwable -> L39
            r4.label = r1     // Catch: java.lang.Throwable -> L39
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r8
            java.lang.Object r12 = executeApolloCall$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L39
            g13 r8 = defpackage.g13.a
            if (r12 != r8) goto La9
            return r8
        La9:
            j56$b r12 = (j56.b) r12     // Catch: java.lang.Throwable -> L39
            j56$a r8 = r12.a     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto Lb2
            j56$d r8 = r8.a     // Catch: java.lang.Throwable -> L39
            return r8
        Lb2:
            return r7
        Lb3:
            java.util.ArrayList r9 = defpackage.lz2.a
            java.lang.String r9 = "Failed to get SuggestedMessages data"
            r10 = 0
            java.lang.String r11 = "ConversationsRemoteDataSource"
            defpackage.lz2.b(r11, r9, r10, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.getSuggestedMessageList(java.lang.String, boolean, java.lang.String, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object markConversationRead(java.lang.String r8, java.util.Date r9, defpackage.lu2<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06381
            if (r0 == 0) goto L14
            r0 = r10
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$markConversationRead$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$markConversationRead$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$markConversationRead$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.result
            int r0 = r4.label
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L34
            java.lang.Object r7 = r4.L$2
            c8g r7 = (defpackage.c8g) r7
            java.lang.Object r7 = r4.L$1
            java.util.Date r7 = (java.util.Date) r7
            java.lang.Object r7 = r4.L$0
            java.lang.String r7 = (java.lang.String) r7
            defpackage.r7d.b(r10)     // Catch: java.lang.Throwable -> L64
            goto L61
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L3a:
            defpackage.r7d.b(r10)
            c8g r10 = new c8g
            hva$c r0 = new hva$c
            r0.<init>(r9)
            r10.<init>(r0, r8)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$markConversationRead$2 r3 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$markConversationRead$2     // Catch: java.lang.Throwable -> L64
            r3.<init>(r10, r2)     // Catch: java.lang.Throwable -> L64
            r4.L$0 = r2     // Catch: java.lang.Throwable -> L64
            r4.L$1 = r2     // Catch: java.lang.Throwable -> L64
            r4.L$2 = r2     // Catch: java.lang.Throwable -> L64
            r4.label = r1     // Catch: java.lang.Throwable -> L64
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r7 = executeApolloCall$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L64
            g13 r8 = defpackage.g13.a
            if (r7 != r8) goto L61
            return r8
        L61:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L64
            return r7
        L64:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.markConversationRead(java.lang.String, java.util.Date, lu2):java.lang.Object");
    }

    public final Object moveConversationToFolder(String str, w47 w47Var, lu2<? super j6g> lu2Var) throws Exception {
        Object objExecuteApolloCall = executeApolloCall(new ju(3), new AnonymousClass3(new yf(str, u63.Z(w47Var.a())), null), lu2Var);
        return objExecuteApolloCall == g13.a ? objExecuteApolloCall : j6g.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object registerOnlineStatusListeners(java.util.List<com.indeed.android.messaging.data.conversations.ConversationRecord.Participant> r8, int r9, defpackage.lu2<? super dyc.g> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06391
            if (r0 == 0) goto L14
            r0 = r10
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$registerOnlineStatusListeners$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06391) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$registerOnlineStatusListeners$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$registerOnlineStatusListeners$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.result
            int r0 = r4.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L37
            if (r0 != r2) goto L31
            java.lang.Object r7 = r4.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r4.L$0
            java.util.List r7 = (java.util.List) r7
            defpackage.r7d.b(r10)
            goto Lb3
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r1
        L37:
            defpackage.r7d.b(r10)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L45:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r8.next()
            r3 = r0
            com.indeed.android.messaging.data.conversations.ConversationRecord$Participant r3 = (com.indeed.android.messaging.data.conversations.ConversationRecord.Participant) r3
            java.lang.String r3 = r3.getAccountKey()
            if (r3 == 0) goto L45
            boolean r3 = defpackage.zve.U(r3)
            if (r3 == 0) goto L5f
            goto L45
        L5f:
            r10.add(r0)
            goto L45
        L63:
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.t92.r0(r10, r0)
            r8.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L72:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r0 = r10.next()
            com.indeed.android.messaging.data.conversations.ConversationRecord$Participant r0 = (com.indeed.android.messaging.data.conversations.ConversationRecord.Participant) r0
            xsa r3 = new xsa
            zsa r5 = defpackage.zsa.JOBSEEKER
            java.lang.String r5 = r0.getAccountKey()
            r5.getClass()
            java.lang.String r0 = r0.getAdvertiserKey()
            hva$c r6 = new hva$c
            r6.<init>(r0)
            r3.<init>(r6, r5)
            r8.add(r3)
            goto L72
        L99:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$registerOnlineStatusListeners$response$1 r3 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$registerOnlineStatusListeners$response$1
            r3.<init>(r7, r8, r9, r1)
            r4.L$0 = r1
            r4.L$1 = r1
            r4.I$0 = r9
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r10 = executeApolloCall$default(r1, r2, r3, r4, r5, r6)
            g13 r7 = defpackage.g13.a
            if (r10 != r7) goto Lb3
            return r7
        Lb3:
            dyc$b r10 = (dyc.b) r10
            dyc$g r7 = r10.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.registerOnlineStatusListeners(java.util.List, int, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendConversationMessage(java.lang.String r7, java.lang.String r8, java.util.List<com.indeed.android.messaging.data.events.EventRecord.Attachment> r9, defpackage.aib r10, defpackage.lu2<? super defpackage.jk8> r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.sendConversationMessage(java.lang.String, java.lang.String, java.util.List, aib, lu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setJSOnlineStatus(boolean r8, defpackage.lu2<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06411
            if (r0 == 0) goto L14
            r0 = r9
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$setJSOnlineStatus$1 r0 = (com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.C06411) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$setJSOnlineStatus$1 r0 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$setJSOnlineStatus$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            int r0 = r4.label
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L28
            defpackage.r7d.b(r9)
            goto L5c
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r2
        L2e:
            defpackage.r7d.b(r9)
            java.util.ArrayList r9 = defpackage.lz2.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Setting JS Online status to: "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "ConversationsRemoteDataSource"
            android.util.Log.d(r0, r9, r2)
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$setJSOnlineStatus$response$1 r3 = new com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource$setJSOnlineStatus$response$1
            r3.<init>(r7, r8, r2)
            r4.Z$0 = r8
            r4.label = r1
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r7
            java.lang.Object r9 = executeApolloCall$default(r1, r2, r3, r4, r5, r6)
            g13 r7 = defpackage.g13.a
            if (r9 != r7) goto L5c
            return r7
        L5c:
            lae$a r9 = (lae.a) r9
            lae$c r7 = r9.a
            lae$d r7 = r7.a
            if (r7 == 0) goto L6b
            lae$b r7 = r7.a
            if (r7 == 0) goto L6b
            boolean r7 = r7.a
            goto L6c
        L6b:
            r7 = 0
        L6c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource.setJSOnlineStatus(boolean, lu2):java.lang.Object");
    }
}
