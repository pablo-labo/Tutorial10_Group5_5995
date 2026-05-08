package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentContainerView;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.defaults.DefaultReactHostDelegate;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.messaging.data.events.EventRecord;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.cz2;
import defpackage.ph8;
import defpackage.rx8;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iq0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ iq0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                SavedJobsDto savedJobsDto = (SavedJobsDto) obj;
                savedJobsDto.getClass();
                return Long.valueOf(savedJobsDto.getTimeStamp());
            case 1:
                ((fo7) obj).getClass();
                return j6g.a;
            case 2:
                ((String) obj).getClass();
                return j6g.a;
            case 3:
                ((EventRecord.Attachment) obj).getClass();
                return j6g.a;
            case 4:
                cz2.a aVar = (cz2.a) obj;
                aVar.getClass();
                return aVar.b;
            case 5:
                return DefaultReactHostDelegate._init_$lambda$0((Exception) obj);
            case 6:
                y98 y98Var = (y98) obj;
                y98Var.getClass();
                y98Var.b = true;
                return j6g.a;
            case 7:
                IanInitialState ianInitialState = (IanInitialState) obj;
                d98 d98Var = new d98();
                Bundle bundle = new Bundle();
                if ((ianInitialState != null ? ianInitialState.getInitialTab() : null) == xj1.Z) {
                    bundle.putString("KEY_INITIAL_URL", ianInitialState.getInitialUrl());
                }
                d98Var.setArguments(bundle);
                return d98Var;
            case 8:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("records");
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj).getClass();
                go8 go8Var = uo8.a;
                return -1;
            case 10:
                ph8.b bVar = (ph8.b) obj;
                bVar.a = 1332;
                bVar.a(Float.valueOf(0.0f), 666).b = c3c.e;
                bVar.a(Float.valueOf(290.0f), bVar.a);
                return j6g.a;
            case 11:
                ((mq7) obj).getClass();
                return j6g.a;
            case 12:
                Context context = (Context) obj;
                context.getClass();
                int iGenerateViewId = View.generateViewId();
                FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
                fragmentContainerView.setId(iGenerateViewId);
                return fragmentContainerView;
            case 13:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                o5e.c(s5eVar);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                String str = obj2 != null ? (String) obj2 : null;
                str.getClass();
                Object obj3 = list.get(1);
                return new rx8.b(str, (wl7.b(obj3, Boolean.FALSE) || obj3 == null) ? null : (rif) ((Function1) wld.i.b).invoke(obj3), null);
            case 15:
                ((dd0) obj).getClass();
                return r25.a;
            case 16:
                r5e<j6g> r5eVar = k5e.z;
                j6g j6gVar = j6g.a;
                ((s5e) obj).a(r5eVar, j6gVar);
                return j6gVar;
            default:
                de0 de0Var = (de0) obj;
                return new kie((((long) Float.floatToRawIntBits(de0Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(de0Var.a)) << 32));
        }
    }
}
