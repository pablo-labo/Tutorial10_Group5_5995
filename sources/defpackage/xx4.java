package defpackage;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.messaging.data.conversations.InterviewLinkParams;
import defpackage.m3f;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xx4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xx4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                gu5 gu5Var = (gu5) obj2;
                zie zieVar = (zie) obj;
                zieVar.getClass();
                ((Function1) obj4).invoke(zieVar);
                if (!((iba) obj3).r()) {
                    gu5Var.invoke();
                }
                break;
            default:
                FragmentManager fragmentManager = (FragmentManager) obj4;
                Function2 function2 = (Function2) obj3;
                gu5 gu5Var2 = (gu5) obj2;
                m3f m3fVar = (m3f) obj;
                m3fVar.getClass();
                function2.getClass();
                gu5Var2.getClass();
                if (fragmentManager != null) {
                    if (m3fVar instanceof m3f.d) {
                        ((v1g) cr8.p(v1g.class)).b(fragmentManager, ((m3f.d) m3fVar).c);
                    } else if (!(m3fVar instanceof m3f.a) && !(m3fVar instanceof m3f.c)) {
                        if (m3fVar instanceof m3f.b) {
                            m3f.b bVar = (m3f.b) m3fVar;
                            String str = bVar.a;
                            Map<String, Object> map = bVar.b;
                            if (wl7.b(str, "request_and_navigate_to_interview")) {
                                ArrayList arrayList = lz2.a;
                                Log.d("TELEvent", "Indeed Apply Interview Button Clicked: " + map, null);
                                Object obj5 = map != null ? map.get("apiToken") : null;
                                String str2 = obj5 instanceof String ? (String) obj5 : null;
                                String str3 = str2 == null ? "" : str2;
                                Object obj6 = map != null ? map.get("email") : null;
                                String str4 = obj6 instanceof String ? (String) obj6 : null;
                                String str5 = str4 == null ? "" : str4;
                                Object obj7 = map != null ? map.get("jobTitle") : null;
                                String str6 = obj7 instanceof String ? (String) obj7 : null;
                                String str7 = str6 == null ? "" : str6;
                                Object obj8 = map != null ? map.get("interviewId") : null;
                                String str8 = obj8 instanceof String ? (String) obj8 : null;
                                String str9 = str8 == null ? "" : str8;
                                Object obj9 = map != null ? map.get("jobCompanyName") : null;
                                String str10 = obj9 instanceof String ? (String) obj9 : null;
                                String str11 = str10 == null ? "" : str10;
                                Object obj10 = map != null ? map.get("slotDuration") : null;
                                String str12 = obj10 instanceof String ? (String) obj10 : null;
                                String str13 = str12 == null ? "" : str12;
                                Object obj11 = map != null ? map.get("timezoneId") : null;
                                String str14 = obj11 instanceof String ? (String) obj11 : null;
                                String str15 = str14 == null ? "" : str14;
                                Object obj12 = map != null ? map.get("source") : null;
                                String str16 = obj12 instanceof String ? (String) obj12 : null;
                                String str17 = str16 == null ? "" : str16;
                                Object obj13 = map != null ? map.get("destination") : null;
                                String str18 = obj13 instanceof String ? (String) obj13 : null;
                                function2.invoke(new InterviewLinkParams(str3, str5, str7, str11, str9, str13, str15, str17, str18 == null ? "" : str18), fragmentManager);
                            } else if (wl7.b(str, "launch_view_original_email_modal")) {
                                ArrayList arrayList2 = lz2.a;
                                Log.d("TELEvent", "Show Email Clicked: " + map, null);
                                gu5Var2.invoke();
                            } else {
                                ArrayList arrayList3 = lz2.a;
                                lz2.c("TELEvent", l5.l("Unknown custom action: ", str), false, null, 12);
                            }
                        } else {
                            ArrayList arrayList4 = lz2.a;
                            lz2.c("TELEvent", "Unknown action: " + m3fVar, false, null, 12);
                        }
                    }
                }
                break;
        }
        return j6g.a;
    }
}
