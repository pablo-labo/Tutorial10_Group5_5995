package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jsmappservices.bridge.NavigateToInterviewPrepCommandData;
import com.indeed.android.messaging.data.conversations.ConversationDao_Impl;
import com.indeed.android.messaging.data.events.EventDao_Impl;
import com.indeed.android.myjobs.data.model.AppStatusJob;
import com.indeed.android.myjobs.data.model.dto.DtoExtensionKt;
import com.indeed.android.reactnative.nativemodules.RNJSTPushAuthorization;
import defpackage.csf;
import defpackage.lx5;
import defpackage.xsc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qs0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qs0(List list, Function1 function1) {
        this.a = 14;
        this.c = list;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        Object obj2 = null;
        switch (this.a) {
            case 0:
                rs0 rs0Var = (rs0) this.b;
                List list = (List) this.c;
                old oldVarI = rs0Var.i();
                List list2 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(DtoExtensionKt.toSavedJobDTO((AppStatusJob) it.next()));
                }
                return old.a(oldVarI, arrayList, null, false, 0, null, null, false, null, false, null, false, null, null, false, false, 0, 262142);
            case 1:
                NavigateToInterviewPrepCommandData navigateToInterviewPrepCommandData = (NavigateToInterviewPrepCommandData) this.b;
                String str = (String) this.c;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("occupationSuid", navigateToInterviewPrepCommandData.a);
                bVar.a("jobKey", navigateToInterviewPrepCommandData.b);
                bVar.a("from", str);
                return j6g.a;
            case 2:
                return ConversationDao_Impl.observeDraftConversations$lambda$3("\n    SELECT * FROM conversationrecord\n    WHERE id IN (SELECT conversationId FROM draftrecord)\n    AND folder = ?\n    AND isExisting=1\n    ORDER BY lastEventTimestamp DESC\n    ", (ConversationDao_Impl) this.b, (w47) this.c, (zhd) obj);
            case 3:
                o03 o03Var = (o03) this.b;
                le0 le0Var = (le0) obj;
                if (!o03Var.i0 && o03Var.j0) {
                    whf whfVar = o03Var.h0.e;
                    if (whfVar != null) {
                        List listA0 = u63.a0(new if5(), new kc2(le0Var, 1));
                        lu8 lu8Var = o03Var.h0;
                        j04 j04Var = lu8Var.d;
                        pq pqVar = lu8Var.v;
                        jhf jhfVarA = j04Var.a(listA0);
                        whfVar.a(null, jhfVarA);
                        pqVar.invoke(jhfVarA);
                    } else {
                        jhf jhfVar = o03Var.g0;
                        String str2 = jhfVar.a.b;
                        long j = jhfVar.b;
                        int i = kjf.c;
                        String string = zve.g0(str2, (int) (j >> 32), (int) (j & 4294967295L), le0Var).toString();
                        int length = le0Var.b.length() + ((int) (o03Var.g0.b >> 32));
                        o03Var.h0.v.invoke(new jhf(string, cr8.c(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                return g24.a((Activity) this.b, (gu5) this.c, (m74) obj);
            case 5:
                gu5 gu5Var = (gu5) this.b;
                g4a g4aVar = (g4a) this.c;
                String str3 = (String) obj;
                str3.getClass();
                g4aVar.setValue(str3);
                gu5Var.invoke();
                return j6g.a;
            case 6:
                iba ibaVar = (iba) this.b;
                g4a g4aVar2 = (g4a) this.c;
                Locale locale = (Locale) obj;
                locale.getClass();
                g4aVar2.setValue(locale);
                ibaVar.r();
                return j6g.a;
            case 7:
                return EventDao_Impl.getLocalLastEvent$lambda$2("SELECT * FROM eventrecord WHERE isLocalMessage = 1 AND conversationId = ? ORDER BY timestamp DESC LIMIT 1", (String) this.b, (EventDao_Impl) this.c, (zhd) obj);
            case 8:
                Function1 function1 = (Function1) this.b;
                iba ibaVar2 = (iba) this.c;
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(str4);
                ibaVar2.p("LANGUAGE_LIST");
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ApiError apiError = (ApiError) this.b;
                lsc lscVar = (lsc) this.c;
                y3b y3bVar = (y3b) obj;
                y3bVar.b("error_message", apiError.getMsg());
                y3bVar.b("error_description", apiError.description());
                y3bVar.b("recent_search_keyword", lscVar.b.a);
                y3bVar.b("recent_search_location", lscVar.b.b);
                return j6g.a;
            case 10:
                j2b j2bVar = (j2b) this.b;
                float fFloatValue = ((Float) obj).floatValue();
                e2b e2bVar = j2bVar.b;
                ((dme) e2bVar.s).h(e2bVar.j(e2bVar.k() + gf9.b(e2bVar.q() != 0 ? fFloatValue / e2bVar.q() : 0.0f)));
                return j6g.a;
            case 11:
                String str5 = (String) this.b;
                Context context = (Context) this.c;
                ((Integer) obj).getClass();
                str5.getClass();
                context.getClass();
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(!wve.K(str5, "http", false) ? "http://".concat(str5) : str5)));
                    break;
                } catch (Exception e) {
                    ArrayList arrayList2 = lz2.a;
                    lz2.c("ClickableLink", "Invalid link: " + str5 + "\n" + e, false, null, 12);
                }
                return j6g.a;
            case 12:
                return RNJSTPushAuthorization.openPushNotificationAuthorizationSettings$lambda$4((Promise) this.b, (RNJSTPushAuthorization) this.c, (et7) obj);
            case 13:
                xsc xscVar = (xsc) this.b;
                Throwable th = (Throwable) this.c;
                Throwable th2 = (Throwable) obj;
                synchronized (xscVar.b) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                boa.h(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    xscVar.d = th;
                    gse gseVar = xscVar.t;
                    xsc.d dVar = xsc.d.a;
                    gseVar.getClass();
                    gseVar.m(null, dVar);
                }
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                List list3 = (List) this.c;
                Function1 function12 = (Function1) this.b;
                String str6 = (String) obj;
                str6.getClass();
                Iterator it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (wl7.b(((zie) next).a, str6)) {
                            obj2 = next;
                        }
                    }
                }
                zie zieVar = (zie) obj2;
                if (zieVar == null) {
                    zieVar = new zie(null, null, null, null, false, null, null, null, null, null, 1023);
                }
                function12.invoke(zieVar);
                return j6g.a;
            default:
                return new isf((csf) this.b, (csf.a) this.c);
        }
    }

    public /* synthetic */ qs0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
