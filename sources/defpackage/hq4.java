package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import defpackage.l06;
import kotlin.jvm.functions.Function2;
import org.koin.core.error.NoBeanDefFoundException;

/* JADX INFO: loaded from: classes2.dex */
public final class hq4 {

    @uh3(c = "com.indeed.android.messaging.ui.preview.EmailPreviewScreenKt$EmailPreviewScreen$1$1", f = "EmailPreviewScreen.kt", l = {38}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<String> $body$delegate;
        final /* synthetic */ String $conversationId;
        final /* synthetic */ String $eventId;
        final /* synthetic */ ConversationsRemoteDataSource $remoteDataSource;
        final /* synthetic */ g4a<String> $subject$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ConversationsRemoteDataSource conversationsRemoteDataSource, String str, String str2, g4a<String> g4aVar, g4a<String> g4aVar2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$remoteDataSource = conversationsRemoteDataSource;
            this.$conversationId = str;
            this.$eventId = str2;
            this.$subject$delegate = g4aVar;
            this.$body$delegate = g4aVar2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$remoteDataSource, this.$conversationId, this.$eventId, this.$subject$delegate, this.$body$delegate, lu2Var);
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
                ConversationsRemoteDataSource conversationsRemoteDataSource = this.$remoteDataSource;
                String str = this.$conversationId;
                String str2 = this.$eventId;
                this.label = 1;
                obj = conversationsRemoteDataSource.getInboundEmailData(str, str2, this);
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
            l06.e eVar = (l06.e) obj;
            if (eVar != null) {
                g4a<String> g4aVar = this.$subject$delegate;
                g4a<String> g4aVar2 = this.$body$delegate;
                g4aVar.setValue(eVar.b);
                g4aVar2.setValue(eVar.a);
            }
            return j6g.a;
        }
    }

    public static final void a(final int i, final gu5 gu5Var, b bVar, String str, final String str2) throws NoBeanDefFoundException {
        c cVar;
        final String str3;
        b.a.C0020a c0020a;
        o97 o97Var;
        g4a g4aVar;
        String str4;
        String str5;
        str.getClass();
        str2.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(1798599843);
        int i2 = (cVarH.K(str) ? 4 : 2) | i | (cVarH.K(str2) ? 32 : 16) | (cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            cVarH.u(860969189);
            vh8 vh8Var = web.d;
            if (vh8Var == null) {
                r6.g("KoinApplication has not been started");
                return;
            }
            qpd qpdVar = (qpd) vh8Var.a.b;
            cVarH.u(511388516);
            boolean zK = cVarH.K(null) | cVarH.K(null);
            Object objV = cVarH.v();
            b.a.C0020a c0020a2 = b.a.a;
            if (zK || objV == c0020a2) {
                objV = qpdVar.a(null, fwc.a.b(ConversationsRemoteDataSource.class), null);
                cVarH.p(objV);
            }
            cVarH.U(false);
            cVarH.U(false);
            ConversationsRemoteDataSource conversationsRemoteDataSource = (ConversationsRemoteDataSource) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a2) {
                objV2 = r.f("");
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            Object objV3 = cVarH.v();
            if (objV3 == c0020a2) {
                objV3 = r.f("");
                cVarH.p(objV3);
            }
            g4a g4aVar3 = (g4a) objV3;
            o97 o97Var2 = (o97) cVarH.M(p97.a);
            boolean zX = cVarH.x(conversationsRemoteDataSource) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objV4 = cVarH.v();
            if (zX || objV4 == c0020a2) {
                c0020a = c0020a2;
                o97Var = o97Var2;
                g4aVar = g4aVar2;
                objV4 = new a(conversationsRemoteDataSource, str, str2, g4aVar, g4aVar3, null);
                str4 = str;
                str5 = str2;
                cVarH.p(objV4);
            } else {
                str4 = str;
                str5 = str2;
                o97Var = o97Var2;
                g4aVar = g4aVar2;
                c0020a = c0020a2;
            }
            to4.f(str4, str5, (Function2) objV4, cVarH);
            boolean z = (i2 & 896) == 256;
            Object objV5 = cVarH.v();
            if (z || objV5 == c0020a) {
                objV5 = new xa(3, gu5Var);
                cVarH.p(objV5);
            }
            g71.a(false, (gu5) objV5, cVarH, 0, 1);
            cVar = cVarH;
            str3 = str;
            oi7.a(R.string.messaging_email_preview_header, "email_preview", null, null, gu5Var, null, null, false, false, null, bh2.c(-1962047536, new fq4(0, o97Var, g4aVar, g4aVar3), cVarH), cVar, ((i2 << 6) & 57344) | 48, 1004);
        } else {
            cVar = cVarH;
            str3 = str;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2(i, gu5Var, str3, str2) { // from class: gq4
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ gu5 c;

                {
                    this.a = str3;
                    this.b = str2;
                    this.c = gu5Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws NoBeanDefFoundException {
                    ((Integer) obj2).getClass();
                    hq4.a(ka2.L(1), this.c, (b) obj, this.a, this.b);
                    return j6g.a;
                }
            };
        }
    }
}
