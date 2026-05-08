package defpackage;

import android.content.Context;
import android.net.Uri;
import com.indeed.android.messaging.data.events.EventRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onAttachmentPreviewDownloadClicked$1", f = "SelectedConversationViewModel.kt", l = {436}, m = "invokeSuspend")
public final class e2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ y1e this$0;

    @uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onAttachmentPreviewDownloadClicked$1$1", f = "SelectedConversationViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ y1e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Uri uri, y1e y1eVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$context = context;
            this.$uri = uri;
            this.this$0 = y1eVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$context, this.$uri, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws FileNotFoundException {
            File file;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            OutputStream outputStreamOpenOutputStream = this.$context.getContentResolver().openOutputStream(this.$uri);
            if (outputStreamOpenOutputStream != null) {
                y1e y1eVar = this.this$0;
                EventRecord.Attachment attachment = ((x1e) y1eVar.d0.getValue()).k;
                if (attachment != null && (file = attachment.getFile()) != null) {
                    new Long(wg2.u(new FileInputStream(file), outputStreamOpenOutputStream));
                }
                y1eVar.h();
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2e(Context context, Uri uri, y1e y1eVar, lu2<? super e2e> lu2Var) {
        super(2, lu2Var);
        this.$context = context;
        this.$uri = uri;
        this.this$0 = y1eVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new e2e(this.$context, this.$uri, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((e2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            eq3 eq3Var = a74.a;
            no3 no3Var = no3.c;
            a aVar = new a(this.$context, this.$uri, this.this$0, null);
            this.label = 1;
            Object objQ0 = u63.q0(no3Var, aVar, this);
            g13 g13Var = g13.a;
            if (objQ0 == g13Var) {
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
