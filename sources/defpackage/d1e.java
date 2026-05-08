package defpackage;

import com.indeed.android.messaging.data.events.EventRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.selected.conversation.SelectedConversationScreenKt$InternalSelectedConversationScreen$9$1", f = "SelectedConversationScreen.kt", l = {}, m = "invokeSuspend")
public final class d1e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ int $failedAttachmentsCount;
    final /* synthetic */ fnf $toastViewModel;
    final /* synthetic */ x1e $uiState;
    int label;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EventRecord.AttachmentFileType.values().length];
            try {
                iArr[EventRecord.AttachmentFileType.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventRecord.AttachmentFileType.FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1e(x1e x1eVar, fnf fnfVar, int i, lu2<? super d1e> lu2Var) {
        super(2, lu2Var);
        this.$uiState = x1eVar;
        this.$toastViewModel = fnfVar;
        this.$failedAttachmentsCount = i;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new d1e(this.$uiState, this.$toastViewModel, this.$failedAttachmentsCount, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((d1e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        cnf cnfVar;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        if (!this.$uiState.b.isEmpty()) {
            this.$toastViewModel.g();
        }
        if (this.$uiState.c) {
            fnf.h(this.$toastViewModel, cnf.V, null, null, 6);
        }
        if (this.$failedAttachmentsCount > 0) {
            if (this.$uiState.b.size() == 1 && this.$failedAttachmentsCount == 1) {
                fnf fnfVar = this.$toastViewModel;
                int i = a.a[this.$uiState.b.get(0).getFileType().ordinal()];
                if (i == 1) {
                    cnfVar = cnf.X;
                } else {
                    if (i != 2) {
                        l.g();
                        return null;
                    }
                    cnfVar = cnf.W;
                }
                fnf.h(fnfVar, cnfVar, null, null, 6);
            } else {
                fnf.h(this.$toastViewModel, cnf.Y, new Integer(this.$failedAttachmentsCount), null, 4);
            }
        }
        return j6g.a;
    }
}
