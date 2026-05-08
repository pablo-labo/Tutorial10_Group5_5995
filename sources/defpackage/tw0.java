package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.sp7;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class tw0 {

    @uh3(c = "com.indeed.android.messaging.ui.preview.AttachmentDownloadPreviewScreenKt$AttachmentDownloadPreviewScreen$2$1", f = "AttachmentDownloadPreviewScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ EventRecord.Attachment $attachment;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EventRecord.Attachment attachment, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$attachment = attachment;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$attachment, lu2Var);
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
            String fileExtensionTrimmed = this.$attachment.getFileExtensionTrimmed();
            fileExtensionTrimmed.getClass();
            ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, "messagingAttachmentDownloadPreview", null, new wx4(fileExtensionTrimmed, 2)));
            return j6g.a;
        }
    }

    public static final void a(EventRecord.Attachment attachment, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        attachment.getClass();
        gu5Var.getClass();
        gu5Var2.getClass();
        c cVarH = bVar.h(-312291528);
        int i2 = i | (cVarH.x(attachment) ? 4 : 2) | (cVarH.x(gu5Var) ? 32 : 16) | (cVarH.x(gu5Var2) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (z || objV == c0020a) {
                objV = new di(3, gu5Var2);
                cVarH.p(objV);
            }
            g71.a(false, (gu5) objV, cVarH, 0, 1);
            boolean zX = cVarH.x(attachment);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new a(attachment, null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, attachment, (Function2) objV2);
            oi7.a(R.string.messaging_attachment_download_preview_header, "AttachmentDownloadPreview", attachment.getFileName(), null, gu5Var2, bh2.c(525444713, new rw0(gu5Var), cVarH), null, false, false, null, bh2.c(114136491, new sw0(attachment, 0), cVarH), cVarH, ((i2 << 6) & 57344) | 12779568, 840);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kt(attachment, gu5Var, gu5Var2, i, 1);
        }
    }
}
