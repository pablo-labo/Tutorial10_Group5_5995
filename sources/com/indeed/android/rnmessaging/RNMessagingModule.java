package com.indeed.android.rnmessaging;

import android.app.Activity;
import android.util.Base64;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMessagingModule;
import defpackage.a32;
import defpackage.a74;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.bhg;
import defpackage.boa;
import defpackage.c1f;
import defpackage.cm0;
import defpackage.cr8;
import defpackage.cs0;
import defpackage.e13;
import defpackage.em0;
import defpackage.eq3;
import defpackage.eze;
import defpackage.f13;
import defpackage.fc2;
import defpackage.fj2;
import defpackage.fq9;
import defpackage.fwc;
import defpackage.g13;
import defpackage.gq9;
import defpackage.gu5;
import defpackage.h2g;
import defpackage.hb5;
import defpackage.hm0;
import defpackage.hq9;
import defpackage.im0;
import defpackage.io7;
import defpackage.iq9;
import defpackage.j6g;
import defpackage.kk2;
import defpackage.ko7;
import defpackage.kr;
import defpackage.kr7;
import defpackage.lr5;
import defpackage.lu2;
import defpackage.lz2;
import defpackage.m0b;
import defpackage.m89;
import defpackage.mj8;
import defpackage.n47;
import defpackage.nmc;
import defpackage.no3;
import defpackage.or9;
import defpackage.oz;
import defpackage.p81;
import defpackage.pr9;
import defpackage.q7;
import defpackage.qpd;
import defpackage.qr9;
import defpackage.qt8;
import defpackage.r6;
import defpackage.r7d;
import defpackage.rr9;
import defpackage.sd7;
import defpackage.u63;
import defpackage.uh3;
import defpackage.v03;
import defpackage.v1g;
import defpackage.vh8;
import defpackage.w1g;
import defpackage.w20;
import defpackage.wea;
import defpackage.wg0;
import defpackage.xh8;
import defpackage.y03;
import defpackage.yig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseMessagingModule.MODULE_NAME)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010\"\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b%\u0010\u001dJ\u001f\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b'\u0010\u001dJ)\u0010+\u001a\u00020\t2\u0006\u0010(\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b+\u0010,JC\u00101\u001a\u00020\t2\u0006\u0010(\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b1\u00102JA\u00105\u001a\u00020\t2\u0006\u0010(\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u00104\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b9\u00108J\u0017\u0010:\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b:\u00108J\u0019\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u00020?2\b\u0010;\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0B*\u00020.H\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010F\u001a\b\u0012\u0004\u0012\u00020E0B*\u00020.H\u0002¢\u0006\u0004\bF\u0010DJ\u0019\u0010H\u001a\b\u0012\u0004\u0012\u00020G0B*\u00020.H\u0002¢\u0006\u0004\bH\u0010DR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010P\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lcom/indeed/android/rnmessaging/RNMessagingModule;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseMessagingModule;", "Lxh8;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Ly03;", "ioDispatcher", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ly03;)V", "Lj6g;", "invalidate", "()V", "", "eventName", "addListener", "(Ljava/lang/String;)V", "", "count", "removeListeners", "(D)V", "conversationId", "reportType", "additionalInfo", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "reportSpam", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "filePath", "uploadFile", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "messageId", "contentHash", "fileName", "fileExtension", "downloadAttachmentFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "token", "getInitiateConversation", "url", "openTELNavigationAction", "pageLoadTk", "Lcom/facebook/react/bridge/ReadableMap;", "additionalParams", "postPageLoadLog", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "itemType", "Lcom/facebook/react/bridge/ReadableArray;", "itemUids", "itemsAttributes", "postImpressionLog", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", RumEventDeserializer.EVENT_TYPE_ACTION, "itemUid", "postUserActionLog", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "refreshUnreadMessagesCount", "(Lcom/facebook/react/bridge/Promise;)V", "isTareTopNavActive", "isSearchTabActive", "map", "Loz;", "parseAdditionalParams", "(Lcom/facebook/react/bridge/ReadableMap;)Loz;", "Lko7;", "parseItemsAttributes", "(Lcom/facebook/react/bridge/ReadableMap;)Lko7;", "", "toStringList", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;", "", "toBooleanList", "", "toIntList", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ly03;", "Le13;", "moduleScope", "Le13;", "Liq9;", "messagingApiClient$delegate", "Lkotlin/Lazy;", "getMessagingApiClient", "()Liq9;", "messagingApiClient", "Lrr9;", "messagingLoggingApi$delegate", "getMessagingLoggingApi", "()Lrr9;", "messagingLoggingApi", "rnmessaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNMessagingModule extends IndeedRNBridgeBaseMessagingModule implements xh8 {
    public static final int $stable = 8;
    private final y03 ioDispatcher;

    /* JADX INFO: renamed from: messagingApiClient$delegate, reason: from kotlin metadata */
    private final Lazy messagingApiClient;

    /* JADX INFO: renamed from: messagingLoggingApi$delegate, reason: from kotlin metadata */
    private final Lazy messagingLoggingApi;
    private final e13 moduleScope;
    private final ReactApplicationContext reactContext;

    @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$downloadAttachmentFile$1", f = "RNMessagingModule.kt", l = {174}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $contentHash;
        final /* synthetic */ String $conversationId;
        final /* synthetic */ String $fileExtension;
        final /* synthetic */ String $fileName;
        final /* synthetic */ String $messageId;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX INFO: renamed from: com.indeed.android.rnmessaging.RNMessagingModule$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$downloadAttachmentFile$1$file$1", f = "RNMessagingModule.kt", l = {175}, m = "invokeSuspend")
        public static final class C0182a extends c1f implements Function2<e13, lu2<? super File>, Object> {
            final /* synthetic */ String $contentHash;
            final /* synthetic */ String $conversationId;
            final /* synthetic */ String $fileExtension;
            final /* synthetic */ String $fileName;
            final /* synthetic */ String $messageId;
            int label;
            final /* synthetic */ RNMessagingModule this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0182a(RNMessagingModule rNMessagingModule, String str, String str2, String str3, String str4, String str5, lu2<? super C0182a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = rNMessagingModule;
                this.$conversationId = str;
                this.$messageId = str2;
                this.$contentHash = str3;
                this.$fileName = str4;
                this.$fileExtension = str5;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0182a(this.this$0, this.$conversationId, this.$messageId, this.$contentHash, this.$fileName, this.$fileExtension, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super File> lu2Var) {
                return ((C0182a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws IOException {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return obj;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                iq9 messagingApiClient = this.this$0.getMessagingApiClient();
                ReactApplicationContext reactApplicationContext = this.this$0.reactContext;
                String str = this.$conversationId;
                String str2 = this.$messageId;
                String str3 = this.$contentHash;
                String str4 = this.$fileName;
                String str5 = this.$fileExtension;
                this.label = 1;
                Object objD = messagingApiClient.d(reactApplicationContext, str, str2, str3, str4, str5, this);
                g13 g13Var = g13.a;
                return objD == g13Var ? g13Var : objD;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Promise promise, String str, String str2, String str3, String str4, String str5, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$promise = promise;
            this.$conversationId = str;
            this.$messageId = str2;
            this.$contentHash = str3;
            this.$fileName = str4;
            this.$fileExtension = str5;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return RNMessagingModule.this.new a(this.$promise, this.$conversationId, this.$messageId, this.$contentHash, this.$fileName, this.$fileExtension, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    y03 y03Var = RNMessagingModule.this.ioDispatcher;
                    C0182a c0182a = new C0182a(RNMessagingModule.this, this.$conversationId, this.$messageId, this.$contentHash, this.$fileName, this.$fileExtension, null);
                    this.label = 1;
                    obj = u63.q0(y03Var, c0182a, this);
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
                File file = (File) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("filePath", file.getAbsolutePath());
                writableMapCreateMap.putString("fileName", file.getName());
                this.$promise.resolve(writableMapCreateMap);
            } catch (Exception e) {
                Promise promise = this.$promise;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                promise.reject("DOWNLOAD_ATTACHMENT_EXCEPTION", message, e);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$getInitiateConversation$1", f = "RNMessagingModule.kt", l = {209}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ RNMessagingModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lu2 lu2Var, Promise promise, RNMessagingModule rNMessagingModule, String str) {
            super(2, lu2Var);
            this.this$0 = rNMessagingModule;
            this.$token = str;
            this.$promise = promise;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(lu2Var, this.$promise, this.this$0, this.$token);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            String message;
            Exception cause;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    iq9 messagingApiClient = this.this$0.getMessagingApiClient();
                    String str = this.$token;
                    this.label = 1;
                    fj2 fj2Var = new fj2(11, (byte) 0);
                    messagingApiClient.getClass();
                    obj = b.a.a(messagingApiClient, new fq9(messagingApiClient, str, null), fj2Var, this);
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
                wg0 wg0Var = (wg0) obj;
                sd7 sd7Var = (sd7) wg0Var.b();
                if (!wg0Var.d() || sd7Var == null) {
                    wg0.a aVar = wg0Var instanceof wg0.a ? (wg0.a) wg0Var : null;
                    p81 p81Var = aVar != null ? aVar.a : null;
                    if (p81Var == null || (cause = p81Var.getCause()) == null || (message = cause.getMessage()) == null) {
                        message = "Failed to get initiate conversation";
                    }
                    this.$promise.reject("GET_INITIATE_CONVERSATION_ERROR", message, p81Var != null ? p81Var.getCause() : null);
                } else {
                    sd7.c cVar = sd7Var.a;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    String str2 = cVar.a;
                    sd7.d dVar = cVar.d;
                    writableMapCreateMap.putString("conversationSid", str2);
                    writableMapCreateMap.putBoolean("exists", cVar.b);
                    writableMapCreateMap.putString("token", cVar.c);
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.getClass();
                    writableMapCreateMap2.putString("jobKey", dVar.a);
                    writableMapCreateMap2.putString("advertiserKey", dVar.b);
                    writableMapCreateMap2.putString("candidateKey", dVar.c);
                    writableMapCreateMap2.putBoolean("hasEmployerEmail", dVar.d);
                    writableMapCreateMap2.putBoolean("isPreApplyConversation", dVar.e);
                    if (dVar.f != null) {
                        writableMapCreateMap2.putDouble("applyTime", r1.longValue());
                    }
                    writableMapCreateMap.putMap("metadata", writableMapCreateMap2);
                    this.$promise.resolve(writableMapCreateMap);
                }
            } catch (Exception e) {
                Promise promise = this.$promise;
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "Unknown error";
                }
                promise.reject("GET_INITIATE_CONVERSATION_EXCEPTION", message2, e);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$openTELNavigationAction$1", f = "RNMessagingModule.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ RNMessagingModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(lu2 lu2Var, Promise promise, RNMessagingModule rNMessagingModule, String str) {
            super(2, lu2Var);
            this.this$0 = rNMessagingModule;
            this.$promise = promise;
            this.$url = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(lu2Var, this.$promise, this.this$0, this.$url);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            androidx.fragment.app.g gVar;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            try {
                Activity currentActivity = this.this$0.reactContext.getCurrentActivity();
                gVar = currentActivity instanceof androidx.fragment.app.g ? (androidx.fragment.app.g) currentActivity : null;
            } catch (Exception e) {
                Promise promise = this.$promise;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                promise.reject("OPEN_TEL_NAVIGATION_EXCEPTION", message, e);
            }
            if (gVar == null) {
                this.$promise.reject("NO_ACTIVITY", "Current activity is not available");
                return j6g.a;
            }
            v1g v1gVar = (v1g) cr8.p(v1g.class);
            String str = this.$url;
            lr5 lr5VarU = gVar.u();
            lr5VarU.getClass();
            v1gVar.b(lr5VarU, str);
            this.$promise.resolve(null);
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$postImpressionLog$1", f = "RNMessagingModule.kt", l = {357}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ReadableMap $additionalParams;
        final /* synthetic */ String $itemType;
        final /* synthetic */ ReadableArray $itemUids;
        final /* synthetic */ ReadableMap $itemsAttributes;
        final /* synthetic */ String $pageLoadTk;
        final /* synthetic */ Promise $promise;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ RNMessagingModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Promise promise, ReadableArray readableArray, String str2, RNMessagingModule rNMessagingModule, ReadableMap readableMap, ReadableMap readableMap2, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$itemType = str;
            this.$promise = promise;
            this.$itemUids = readableArray;
            this.$pageLoadTk = str2;
            this.this$0 = rNMessagingModule;
            this.$itemsAttributes = readableMap;
            this.$additionalParams = readableMap2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d(this.$itemType, this.$promise, this.$itemUids, this.$pageLoadTk, this.this$0, this.$itemsAttributes, this.$additionalParams, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    try {
                        io7 io7VarValueOf = io7.valueOf(this.$itemType);
                        ArrayList arrayList = new ArrayList();
                        int size = this.$itemUids.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String string = this.$itemUids.getString(i2);
                            if (string != null) {
                                arrayList.add(string);
                            }
                        }
                        n47 n47Var = new n47(this.$pageLoadTk, io7VarValueOf, arrayList, this.this$0.parseItemsAttributes(this.$itemsAttributes), this.this$0.parseAdditionalParams(this.$additionalParams));
                        rr9 messagingLoggingApi = this.this$0.getMessagingLoggingApi();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 1;
                        im0 im0Var = new im0(11, (byte) 0);
                        messagingLoggingApi.getClass();
                        ArrayList arrayList2 = lz2.a;
                        Log.d("RnMessagingLoggingApi", "posting impression:\n" + n47Var, null);
                        obj = b.a.a(messagingLoggingApi, new or9(messagingLoggingApi, n47Var, null), im0Var, this);
                        g13 g13Var = g13.a;
                        if (obj == g13Var) {
                            return g13Var;
                        }
                    } catch (IllegalArgumentException unused) {
                        this.$promise.reject("INVALID_ITEM_TYPE", "Invalid itemType: " + this.$itemType);
                        return j6g.a;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                wg0 wg0Var = (wg0) obj;
                if (wg0Var instanceof wg0.b) {
                    this.$promise.resolve(null);
                } else {
                    if (!(wg0Var instanceof wg0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String message = ((wg0.a) wg0Var).a.getCause().getMessage();
                    if (message == null) {
                        message = "Failed to post impression log";
                    }
                    this.$promise.reject("IMPRESSION_LOG_ERROR", message, ((wg0.a) wg0Var).a.getCause());
                }
            } catch (Exception e) {
                Promise promise = this.$promise;
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "Unknown error";
                }
                promise.reject("IMPRESSION_LOG_EXCEPTION", message2, e);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$postPageLoadLog$1", f = "RNMessagingModule.kt", l = {303}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ReadableMap $additionalParams;
        final /* synthetic */ String $pageLoadTk;
        final /* synthetic */ Promise $promise;
        Object L$0;
        int label;
        final /* synthetic */ RNMessagingModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, RNMessagingModule rNMessagingModule, ReadableMap readableMap, Promise promise, lu2<? super e> lu2Var) {
            super(2, lu2Var);
            this.$pageLoadTk = str;
            this.this$0 = rNMessagingModule;
            this.$additionalParams = readableMap;
            this.$promise = promise;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new e(this.$pageLoadTk, this.this$0, this.$additionalParams, this.$promise, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    m0b m0bVar = new m0b(this.$pageLoadTk, this.this$0.parseAdditionalParams(this.$additionalParams));
                    rr9 messagingLoggingApi = this.this$0.getMessagingLoggingApi();
                    this.L$0 = null;
                    this.label = 1;
                    em0 em0Var = new em0(10);
                    messagingLoggingApi.getClass();
                    ArrayList arrayList = lz2.a;
                    Log.d("RnMessagingLoggingApi", "posting page load:\n" + m0bVar, null);
                    obj = b.a.a(messagingLoggingApi, new pr9(messagingLoggingApi, m0bVar, null), em0Var, this);
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
                wg0 wg0Var = (wg0) obj;
                if (wg0Var instanceof wg0.b) {
                    this.$promise.resolve(null);
                } else {
                    if (!(wg0Var instanceof wg0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String message = ((wg0.a) wg0Var).a.getCause().getMessage();
                    if (message == null) {
                        message = "Failed to post page load log";
                    }
                    this.$promise.reject("PAGE_LOAD_LOG_ERROR", message, ((wg0.a) wg0Var).a.getCause());
                }
            } catch (Exception e) {
                Promise promise = this.$promise;
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "Unknown error";
                }
                promise.reject("PAGE_LOAD_LOG_EXCEPTION", message2, e);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$postUserActionLog$1", f = "RNMessagingModule.kt", l = {DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE}, m = "invokeSuspend")
    public static final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $action;
        final /* synthetic */ ReadableMap $additionalParams;
        final /* synthetic */ String $itemType;
        final /* synthetic */ String $itemUid;
        final /* synthetic */ String $pageLoadTk;
        final /* synthetic */ Promise $promise;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ RNMessagingModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Promise promise, String str2, String str3, String str4, RNMessagingModule rNMessagingModule, ReadableMap readableMap, lu2<? super f> lu2Var) {
            super(2, lu2Var);
            this.$action = str;
            this.$promise = promise;
            this.$itemType = str2;
            this.$pageLoadTk = str3;
            this.$itemUid = str4;
            this.this$0 = rNMessagingModule;
            this.$additionalParams = readableMap;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new f(this.$action, this.$promise, this.$itemType, this.$pageLoadTk, this.$itemUid, this.this$0, this.$additionalParams, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    try {
                        try {
                            yig yigVar = new yig(this.$pageLoadTk, q7.valueOf(this.$action), io7.valueOf(this.$itemType), this.$itemUid, this.this$0.parseAdditionalParams(this.$additionalParams));
                            rr9 messagingLoggingApi = this.this$0.getMessagingLoggingApi();
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 1;
                            hm0 hm0Var = new hm0(12);
                            messagingLoggingApi.getClass();
                            ArrayList arrayList = lz2.a;
                            Log.d("RnMessagingLoggingApi", "posting userAction:\n" + yigVar, null);
                            obj = b.a.a(messagingLoggingApi, new qr9(messagingLoggingApi, yigVar, null), hm0Var, this);
                            g13 g13Var = g13.a;
                            if (obj == g13Var) {
                                return g13Var;
                            }
                        } catch (IllegalArgumentException unused) {
                            this.$promise.reject("INVALID_ITEM_TYPE", "Invalid itemType: " + this.$itemType);
                            return j6g.a;
                        }
                    } catch (IllegalArgumentException unused2) {
                        this.$promise.reject("INVALID_ACTION", "Invalid action: " + this.$action);
                        return j6g.a;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                wg0 wg0Var = (wg0) obj;
                if (wg0Var instanceof wg0.b) {
                    this.$promise.resolve(null);
                } else {
                    if (!(wg0Var instanceof wg0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String message = ((wg0.a) wg0Var).a.getCause().getMessage();
                    if (message == null) {
                        message = "Failed to post user action log";
                    }
                    this.$promise.reject("USER_ACTION_LOG_ERROR", message, ((wg0.a) wg0Var).a.getCause());
                }
            } catch (Exception e) {
                Promise promise = this.$promise;
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "Unknown error";
                }
                promise.reject("USER_ACTION_LOG_EXCEPTION", message2, e);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$refreshUnreadMessagesCount$1", f = "RNMessagingModule.kt", l = {443}, m = "invokeSuspend")
    public static final class g extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Promise promise, lu2<? super g> lu2Var) {
            super(2, lu2Var);
            this.$promise = promise;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return RNMessagingModule.this.new g(this.$promise, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((g) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                if (((kr7) cr8.p(kr7.class)).e("droid_uip_messaging_tst").a == 2) {
                    ((w1g) cr8.p(w1g.class)).a(f13.a(RNMessagingModule.this.ioDispatcher), new kr(13));
                    j6g j6gVar = j6g.a;
                } else {
                    w1g w1gVar = (w1g) cr8.p(w1g.class);
                    fc2 fc2Var = new fc2(12);
                    this.label = 1;
                    Object objF = w1gVar.f(fc2Var, this);
                    g13 g13Var = g13.a;
                    if (objF == g13Var) {
                        return g13Var;
                    }
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            this.$promise.resolve(null);
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$reportSpam$1", f = "RNMessagingModule.kt", l = {81}, m = "invokeSuspend")
    public static final class h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $additionalInfo;
        final /* synthetic */ String $conversationId;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $reportType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, String str3, Promise promise, lu2<? super h> lu2Var) {
            super(2, lu2Var);
            this.$conversationId = str;
            this.$reportType = str2;
            this.$additionalInfo = str3;
            this.$promise = promise;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return RNMessagingModule.this.new h(this.$conversationId, this.$reportType, this.$additionalInfo, this.$promise, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    iq9 messagingApiClient = RNMessagingModule.this.getMessagingApiClient();
                    String str = this.$conversationId;
                    String str2 = this.$reportType;
                    String str3 = this.$additionalInfo;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    this.label = 1;
                    kk2 kk2Var = new kk2(11);
                    messagingApiClient.getClass();
                    str.getClass();
                    byte[] bytes = "CONVERSATION_SERVICE_ENCRYPTED///".concat(str).getBytes(a32.b);
                    bytes.getClass();
                    String strEncodeToString = Base64.encodeToString(bytes, 2);
                    strEncodeToString.getClass();
                    obj = b.a.a(messagingApiClient, new gq9(messagingApiClient, strEncodeToString, str2, str4, null), kk2Var, this);
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
                wg0 wg0Var = (wg0) obj;
                if (wg0Var instanceof wg0.b) {
                    this.$promise.resolve(null);
                } else {
                    if (!(wg0Var instanceof wg0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p81 p81Var = ((wg0.a) wg0Var).a;
                    String message = p81Var.getCause().getMessage();
                    if (message == null) {
                        message = "Failed to report spam";
                    }
                    this.$promise.reject("REPORT_SPAM_ERROR", message, p81Var.getCause());
                }
            } catch (Exception e) {
                Promise promise = this.$promise;
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "Unknown error";
                }
                promise.reject("REPORT_SPAM_EXCEPTION", message2, e);
            }
            return j6g.a;
        }
    }

    public static final class i extends mj8 implements gu5<iq9> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(RNMessagingModule rNMessagingModule) {
            super(0);
            this.$this_inject = rNMessagingModule;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [iq9, java.lang.Object] */
        @Override // defpackage.gu5
        public final iq9 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(iq9.class), a9cVar);
        }
    }

    public static final class j extends mj8 implements gu5<rr9> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(RNMessagingModule rNMessagingModule) {
            super(0);
            this.$this_inject = rNMessagingModule;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, rr9] */
        @Override // defpackage.gu5
        public final rr9 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(rr9.class), a9cVar);
        }
    }

    @uh3(c = "com.indeed.android.rnmessaging.RNMessagingModule$uploadFile$1", f = "RNMessagingModule.kt", l = {126}, m = "invokeSuspend")
    public static final class k extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $filePath;
        final /* synthetic */ Promise $promise;
        Object L$0;
        int label;
        final /* synthetic */ RNMessagingModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(lu2 lu2Var, Promise promise, RNMessagingModule rNMessagingModule, String str) {
            super(2, lu2Var);
            this.$filePath = str;
            this.$promise = promise;
            this.this$0 = rNMessagingModule;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new k(lu2Var, this.$promise, this.this$0, this.$filePath);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((k) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            String message;
            Exception cause;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    File file = new File(this.$filePath);
                    if (!file.exists()) {
                        this.$promise.reject("FILE_NOT_FOUND", "File not found at path: " + this.$filePath);
                        return j6g.a;
                    }
                    iq9 messagingApiClient = this.this$0.getMessagingApiClient();
                    this.L$0 = null;
                    this.label = 1;
                    cm0 cm0Var = new cm0(9);
                    messagingApiClient.getClass();
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(hb5.Q(file));
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = "application/octet-stream";
                    }
                    obj = b.a.a(messagingApiClient, new hq9(messagingApiClient, file, mimeTypeFromExtension, null), cm0Var, this);
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
                wg0 wg0Var = (wg0) obj;
                bhg bhgVar = (bhg) wg0Var.b();
                if (!wg0Var.d() || bhgVar == null) {
                    wg0.a aVar = wg0Var instanceof wg0.a ? (wg0.a) wg0Var : null;
                    p81 p81Var = aVar != null ? aVar.a : null;
                    if (p81Var == null || (cause = p81Var.getCause()) == null || (message = cause.getMessage()) == null) {
                        message = "Failed to upload file";
                    }
                    this.$promise.reject("UPLOAD_FILE_ERROR", message, p81Var != null ? p81Var.getCause() : null);
                } else {
                    bhg.c cVar = bhgVar.a;
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("sid", cVar.a);
                    writableMapCreateMap.putString("url", cVar.b);
                    writableMapCreateMap.putString("contentHash", cVar.c);
                    writableMapCreateMap.putString("fileName", cVar.d);
                    writableMapCreateMap.putString("fileExtension", cVar.e);
                    this.$promise.resolve(writableMapCreateMap);
                }
            } catch (Exception e) {
                Promise promise = this.$promise;
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "Unknown error";
                }
                promise.reject("UPLOAD_FILE_EXCEPTION", message2, e);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNMessagingModule(ReactApplicationContext reactApplicationContext, y03 y03Var) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        y03Var.getClass();
        this.reactContext = reactApplicationContext;
        this.ioDispatcher = y03Var;
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        this.moduleScope = f13.a(v03.a.C0438a.c(ezeVarA, m89.a));
        i iVar = new i(this);
        qt8 qt8Var = qt8.a;
        this.messagingApiClient = boa.E(qt8Var, iVar);
        this.messagingLoggingApi = boa.E(qt8Var, new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iq9 getMessagingApiClient() {
        return (iq9) this.messagingApiClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rr9 getMessagingLoggingApi() {
        return (rr9) this.messagingLoggingApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz parseAdditionalParams(ReadableMap map) {
        cs0 cs0VarValueOf;
        cs0 cs0Var;
        if (map == null) {
            return new oz(0);
        }
        String string = map.hasKey("cause") ? map.getString("cause") : null;
        if (string != null) {
            try {
                cs0VarValueOf = cs0.valueOf(string);
            } catch (IllegalArgumentException unused) {
                cs0VarValueOf = null;
            }
            cs0Var = cs0VarValueOf;
        } else {
            cs0Var = null;
        }
        return new oz(map.hasKey("deviceId") ? map.getString("deviceId") : null, map.hasKey("nativeAppVersion") ? map.getString("nativeAppVersion") : null, map.hasKey("mobileAppProctorGrps") ? map.getString("mobileAppProctorGrps") : null, map.hasKey("from") ? map.getString("from") : null, cs0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ko7 parseItemsAttributes(ReadableMap map) {
        List<Boolean> list;
        List<Integer> intList;
        if (map == null) {
            return new ko7(0);
        }
        ReadableArray array = map.getArray("folders");
        List<String> stringList = array != null ? toStringList(array) : null;
        ReadableArray array2 = map.getArray("hasCompanyName");
        List<Boolean> booleanList = array2 != null ? toBooleanList(array2) : null;
        ReadableArray array3 = map.getArray("hasTitleLink");
        List<Boolean> booleanList2 = array3 != null ? toBooleanList(array3) : null;
        ReadableArray array4 = map.getArray("isArchived");
        List<Boolean> booleanList3 = array4 != null ? toBooleanList(array4) : null;
        ReadableArray array5 = map.getArray("isInitiated");
        List<Boolean> booleanList4 = array5 != null ? toBooleanList(array5) : null;
        ReadableArray array6 = map.getArray("isJobRemoved");
        List<Boolean> booleanList5 = array6 != null ? toBooleanList(array6) : null;
        ReadableArray array7 = map.getArray("isOld");
        List<Boolean> booleanList6 = array7 != null ? toBooleanList(array7) : null;
        ReadableArray array8 = map.getArray("isPreApply");
        List<Boolean> booleanList7 = array8 != null ? toBooleanList(array8) : null;
        ReadableArray array9 = map.getArray("jobKey");
        List<String> stringList2 = array9 != null ? toStringList(array9) : null;
        ReadableArray array10 = map.getArray("lastEventId");
        List<String> stringList3 = array10 != null ? toStringList(array10) : null;
        ReadableArray array11 = map.getArray("lastEventType");
        List<String> stringList4 = array11 != null ? toStringList(array11) : null;
        ReadableArray array12 = map.getArray("positions");
        List<Integer> intList2 = array12 != null ? toIntList(array12) : null;
        ReadableArray array13 = map.getArray("reminders");
        List<Boolean> booleanList8 = array13 != null ? toBooleanList(array13) : null;
        ReadableArray array14 = map.getArray("requireResponse");
        List<Boolean> booleanList9 = array14 != null ? toBooleanList(array14) : null;
        ReadableArray array15 = map.getArray("types");
        List<String> stringList5 = array15 != null ? toStringList(array15) : null;
        ReadableArray array16 = map.getArray("unreadCounts");
        if (array16 != null) {
            list = booleanList9;
            intList = toIntList(array16);
        } else {
            list = booleanList9;
            intList = null;
        }
        return new ko7(stringList, booleanList, booleanList2, booleanList3, booleanList4, booleanList5, booleanList6, booleanList7, stringList2, stringList3, stringList4, intList2, booleanList8, list, stringList5, intList);
    }

    private final List<Boolean> toBooleanList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Boolean.valueOf(readableArray.getBoolean(i2)));
        }
        return arrayList;
    }

    private final List<Integer> toIntList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(readableArray.getInt(i2)));
        }
        return arrayList;
    }

    private final List<String> toStringList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            String string = readableArray.getString(i2);
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMessagingModule
    @ReactMethod
    public void addListener(String eventName) {
        eventName.getClass();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMessagingModule
    @ReactMethod
    public void downloadAttachmentFile(String conversationId, String messageId, String contentHash, String fileName, String fileExtension, Promise promise) {
        w20.p(conversationId, messageId, contentHash, fileName, fileExtension);
        promise.getClass();
        u63.Y(this.moduleScope, null, null, new a(promise, conversationId, messageId, contentHash, fileName, fileExtension, null), 3);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMessagingModule
    @ReactMethod
    public void getInitiateConversation(String token, Promise promise) {
        token.getClass();
        promise.getClass();
        u63.Y(this.moduleScope, null, null, new b(null, promise, this, token), 3);
    }

    @Override // defpackage.xh8
    public vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        f13.c(this.moduleScope, null);
    }

    @ReactMethod
    public final void isSearchTabActive(Promise promise) {
        promise.getClass();
        try {
            promise.resolve(Boolean.valueOf(((h2g) cr8.p(h2g.class)).a()));
        } catch (Exception e2) {
            promise.reject("SEARCH_TAB_ERROR", "Failed to check if search tab is active", e2);
        }
    }

    @ReactMethod
    public final void isTareTopNavActive(Promise promise) {
        promise.getClass();
        try {
            promise.resolve(Boolean.valueOf(((h2g) cr8.p(h2g.class)).c()));
        } catch (Exception e2) {
            promise.reject("TARE_TOP_NAV_ERROR", "Failed to check if TARE top nav is active", e2);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMessagingModule
    @ReactMethod
    public void openTELNavigationAction(String url, Promise promise) {
        url.getClass();
        promise.getClass();
        u63.Y(this.moduleScope, null, null, new c(null, promise, this, url), 3);
    }

    @ReactMethod
    public final void postImpressionLog(String pageLoadTk, String itemType, ReadableArray itemUids, ReadableMap itemsAttributes, ReadableMap additionalParams, Promise promise) {
        pageLoadTk.getClass();
        itemType.getClass();
        itemUids.getClass();
        promise.getClass();
        u63.Y(this.moduleScope, null, null, new d(itemType, promise, itemUids, pageLoadTk, this, itemsAttributes, additionalParams, null), 3);
    }

    @ReactMethod
    public final void postPageLoadLog(String pageLoadTk, ReadableMap additionalParams, Promise promise) {
        pageLoadTk.getClass();
        promise.getClass();
        u63.Y(this.moduleScope, null, null, new e(pageLoadTk, this, additionalParams, promise, null), 3);
    }

    @ReactMethod
    public final void postUserActionLog(String pageLoadTk, String action, String itemType, String itemUid, ReadableMap additionalParams, Promise promise) {
        pageLoadTk.getClass();
        action.getClass();
        itemType.getClass();
        itemUid.getClass();
        promise.getClass();
        u63.Y(this.moduleScope, null, null, new f(action, promise, itemType, pageLoadTk, itemUid, this, additionalParams, null), 3);
    }

    @ReactMethod
    public final void refreshUnreadMessagesCount(Promise promise) {
        promise.getClass();
        u63.Y(this.moduleScope, null, null, new g(promise, null), 3);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMessagingModule
    @ReactMethod
    public void removeListeners(double count) {
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMessagingModule
    @ReactMethod
    public void reportSpam(String conversationId, String reportType, String additionalInfo, Promise promise) {
        conversationId.getClass();
        reportType.getClass();
        promise.getClass();
        u63.Y(this.moduleScope, null, null, new h(conversationId, reportType, additionalInfo, promise, null), 3);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseMessagingModule
    @ReactMethod
    public void uploadFile(String filePath, Promise promise) {
        filePath.getClass();
        promise.getClass();
        u63.Y(this.moduleScope, null, null, new k(null, promise, this, filePath), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RNMessagingModule(ReactApplicationContext reactApplicationContext, y03 y03Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            eq3 eq3Var = a74.a;
            y03Var = no3.c;
        }
        this(reactApplicationContext, y03Var);
    }
}
