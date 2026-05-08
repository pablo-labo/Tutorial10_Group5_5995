package defpackage;

import android.net.Uri;
import com.indeed.android.messaging.data.events.EventRecord;
import com.indeed.android.uiplugin.file.FileTooLargeException;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationViewModel$onAttachmentSelected$1", f = "SelectedConversationViewModel.kt", l = {321}, m = "invokeSuspend")
public final class g2e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ gu5<j6g> $onNavigateToPreview;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ y1e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2e(y1e y1eVar, Uri uri, gu5<j6g> gu5Var, lu2<? super g2e> lu2Var) {
        super(2, lu2Var);
        this.this$0 = y1eVar;
        this.$uri = uri;
        this.$onNavigateToPreview = gu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g2e(this.this$0, this.$uri, this.$onNavigateToPreview, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((g2e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objC;
        Object value2;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                gse gseVar = this.this$0.c0;
                do {
                    value = gseVar.getValue();
                } while (!gseVar.h(value, x1e.a((x1e) value, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, false, 0, null, null, null, null, false, null, 67108735)));
                f1g f1gVar = (f1g) cr8.p(f1g.class);
                Uri uri = this.$uri;
                this.label = 1;
                objC = f1gVar.c(uri);
                g13 g13Var = g13.a;
                if (objC == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                objC = obj;
            }
            File file = (File) objC;
            if (file != null) {
                y1e y1eVar = this.this$0;
                gu5<j6g> gu5Var = this.$onNavigateToPreview;
                Iterator<T> it = ((x1e) y1eVar.d0.getValue()).b.iterator();
                long length = 0;
                while (it.hasNext()) {
                    File file2 = ((EventRecord.Attachment) it.next()).getFile();
                    length += file2 != null ? file2.length() : 0L;
                }
                if (file.length() + length > 15728640) {
                    fnf.h(y1eVar.e, cnf.f, null, null, 6);
                    return j6g.a;
                }
                if (!y1e.e0.contains(hb5.Q(file)) || gu5Var == null) {
                    u63.Y(ee3.p(y1eVar), null, null, new n2e(y1eVar, file, null), 3);
                } else {
                    gse gseVar2 = y1eVar.c0;
                    do {
                        value2 = gseVar2.getValue();
                    } while (!gseVar2.h(value2, x1e.a((x1e) value2, null, null, false, false, false, null, false, false, false, file, null, null, null, false, false, null, false, false, 0, null, null, null, null, false, null, 67108351)));
                    gu5Var.invoke();
                }
            }
            return j6g.a;
        } catch (FileTooLargeException unused) {
            fnf.h(this.this$0.e, cnf.e, null, null, 6);
            return j6g.a;
        }
    }
}
