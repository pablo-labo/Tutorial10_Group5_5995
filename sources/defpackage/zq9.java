package defpackage;

import androidx.compose.ui.layout.w;
import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zq9 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zq9(int i, SuggestedMessageModel suggestedMessageModel) {
        this.b = i;
        this.c = suggestedMessageModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                SuggestedMessageModel suggestedMessageModel = (SuggestedMessageModel) obj2;
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                hr7Var.c(Integer.valueOf(i2), "messagingAssistedMessageRewriteEditDistance");
                String trackingKey = suggestedMessageModel.getTrackingKey();
                if (trackingKey == null) {
                    trackingKey = "";
                }
                hr7Var.a("messagingAssistedMessageTrackingKey", trackingKey);
                hr7Var.c(Integer.valueOf(suggestedMessageModel.getDisplayIndex()), "messagingAssistedMessageDisplayIndex");
                break;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                w.a aVar = (w.a) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    w wVar = (w) arrayList.get(i3);
                    w.a.y(aVar, wVar, 0, (i2 - wVar.b) / 2);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ zq9(int i, ArrayList arrayList) {
        this.c = arrayList;
        this.b = i;
    }
}
