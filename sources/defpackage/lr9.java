package defpackage;

import android.util.Base64;
import android.util.Log;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.jobsearch.BuildConfig;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.ho7;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class lr9 {
    public final sr9 a;
    public final d2f b = new d2f(new fc2(9));
    public String c;

    @uh3(c = "com.indeed.android.messaging.utils.MessagingLogger$emitConversationArchived$1", f = "MessagingLogger.kt", l = {152}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<String, lu2<? super j6g>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ p12 $trigger;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: lr9$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0309a extends qv5 implements Function2<ApiError, Request, j6g> {
            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(ApiError apiError, Request request) {
                ApiError apiError2 = apiError;
                apiError2.getClass();
                lr9.a((lr9) this.receiver, apiError2, request);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, p12 p12Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$conversationId = str;
            this.$trigger = p12Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = lr9.this.new a(this.$conversationId, this.$trigger, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, lu2<? super j6g> lu2Var) {
            return ((a) create(str, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[RETURN] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = r0.L$0
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L19
                if (r2 != r4) goto L13
                defpackage.r7d.b(r18)
                goto L85
            L13:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r0)
                return r3
            L19:
                defpackage.r7d.b(r18)
                lr9 r2 = defpackage.lr9.this
                sr9 r2 = r2.a
                xig r5 = new xig
                p7 r6 = defpackage.p7.c
                ho7$a r7 = defpackage.ho7.Companion
                java.lang.String r7 = r0.$conversationId
                r7.getClass()
                java.lang.String r8 = "CONVERSATION_SERVICE_ENCRYPTED///"
                java.lang.String r7 = r8.concat(r7)
                java.nio.charset.Charset r8 = defpackage.a32.b
                byte[] r7 = r7.getBytes(r8)
                r7.getClass()
                r8 = 2
                java.lang.String r7 = android.util.Base64.encodeToString(r7, r8)
                r7.getClass()
                nz r9 = new nz
                lr9 r10 = defpackage.lr9.this
                p12 r11 = r0.$trigger
                r10.getClass()
                int r10 = r11.ordinal()
                if (r10 == 0) goto L59
                if (r10 == r8) goto L55
                r14 = r3
                goto L5c
            L55:
                bs0 r8 = defpackage.bs0.b
            L57:
                r14 = r8
                goto L5c
            L59:
                bs0 r8 = defpackage.bs0.c
                goto L57
            L5c:
                r15 = 15
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r9.<init>(r10, r11, r12, r13, r14, r15)
                r5.<init>(r1, r6, r7, r9)
                lr9$a$a r10 = new lr9$a$a
                lr9 r12 = defpackage.lr9.this
                java.lang.String r15 = "callbackLogError(Lcom/indeed/android/backendservices/common/api/ApiError;Lokhttp3/Request;)V"
                r16 = 0
                r11 = 2
                java.lang.Class<lr9> r13 = defpackage.lr9.class
                java.lang.String r14 = "callbackLogError"
                r10.<init>(r11, r12, r13, r14, r15, r16)
                r0.L$0 = r3
                r0.label = r4
                java.lang.Object r0 = r2.T(r5, r10, r0)
                g13 r1 = defpackage.g13.a
                if (r0 != r1) goto L85
                return r1
            L85:
                j6g r0 = defpackage.j6g.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lr9.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.messaging.utils.MessagingLogger$emitConversationRestored$1", f = "MessagingLogger.kt", l = {179}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<String, lu2<? super j6g>, Object> {
        final /* synthetic */ String $conversationId;
        final /* synthetic */ p12 $trigger;
        /* synthetic */ Object L$0;
        int label;

        public static final /* synthetic */ class a extends qv5 implements Function2<ApiError, Request, j6g> {
            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(ApiError apiError, Request request) {
                ApiError apiError2 = apiError;
                apiError2.getClass();
                lr9.a((lr9) this.receiver, apiError2, request);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, p12 p12Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$conversationId = str;
            this.$trigger = p12Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = lr9.this.new b(this.$conversationId, this.$trigger, lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, lu2<? super j6g> lu2Var) {
            return ((b) create(str, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[RETURN] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = r0.L$0
                java.lang.String r1 = (java.lang.String) r1
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L19
                if (r2 != r4) goto L13
                defpackage.r7d.b(r18)
                goto L85
            L13:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r0)
                return r3
            L19:
                defpackage.r7d.b(r18)
                lr9 r2 = defpackage.lr9.this
                sr9 r2 = r2.a
                xig r5 = new xig
                p7 r6 = defpackage.p7.d
                ho7$a r7 = defpackage.ho7.Companion
                java.lang.String r7 = r0.$conversationId
                r7.getClass()
                java.lang.String r8 = "CONVERSATION_SERVICE_ENCRYPTED///"
                java.lang.String r7 = r8.concat(r7)
                java.nio.charset.Charset r8 = defpackage.a32.b
                byte[] r7 = r7.getBytes(r8)
                r7.getClass()
                r8 = 2
                java.lang.String r7 = android.util.Base64.encodeToString(r7, r8)
                r7.getClass()
                nz r9 = new nz
                lr9 r10 = defpackage.lr9.this
                p12 r11 = r0.$trigger
                r10.getClass()
                int r10 = r11.ordinal()
                if (r10 == 0) goto L59
                if (r10 == r8) goto L55
                r14 = r3
                goto L5c
            L55:
                bs0 r8 = defpackage.bs0.b
            L57:
                r14 = r8
                goto L5c
            L59:
                bs0 r8 = defpackage.bs0.c
                goto L57
            L5c:
                r15 = 15
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r9.<init>(r10, r11, r12, r13, r14, r15)
                r5.<init>(r1, r6, r7, r9)
                lr9$b$a r10 = new lr9$b$a
                lr9 r12 = defpackage.lr9.this
                java.lang.String r15 = "callbackLogError(Lcom/indeed/android/backendservices/common/api/ApiError;Lokhttp3/Request;)V"
                r16 = 0
                r11 = 2
                java.lang.Class<lr9> r13 = defpackage.lr9.class
                java.lang.String r14 = "callbackLogError"
                r10.<init>(r11, r12, r13, r14, r15, r16)
                r0.L$0 = r3
                r0.label = r4
                java.lang.Object r0 = r2.T(r5, r10, r0)
                g13 r1 = defpackage.g13.a
                if (r0 != r1) goto L85
                return r1
            L85:
                j6g r0 = defpackage.j6g.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lr9.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.indeed.android.messaging.utils.MessagingLogger$emitConversationsImpression$1", f = "MessagingLogger.kt", l = {71}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<String, lu2<? super j6g>, Object> {
        final /* synthetic */ List<ConversationRecord> $conversations;
        /* synthetic */ Object L$0;
        int label;

        public static final /* synthetic */ class a extends qv5 implements Function2<ApiError, Request, j6g> {
            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(ApiError apiError, Request request) {
                ApiError apiError2 = apiError;
                apiError2.getClass();
                lr9.a((lr9) this.receiver, apiError2, request);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<ConversationRecord> list, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$conversations = list;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = lr9.this.new c(this.$conversations, lu2Var);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, lu2<? super j6g> lu2Var) {
            return ((c) create(str, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            String strA;
            String str = (String) this.L$0;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                sr9 sr9Var = lr9.this.a;
                ho7.a aVar = ho7.Companion;
                List<ConversationRecord> list = this.$conversations;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String id = ((ConversationRecord) it.next()).getId();
                    id.getClass();
                    byte[] bytes = "CONVERSATION_SERVICE_ENCRYPTED///".concat(id).getBytes(a32.b);
                    bytes.getClass();
                    String strEncodeToString = Base64.encodeToString(bytes, 2);
                    strEncodeToString.getClass();
                    arrayList.add(strEncodeToString);
                }
                List<ConversationRecord> list2 = this.$conversations;
                ArrayList arrayList2 = new ArrayList(t92.r0(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ConversationRecord) it2.next()).getFolder().c());
                }
                List<ConversationRecord> list3 = this.$conversations;
                ArrayList arrayList3 = new ArrayList(t92.r0(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (true) {
                    boolean z = false;
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((ConversationRecord) it3.next()).getCompanyName().length() > 0) {
                        z = true;
                    }
                    arrayList3.add(Boolean.valueOf(z));
                }
                List<ConversationRecord> list4 = this.$conversations;
                ArrayList arrayList4 = new ArrayList(t92.r0(list4, 10));
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    String jobKey = ((ConversationRecord) it4.next()).getJob().getJobKey();
                    arrayList4.add(Boolean.valueOf(jobKey != null && jobKey.length() > 0));
                }
                List<ConversationRecord> list5 = this.$conversations;
                ArrayList arrayList5 = new ArrayList(t92.r0(list5, 10));
                Iterator<T> it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(Boolean.valueOf(((ConversationRecord) it5.next()).getFolder() == w47.ARCHIVE));
                }
                List<ConversationRecord> list6 = this.$conversations;
                ArrayList arrayList6 = new ArrayList(t92.r0(list6, 10));
                for (ConversationRecord conversationRecord : list6) {
                    arrayList6.add(Boolean.TRUE);
                }
                List<ConversationRecord> list7 = this.$conversations;
                ArrayList arrayList7 = new ArrayList(t92.r0(list7, 10));
                Iterator<T> it6 = list7.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(Boolean.valueOf(((ConversationRecord) it6.next()).getLastEventTimestamp() < 1577836800));
                }
                List<ConversationRecord> list8 = this.$conversations;
                ArrayList arrayList8 = new ArrayList(t92.r0(list8, 10));
                Iterator<T> it7 = list8.iterator();
                while (it7.hasNext()) {
                    String jobKey2 = ((ConversationRecord) it7.next()).getJob().getJobKey();
                    if (jobKey2 == null) {
                        jobKey2 = "";
                    }
                    arrayList8.add(jobKey2);
                }
                List<ConversationRecord> list9 = this.$conversations;
                ArrayList arrayList9 = new ArrayList(t92.r0(list9, 10));
                Iterator<T> it8 = list9.iterator();
                while (it8.hasNext()) {
                    String lastEventId = ((ConversationRecord) it8.next()).getLastEventId();
                    if (lastEventId == null) {
                        lastEventId = "";
                    }
                    arrayList9.add(lastEventId);
                }
                List<ConversationRecord> list10 = this.$conversations;
                ArrayList arrayList10 = new ArrayList(t92.r0(list10, 10));
                Iterator<T> it9 = list10.iterator();
                while (it9.hasNext()) {
                    sw2 lastEventType = ((ConversationRecord) it9.next()).getLastEventType();
                    if (lastEventType == null || (strA = lastEventType.a()) == null) {
                        strA = "";
                    }
                    arrayList10.add(strA);
                }
                int size = this.$conversations.size();
                ArrayList arrayList11 = new ArrayList(size);
                int i2 = 0;
                while (i2 < size) {
                    arrayList11.add(new Integer(i2));
                    i2++;
                    size = size;
                }
                List<ConversationRecord> list11 = this.$conversations;
                ArrayList arrayList12 = new ArrayList(t92.r0(list11, 10));
                Iterator<T> it10 = list11.iterator();
                while (it10.hasNext()) {
                    arrayList12.add(Boolean.valueOf(((ConversationRecord) it10.next()).getAwaitingJobSeekerResponse()));
                }
                List<ConversationRecord> list12 = this.$conversations;
                ArrayList arrayList13 = new ArrayList(t92.r0(list12, 10));
                Iterator<T> it11 = list12.iterator();
                while (it11.hasNext()) {
                    arrayList13.add(((ConversationRecord) it11.next()).getConversationContext().toString());
                }
                List<ConversationRecord> list13 = this.$conversations;
                ArrayList arrayList14 = new ArrayList(t92.r0(list13, 10));
                for (Iterator it12 = list13.iterator(); it12.hasNext(); it12 = it12) {
                    arrayList14.add(new Integer(((ConversationRecord) it12.next()).getUnreadCount()));
                }
                jo7 jo7Var = new jo7(arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13, arrayList14, 4256);
                lr9.this.getClass();
                m47 m47Var = new m47(str, arrayList, jo7Var, lr9.b(null));
                a aVar2 = new a(2, lr9.this, lr9.class, "callbackLogError", "callbackLogError(Lcom/indeed/android/backendservices/common/api/ApiError;Lokhttp3/Request;)V", 0);
                this.L$0 = null;
                this.label = 1;
                Object objD = sr9Var.d(m47Var, aVar2, this);
                g13 g13Var = g13.a;
                if (objD == g13Var) {
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

    @uh3(c = "com.indeed.android.messaging.utils.MessagingLogger$emitPageLoad$1$1", f = "MessagingLogger.kt", l = {49}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $from;
        final /* synthetic */ String $it;
        int label;

        public static final /* synthetic */ class a extends qv5 implements Function2<ApiError, Request, j6g> {
            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(ApiError apiError, Request request) {
                ApiError apiError2 = apiError;
                apiError2.getClass();
                lr9.a((lr9) this.receiver, apiError2, request);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$it = str;
            this.$from = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return lr9.this.new d(this.$it, this.$from, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                sr9 sr9Var = lr9.this.a;
                String str = this.$it;
                lr9 lr9Var = lr9.this;
                String str2 = this.$from;
                lr9Var.getClass();
                l0b l0bVar = new l0b(str, lr9.b(str2));
                a aVar = new a(2, lr9.this, lr9.class, "callbackLogError", "callbackLogError(Lcom/indeed/android/backendservices/common/api/ApiError;Lokhttp3/Request;)V", 0);
                this.label = 1;
                ArrayList arrayList = lz2.a;
                Log.d("MessagingLogger", "posting page load:\n" + l0bVar, null);
                Object objA = b.a.a(sr9Var, new ur9(sr9Var, l0bVar, null), aVar, this);
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

    @uh3(c = "com.indeed.android.messaging.utils.MessagingLogger$withPageLoadTk$1$1", f = "MessagingLogger.kt", l = {205}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Function2<String, lu2<? super j6g>, Object> $content;
        final /* synthetic */ String $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function2<? super String, ? super lu2<? super j6g>, ? extends Object> function2, String str, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$content = function2;
            this.$it = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new e(this.$content, this.$it, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Function2<String, lu2<? super j6g>, Object> function2 = this.$content;
                String str = this.$it;
                this.label = 1;
                Object objInvoke = function2.invoke(str, this);
                g13 g13Var = g13.a;
                if (objInvoke == g13Var) {
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

    public lr9(sr9 sr9Var) {
        this.a = sr9Var;
    }

    public static final void a(lr9 lr9Var, ApiError apiError, Request request) {
        lr9Var.getClass();
        ArrayList arrayList = lz2.a;
        HttpUrl httpUrl = request != null ? request.a : null;
        lz2.b("MessagingLogger", "Error logging to " + httpUrl + "\n" + apiError.getErrorType() + "\n" + apiError.getError(), false, apiError.getCause());
    }

    public static nz b(String str) {
        String strB = ((pp7) cr8.p(pp7.class)).b();
        return new nz(strB, BuildConfig.VERSION_NAME, zkd.c0, str, (bs0) null, 16);
    }

    public final void c(String str, p12 p12Var) {
        str.getClass();
        p12Var.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.h(4, br9.a[p12Var.ordinal()] == 1 ? "messagingConversationDetails" : "messagingInbox", "messagingArchiveConversation", new ne(p12Var, 11)));
        g(new a(str, p12Var, null));
    }

    public final void d(String str, p12 p12Var, w47 w47Var) {
        String str2;
        str.getClass();
        p12Var.getClass();
        w47Var.getClass();
        tp7 tp7Var = (tp7) cr8.p(tp7.class);
        int iOrdinal = w47Var.ordinal();
        if (iOrdinal == 0) {
            str2 = "messagingInbox";
        } else if (iOrdinal == 1) {
            str2 = "messagingArchive";
        } else if (iOrdinal == 2) {
            str2 = "messagingSpam";
        } else {
            if (iOrdinal != 3) {
                l.g();
                return;
            }
            str2 = "messagingDrafts";
        }
        tp7Var.b(new sp7.h(4, str2, "messagingRestoreConversation", new j91(p12Var, 10)));
        if (w47Var == w47.ARCHIVE) {
            g(new b(str, p12Var, null));
        }
    }

    public final void e(w47 w47Var, List<ConversationRecord> list) {
        final int i;
        String str;
        w47Var.getClass();
        list.getClass();
        List<ConversationRecord> list2 = list;
        boolean z = list2 instanceof Collection;
        final int i2 = 0;
        if (z && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((ConversationRecord) it.next()).getUnreadCount() == 0 && (i = i + 1) < 0) {
                    u63.n0();
                    throw null;
                }
            }
        }
        if (!z || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((ConversationRecord) it2.next()).getUnreadCount() > 0 && (i2 = i2 + 1) < 0) {
                    u63.n0();
                    throw null;
                }
            }
        }
        tp7 tp7Var = (tp7) cr8.p(tp7.class);
        int iOrdinal = w47Var.ordinal();
        if (iOrdinal == 0) {
            str = "messagingInbox";
        } else if (iOrdinal == 1) {
            str = "messagingArchive";
        } else if (iOrdinal == 2) {
            str = "messagingSpam";
        } else {
            if (iOrdinal != 3) {
                l.g();
                return;
            }
            str = "messagingDrafts";
        }
        tp7Var.b(new sp7.f(2, str, null, new Function1() { // from class: uq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.c(Integer.valueOf(i), "nbReadConvs");
                hr7Var.c(Integer.valueOf(i2), "nbUnreadConvs");
                return j6g.a;
            }
        }));
        g(new c(list, null));
    }

    public final void f(String str) {
        String string = UUID.randomUUID().toString();
        this.c = string;
        if (string != null) {
            u63.Y((e13) this.b.getValue(), null, null, new d(string, str, null), 3);
        }
    }

    public final void g(Function2<? super String, ? super lu2<? super j6g>, ? extends Object> function2) {
        String str = this.c;
        if (str != null) {
            u63.Y((e13) this.b.getValue(), null, null, new e(function2, str, null), 3);
        } else {
            ArrayList arrayList = lz2.a;
            lz2.c("MessagingLogger", "Attempted to log without emitting pageLoad log first.", false, null, 12);
        }
    }
}
