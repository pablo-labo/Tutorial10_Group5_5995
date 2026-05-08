package defpackage;

import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import defpackage.h63;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bridge.BridgeCommandHandlerKt$handleBridgeCommand$4", f = "BridgeCommandHandler.kt", l = {207}, m = "invokeSuspend")
public final class pm1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ LaunchActivity $activity;
    final /* synthetic */ Function1<DisplayToastData, j6g> $onDisplayToast;
    final /* synthetic */ String $reportSource;
    final /* synthetic */ LaunchActivity $this_handleBridgeCommand;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pm1(LaunchActivity launchActivity, String str, Function1<? super DisplayToastData, j6g> function1, LaunchActivity launchActivity2, lu2<? super pm1> lu2Var) {
        super(2, lu2Var);
        this.$activity = launchActivity;
        this.$reportSource = str;
        this.$onDisplayToast = function1;
        this.$this_handleBridgeCommand = launchActivity2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new pm1(this.$activity, this.$reportSource, this.$onDisplayToast, this.$this_handleBridgeCommand, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((pm1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            LaunchActivity launchActivity = this.$activity;
            qpd qpdVarB = pnb.B(launchActivity);
            iwc iwcVar = fwc.a;
            String strA = ((nl0) qpdVarB.a(null, iwcVar.b(nl0.class), null)).a();
            ba5 ba5Var = (ba5) pnb.B(this.$activity).a(null, iwcVar.b(ba5.class), null);
            String str = this.$reportSource;
            final LaunchActivity launchActivity2 = this.$activity;
            final Function1<DisplayToastData, j6g> function1 = this.$onDisplayToast;
            final LaunchActivity launchActivity3 = this.$this_handleBridgeCommand;
            Function1 function12 = new Function1() { // from class: om1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    h63 h63Var = (h63) obj2;
                    if (h63Var instanceof h63.c) {
                        launchActivity2.N0.a(((h63.c) h63Var).a);
                    } else if (wl7.b(h63Var, h63.b.a)) {
                        String string = launchActivity3.getString(R.string.failed_to_find_email_app);
                        string.getClass();
                        function1.invoke(new DisplayToastData(string));
                    } else {
                        if (!wl7.b(h63Var, h63.a.a)) {
                            l.g();
                            return null;
                        }
                        ArrayList arrayList = lz2.a;
                        lz2.d("BridgeCommandHandler", "User canceled out of creating a report", false, null);
                    }
                    return j6g.a;
                }
            };
            this.label = 1;
            Object objD = p2d.d(launchActivity, strA, ba5Var, r2d.UserInitiatedReport, str, function12, this);
            g13 g13Var = g13.a;
            if (objD == g13Var) {
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
