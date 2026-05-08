package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.indeed.android.messaging.data.conversations.ConversationDao_Impl;
import com.indeed.android.messaging.data.conversations.DraftRecord;
import com.indeed.android.messaging.data.events.EventDao_Impl;
import com.indeed.android.myjobs.data.model.ApiResponse;
import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.Body;
import com.indeed.android.myjobs.data.model.dto.DtoExtensionKt;
import com.indeed.android.reactnative.nativemodules.RNJSTPushAuthorization;
import defpackage.fr0;
import defpackage.hf3;
import defpackage.kv8;
import defpackage.lx5;
import defpackage.qq0;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mt implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mt(g4a g4aVar, g4a g4aVar2) {
        this.a = 7;
        this.c = g4aVar;
        this.b = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [mq0, yv8] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        List<AppStatusJob> appStatusJobs;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((g4a) obj2).setValue(str);
                ((iba) obj3).r();
                return j6g.a;
            case 1:
                zv8 zv8Var = (zv8) obj3;
                final fr0 fr0Var = (fr0) obj2;
                ((m74) obj).getClass();
                ?? r1 = new uv8() { // from class: mq0
                    @Override // defpackage.uv8
                    public final void G(zv8 zv8Var2, kv8.a aVar) {
                        if (aVar == kv8.a.ON_RESUME) {
                            boolean zK = i6a.k();
                            fr0 fr0Var2 = fr0Var;
                            if (zK) {
                                fr0Var2.o();
                            }
                            fr0Var2.r(fr0.b.p.a);
                        }
                    }
                };
                zv8Var.getLifecycle().a(r1);
                return new qq0.e(fr0Var, zv8Var, r1);
            case 2:
                old oldVarI = ((rs0) obj3).i();
                Body body = ((ApiResponse) ((hf3.c) ((hf3) obj2)).a).getBody();
                if (body == null || (appStatusJobs = body.getAppStatusJobs()) == null) {
                    arrayList = null;
                } else {
                    List<AppStatusJob> list = appStatusJobs;
                    arrayList = new ArrayList(t92.r0(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(DtoExtensionKt.toSavedJobDTO((AppStatusJob) it.next()));
                    }
                }
                return old.a(oldVarI, arrayList, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, 0, 261758);
            case 3:
                return ConversationDao_Impl.upsertConversationDraft$lambda$1((ConversationDao_Impl) obj3, (DraftRecord) obj2, (zhd) obj);
            case 4:
                return EventDao_Impl.findById$lambda$4("SELECT * FROM eventrecord WHERE id = ?", (String) obj3, (EventDao_Impl) obj2, (zhd) obj);
            case 5:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", (String) obj3);
                bVar.a("myjobsPageTk", ie7.Z);
                bVar.a("appTk", (String) obj2);
                return j6g.a;
            case 6:
                gu5 gu5Var = (gu5) obj2;
                if (!((hee) obj3).c()) {
                    gu5Var.invoke();
                }
                return j6g.a;
            case 7:
                ((String) obj).getClass();
                ((g4a) obj2).setValue("");
                ((g4a) obj3).setValue("");
                return j6g.a;
            case 8:
                lx5.b bVar2 = (lx5.b) obj;
                bVar2.getClass();
                bVar2.a("acceptTypes", ut0.t0((String[]) obj3, ", ", null, null, null, 62));
                bVar2.a("sourceUrl", (String) obj2);
                bVar2.c("isTemporarilyDisabled", Boolean.FALSE);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return RNJSTPushAuthorization.requestSystemPushAuthWithPrimer$lambda$1((Promise) obj3, (RNJSTPushAuthorization) obj2, (et7) obj);
            default:
                ((String) obj).getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-skills", "delete", null, null, 12));
                ((Function2) obj3).invoke((zie) obj2, Boolean.FALSE);
                return j6g.a;
        }
    }

    public /* synthetic */ mt(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
