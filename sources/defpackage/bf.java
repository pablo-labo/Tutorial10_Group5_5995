package defpackage;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.events.EventDao_Impl;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.indeed.android.reactnative.nativemodules.RNJSTPushAuthorization;
import defpackage.lx5;
import defpackage.ude;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bf(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((g4a) obj2).setValue(str);
                ((iba) obj3).p("TIME_PERIOD");
                return j6g.a;
            case 1:
                f51 f51Var = (f51) obj3;
                String str2 = (String) obj;
                str2.getClass();
                Locale locale = (Locale) ((g4a) obj2).getValue();
                f51Var.y(str2, locale != null ? locale.getCountry() : null);
                return j6g.a;
            case 2:
                return EventDao_Impl.C06561.convertRows$lambda$0((kfd) obj3, (EventDao_Impl) obj2, (zhd) obj);
            case 3:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", (String) obj3, "userJobStatus", null);
                bVar.a("myjobsPageTk", ie7.Z);
                bVar.a("appTk", (String) obj2);
                return j6g.a;
            case 4:
                Function1 function1 = (Function1) obj3;
                g4a g4aVar = (g4a) obj2;
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                String str3 = ((jhf) g4aVar.getValue()).a.b;
                g4aVar.setValue(jhfVar);
                le0 le0Var = jhfVar.a;
                if (!wl7.b(le0Var.b, str3)) {
                    function1.invoke(le0Var.b);
                }
                return j6g.a;
            case 5:
                return RNJSTPushAuthorization.requestImmediateSystemPushAuthorization$lambda$2((Promise) obj3, (RNJSTPushAuthorization) obj2, (et7) obj);
            case 6:
                Context context = (Context) obj3;
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                String string = context.getString(((f3d) obj2).f ? R.string.messaging_loading_report_state : R.string.messaging_ready_report_state);
                string.getClass();
                qf8<Object>[] qf8VarArr = o5e.a;
                r5e<String> r5eVar = k5e.b;
                qf8<Object> qf8Var = o5e.a[0];
                s5eVar.a(r5eVar, string);
                return j6g.a;
            default:
                vde vdeVarI = ((ude) obj3).i();
                ude.c.i0 i0Var = (ude.c.i0) ((ude.c) obj2);
                String str4 = i0Var.a;
                SavedJobsDto savedJobsDto = i0Var.b;
                Context context2 = i0Var.c;
                str4.getClass();
                savedJobsDto.getClass();
                context2.getClass();
                String string2 = context2.getString(R.string.manage_this_job);
                string2.getClass();
                String string3 = context2.getString(R.string.move_to_applied);
                string3.getClass();
                String string4 = context2.getString(R.string.moved_to);
                string4.getClass();
                String string5 = context2.getString(R.string.applied);
                string5.getClass();
                return vde.a(vdeVarI, new kk1(string2, str4, u63.Z(new fo7(1, string3, R.drawable.move_to_folder, new ude.a.f(savedJobsDto, string4, string5), null, 16)), new dc(5), "Saved", false), true, false, null, null, null, null, null, false, null, null, null, 4092);
        }
    }
}
