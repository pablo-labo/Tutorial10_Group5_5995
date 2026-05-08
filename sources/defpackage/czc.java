package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.indeed.android.jobsearch.R;
import com.wlappdebug.r;
import defpackage.sd5;
import defpackage.wg0;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class czc implements RemoteViewsService.RemoteViewsFactory, xh8 {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(czc czcVar) {
            super(0);
            this.$this_inject = czcVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<gsa> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(czc czcVar) {
            super(0);
            this.$this_inject = czcVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gsa, java.lang.Object] */
        @Override // defpackage.gu5
        public final gsa invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gsa.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<r.b> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(czc czcVar) {
            super(0);
            this.$this_inject = czcVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    public static final class d extends mj8 implements gu5<zk6> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(czc czcVar) {
            super(0);
            this.$this_inject = czcVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zk6] */
        @Override // defpackage.gu5
        public final zk6 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zk6.class), a9cVar);
        }
    }

    public czc(Context context) {
        this.a = context;
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.c = boa.E(qt8Var, aVar);
        this.d = boa.E(qt8Var, new b(this));
        this.e = boa.E(qt8Var, new c(this));
        this.f = boa.E(qt8Var, new d(this));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return i;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return new RemoteViews(this.a.getPackageName(), R.layout.view_relevant_jobs_app_widget_loading);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        Context context = this.a;
        r.b bVar = (r.b) this.e.getValue();
        bVar.getClass();
        r.a aVar = (r.a) r.a.get("appWidget.itemProvideDelay");
        if (aVar != null) {
            bVar.a(aVar);
        }
        int i2 = 1;
        try {
            bzc bzcVar = (bzc) this.b.get(i);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.view_relevant_jobs_app_widget_item);
            String str = bzcVar.a;
            String str2 = bzcVar.b;
            Double d2 = bzcVar.c;
            String str3 = bzcVar.d;
            String str4 = bzcVar.e;
            boolean z = bzcVar.f;
            String str5 = bzcVar.g;
            String str6 = bzcVar.i;
            if (!zve.U(str)) {
                remoteViews.setViewVisibility(R.id.text_job_title, 0);
                remoteViews.setTextViewText(R.id.text_job_title, str);
            }
            if (!zve.U(str2)) {
                remoteViews.setViewVisibility(R.id.text_company_name, 0);
                remoteViews.setTextViewText(R.id.text_company_name, str2);
            }
            if (d2 != null) {
                double dDoubleValue = d2.doubleValue();
                if (d2.doubleValue() == 0.0d) {
                    remoteViews.setViewVisibility(R.id.text_rating, 8);
                    remoteViews.setViewVisibility(R.id.image_star, 8);
                } else {
                    remoteViews.setViewVisibility(R.id.text_rating, 0);
                    remoteViews.setViewVisibility(R.id.image_star, 0);
                    remoteViews.setTextViewText(R.id.text_rating, String.valueOf(dDoubleValue));
                }
            } else {
                remoteViews.setViewVisibility(R.id.text_rating, 8);
                remoteViews.setViewVisibility(R.id.image_star, 8);
            }
            if (!zve.U(str3)) {
                remoteViews.setViewVisibility(R.id.text_location_short, 0);
                remoteViews.setTextViewText(R.id.text_location_short, str3);
            }
            if (str4 == null || zve.U(str4)) {
                remoteViews.setViewVisibility(R.id.text_compensation_rate, 8);
            } else {
                remoteViews.setViewVisibility(R.id.text_compensation_rate, 0);
                remoteViews.setTextViewText(R.id.text_compensation_rate, str4);
            }
            if (z) {
                remoteViews.setViewVisibility(R.id.image_apply_with_indeed, 0);
                remoteViews.setViewVisibility(R.id.text_apply_with_indeed, 0);
            }
            if (!zve.U(str5)) {
                remoteViews.setViewVisibility(R.id.text_date_on_indeed, 0);
                long jCurrentTimeMillis = (System.currentTimeMillis() - Long.parseLong(str5)) / 86400000;
                if (jCurrentTimeMillis == 0) {
                    remoteViews.setTextViewText(R.id.text_date_on_indeed, context.getString(R.string.relevant_jobs_widget_today));
                } else if (jCurrentTimeMillis == 1) {
                    remoteViews.setTextViewText(R.id.text_date_on_indeed, context.getString(R.string.relevant_jobs_widget_1_day_on_indeed));
                } else if (jCurrentTimeMillis > 30) {
                    remoteViews.setTextViewText(R.id.text_date_on_indeed, context.getString(R.string.relevant_jobs_widget_days_on_indeed, "30+"));
                } else {
                    remoteViews.setTextViewText(R.id.text_date_on_indeed, context.getString(R.string.relevant_jobs_widget_days_on_indeed, String.valueOf(jCurrentTimeMillis)));
                }
            }
            Intent intent = new Intent();
            intent.setFlags(268468224);
            intent.putExtra("RELEVANT_JOBS_VIEW_JOB_URL", str6);
            intent.setAction("relevant_jobs_app_widget_action");
            remoteViews.setOnClickFillInIntent(R.id.item_relevant_jobs, intent);
            return remoteViews;
        } catch (Exception e) {
            ((gz4) this.c.getValue()).a("relevant_jobs_app_widget_exception", new kz4(e, this, i, i2));
            ArrayList arrayList = lz2.a;
            lz2.c("relevant_jobs_app_widget_exception", "relevant jobs widget was not loaded successfully", false, e, 4);
            return null;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        sd5.q qVar;
        sd5.o oVar;
        sd5.n nVar;
        ArrayList arrayList = this.b;
        try {
            wg0 wg0VarF = ((gsa) this.d.getValue()).f(new e45(this, 9));
            if (wg0VarF instanceof wg0.b) {
                sd5.b bVar = (sd5.b) ((wg0.b) wg0VarF).a;
                arrayList.clear();
                sd5.e eVar = bVar.a;
                if (eVar != null) {
                    ArrayList<sd5.p> arrayList2 = eVar.b;
                    if (!arrayList2.isEmpty()) {
                        for (sd5.p pVar : arrayList2) {
                            sd5.i iVar = pVar.b;
                            String str = iVar.a;
                            String str2 = iVar.b;
                            sd5.d dVar = iVar.c;
                            Object obj = null;
                            Double d2 = (dVar == null || (qVar = dVar.b) == null || (oVar = qVar.a) == null || (nVar = oVar.a) == null) ? null : nVar.a;
                            String str3 = iVar.d.a.a;
                            sd5.a aVar = iVar.e;
                            String str4 = aVar != null ? aVar.b : null;
                            boolean zContains = iVar.f.a.contains(ty7.c);
                            String string = pVar.b.g.toString();
                            sd5.m mVar = pVar.a.c;
                            String str5 = mVar != null ? mVar.a : null;
                            sd5.h hVar = pVar.c;
                            if (hVar != null) {
                                obj = hVar.a;
                            }
                            arrayList.add(new bzc(str, str2, d2, str3, str4, zContains, string, str5, String.valueOf(obj)));
                        }
                    }
                }
            }
            if (wg0VarF instanceof wg0.a) {
                ((gz4) this.c.getValue()).a("relevant_jobs_widget_loading_error", new cd(((wg0.a) wg0VarF).a, 14));
            }
        } catch (Exception e) {
            ArrayList arrayList3 = lz2.a;
            lz2.b("RelevantJobsAppWidgetRemoteViewsFactory", "updateRelevantJobsItems error", false, e);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        this.b.clear();
    }
}
