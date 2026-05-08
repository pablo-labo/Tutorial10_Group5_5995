package defpackage;

import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n1e extends qv5 implements Function1<SuggestedMessageModel, j6g> {
    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(SuggestedMessageModel suggestedMessageModel) {
        y1e y1eVar;
        SuggestedMessageModel suggestedMessageModel2 = suggestedMessageModel;
        suggestedMessageModel2.getClass();
        y1e y1eVar2 = (y1e) this.receiver;
        y1eVar2.getClass();
        gse gseVar = y1eVar2.c0;
        while (true) {
            Object value = gseVar.getValue();
            gse gseVar2 = gseVar;
            y1eVar = y1eVar2;
            if (gseVar2.h(value, x1e.a((x1e) value, null, null, false, false, false, null, false, false, false, null, null, null, null, false, false, null, false, false, 0, null, null, suggestedMessageModel2, null, false, null, 62914559))) {
                break;
            }
            gseVar = gseVar2;
            y1eVar2 = y1eVar;
        }
        y1eVar.m(suggestedMessageModel2.getMessageBody(), true);
        final String messageBody = suggestedMessageModel2.getMessageBody();
        final String trackingKey = suggestedMessageModel2.getTrackingKey();
        if (trackingKey == null) {
            trackingKey = "";
        }
        final int displayIndex = suggestedMessageModel2.getDisplayIndex();
        messageBody.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.g("messagingAssistedResultsSheet", "messagingAssistedSuggestion", null, new Function1() { // from class: ar9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.a("messagingSuggestionContent", messageBody);
                hr7Var.a("messagingAssistedMessageTrackingKey", trackingKey);
                hr7Var.c(Integer.valueOf(displayIndex), "messagingAssistedMessageDisplayIndex");
                return j6g.a;
            }
        }, 4));
        y1eVar.k();
        return j6g.a;
    }
}
