package defpackage;

import com.indeed.android.messaging.data.conversations.OnlineStatusRepository;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.common.OnlineStatusViewModel$updateOnlineStatusPreference$1", f = "OnlineStatusViewModel.kt", l = {87}, m = "invokeSuspend")
public final class mta extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $enabled;
    int label;
    final /* synthetic */ kta this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mta(kta ktaVar, boolean z, lu2<? super mta> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ktaVar;
        this.$enabled = z;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new mta(this.this$0, this.$enabled, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((mta) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                OnlineStatusRepository onlineStatusRepository = this.this$0.b;
                boolean z = this.$enabled;
                this.label = 1;
                obj = onlineStatusRepository.updateJSOnlineStatusPreference(z, this);
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
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            gse gseVar = this.this$0.c;
            do {
                value = gseVar.getValue();
            } while (!gseVar.h(value, jta.a((jta) value, null, zBooleanValue, 1)));
        } catch (Exception e) {
            ArrayList arrayList = lz2.a;
            lz2.b("OnlineStatusViewModel", "Failed to update online status preference", false, e);
        }
        return j6g.a;
    }
}
