package defpackage;

import com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bx0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ bx0(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return AttachmentsRepositoryImpl.downloadAttachmentWithoutPreview$lambda$12(function1, ((Integer) obj).intValue());
            default:
                Long l = (Long) obj;
                l.getClass();
                return function1.invoke(l);
        }
    }
}
