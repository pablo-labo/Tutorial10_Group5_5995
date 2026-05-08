package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.b;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import defpackage.e9a;
import defpackage.s87;
import defpackage.sp7;
import defpackage.ude;
import defpackage.xs7;
import defpackage.ys7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pa0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        Task task;
        xs7.a aVar;
        int i = 3;
        boolean z = false;
        switch (this.a) {
            case 0:
                sa0 sa0Var = (sa0) this.b;
                zcf zcfVar = (zcf) this.c;
                ne neVar = sa0Var.g;
                ti tiVar = new ti(1, sa0Var, zcfVar);
                luc lucVar = new luc();
                sa0Var.e.d("positioner", neVar, new x9(i, lucVar, tiVar, z));
                T t = lucVar.element;
                if (t != 0) {
                    return (qtc) t;
                }
                wl7.g("result");
                throw null;
            case 1:
                pm0 pm0Var = (pm0) this.b;
                Context context = (g) this.c;
                Lazy<s87> lazy = s87.f;
                s87.a.a(pm0Var.M(), tx5.g(pm0Var.g0, "app_rating_multi_prompt_rate_us", null, 6));
                bu8 bu8Var = bu8.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                bu8Var.getClass();
                bu8.i0.b(bu8.b[18], bu8Var, Long.valueOf(jCurrentTimeMillis));
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                b bVar = new b(new g7i(applicationContext));
                g7i g7iVar = bVar.a;
                w6i w6iVar = g7i.c;
                w6iVar.a("requestInAppReview (%s)", g7iVar.b);
                if (g7iVar.a == null) {
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", w6i.b(w6iVar.a, "Play Store app is either not installed or not the official version", objArr));
                    }
                    Locale locale = Locale.getDefault();
                    HashMap map = pfh.a;
                    task = Tasks.forException(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : o6.f((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) pfh.b.get(-1), ")")), null, null)));
                } else {
                    final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    final mli mliVar = g7iVar.a;
                    uwh uwhVar = new uwh(g7iVar, taskCompletionSource, taskCompletionSource);
                    synchronized (mliVar.f) {
                        mliVar.e.add(taskCompletionSource);
                        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: xci
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task2) {
                                mli mliVar2 = mliVar;
                                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                                synchronized (mliVar2.f) {
                                    mliVar2.e.remove(taskCompletionSource2);
                                }
                            }
                        });
                        break;
                    }
                    synchronized (mliVar.f) {
                        try {
                            if (mliVar.k.getAndIncrement() > 0) {
                                w6i w6iVar2 = mliVar.b;
                                Object[] objArr2 = new Object[0];
                                w6iVar2.getClass();
                                if (Log.isLoggable("PlayCore", 3)) {
                                    Log.d("PlayCore", w6i.b(w6iVar2.a, "Already connected to the service.", objArr2));
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    mliVar.a().post(new hhi(mliVar, taskCompletionSource, uwhVar));
                    task = taskCompletionSource.getTask();
                }
                task.addOnCompleteListener(new vh9(bVar, context));
                return j6g.a;
            case 2:
                ude udeVar = (ude) this.b;
                Context context2 = (Context) this.c;
                String string = context2.getString(R.string.not_seeing_an_archived_application);
                string.getClass();
                String string2 = context2.getString(R.string.archived_tab_dialog_body);
                string2.getClass();
                udeVar.m(new ude.c.a0(string, string2, "app-tracker-archived-emptytabmodalcta"));
                udeVar.m(new ude.c.s("Archived"));
                return j6g.a;
            case 3:
                ((Function1) this.b).invoke((ljg) this.c);
                return j6g.a;
            case 4:
                gu5 gu5Var = (gu5) this.b;
                ((g4a) this.c).setValue(Boolean.FALSE);
                gu5Var.invoke();
                return j6g.a;
            case 5:
                gu5 gu5Var2 = (gu5) this.b;
                Function1 function1 = (Function1) this.c;
                gu5Var2.invoke();
                w47 w47Var = w47.ARCHIVE;
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "messagingArchiveSpamFilterBanner", "messagingArchiveSpamFilterBannerArchiveButton", null));
                function1.invoke(w47Var);
                return j6g.a;
            case 6:
                ((Function1) this.b).invoke((InvitedJobDto) this.c);
                return j6g.a;
            case 7:
                FragmentManager fragmentManager = (FragmentManager) this.b;
                String str = (String) this.c;
                i1g i1gVar = (i1g) cr8.p(i1g.class);
                qec qecVar = new qec();
                qecVar.setArguments(aq1.a(new Pair("resume-coach-props", e9a.a.a(null, null).toBundle()), new Pair("from", str)));
                i1gVar.e(fragmentManager, qecVar);
                return j6g.a;
            case 8:
                ((Function1) this.b).invoke(((vnd) this.c).h);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Function1) this.b).invoke((String) this.c);
                return j6g.a;
            case 10:
                Function1 function12 = (Function1) this.b;
                g4a g4aVar = (g4a) this.c;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-commute-time-preference", "refresh", null, null, 12));
                function12.invoke(Integer.valueOf(((Number) g4aVar.getValue()).intValue()));
                return j6g.a;
            case 11:
                List list = (List) this.b;
                d1d d1dVar = (d1d) this.c;
                List<sjb> list2 = list;
                ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
                for (sjb sjbVar : list2) {
                    sjbVar.getClass();
                    String str2 = sjbVar.a;
                    if (str2.equals("DSQF7")) {
                        aVar = xs7.a.a;
                    } else if (str2.equals("PAXZC")) {
                        aVar = xs7.a.b;
                    } else {
                        if (!str2.equals("SWG7T")) {
                            r6.g(akb.k("Invalid suid: PreferenceData (suid=", str2, ", displayName=", sjbVar.b, " is not supported"));
                            return null;
                        }
                        aVar = xs7.a.c;
                    }
                    arrayList.add(aVar);
                }
                Set setE1 = z92.E1(arrayList);
                hs7 hs7Var = hs7.a;
                xs7 xs7Var = new xs7(setE1);
                d1dVar.close();
                Function2<? super hs7, ? super xs7, j6g> function2 = d1dVar.h0;
                if (function2 != null) {
                    function2.invoke(hs7Var, xs7Var);
                }
                return j6g.a;
            case 12:
                String str3 = (String) this.b;
                gu5 gu5Var3 = (gu5) this.c;
                tp7 tp7Var = (tp7) cr8.p(tp7.class);
                if (str3 == null) {
                    str3 = "UIPTopNavBar";
                }
                tp7Var.b(new sp7.g(str3, "SearchBarButton", null, null, 12));
                if (gu5Var3 != null) {
                    gu5Var3.invoke();
                }
                return j6g.a;
            default:
                List list3 = (List) this.b;
                f4h f4hVar = (f4h) this.c;
                List<sjb> list4 = list3;
                ArrayList arrayList2 = new ArrayList(t92.r0(list4, 10));
                for (sjb sjbVar2 : list4) {
                    sjbVar2.getClass();
                    arrayList2.add(new ys7.a(sjbVar2.a, sjbVar2.b));
                }
                Set setE12 = z92.E1(arrayList2);
                hs7 hs7Var2 = hs7.a;
                ys7 ys7Var = new ys7(setE12);
                f4hVar.close();
                Function2<? super hs7, ? super ys7, j6g> function22 = f4hVar.h0;
                if (function22 != null) {
                    function22.invoke(hs7Var2, ys7Var);
                }
                return j6g.a;
        }
    }
}
