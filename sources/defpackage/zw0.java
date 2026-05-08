package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.sp7;
import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class zw0 {

    @uh3(c = "com.indeed.android.messaging.ui.preview.AttachmentUploadPreviewScreenKt$AttachmentUploadPreviewScreen$2$1", f = "AttachmentUploadPreviewScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ File $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$file = file;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$file, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, "messagingAttachmentUploadPreview", null, new wq9(hb5.Q(this.$file), 0)));
            return j6g.a;
        }
    }

    public static final void a(File file, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        c cVar;
        file.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(1621303071);
        int i2 = i | (cVarH.x(file) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new hh(2, gu5Var2);
                cVarH.p(objV);
            }
            g71.a(false, (gu5) objV, cVarH, 0, 1);
            boolean zX = cVarH.x(file);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new a(file, null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, file, (Function2) objV2);
            cVar = cVarH;
            oi7.a(R.string.messaging_attachment_preview_header, "AttachmentUploadPreview", null, gu5Var2, null, bh2.c(-1228206192, new ww0(gu5Var), cVarH), bh2.c(2105135889, new xw0(gu5Var2, 0, (byte) 0), cVarH), false, false, null, bh2.c(-427112110, new wt5(file, 3), cVarH), cVar, ((i2 << 3) & 7168) | 14352432, 788);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new ot(i, 1, gu5Var, file, gu5Var2);
        }
    }
}
