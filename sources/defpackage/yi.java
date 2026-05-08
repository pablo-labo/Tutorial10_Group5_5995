package defpackage;

import android.content.Context;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment.d;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.indeed.android.uiplugin.oneoff.JSONCallbackError;
import com.indeed.android.uiplugin.oneoff.a;
import defpackage.fr0;
import defpackage.ude;
import defpackage.ym7;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yi implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yi(xie xieVar, o97 o97Var) {
        this.a = 5;
        this.b = xieVar;
        this.c = o97Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((iba) obj2).p("SCHOOL_TIME_PERIOD");
                ((luc) obj).element = "";
                return j6g.a;
            case 1:
                ((fr0) obj2).r(new fr0.b.m(((SavedJobsDto) obj).getJobkey()));
                return j6g.a;
            case 2:
                u63.Y((e13) obj2, null, null, new eb3((hw9) obj, null), 3);
                return j6g.a;
            case 3:
                GhostwriterDebugFragment ghostwriterDebugFragment = (GhostwriterDebugFragment) obj;
                u63.Y((e13) obj2, null, null, ghostwriterDebugFragment.new d(null), 3);
                return (List) ghostwriterDebugFragment.c.a.getValue();
            case 4:
                c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "shareHiredCloseButton", null, 12));
                e37.a((Context) obj2);
                ((gu5) obj).invoke();
                return j6g.a;
            case 5:
                o97 o97Var = (o97) obj;
                int iOrdinal = ((xie) obj2).ordinal();
                float fA = 95.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        fA = o97Var.a >= 7 ? 16.0f : 24.0f;
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            l.g();
                            return null;
                        }
                        fA = wie.Md.a();
                    }
                }
                return new j94(fA);
            case 6:
                u67 u67Var = (u67) obj2;
                g4a g4aVar = (g4a) obj;
                g4aVar.setValue(Boolean.TRUE);
                oc ocVar = new oc(i2, g4aVar);
                u67Var.d.f("pull-down-refresh");
                u63.Y(ee3.p(u67Var), null, null, new v67(u67Var, ocVar, null), 3);
                return j6g.a;
            case 7:
                Context context = (Context) obj;
                String string = context.getString(R.string.we_re_working_on_it);
                string.getClass();
                String string2 = context.getString(R.string.interview_tab_dialog_body);
                string2.getClass();
                ((ude) obj2).m(new ude.c.a0(string, string2, "app-tracker-interviews-emptytabmodalcta"));
                return j6g.a;
            case 8:
                u63.Y((e13) obj2, null, null, new ym7.a((e8a) obj, null), 3);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                String str = (String) obj;
                if (!((huc) obj2).element) {
                    try {
                        a aVar = a.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        JsonPrimitive jsonPrimitiveC = la8.c("cancelled");
                        jsonPrimitiveC.getClass();
                        j6g j6gVar = j6g.a;
                        aVar.b(str, new JsonObject(linkedHashMap));
                        break;
                    } catch (JSONCallbackError.CallbackNotFound unused) {
                    } catch (JSONCallbackError e) {
                        ((np7) cr8.p(np7.class)).c("JSTNavigatorImpl", l5.l("Failed to trigger schedule apply onboarding callback on detach: ", e.getMessage()), false, e);
                    }
                }
                try {
                    a aVar2 = a.a;
                } catch (Exception unused2) {
                }
                if (str.length() == 0) {
                    throw new JSONCallbackError.InvalidCallbackId(str);
                }
                a.b.remove(str);
                return j6g.a;
            case 10:
                ((g4a) obj).setValue(Boolean.FALSE);
                ((c88) obj2).B.h.invoke();
                return j6g.a;
            case 11:
                ((Function1) obj2).invoke(((aje) obj).a);
                return j6g.a;
            default:
                ((mhg) obj2).a((String) obj);
                return j6g.a;
        }
    }

    public /* synthetic */ yi(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
